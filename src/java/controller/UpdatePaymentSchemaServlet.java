/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.UpdatePayment_schemaRequest;
import services.Payment_schemaService;

/**
 *
 * @author Sandeepa Fernando
 */
public class UpdatePaymentSchemaServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet UpdatePaymentSchemaServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UpdatePaymentSchemaServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");

            double rate = Double.parseDouble(request.getParameter("pay_rate"));
            String pay_name = request.getParameter("pay_name");
            String pay_desc = request.getParameter("pay_desc");
            int pay_id = Integer.parseInt(request.getParameter("pay_id"));

            //create a request based on the inputs
            UpdatePayment_schemaRequest newSchemaRequest = new UpdatePayment_schemaRequest();

            //set values to the request
            newSchemaRequest.setPs_name(pay_name);
            newSchemaRequest.setPs_rate(rate);
            newSchemaRequest.setPs_desc(pay_desc);
            newSchemaRequest.setPsId(pay_id);
            

            //call the logic class
            boolean isPaymetUpdated= Payment_schemaService.updatePayment_schema(newSchemaRequest);

            if (isPaymetUpdated) {
                response.sendRedirect(request.getContextPath() + "/Payment_schema/View_all_payment_schema.jsp");
            } else {
                //error message
                out.println("error In Update"+pay_id);
            }

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
