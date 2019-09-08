<%-- 
    Document   : Edite_user
    Created on : Sep 5, 2019, 3:34:42 PM
    Author     : Sandeepa Fernando
--%>
<%@page import="model.UserRespons"%>
<%@page import="services.User_permanent_service"%>
<%@page import="model.GetUserRequest"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="../External/Bootstrap/css/bootstrap.css">
    <script src="../External/Jquery/jquery.min.js" type="text/javascript"></script>
    <body >
        <%
            String id = request.getParameter("id");
            int user_id = Integer.parseInt(id);
            GetUserRequest user = new GetUserRequest();
            user.setUser_Id(user_id);

            UserRespons userList = User_permanent_service.getUser(user);

        %>

        <br><br><br>
        <div class="container">
            <form class="form-horizontal" action="<%=request.getContextPath()%>/UpdateUserServlet" method="POST">

                <div class="form-group">
                    <label class="control-label col-sm-2">User ID :</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" value="<%= userList.getId()%>" name="name" readonly>
                    </div>
                </div>

                <div class="form-group">
                    <label class="control-label col-sm-2" >User Type :</label>
                    <div class="col-sm-10">          
                        <input type="text" class="form-control" value="<%= userList.getUtype()%>" name="utype" readonly>
                    </div>
                </div>

                <div class="form-group">
                    <label class="control-label col-sm-2" >User Name :</label>
                    <div class="col-sm-10">          
                        <input type="email" class="form-control" value="<%= userList.getUname()%>" name="uname" >
                    </div>
                </div>

                <div class="form-group">
                    <label class="control-label col-sm-2">Email :</label>
                    <div class="col-sm-10">          
                        <input type="email" class="form-control" value="<%= userList.getUemail()%>" name="email" >
                    </div>
                </div>

                <div class="form-group">
                    <label class="control-label col-sm-2">Address :</label>
                    <div class="col-sm-10">          
                        <input type="text" class="form-control" value="<%= userList.getUaddress()%>" name="address" >
                    </div>
                </div>

                <div class="form-group">
                    <label class="control-label col-sm-2">Password :</label>
                    <div class="col-sm-10">          
                        <input type="password" class="form-control" value="<%= userList.getPassword()%>" name="password" >
                    </div>
                </div>

                <div class="form-group">
                    <label class="control-label col-sm-2">Confirm Password :</label>
                    <div class="col-sm-10">          
                        <input type="password" class="form-control" value="<%= userList.getPassword()%>" name="conpass">
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
