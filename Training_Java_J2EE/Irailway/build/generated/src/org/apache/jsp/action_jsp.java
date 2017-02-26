package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import pack.dbcon;

public final class action_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <title>IRCTC</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"t1\" style=\"\"></div>\n");
      out.write("        <a id=\"t2\" STYLE=\" \"><font size=\"5\"><b>INDIAN RAILWAYS</b> CUSTOMER PORTAL</font></a>\n");
      out.write("        <a id=\"t3\" STYLE=\"\"><b><font size=\"3\"><u>Hindi Version</u></font></a>\n");
      out.write("        <img src=\"IMAGES/raillogo.gif\" style=\"position:absolute; top:30px; left:220px;\"/>\n");
      out.write("        <img src=\"IMAGES/Fblogo.jpg\" style=\"position:absolute; top:90px; right:440px;\"/>\n");
      out.write("        <img src=\"IMAGES/Twitl.jpg\" style=\"position:absolute; top:90px; right:410px;\"/>\n");
      out.write("        <img src=\"IMAGES/youtube.jpg\" style=\"position:absolute; top:90px; right:360px;\"/>\n");
      out.write("        <img src=\"IMAGES/cris.gif\" style=\"position:absolute; top:70px; right:280px;\"/>\n");
      out.write("        <img src=\"IMAGES/indiagov.gif\" style=\"position:absolute; top:45px; right:210px;\"/>\n");
      out.write("        <a id=\"t4\" STYLE=\"\"><b><font size=\"3\"><u>Accident Train Chart (XYZ Express  Train No:18448)</u></font></a>\n");
      out.write("    `   <marquee vspace=\"110px\" hspace=\"200px\"> \n");
      out.write("        <div>\n");
      out.write("            <img id=\"i1\" src=\"IMAGES/animated-train-image-0031.gif\" height=\"40px\" width=\"70px\"/>\n");
      out.write("         <a Style=\"color:blue;\"><u><font size=\"3\"><u>INDIAN RAILWAY WELCOMES YOU</u></font></a>\n");
      out.write("        </div></marquee>\n");
      out.write("    \n");
      out.write("        ");
      pack.mrbean bean = null;
      synchronized (_jspx_page_context) {
        bean = (pack.mrbean) _jspx_page_context.getAttribute("bean", PageContext.PAGE_SCOPE);
        if (bean == null){
          bean = new pack.mrbean();
          _jspx_page_context.setAttribute("bean", bean, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("bean"), request);
      out.write("\n");
      out.write("        \n");
      out.write("     \n");
      out.write("        <div id=\"w1\">\n");
      out.write("            ");

            try{
            dbcon d= new dbcon();
           
            if(request.getParameter("b").equals("Insert"))
            {
            d.insert(bean);
            
      out.write("\n");
      out.write("            <center>\n");
      out.write("                <table border=\"2px\" style=\"table-layout: inherit; width:75%; \">\n");
      out.write("                    \n");
      out.write("                  \n");
      out.write("                    <tr><td>Train No</td><td>");
      out.print( request.getParameter("trainno") );
      out.write("</td></tr>\n");
      out.write("                        <tr><td>Source</th><td>");
      out.print( request.getParameter("source") );
      out.write("</td></tr>\n");
      out.write("                        <tr><td>Destination</td><td>");
      out.print( request.getParameter("destination") );
      out.write("</td></tr>\n");
      out.write("                        <tr><td>Name</td><td>");
      out.print( request.getParameter("tname") );
      out.write("</td></tr>\n");
      out.write("                        <tr><td>departure</td><td>");
      out.print( request.getParameter("deptim") );
      out.write("</td></tr>\n");
      out.write("                        <tr><td>arrival</td><td>");
      out.print( request.getParameter("arvtim") );
      out.write("</td></tr>\n");
      out.write("                        <tr><td>Days</td><td>\n");
      out.write("                                <table border=\"2px\" style=\"table-layout: inherit; width:75%; \"><tr>\n");
      out.write("                            <td>mon</td><td>");
      out.print( request.getParameter("mon") );
      out.write("</td>\n");
      out.write("                            <td>tue</td><td>");
      out.print( request.getParameter("tue") );
      out.write("</td>\n");
      out.write("                            <td>wed</td><td>");
      out.print( request.getParameter("wed") );
      out.write("</td>\n");
      out.write("                            <td>thr</td><td>");
      out.print( request.getParameter("thr") );
      out.write("</td>\n");
      out.write("                            <td>fri</td><td>");
      out.print( request.getParameter("fri") );
      out.write("</td>\n");
      out.write("                            <td>sat</td><td>");
      out.print( request.getParameter("sat") );
      out.write("</td>\n");
      out.write("                            <td>sun</td><td>");
      out.print( request.getParameter("sun") );
      out.write("</td>\n");
      out.write("                                    </tr> </table>\n");
      out.write("                            </td></tr>\n");
      out.write("                        <tr><td>1st c cost</td><td>");
      out.print( request.getParameter("cost1") );
      out.write("</td></tr>\n");
      out.write("                         <tr><td>2nd c cost</td><td>");
      out.print( request.getParameter("cost2") );
      out.write("</td></tr>\n");
      out.write("                        <tr><td>Second class seats</td><td>");
      out.print( request.getParameter("seats1") );
      out.write("</td></tr>\n");
      out.write("                        <tr><td>1st class seats</td><td>");
      out.print( request.getParameter("seats2") );
      out.write("</td></tr>\n");
      out.write("                         <td>total seats</td><td>");
      out.print( request.getParameter("totalseats") );
      out.write("</td></tr>\n");
      out.write("                </table>\n");
      out.write("            </center>\n");
      out.write("            ");

            }
            else if(request.getParameter("b").equals("book"))
            {
            //bvbhjbkjnjklm
            }
            else if(request.getParameter("b").equals("Details"))
            {
                ResultSet rs=d.select();
            
            
      out.write("\n");
      out.write("            <table border=\"2px\" style=\"table-layout: inherit; width:75%; \">\n");
      out.write("                \n");
      out.write("                <th>Train No</th>\n");
      out.write("                <th>Source</th>\n");
      out.write("                <th>Departure</th>\n");
      out.write("                <th>Destination</th>\n");
      out.write("                <th>Arrival</th>\n");
      out.write("                <th>Days Available</th>\n");
      out.write("                <th>AC Seats available</th>\n");
      out.write("                <th>Non AC Seats available</th>\n");
      out.write("                ");

            while(rs.next())
                {
                    if(request.getParameter("tname").equals(rs.getString(5)))
                
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print(rs.getString(5));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rs.getString(2));
      out.write("</td> \n");
      out.write("                            <td>");
      out.print(rs.getString(3));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rs.getString(6));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rs.getString(4));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rs.getString(7));
      out.write("</td>\n");
      out.write("                            <td>\n");
      out.write("                                <table border=\"2px\" style=\"table-layout: inherit; width:75%; \">\n");
      out.write("                                    <th>sun</th>\n");
      out.write("                                    <th>mon</th>\n");
      out.write("                                    <th>tue</th>\n");
      out.write("                                    <th>wed</th>\n");
      out.write("                                    <th>thr</th>\n");
      out.write("                                    <th>fri</th>\n");
      out.write("                                    <th>sat</th>\n");
      out.write("                                <tr>\n");
      out.write("                                        <td>");
      out.print(rs.getString(8));
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(rs.getString(9));
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(rs.getString(10));
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(rs.getString(11));
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(rs.getString(12));
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(rs.getString(13));
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(rs.getString(14));
      out.write("</td>\n");
      out.write("                                </tr>\n");
      out.write("                                </table>\n");
      out.write("                            </td>\n");
      out.write("                            <td>");
      out.print(rs.getString(17));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rs.getString(18));
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                    \n");
      out.write("                   ");
 } 
      out.write("\n");
      out.write("                   </table>\n");
      out.write("                   ");

             }
            else if(request.getParameter("b").equals("Submit"))
             {
                ResultSet rs=d.select();
            
            
      out.write("\n");
      out.write("            <table border=\"2px\" style=\"table-layout: inherit; width:75%; \">\n");
      out.write("                <th>Train Name</th>\n");
      out.write("                <th>Train No</th>\n");
      out.write("                <th>Source</th>\n");
      out.write("                <th>Departure</th>\n");
      out.write("                <th>Destination</th>\n");
      out.write("                <th>Arrival</th>\n");
      out.write("                <th>Days Available</th>\n");
      out.write("                <th>AC Seats available</th>\n");
      out.write("                <th>Non AC Seats available</th>\n");
      out.write("                ");

            while(rs.next())
                {
                   if(request.getParameter("source").equals(rs.getString(3))&&request.getParameter("destination").equals(rs.getString(4))) 
               
                    
      out.write("\n");
      out.write("                    \n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print(rs.getString(5));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rs.getString(2));
      out.write("</td> \n");
      out.write("                            <td>");
      out.print(rs.getString(3));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rs.getString(6));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rs.getString(4));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rs.getString(7));
      out.write("</td>\n");
      out.write("                            <td>\n");
      out.write("                                <table border=\"2px\" style=\"table-layout: inherit; width:75%; \">\n");
      out.write("                                    <th>sun</th>\n");
      out.write("                                    <th>mon</th>\n");
      out.write("                                    <th>tue</th>\n");
      out.write("                                    <th>wed</th>\n");
      out.write("                                    <th>thr</th>\n");
      out.write("                                    <th>fri</th>\n");
      out.write("                                    <th>sat</th>\n");
      out.write("                                <tr>\n");
      out.write("                                        <td>");
      out.print(rs.getString(8));
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(rs.getString(9));
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(rs.getString(10));
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(rs.getString(11));
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(rs.getString(12));
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(rs.getString(13));
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(rs.getString(14));
      out.write("</td>\n");
      out.write("                                </tr>\n");
      out.write("                                </table>\n");
      out.write("                            </td>\n");
      out.write("                            <td>");
      out.print(rs.getString(17));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rs.getString(18));
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                    \n");
      out.write("                   ");
 } 
      out.write("\n");
      out.write("                   </table>\n");
      out.write("                   ");

             }
            else if(request.getParameter("b").equals("Seats"))
            {
            ResultSet rs=d.select();
            
      out.write("\n");
      out.write("            <table border=\"2px\" style=\"table-layout: inherit; width:75%; \">\n");
      out.write("                <th>Train Name</th>\n");
      out.write("                <th>Train No</th>\n");
      out.write("                <th>AC Seats</th>\n");
      out.write("                <th>Non AC Seats</th>\n");
      out.write("                ");

            while(rs.next())
                {
                    
                    if(request.getParameter("tnam").equals(rs.getString(5)))
                    
      out.write("\n");
      out.write("                    \n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print(rs.getString(5));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rs.getString(17));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rs.getString(18));
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                    \n");
      out.write("                   ");
 } 
      out.write("\n");
      out.write("                   </table>\n");
      out.write("                   ");

             }
            }catch(NullPointerException e){}
            
      out.write("\n");
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
