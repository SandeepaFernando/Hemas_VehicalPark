<%-- 
    Document   : View_all_notification
    Created on : Sep 5, 2019, 7:00:36 PM
    Author     : Sandeepa Fernando
--%>

<%@page import="services.NotificationService"%>
<%@page import="model.NotificationRespons"%>
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
        <% List<NotificationRespons> notiList = NotificationService.getAllNotification();%>
        <table border="1" cellspacing="5" cellpadding="4" class="qlist">
            <tr>
                <th>User ID</th>
                <th>Notification ID</th>
                <th>Notification Type</th>
                <th>Description</th>
                <th colspan="2">Actions</th>
            </tr>

            <tr>

            <tr>
                <% for (NotificationRespons res : notiList) {%>

                <td><%=res.getUser_Id()%></td>
                <td><%=res.getNot_Id()%></td>
                <td><%=res.getNot_type()%></td>
                <td><%=res.getNot_desc()%></td>
                <td><a href="Edite_Notification.jsp?id=<%=res.getNot_Id()%>">update</a></td>
                <td><a href="DeleteNotification.jsp?id=<%=res.getNot_Id()%>" onclick="return confirm('Are you Sure?')">delete</a></td>
            </tr>
            <% }%>
        </table>
</html>
