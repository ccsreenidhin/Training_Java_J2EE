package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import java.util.List;
import pack.db;

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
      out.write("        <h1>Insert</h1>\n");
      out.write("        <div>\n");
      out.write("            <form action=\"newjsp1.jsp\">\n");
      out.write("                <input type=\"text\" name=\"name\" value=\"name\">\n");
      out.write("                <input type=\"text\" name=\"rollno\" value=\"rollno\">\n");
      out.write("                <input type=\"text\" name=\"address\" value=\"address\">\n");
      out.write("                <input type=\"text\" name=\"phno\" value=\"phno\">\n");
      out.write("                <input type=\"text\" name=\"email\" value=\"email\">\n");
      out.write("                <input type=\"submit\" name=\"b\" value=\"insert\">\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <h1>Delete</h1>\n");
      out.write("        <div id=\"d2\" style=\"position:relative;\">\n");
      out.write("            <form action=\"newjsp1.jsp\">\n");
      out.write("                <select name=\"name\" value=\"name\">    \n");
      out.write("                ");

                    db q=new db();
                    List l=q.select();
                    Iterator it=l.iterator();
                    while(it.hasNext())
                       
                    {
                         
      out.write("\n");
      out.write("                        <option>");
      out.print(it.next());
      out.write("</option>\n");
      out.write("                        ");

                    }
                    
      out.write("\n");
      out.write("           \n");
      out.write("                </select>  \n");
      out.write("                 <input type=\"submit\" name=\"b\" value=\"delete\">\n");
      out.write("            </form>\n");
      out.write("         </div>\n");
      out.write("          <h1>Update</h1>\n");
      out.write("          \n");
      out.write("        <div id=\"d3\" style=\"position:realtive;\">\n");
      out.write("            <form action=\"newjsp1.jsp\">\n");
      out.write("            <select name=\"name\" value=\"name\">    \n");
      out.write("                ");

                    db w=new db();
                    List m=w.select();
                    Iterator itr=m.iterator();
                    while(itr.hasNext())
                       
                    {
                         
      out.write("\n");
      out.write("                        <option>");
      out.print(itr.next());
      out.write("</option>\n");
      out.write("                        ");

                    }
                    
      out.write("\n");
      out.write("           \n");
      out.write("                </select>  \n");
      out.write("                <input type=\"text\" name=\"rollno\" value=\"rollno\">\n");
      out.write("                <input type=\"text\" name=\"address\" value=\"address\">\n");
      out.write("                <input type=\"text\" name=\"phno\" value=\"phno\">\n");
      out.write("                <input type=\"text\" name=\"email\" value=\"email\">    \n");
      out.write("                <input type=\"submit\" name=\"b\" value=\"update\"> \n");
      out.write("           </form>\n");
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
