<%-- 
    Document   : DeleteNotification
    Created on : Sep 5, 2019, 8:48:35 PM
    Author     : Sandeepa Fernando
--%>

<%@page import="services.NotificationService"%>
<%@page import="model.DeleteNotificationRequest"%>
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
            int notId = Integer.parseInt(id);
            DeleteNotificationRequest user = new DeleteNotificationRequest();
            user.setNotifi_id(notId);

            boolean result = NotificationService.deleteNotification(user);

            if (result == true) {
                response.sendRedirect("View_all_notification.jsp");
            } else {
                out.println("Error");
            }

        %>
    </body>
</html>
