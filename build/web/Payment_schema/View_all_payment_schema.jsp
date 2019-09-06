<%-- 
    Document   : View_all_payment_schema
    Created on : Sep 6, 2019, 6:34:35 AM
    Author     : Sandeepa Fernando
--%>

<%@page import="services.Payment_schemaService"%>
<%@page import="model.Payment_schemaRespons"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="../External/css/view_allcss.css">
    </head>
    <body>
        <% List<Payment_schemaRespons> schemaList = Payment_schemaService.getAllPayment_schema();%>
        <table border="1" cellspacing="5" cellpadding="4" class="qlist">
            <tr>
                <th>Payment Schema ID</th>
                <th>Payment Schema Name</th>
                <th>Payment Schema Rate</th>
                <th>Payment Schema Description</th>
                <th colspan="2">Actions</th>
            </tr>

            <tr>

            <tr>
                <% for (Payment_schemaRespons res : schemaList) {%>

                <td><%=res.getPsId()%></td>
                <td><%=res.getPs_name()%></td>
                <td><%=res.getPs_rate()%></td>
                <td><%=res.getPs_desc()%></td>
                <td><a href="Edite_payemt_schema.jsp?id=<%=res.getPsId()%>">update</a></td>
                <td><a href="Delete_Payment_schema.jsp?id=<%=res.getPsId()%>" onclick="return confirm('Are you Sure?')">delete</a></td>
            </tr>
            <% }%>
        </table>
</html>
