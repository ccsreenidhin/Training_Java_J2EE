package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class book_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("         <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <div id=\"t1\" style=\"\"></div>\n");
      out.write("        <a id=\"t2\" STYLE=\" \"><font size=\"5\"><b>INDIAN RAILWAYS</b> CUSTOMER PORTAL</font></a>\n");
      out.write("        <a id=\"t3\" STYLE=\"\"><b><font size=\"3\"><u>Hindi Version</u></font></a>\n");
      out.write("        <img src=\"IMAGES/raillogo.gif\" style=\"position:fixed; top:30px; left:220px;\"/>\n");
      out.write("        <img src=\"IMAGES/Fblogo.jpg\" style=\"position:fixed; top:90px; right:440px;\"/>\n");
      out.write("        <img src=\"IMAGES/Twitl.jpg\" style=\"position:fixed; top:90px; right:410px;\"/>\n");
      out.write("        <img src=\"IMAGES/youtube.jpg\" style=\"position:fixed; top:90px; right:360px;\"/>\n");
      out.write("        <img src=\"IMAGES/cris.gif\" style=\"position:fixed; top:70px; right:280px;\"/>\n");
      out.write("        <img src=\"IMAGES/indiagov.gif\" style=\"position:fixed; top:45px; right:210px;\"/>\n");
      out.write("        <a id=\"t4\" STYLE=\"\"><b><font size=\"3\"><u>Accident Train Chart (Hirakhand Express  Train No:18448)</u></font></a>\n");
      out.write("    `   <marquee vspace=\"110px\" hspace=\"200px\"> \n");
      out.write("        <div>\n");
      out.write("            <img id=\"i1\" src=\"IMAGES/animated-train-image-0031.gif\" height=\"40px\" width=\"70px\"/>\n");
      out.write("         <a Style=\"color:blue;\"><u><font size=\"3\"><u>INDIAN RAILWAY WELCOMES YOU</u></font></a>\n");
      out.write("        </div></marquee>\n");
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
