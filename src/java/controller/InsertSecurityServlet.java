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
import model.InsertSecurityRequest;
import services.SecurityService;

/**
 *
 * @author Sandeepa Fernando
 */
public class InsertSecurityServlet extends HttpServlet {

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
            out.println("<title>Servlet InsertSecurityServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet InsertSecurityServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");

            String name = request.getParameter("name");
            String type = request.getParameter("type");
            String email = request.getParameter("email");
            String address = request.getParameter("address");
            int whrs = Integer.parseInt(request.getParameter("whrs"));
            String password = request.getParameter("password");

            //create a request based on the inputs
            InsertSecurityRequest newUserRequest = new InsertSecurityRequest();

            //set values to the request
            newUserRequest.setUname(name);
            newUserRequest.setUtype(type);
            newUserRequest.setUemail(email);
            newUserRequest.setUaddress(address);
            newUserRequest.setWhrs(whrs);
            newUserRequest.setPassword(password);

            //call the logic class
            boolean isUserInserted = SecurityService.insertUser(newUserRequest);

            if (isUserInserted) {
                response.sendRedirect(request.getContextPath() + "/Security_admin/SecurityInsert.jsp");
            } else {
                //error message
                out.println("error");
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
