<%-- 
    Document   : View_allRegisterd_users
    Created on : Sep 3, 2019, 10:46:42 AM
    Author     : Sandeepa Fernando
--%>

<%@page import="services.User_permanent_service"%>
<%@page import="model.UserRespons"%>
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
        <% List<UserRespons> userList = User_permanent_service.getAllUser();%>
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
                <% for (UserRespons res: userList) { %>

                <td><%=res.getId()%></td>
                <td><%=res.getUname()%></td>
                <td><%=res.getUtype()%></td>
                <td><%=res.getUemail()%></td>
                <td><%=res.getUaddress()%></td>
                <td><%=res.getPassword()%></td>
                <td><a href="Edite_user.jsp?id=<%=res.getId() %>">update</a></td>
                <td><a href="DeleteUser.jsp?id=<%=res.getId() %>" onclick="return confirm('Are you Sure?')">delete</a></td>
            </tr>
            <% }%>
        </table>
</html>
