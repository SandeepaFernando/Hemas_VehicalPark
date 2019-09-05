<%-- 
    Document   : Edite_Notification
    Created on : Sep 5, 2019, 7:19:49 PM
    Author     : Sandeepa Fernando
--%>

<%@page import="model.NotificationRespons"%>
<%@page import="services.NotificationService"%>
<%@page import="model.GetNotificationRequest"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
    </head>
    <body>
        <%
            String id = request.getParameter("id");
            int noti_id = Integer.parseInt(id);
            GetNotificationRequest noti = new GetNotificationRequest();
            noti.setNotifi_id(noti_id);

            NotificationRespons userList = NotificationService.getNotification(noti);

        %>
        <div class="container">
            <form class="form-horizontal" action="<%=request.getContextPath()%>/UpdateNotificationServlet" method="POST">

                <div class="form-group">
                    <label class="control-label col-sm-2">Notification ID :</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" value="<%= userList.getNot_Id()%>"  name="not_id" readonly>
                    </div>
                </div>

                <div class="form-group">
                    <label class="control-label col-sm-2">User ID :</label>
                    <div class="col-sm-10">          
                        <input type="text" class="form-control" value="<%= userList.getUser_Id()%>" name="user_id" readonly>
                    </div>
                </div>

                <div class="form-group">
                    <label class="control-label col-sm-2">Notification Type :</label>
                    <div class="col-sm-10">          
                        <input type="text" class="form-control" value="<%= userList.getNot_type()%>" name="not_type">
                    </div>
                </div>

                <div class="form-group">
                    <label class="control-label col-sm-2">Notification Description :</label>
                    <div class="col-sm-10">          
                        <textarea class="form-control" rows="5" id="not_des" name="not_des"><%= userList.getNot_desc()%></textarea>
                    </div>
                </div>

                <div class="form-group">        
                    <div class="col-sm-offset-2 col-sm-10">
                        <button type="submit" class="btn btn-default">Submit</button>
                    </div>
                </div>

            </form>
        </div>
    </body>
</html>
