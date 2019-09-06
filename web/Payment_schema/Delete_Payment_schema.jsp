<%-- 
    Document   : Delete_Payment_schema
    Created on : Sep 6, 2019, 7:00:00 AM
    Author     : Sandeepa Fernando
--%>

<%@page import="services.Payment_schemaService"%>
<%@page import="model.DeletePayment_schemaRequest"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String id = request.getParameter("id");
            int payId = Integer.parseInt(id);
            DeletePayment_schemaRequest pay = new DeletePayment_schemaRequest();
            pay.setPsId(payId);

            boolean result = Payment_schemaService.deletePayment_schema(pay);

            if (result == true) {
                response.sendRedirect("View_all_payment_schema.jsp");
            } else {
                out.println("Error");
            }

        %> 
    </body>
</html>
