<%-- 
    Document   : SecurityInsert
    Created on : Sep 6, 2019, 10:30:11 AM
    Author     : Sandeepa Fernando
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <title>Admin</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
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
            <br><br><br><br>

            <div class="container">
                <form class="form-horizontal" action="<%=request.getContextPath()%>/InsertSecurityServlet" method="POST">

                    <div class="form-group">
                        <label class="control-label col-sm-2">Name :</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" placeholder="Enter Name" name="name">
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="control-label col-sm-2">User Type :</label>
                        <div class="col-sm-10">          
                            <select class="form-control" name="type">
                                <option value="admin">Admin</option>
                            </select>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="control-label col-sm-2" >Email :</label>
                        <div class="col-sm-10">          
                            <input type="email" class="form-control" placeholder="Enter Email" name="email">
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="control-label col-sm-2">Address :</label>
                        <div class="col-sm-10">          
                            <input type="text" class="form-control" placeholder="Enter Vehicle No." name="address">
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="control-label col-sm-2">Working Hours :</label>
                        <div class="col-sm-10">          
                            <input type="number" class="form-control" placeholder="Enter Vehicle No." name="whrs">
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="control-label col-sm-2">Password :</label>
                        <div class="col-sm-10">          
                            <input type="password" class="form-control" placeholder="Enter Vehicle No." name="password">
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="control-label col-sm-2">Confirm Password :</label>
                        <div class="col-sm-10">          
                            <input type="password" class="form-control" placeholder="Enter Vehicle No." name="conpass">
                        </div>
                    </div>

                    <div class="form-group">        
                        <div class="col-sm-offset-2 col-sm-10">
                            <button type="submit" class="btn btn-default">Submit</button>
                        </div>
                    </div>

                </form>
            </div>


        </div>


    </body>
</html>
