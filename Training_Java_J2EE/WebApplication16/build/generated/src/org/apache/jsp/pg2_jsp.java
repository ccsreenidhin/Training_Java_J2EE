package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import pack.mrbean;
import pack.dbcon;

public final class pg2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>dfs</h1>\n");
      out.write("        ");
      pack.mrbean mrbean = null;
      synchronized (_jspx_page_context) {
        mrbean = (pack.mrbean) _jspx_page_context.getAttribute("mrbean", PageContext.PAGE_SCOPE);
        if (mrbean == null){
          mrbean = new pack.mrbean();
          _jspx_page_context.setAttribute("mrbean", mrbean, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("mrbean"), request);
      out.write("\n");
      out.write("       \n");
      out.write("        \n");
      out.write("        ");

            
            try{
            String s="a";
            out.println(s);
            dbcon db=new dbcon();
          
            ResultSet r=db.select1(s);
            while(r.next())
            {
                
      out.write("\n");
      out.write("               \n");
      out.write("                <input type=\"text\" name=\"roll\" value=\" ");
      out.print(r.getString(3));
      out.write("\">\n");
      out.write("                <input type=\"text\" name=\"addr\" value=\" ");
      out.print(r.getString(4));
      out.write("\">\n");
      out.write("                <input type=\"text\" name=\"phno\" value=\" ");
      out.print(r.getString(5));
      out.write("\">\n");
      out.write("                <input type=\"text\" name=\"email\" value=\" ");
      out.print(r.getString(6));
      out.write("\">\n");
      out.write("                ");

             }
            
           if(request.getParameter("button").equals("insert"))
              db.insert(mrbean);
           else if(request.getParameter("button").equals("delete"))
              db.delete(mrbean);
           else if(request.getParameter("button").equals("update"))
            {
            db.update(mrbean);
            }
            }catch (NullPointerException r)
            {
            }
        
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
