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
    <title></title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="../External/Bootstrap/css/bootstrap.css">
    <link rel="stylesheet" href="../External/css/view_allcss.css">
    <script src="../External/Jquery/jquery.min.js" type="text/javascript"></script>
    <style>
        html,body,h1,h2,h3,h4,h5 {font-family: "Raleway", sans-serif}
    </style>
    <body class="w3-light-grey">

        <!-- Top container -->
        <div class="w3-bar w3-top w3-black w3-large" style="z-index:4">
            <button class="w3-bar-item w3-button w3-hide-large w3-hover-none w3-hover-text-light-grey" onclick="w3_open();"><i class="fa fa-bars"></i>  Menu</button>
            <span class="w3-bar-item w3-right">Logo</span>
        </div>

        <!-- Sidebar/menu -->
        <nav class="w3-sidebar w3-collapse w3-white w3-animate-left" style="z-index:3;width:300px;" id="mySidebar"><br>
            <div class="w3-container w3-row">
                <div class="w3-col s4">
                    <img src="../External/images/logo-300x151.png" class="w3-circle w3-margin-right" style="width:50px">
                </div>
                <div class="w3-col s8 w3-bar">
                    <span>Welcome, <strong>Mike</strong></span><br>
                    <a href="#" class="w3-bar-item w3-button"><i class="fa fa-envelope"></i></a>
                    <a href="#" class="w3-bar-item w3-button"><i class="fa fa-user"></i></a>
                    <a href="#" class="w3-bar-item w3-button"><i class="fa fa-cog"></i></a>
                </div>
            </div>
            <hr>
            <div class="w3-container">
                <h5>Dashboard</h5>
            </div>
            <%@include file="../includes/Side_bar.jsp" %>
        </nav>


        <!-- Overlay effect when opening sidebar on small screens -->
        <div class="w3-overlay w3-hide-large w3-animate-opacity" onclick="w3_close()" style="cursor:pointer" title="close side menu" id="myOverlay"></div>

        <!-- !PAGE CONTENT! -->
        <div class="w3-main" style="margin-left:300px;margin-top:43px;">
            <br>
            <div class="row">
                <div class="col-3">
                    <h1>All Notifications</h1>
                </div>
            </div>

            <br><br>
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
        </div>

    </body>

</html>
