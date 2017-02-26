package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import pack.dbcon;
import pack.mrbean;

public final class fst_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 static ResultSet rs; 
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
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\n");
      out.write("        <title>CLASSROOM</title>\n");
      out.write("        <script>\n");
      out.write("            function insert()\n");
      out.write("            {\n");
      out.write("            document.getElementById(\"ins\").style.visibility=\"visible\";\n");
      out.write("            document.getElementById(\"del\").style.visibility=\"hidden\";\n");
      out.write("            document.getElementById(\"up\").style.visibility=\"hidden\";\n");
      out.write("            document.getElementById(\"sel\").style.visibility=\"hidden\";\n");
      out.write("            }\n");
      out.write("            function del()\n");
      out.write("            {\n");
      out.write("            document.getElementById(\"del\").style.visibility=\"visible\";\n");
      out.write("            document.getElementById(\"ins\").style.visibility=\"hidden\";\n");
      out.write("            document.getElementById(\"up\").style.visibility=\"hidden\";\n");
      out.write("            document.getElementById(\"sel\").style.visibility=\"hidden\";\n");
      out.write("            }\n");
      out.write("            function update()\n");
      out.write("            {\n");
      out.write("            document.getElementById(\"up\").style.visibility=\"visible\";\n");
      out.write("            document.getElementById(\"del\").style.visibility=\"hidden\";\n");
      out.write("            document.getElementById(\"ins\").style.visibility=\"hidden\";\n");
      out.write("            document.getElementById(\"sel\").style.visibility=\"hidden\";\n");
      out.write("            }\n");
      out.write("            function select()\n");
      out.write("            {\n");
      out.write("            document.getElementById(\"sel\").style.visibility = \"visible\";\n");
      out.write("            document.getElementById(\"del\").style.visibility=\"hidden\";\n");
      out.write("            document.getElementById(\"up\").style.visibility=\"hidden\";\n");
      out.write("            document.getElementById(\"ins\").style.visibility=\"hidden\";\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            function ajax(qw)\n");
      out.write("            {\n");
      out.write("                alert(\"yes\");\n");
      out.write("               var ax=new XMLHttpRequest();\n");
      out.write("                ax.open(\"GET\",\"ne.jsp?v=\"+qw,true);\n");
      out.write("                ax.send();\n");
      out.write("                ax.onreadystatechange=function()\n");
      out.write("                {\n");
      out.write("                    if(ax.readyState==4 && ax.status==200)\n");
      out.write("                    {\n");
      out.write("                    document.getElementById(\"gg\").innerHTML=ax.responseText;\n");
      out.write("                    }\n");
      out.write("                } \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"w\" style=\"\">\n");
      out.write("                <h1 style=\"\">FACULTY</h1>\n");
      out.write("         </div>\n");
      out.write("        <div class=\"q\" STYLE=\"\">            \n");
      out.write("            <center><table >\n");
      out.write("             <tr>\n");
      out.write("                 <td><p id=\"i\" onclick=\"insert()\">INSERT</p></td>\n");
      out.write("                 <td><p id=\"d\" onclick=\"del()\">DELETE</p></td>\n");
      out.write("                 <td><p id=\"u\" onclick=\"update()\">UPDATE</p></td>\n");
      out.write("                 ");
      out.write("\n");
      out.write("            </tr>\n");
      out.write("            </table>\n");
      out.write("            </center>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div id=\"up\">\n");
      out.write("           \n");
      out.write("            <form action=\"pg2.jsp\">\n");
      out.write("            <center>\n");
      out.write("                \n");
      out.write("                    Select User Name \n");
      out.write("                     <select id=\"s1\" onchange=\"ajax(this.value)\" name=\"name\" style=\"\">\n");
      out.write("                                     ");

                dbcon e=new dbcon();
                rs=e.select();
                while(rs.next())
                {
                    
      out.write("\n");
      out.write("                    <option>");
      out.print(rs.getString(2));
      out.write("</option>\n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("                     </select>\n");
      out.write("                  \n");
      out.write("           \n");
      out.write("                     \n");
      out.write("                     <span id=\"gg\">\n");
      out.write("                   \n");
      out.write("                        <table>\n");
      out.write("                        \n");
      out.write("                 \n");
      out.write("                       </table>     \n");
      out.write("                \n");
      out.write("                </span>\n");
      out.write("                     \n");
      out.write("                <input type=\"submit\" name=\"button\" value=\"update\">\n");
      out.write("                </center>\n");
      out.write("                </form>\n");
      out.write("      \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("                     \n");
      out.write("                     \n");
      out.write("                     \n");
      out.write("                     \n");
      out.write("                     \n");
      out.write("          \n");
      out.write("        <div id=\"ins\">        \n");
      out.write("        <form action=\"pg2.jsp\">\n");
      out.write("         <center>\n");
      out.write("        <table border=\"0\" width=\"500\">\n");
      out.write("            \n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Name:</td>\n");
      out.write("                        <td><input type=\"text\" name=\"name\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Rollno:</td>\n");
      out.write("                        <td><input type=\"text\" name=\"roll\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Address:</td>\n");
      out.write("                        <td><input type=\"text\" name=\"addr\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Phoneno:</td>\n");
      out.write("                        <td><input type=\"text\" name=\"phno\"</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>email:</td>\n");
      out.write("                        <td><input type=\"text\" name=\"email\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                     \n");
      out.write("                </tbody>\n");
      out.write("        </table>\n");
      out.write("                <input type=\"submit\" name=\"button\" value=\"insert\" >  \n");
      out.write("                </center>\n");
      out.write("                </form>\n");
      out.write("        </div>\n");
      out.write("        <center>\n");
      out.write("        <div id=\"del\">\n");
      out.write("             <form id=\"sd\" action=\"pg2.jsp\">\n");
      out.write("                 Select User Name \n");
      out.write("                     <select name=\"name\" style=\"\">\n");
      out.write("                                     ");

                dbcon d=new dbcon();
              rs=d.select();
                while(rs.next())
                {
                    
      out.write("\n");
      out.write("                    <option>");
      out.print(rs.getString(2));
      out.write("</option>\n");
      out.write("                   ");
 } 
      out.write("\n");
      out.write("                     </select>\n");
      out.write("                    <input type=\"submit\" name=\"button\" value=\"delete\">\n");
      out.write("             </form>\n");
      out.write("        </div>\n");
      out.write("      </center>\n");
      out.write("        \n");
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
