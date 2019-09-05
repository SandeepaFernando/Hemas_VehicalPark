<%-- 
    Document   : InsertPayment_schema
    Created on : Sep 6, 2019, 12:38:32 AM
    Author     : Sandeepa Fernando
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
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
                <form class="form-horizontal" action="<%=request.getContextPath()%>/InsertPayment_schemaServlet" method="POST">

                    <div class="form-group">
                        <label class="control-label col-sm-2">Payment schema Name :</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" placeholder="Enter Payment schema Name" name="name">
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="control-label col-sm-2" >Rate (Rs.) :</label>
                        <div class="col-sm-10">          
                            <input type="number" step=0.01 class="form-control" placeholder="Enter Rate" name="rate">
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="control-label col-sm-2">Payment schema Description :</label>
                        <div class="col-sm-10">          
                            <textarea class="form-control" rows="5" id="not_des" name="desc"></textarea>
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


</html>
