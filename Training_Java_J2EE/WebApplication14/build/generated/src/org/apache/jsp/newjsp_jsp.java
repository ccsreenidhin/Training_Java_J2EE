package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script>\n");
      out.write("            function ajax()\n");
      out.write("            {\n");
      out.write("                var ax=new XMLHttpRequest();\n");
      out.write("                ax.open(\"GET\",\"hel.jsp\",true);\n");
      out.write("                ax.send();\n");
      out.write("                ax.onreadystatechange = function()\n");
      out.write("               {\n");
      out.write("                    if(ax.readyState == 4 && ax.status == 200)\n");
      out.write("                    {\n");
      out.write("                    document.getElementById(\"a1\").innerHTML=ax.responseText;\n");
      out.write("                    }\n");
      out.write("               }    \n");
      out.write("                    \n");
      out.write("            }\n");
      out.write("         </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <input type=\"text\" onkeyup=\"ajax()\">\n");
      out.write("        \n");
      out.write("        <p id=\"a1\">sdcfsdbf jksbncvjkxc jkxbvhbxhcv zxjkcvnj klxbcvbzc\n");
      out.write("        cvsbv hjbxv jknxjk cvnxklcv kldsz vkxdnvjkndc vn\n");
      out.write("        sc jnvckn xc vmxzc klvm\n");
      out.write("        </p>\n");
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
