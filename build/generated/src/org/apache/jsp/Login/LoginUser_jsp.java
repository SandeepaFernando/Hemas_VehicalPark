package org.apache.jsp.Login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class LoginUser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <!--===============================================================================================-->\t\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"images/icons/favicon.ico\"/>\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/bootstrap/css/bootstrap.min.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/font-awesome-4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/Linearicons-Free-v1.0.0/icon-font.min.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/animate/animate.css\">\n");
      out.write("        <!--===============================================================================================-->\t\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/css-hamburgers/hamburgers.min.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/animsition/css/animsition.min.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/select2/select2.min.css\">\n");
      out.write("        <!--===============================================================================================-->\t\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/daterangepicker/daterangepicker.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/util.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/main.css\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <style>\n");
      out.write("            .wrap-input100 {\n");
      out.write("                display: -webkit-box;\n");
      out.write("                display: -webkit-flex;\n");
      out.write("                display: -moz-box;\n");
      out.write("                display: -ms-flexbox;\n");
      out.write("                display: flex;\n");
      out.write("                flex-wrap: wrap;\n");
      out.write("                align-items: flex-end;\n");
      out.write("                width: 100%;\n");
      out.write("                height: 100px;\n");
      out.write("                position: relative;\n");
      out.write("                border: 1px solid #e6e6e6;\n");
      out.write("                border-radius: 10px;\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: #666666;\">\n");
      out.write("\n");
      out.write("        <div class=\"limiter\">\n");
      out.write("            <div class=\"container-login100\">\n");
      out.write("                <div class=\"wrap-login100\">\n");
      out.write("                    <form class=\"login100-form validate-form\" action=\"");
      out.print(request.getContextPath());
      out.write("/LoginServlet\">\n");
      out.write("                        <span class=\"login100-form-title p-b-43\">\n");
      out.write("                            Login to continue\n");
      out.write("                        </span>\n");
      out.write("\n");
      out.write("                        <div class=\"wrap-input100\">\n");
      out.write("\n");
      out.write("                            <select class=\"form-control\" name=\"type\">\n");
      out.write("                                <option value=\"admin\">Admin</option>\n");
      out.write("                                <option value=\"user\">User</option>\n");
      out.write("                            </select>\n");
      out.write("                            <span class=\"focus-input100\"></span>\n");
      out.write("\n");
      out.write("                            <span class=\"label-input100\">Select user type</span>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"wrap-input100 validate-input\" data-validate = \"Valid email is required: ex@abc.xyz\">\n");
      out.write("                            <input class=\"input100\" type=\"text\" name=\"name\">\n");
      out.write("                            <span class=\"focus-input100\"></span>\n");
      out.write("                            <span class=\"label-input100\">User Name</span>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"wrap-input100 validate-input\" data-validate=\"Password is required\">\n");
      out.write("                            <input class=\"input100\" type=\"password\" name=\"pass\">\n");
      out.write("                            <span class=\"focus-input100\"></span>\n");
      out.write("                            <span class=\"label-input100\">Password</span>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"flex-sb-m w-full p-t-3 p-b-32\">\n");
      out.write("                            <div class=\"contact100-form-checkbox\">\n");
      out.write("                                <input class=\"input-checkbox100\" id=\"ckb1\" type=\"checkbox\" name=\"remember-me\">\n");
      out.write("                                <label class=\"label-checkbox100\" for=\"ckb1\">\n");
      out.write("                                    Remember me\n");
      out.write("                                </label>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div>\n");
      out.write("                                <a href=\"#\" class=\"txt1\">\n");
      out.write("                                    Forgot Password?\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"container-login100-form-btn\">\n");
      out.write("                            <button class=\"login100-form-btn\">\n");
      out.write("                                Login\n");
      out.write("                            </button>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"text-center p-t-46 p-b-20\">\n");
      out.write("                            <span class=\"txt2\">\n");
      out.write("                                or sign up using\n");
      out.write("                            </span>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"login100-form-social flex-c-m\">\n");
      out.write("                            <a href=\"#\" class=\"login100-form-social-item flex-c-m bg1 m-r-5\">\n");
      out.write("                                <i class=\"fa fa-facebook-f\" aria-hidden=\"true\"></i>\n");
      out.write("                            </a>\n");
      out.write("\n");
      out.write("                            <a href=\"#\" class=\"login100-form-social-item flex-c-m bg2 m-r-5\">\n");
      out.write("                                <i class=\"fa fa-twitter\" aria-hidden=\"true\"></i>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("                    <div class=\"login100-more\" style=\"background-image: url('../External/images/bg-012.jpg');\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <script src=\"vendor/jquery/jquery-3.2.1.min.js\"></script>\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <script src=\"vendor/animsition/js/animsition.min.js\"></script>\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <script src=\"vendor/bootstrap/js/popper.js\"></script>\n");
      out.write("        <script src=\"vendor/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <script src=\"vendor/select2/select2.min.js\"></script>\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <script src=\"vendor/daterangepicker/moment.min.js\"></script>\n");
      out.write("        <script src=\"vendor/daterangepicker/daterangepicker.js\"></script>\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <script src=\"vendor/countdowntime/countdowntime.js\"></script>\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
      out.write("\n");
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
