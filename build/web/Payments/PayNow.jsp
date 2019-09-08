<%-- 
    Document   : PayNow
    Created on : Sep 7, 2019, 10:46:35 PM
    Author     : Sandeepa Fernando
--%>

<%@page import="dao.RegisteredDao"%>
<%@page import="java.sql.Timestamp"%>
<%@page import="java.sql.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="bean.Registered"%>
<%@page import="services.RegisteredService"%>
<%@page import="model.UpdateRegisteredRequest"%>
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
            int uId = Integer.parseInt(id);
            UpdateRegisteredRequest pay = new UpdateRegisteredRequest();
            pay.setUser_Id(uId);
            RegisteredDao regDao = new RegisteredDao();

            boolean result = RegisteredService.editeReservation(pay);
            if (result == true) {
                //regDao.getdiff(uId);
                out.println("<h1>Payment</h1>");
                out.println(regDao.getdiff(uId));

            } else {
                out.println("Error");
            }

        %> 
    </body>
</html>
