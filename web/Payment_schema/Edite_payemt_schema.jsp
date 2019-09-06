<%-- 
    Document   : Edite_payemt_schema
    Created on : Sep 6, 2019, 7:00:39 AM
    Author     : Sandeepa Fernando
--%>

<%@page import="services.Payment_schemaService"%>
<%@page import="model.Payment_schemaRespons"%>
<%@page import="model.GetPayment_schemaRequest"%>
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
            int payid = Integer.parseInt(id);
            GetPayment_schemaRequest pay = new GetPayment_schemaRequest();
            pay.setPsId(payid);

            Payment_schemaRespons schemaList = Payment_schemaService.getPayment_schema(pay);

        %>
        <div class="container">
            <form class="form-horizontal" action="<%=request.getContextPath()%>/UpdatePaymentSchemaServlet" method="POST">

                <div class="form-group">
                    <label class="control-label col-sm-2">Payment schema ID :</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" value="<%= schemaList.getPsId()%>"  name="pay_id" readonly>
                    </div>
                </div>

                <div class="form-group">
                    <label class="control-label col-sm-2">Payment schema Name :</label>
                    <div class="col-sm-10">          
                        <input type="text" class="form-control" value="<%= schemaList.getPs_name()%>" name="pay_name">
                    </div>
                </div>

                <div class="form-group">
                    <label class="control-label col-sm-2">Payment schema Rate :</label>
                    <div class="col-sm-10">          
                        <input type="text" class="form-control" value="<%= schemaList.getPs_rate()%>" name="pay_rate">
                    </div>
                </div>

                <div class="form-group">
                    <label class="control-label col-sm-2">Payment schema Description :</label>
                    <div class="col-sm-10">          
                        <textarea class="form-control" rows="5" id="not_des" name="pay_desc"><%= schemaList.getPs_desc()%></textarea>
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
