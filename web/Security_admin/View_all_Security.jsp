<%-- 
    Document   : View_all_Security
    Created on : Sep 7, 2019, 10:07:39 AM
    Author     : Sandeepa Fernando
--%>

<%@page import="model.UserRespons"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="services.SecurityService"%>
<%@page import="model.SecurityRespons"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="../External/css/view_allcss.css">

        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="../External/Bootstrap/css/bootstrap.css">
        <script src="../External/Jquery/jquery.min.js" type="text/javascript"></script>
        <style>
            html,body,h1,h2,h3,h4,h5 {font-family: "Raleway", sans-serif}
        </style>
    </head>
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

            <% List<SecurityRespons> userList = SecurityService.getAllUser();%>
            
            <h1> All Admins</h1>
            
            <table border="1" cellspacing="5" cellpadding="4" class="qlist">
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Type</th>
                    <th>Email</th>
                    <th>Address</th>
                    <th>Password</th>
                    <th colspan="2">Actions</th>
                </tr>

                <tr>

                <tr>
                    <% for (SecurityRespons res : userList) {%>

                    <td><%=res.getId()%></td>
                    <td><%=res.getUname()%></td>
                    <td><%=res.getUtype()%></td>
                    <td><%=res.getUemail()%></td>
                    <td><%=res.getUaddress()%></td>
                    <td><%=res.getPassword()%></td>
                    <td><a href="Edite_user.jsp?id=<%=res.getId()%>">update</a></td>
                    <td><a href="DeleteUser.jsp?id=<%=res.getId()%>" onclick="return confirm('Are you Sure?')">delete</a></td>
                </tr>
                <% }%>
            </table>
        </div>
    </body>
</html>
