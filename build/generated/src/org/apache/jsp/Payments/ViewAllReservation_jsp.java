package org.apache.jsp.Payments;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import services.RegisteredService;
import model.RegisteredRespons;
import java.util.List;

public final class ViewAllReservation_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Payments/../includes/Side_bar.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <title></title>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Raleway\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"../External/Bootstrap/css/bootstrap.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"../External/css/view_allcss.css\">\n");
      out.write("    <script src=\"../External/Jquery/jquery.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        var nigga=document.getElementById(\"sandeepa\");\n");
      out.write("        console.log(nigga);\n");
      out.write("        \n");
      out.write("    </script>\n");
      out.write("    <style>\n");
      out.write("        html,body,h1,h2,h3,h4,h5 {font-family: \"Raleway\", sans-serif}\n");
      out.write("    </style>\n");
      out.write("    <body class=\"w3-light-grey\">\n");
      out.write("\n");
      out.write("        <!-- Top container -->\n");
      out.write("        <div class=\"w3-bar w3-top w3-black w3-large\" style=\"z-index:4\">\n");
      out.write("            <button class=\"w3-bar-item w3-button w3-hide-large w3-hover-none w3-hover-text-light-grey\" onclick=\"w3_open();\"><i class=\"fa fa-bars\"></i>  Menu</button>\n");
      out.write("            <span class=\"w3-bar-item w3-right\">Logo</span>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Sidebar/menu -->\n");
      out.write("        <nav class=\"w3-sidebar w3-collapse w3-white w3-animate-left\" style=\"z-index:3;width:300px;\" id=\"mySidebar\"><br>\n");
      out.write("            <div class=\"w3-container w3-row\">\n");
      out.write("                <div class=\"w3-col s4\">\n");
      out.write("                    <img src=\"../External/images/logo-300x151.png\" class=\"w3-circle w3-margin-right\" style=\"width:50px\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"w3-col s8 w3-bar\">\n");
      out.write("                    <span>Welcome, <strong>Mike</strong></span><br>\n");
      out.write("                    <a href=\"#\" class=\"w3-bar-item w3-button\"><i class=\"fa fa-envelope\"></i></a>\n");
      out.write("                    <a href=\"#\" class=\"w3-bar-item w3-button\"><i class=\"fa fa-user\"></i></a>\n");
      out.write("                    <a href=\"#\" class=\"w3-bar-item w3-button\"><i class=\"fa fa-cog\"></i></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <hr>\n");
      out.write("            <div class=\"w3-container\">\n");
      out.write("                <h5>Dashboard</h5>\n");
      out.write("            </div>\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"w3-bar-block\">\n");
      out.write("            <a href=\"#\" class=\"w3-bar-item w3-button w3-padding-16 w3-hide-large w3-dark-grey w3-hover-black\" onclick=\"w3_close()\" title=\"close menu\"><i class=\"fa fa-remove fa-fw\"></i>  Close Menu</a>\n");
      out.write("            <a href=\"#\" class=\"w3-bar-item w3-button w3-padding w3-blue\"><i class=\"fa fa-users fa-fw\"></i>  Overview</a>\n");
      out.write("            <a href=\"#\" class=\"w3-bar-item w3-button w3-padding\"><i class=\"fa fa-eye fa-fw\"></i>  Parking Grid</a>\n");
      out.write("            <a href=\"../Security_admin/SecurityInsert.jsp\" class=\"w3-bar-item w3-button w3-padding\"><i class=\"fa fa-users fa-fw\"></i>  Admin Registration</a>\n");
      out.write("            <a href=\"../UserRegistration/PrementUserRegistration.jsp\" class=\"w3-bar-item w3-button w3-padding\"><i class=\"fa fa-users fa-fw\"></i>  User Registration</a>\n");
      out.write("            <a href=\"#\" class=\"w3-bar-item w3-button w3-padding\"><i class=\"fa fa-bullseye fa-fw\"></i>  Temporary Registration</a>\n");
      out.write("            <a href=\"#\" class=\"w3-bar-item w3-button w3-padding\"><i class=\"fa fa-diamond fa-fw\"></i>  Bookings</a>\n");
      out.write("            <a href=\"../Payment_schema/InsertPayment_schema.jsp\" class=\"w3-bar-item w3-button w3-padding\"><i class=\"fa fa-bell fa-fw\"></i>  Payments Schema</a>\n");
      out.write("            <a href=\"../Payment_schema/InsertPayment_schema.jsp\" class=\"w3-bar-item w3-button w3-padding\"><i class=\"fa fa-bell fa-fw\"></i>  Payments</a>\n");
      out.write("            <a href=\"#\" class=\"w3-bar-item w3-button w3-padding\"><i class=\"fa fa-bank fa-fw\"></i>  Feedback</a>\n");
      out.write("            <a href=\"#\" class=\"w3-bar-item w3-button w3-padding\"><i class=\"fa fa-history fa-fw\"></i>  Complaints</a>\n");
      out.write("            <a href=\"../Notification/InsertNotification.jsp\" class=\"w3-bar-item w3-button w3-padding\"><i class=\"fa fa-cog fa-fw\"></i>  Notification</a><br><br>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            // Get the Sidebar\n");
      out.write("            var mySidebar = document.getElementById(\"mySidebar\");\n");
      out.write("\n");
      out.write("            // Get the DIV with overlay effect\n");
      out.write("            var overlayBg = document.getElementById(\"myOverlay\");\n");
      out.write("\n");
      out.write("            // Toggle between showing and hiding the sidebar, and add overlay effect\n");
      out.write("            function w3_open() {\n");
      out.write("                if (mySidebar.style.display === 'block') {\n");
      out.write("                    mySidebar.style.display = 'none';\n");
      out.write("                    overlayBg.style.display = \"none\";\n");
      out.write("                } else {\n");
      out.write("                    mySidebar.style.display = 'block';\n");
      out.write("                    overlayBg.style.display = \"block\";\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            // Close the sidebar with the close button\n");
      out.write("            function w3_close() {\n");
      out.write("                mySidebar.style.display = \"none\";\n");
      out.write("                overlayBg.style.display = \"none\";\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Overlay effect when opening sidebar on small screens -->\n");
      out.write("        <div class=\"w3-overlay w3-hide-large w3-animate-opacity\" onclick=\"w3_close()\" style=\"cursor:pointer\" title=\"close side menu\" id=\"myOverlay\"></div>\n");
      out.write("\n");
      out.write("        <!-- !PAGE CONTENT! -->\n");
      out.write("        <div class=\"w3-main\" style=\"margin-left:300px;margin-top:43px;\">\n");
      out.write("            <br>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-3\">\n");
      out.write("                    <h1>All Reservation</h1>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <br><br>\n");
      out.write("            ");
 List<RegisteredRespons> resList = RegisteredService.getAllReservations();
      out.write("\n");
      out.write("            <table border=\"1\" cellspacing=\"5\" cellpadding=\"4\" class=\"qlist\">\n");
      out.write("                <tr>\n");
      out.write("                    <th>User ID</th>\n");
      out.write("                    <th>Vehicle NO.</th>\n");
      out.write("                    <th>NIC</th>\n");
      out.write("                    <th>Arrived Time</th>\n");
      out.write("                    <th colspan=\"1\">Actions</th>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    ");
 for (RegisteredRespons res : resList) {
      out.write("\n");
      out.write("\n");
      out.write("                    <td>");
      out.print(res.getUser_Id());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(res.getRVehicleNo());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(res.getRNIC());
      out.write("</td>\n");
      out.write("                    <td id=\"sandeepa\">");
      out.print(res.getRArrivedTime());
      out.write("</td>\n");
      out.write("                    <td><a href=\"PayNow.jsp?id=");
      out.print(res.getUser_Id());
      out.write("\" onclick=\"return confirm('Are you Sure?')\">Pay Now</a></td>\n");
      out.write("                </tr>\n");
      out.write("                ");
 }
      out.write("\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
