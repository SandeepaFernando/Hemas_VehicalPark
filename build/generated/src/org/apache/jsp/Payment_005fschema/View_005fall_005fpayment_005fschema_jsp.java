package org.apache.jsp.Payment_005fschema;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import services.Payment_schemaService;
import model.Payment_schemaRespons;
import java.util.List;

public final class View_005fall_005fpayment_005fschema_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"../External/css/view_allcss.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
 List<Payment_schemaRespons> schemaList = Payment_schemaService.getAllPayment_schema();
      out.write("\n");
      out.write("        <table border=\"1\" cellspacing=\"5\" cellpadding=\"4\" class=\"qlist\">\n");
      out.write("            <tr>\n");
      out.write("                <th>Payment Schema ID</th>\n");
      out.write("                <th>Payment Schema Name</th>\n");
      out.write("                <th>Payment Schema Rate</th>\n");
      out.write("                <th>Payment Schema Description</th>\n");
      out.write("                <th colspan=\"2\">Actions</th>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                ");
 for (Payment_schemaRespons res : schemaList) {
      out.write("\n");
      out.write("\n");
      out.write("                <td>");
      out.print(res.getPsId());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(res.getPs_name());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(res.getPs_rate());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(res.getPs_desc());
      out.write("</td>\n");
      out.write("                <td><a href=\"Edite_payemt_schema.jsp?id=");
      out.print(res.getPsId());
      out.write("\">update</a></td>\n");
      out.write("                <td><a href=\"Delete_Payment_schema.jsp?id=");
      out.print(res.getPsId());
      out.write("\" onclick=\"return confirm('Are you Sure?')\">delete</a></td>\n");
      out.write("            </tr>\n");
      out.write("            ");
 }
      out.write("\n");
      out.write("        </table>\n");
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