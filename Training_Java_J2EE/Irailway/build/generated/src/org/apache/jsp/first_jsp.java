package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import pack.dbcon;

public final class first_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Indian Railway</title>\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("         <script>\n");
      out.write("             \n");
      out.write("             function windsd(element,clr)\n");
      out.write("             {\n");
      out.write("               document.getElementById(\"srcd\").style.visibility=\"visible\";\n");
      out.write("               document.getElementById(\"bk\").style.visibility=\"hidden\";\n");
      out.write("               document.getElementById(\"sa\").style.visibility=\"hidden\";\n");
      out.write("               document.getElementById(\"td\").style.visibility=\"hidden\";\n");
      out.write("               document.getElementById(\"t15\").style.visibility=\"hidden\";\n");
      out.write("             }\n");
      out.write("             function windbk(element,clr)\n");
      out.write("             {\n");
      out.write("              document.getElementById(\"bk\").style.visibility=\"visible\";\n");
      out.write("               document.getElementById(\"srcd\").style.visibility=\"hidden\";\n");
      out.write("               document.getElementById(\"sa\").style.visibility=\"hidden\";\n");
      out.write("               document.getElementById(\"td\").style.visibility=\"hidden\";\n");
      out.write("               document.getElementById(\"t15\").style.visibility=\"hidden\";\n");
      out.write("             }\n");
      out.write("             \n");
      out.write("             function windtd(element,clr)\n");
      out.write("             {\n");
      out.write("             document.getElementById(\"sa\").style.visibility=\"visible\";\n");
      out.write("             document.getElementById(\"srcd\").style.visibility=\"hidden\";\n");
      out.write("             document.getElementById(\"bk\").style.visibility=\"hidden\";\n");
      out.write("             document.getElementById(\"td\").style.visibility=\"hidden\";\n");
      out.write("             document.getElementById(\"t15\").style.visibility=\"hidden\";\n");
      out.write("             }\n");
      out.write("              function windsa(element,clr)\n");
      out.write("             {\n");
      out.write("             document.getElementById(\"td\").style.visibility=\"visible\";\n");
      out.write("             document.getElementById(\"srcd\").style.visibility=\"hidden\";\n");
      out.write("             document.getElementById(\"sa\").style.visibility=\"hidden\";\n");
      out.write("             document.getElementById(\"bk\").style.visibility=\"hidden\";\n");
      out.write("             document.getElementById(\"t15\").style.visibility=\"hidden\";\n");
      out.write("             }\n");
      out.write("             function windin(element,clr)\n");
      out.write("             {\n");
      out.write("             document.getElementById(\"t15\").style.visibility=\"visible\";\n");
      out.write("             document.getElementById(\"srcd\").style.visibility=\"hidden\";\n");
      out.write("             document.getElementById(\"sa\").style.visibility=\"hidden\";\n");
      out.write("             document.getElementById(\"bk\").style.visibility=\"hidden\";\n");
      out.write("             document.getElementById(\"td\").style.visibility=\"hidden\";\n");
      out.write("             }\n");
      out.write("         </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"t1\" style=\"\"></div>\n");
      out.write("        <a id=\"t2\" STYLE=\" \"><b><font size=\"5\">INDIAN RAILWAYS PASSENGER RESERVATION ENQUIRY</b></font></a>\n");
      out.write("        <a id=\"t3\" STYLE=\"\"><b><font size=\"3\"><u>Hindi Version</u></font></a>\n");
      out.write("        <img src=\"IMAGES/raillogo.gif\" style=\"position:fixed; top:30px; left:220px;\"/>\n");
      out.write("        <img src=\"IMAGES/Fblogo.jpg\" style=\"position:fixed; top:90px; right:440px;\"/>\n");
      out.write("        <img src=\"IMAGES/Twitl.jpg\" style=\"position:fixed; top:90px; right:410px;\"/>\n");
      out.write("        <img src=\"IMAGES/youtube.jpg\" style=\"position:fixed; top:90px; right:360px;\"/>\n");
      out.write("        <img src=\"IMAGES/cris.gif\" style=\"position:fixed; top:70px; right:280px;\"/>\n");
      out.write("        <img src=\"IMAGES/indiagov.gif\" style=\"position:fixed; top:45px; right:210px;\"/>\n");
      out.write("        <a id=\"t4\" STYLE=\"\"><b><font size=\"3\"><u>Accident Train Chart (XYZ Express  Train No:18448)</u></font></a>\n");
      out.write("    `   <marquee vspace=\"110px\" hspace=\"200px\"> \n");
      out.write("        <div>\n");
      out.write("            <img id=\"i1\" src=\"IMAGES/animated-train-image-0031.gif\" height=\"40px\" width=\"70px\"/>\n");
      out.write("         <a Style=\"color:blue;\"><u><font size=\"3\"><u>Please help Indian railways and government of India in moving towards a digitized and cashless economy. Eradicate black money.</u></font></a>\n");
      out.write("        </div></marquee>\n");
      out.write("       \n");
      out.write("       \n");
      out.write("       \n");
      out.write("        <div id=\"t5\" style=\" \">\n");
      out.write("            <table id=\"op\" style=\"cursor:pointer;\">\n");
      out.write("                <tr>\n");
      out.write("                    <td><p id=\"e\" onclick=\"windin(this, 'black')\"><font size=\"3\">Insert &nbsp;&nbsp;&nbsp;</font></p></td>\n");
      out.write("                   \n");
      out.write("                      <td>  <p id=\"a\" onclick=\"windsd(this, 'black')\"><font size=\"3\"> Train Between Stations &nbsp;&nbsp;&nbsp;</font></p></td>\n");
      out.write("                 \n");
      out.write("                        <td><p id=\"b\" onclick=\"windsa(this, 'black')\"><font size=\"3\">Seat Availability &nbsp;&nbsp;&nbsp;</font></p></td>\n");
      out.write("                   \n");
      out.write("                        <td><p id=\"c\" onclick=\"windbk(this, 'black')\"><font size=\"3\">Book Tickets &nbsp;&nbsp;&nbsp;</font></p></td>\n");
      out.write("                   \n");
      out.write("                        <td><p id=\"d\" onclick=\"windtd(this, 'black')\"><font size=\"3\">Train Details &nbsp;&nbsp;&nbsp;</font></p></td> \n");
      out.write("                        \n");
      out.write("                        <td><form action=\"login.jsp\"><input type=\"submit\" class=\"btn btn-primary\" name=\"b\" value=\"login\" style=\"cursor:pointer\"></form></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>         \n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("    \n");
      out.write("         <img src=\"IMAGES/header.JPG\" style=\"position:fixed; top:230px; right:210px;\"/>\n");
      out.write("         <img src=\"IMAGES/experiance.jpg\" style=\"position:fixed; top:480px; left:430px;\"/>\n");
      out.write("         <img src=\"IMAGES/india.gif\" style=\"position:fixed; top:460px; right:220px;\"/>\n");
      out.write("         <a id=\"t6\" STYLE=\"\"><font size=\"2px\">India has some of the most spectacular and unforgettable rail journeys in the world. Here you experience a simple<br> way to find out everything you need to know in one easy place. There's no better way to enjoy India's outback, cities,<br> coastal towns andregional areas in comfort.</font></a>\n");
      out.write("         \n");
      out.write("         <div id=\"t7\" style=\"\"> <a>Services</a></div>\n");
      out.write("            \n");
      out.write("         \n");
      out.write("         <div id=\"t8\" style=\"\">\n");
      out.write("            <table border=\"5\" bordercolor=\"blue\" >\n");
      out.write("                <tr>\n");
      out.write("                <td style=\"width:200px\"><li><a><font size=\"2\">Mobile Ticketing</font></a></li> \n");
      out.write("                \n");
      out.write("                <li><a><font size=\"2\"> Registration of Train<br> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Tariff Rate</font></a></li>\n");
      out.write("                \n");
      out.write("                <li><a><font size=\"2\">Availability at Stations</font></a></li>\n");
      out.write("                \n");
      out.write("                <li><a><font size=\"2\">Reserved Train Schedule</font></a> </li>\n");
      out.write("                \n");
      out.write("                <li> <a><font size=\"2\">National Train Enquiry</font></a> </li>\n");
      out.write("                \n");
      out.write("                <li><a><font size=\"2\">SMS Service</font></a></li>\n");
      out.write("                \n");
      out.write("                <li> <a><font size=\"2\">Current Booking </font></a></li>\n");
      out.write("                \n");
      out.write("                <li><a><font size=\"2\">Train Berth </font></a></li></td>\n");
      out.write("                \n");
      out.write("                </tr>                    \n");
      out.write("            </table> \n");
      out.write("         </div>\n");
      out.write("         \n");
      out.write("         \n");
      out.write("         <div id=\"t9\" style=\"\"><a>Information</a></div>\n");
      out.write("         \n");
      out.write("         <div id=\"t10\" style=\"\">\n");
      out.write("            <table border=\"5\" bordercolor=\"blue\">\n");
      out.write("                <tr><td style=\"width:200px\">  \n");
      out.write("                <li> <a><font size=\"2\">Trains at a Glance</font></a></li> \n");
      out.write("                \n");
      out.write("                <li> <a><font size=\"2\"> Catering Charges</font></a> </li>\n");
      out.write("                \n");
      out.write("                <li> <a><font size=\"2\">Train Type </font></a></li>\n");
      out.write("                \n");
      out.write("                <li><a><font size=\"2\">View Codes</font></a></li>\n");
      out.write("                \n");
      out.write("                <li><a><font size=\"2\">Rules</font></a></li>\n");
      out.write("                \n");
      out.write("                <li><a><font size=\"2\">International Tourists</font></a></li>\n");
      out.write("                \n");
      out.write("                <li><a><font size=\"2\">Tatkal Scheme</font></a></li>\n");
      out.write("                \n");
      out.write("                <li><a><font size=\"2\">Other Railway Websites</font></a></li>\n");
      out.write("                </td></tr>                    \n");
      out.write("            </table> \n");
      out.write("         </div>\n");
      out.write("         \n");
      out.write("         \n");
      out.write("         <div  id=\"srcd\" Style=\"\" >\n");
      out.write("             <center>\n");
      out.write("             <form id=\"sd\" action=\"action.jsp\">\n");
      out.write("                <table>\n");
      out.write("                    <tr> <td>Source Station :</td><td><select name=\"source\">\n");
      out.write("                    ");

                dbcon i=new dbcon();
                ResultSet t=i.select();
                try{
                while(t.next())
                {
                    
      out.write("\n");
      out.write("                    <option>");
      out.print(t.getString(3));
      out.write("</option>\n");
      out.write("                   ");
 } 
      out.write("\n");
      out.write("                    </select></td></tr>\n");
      out.write("              \n");
      out.write("                     <tr> <td>Destination Station :</td><td><select name=\"destination\">\n");
      out.write("                   ");

                dbcon j=new dbcon();
                ResultSet u=j.select();
                while(u.next())
                {
                    
      out.write("\n");
      out.write("                    <option>");
      out.print(u.getString(3));
      out.write("</option>\n");
      out.write("                   ");
 } }catch(NullPointerException ex){}
      out.write("\n");
      out.write("                    </select></td></tr>\n");
      out.write("                \n");
      out.write("              \n");
      out.write("                     <tr><td> <input type=\"submit\" name=\"b\" value=\"Submit\"></td></tr>\n");
      out.write("                 \n");
      out.write("            </table>\n");
      out.write("           </form>\n");
      out.write("             \n");
      out.write("             <a>*Train details are shown only for reserved trains defined in the PRS system.</a>\n");
      out.write("             </center>\n");
      out.write("         </div>\n");
      out.write("         \n");
      out.write("         <div  id=\"sa\" Style=\"\" >\n");
      out.write("             <center>\n");
      out.write("             <form id=\"sd\" action=\"action.jsp\">\n");
      out.write("                 <p>Select train :<select name=\"tname\" style=\"position:relative;\">\n");
      out.write("                    ");

                dbcon e=new dbcon();
                ResultSet s=e.select();
                try{
                while(s.next())
                {
                    
      out.write("\n");
      out.write("                    <option>");
      out.print(s.getString(5));
      out.write("</option>\n");
      out.write("                   ");
 } }catch(NullPointerException ex){}
      out.write("\n");
      out.write("                     </select></p> <br> <br>\n");
      out.write("                 \n");
      out.write("                 <input type=\"submit\" value=\"Details\" style=\"position:relative;\"> <br> <br>\n");
      out.write("                 \n");
      out.write("                 <a> \n");
      out.write("                     *Train details are shown only for reserved trains defined in the PRS system.</a>\n");
      out.write("             </form>\n");
      out.write("         </center>\n");
      out.write("         </div>\n");
      out.write("         \n");
      out.write("         \n");
      out.write("         <div  id=\"bk\" Style=\"\" >\n");
      out.write("             <center>\n");
      out.write("             <form id=\"sd\" action=\"action.jsp\">\n");
      out.write("                 <table>\n");
      out.write("                     <tr><td>Name:</td><td><input type=\"text\" value=\"Name\"></td>\n");
      out.write("                     <tr><td>Age:</td><td><input type=\"text\" value=\"Age\"></td>\n");
      out.write("                     <tr><td>ID Card :</td><td><select name=\"Id\">\n");
      out.write("                    <option value=\"Passport\">Passport</option>\n");
      out.write("                    <option value=\"D license\">D license</option>\n");
      out.write("                    <option value=\"Adhar\">Adhar</option>\n");
      out.write("                    <option value=\"Pan Card\">Pan Card</option>\n");
      out.write("                     </select></td></tr> \n");
      out.write("                     <tr><td>Identity Card Details(NO):</td><td><input type=\"text\" value=\"id\"></td>\n");
      out.write("                     <tr><td>Source Station :</td><td><select name=\"source\">\n");
      out.write("                    ");

                dbcon f=new dbcon();
                ResultSet rs=f.select();
                try{
                while(rs.next())
                {
                    
      out.write("\n");
      out.write("                    <option>");
      out.print(rs.getString(3));
      out.write("</option>\n");
      out.write("                   ");
 } }catch(NullPointerException ex){}
      out.write("\n");
      out.write("                     </select></td></tr> \n");
      out.write("\n");
      out.write("                 \n");
      out.write("                     <tr><td>Destination Station :</td><td><select name=\"destination\">\n");
      out.write("                    ");

                dbcon g=new dbcon();
                ResultSet sr=g.select();
                try{
                while(sr.next())
                {
                    
      out.write("\n");
      out.write("                    <option>");
      out.print(sr.getString(4));
      out.write("</option>\n");
      out.write("                   ");
 }}catch(NullPointerException ecp){} 
      out.write("\n");
      out.write("                    </select></td></tr> \n");
      out.write("                \n");
      out.write("\n");
      out.write("                     <tr><td>AC<input id=\"tp\" type=\"radio\" value=\"AC\" > \n");
      out.write("                     SL<input id=\"tp\" type=\"radio\" value=\"SL\" ></td></tr> \n");
      out.write("                 \n");
      out.write("                     <tr><td><input type=\"submit\" name=\"b\" value=\"Book\" ></td></tr> \n");
      out.write("                 \n");
      out.write("                 \n");
      out.write("                 </table>  \n");
      out.write("             </form>\n");
      out.write("             </center>\n");
      out.write("         </div>\n");
      out.write("         \n");
      out.write("         \n");
      out.write("         <div  id=\"td\" Style=\"\" >\n");
      out.write("             <center>\n");
      out.write("             <form id=\"sd\" action=\"action.jsp\">\n");
      out.write("                 <table>\n");
      out.write("                     <tr><td>Select train :</td><td><select name=\"tnam\">\n");
      out.write("                    ");

                dbcon h=new dbcon();
                ResultSet r=h.select();
                try{
                while(r.next())
                {
                    
      out.write("\n");
      out.write("                    <option>");
      out.print(r.getString(1));
      out.write("</option>\n");
      out.write("                   ");
 }}catch(NullPointerException x){} 
      out.write("\n");
      out.write("                         </select></td></tr>\n");
      out.write("               \n");
      out.write("                     <tr> <td><input type=\"submit\" name=\"b\" value=\"Seats\"></td></tr>\n");
      out.write("                 \n");
      out.write("                 </table>\n");
      out.write("             </form>\n");
      out.write("              <a>  *Train details are shown only for reserved trains defined in the PRS system.</a>\n");
      out.write("             </center>\n");
      out.write("         </div>\n");
      out.write("        \n");
      out.write("         <div id=\"t15\" style=\"\">\n");
      out.write("             <center>\n");
      out.write("                 <form action=\"action.jsp\">\n");
      out.write("                 <table>\n");
      out.write("                 <tr><td><label>Train No</label></td> <td><input type=\"text\" name=\"trainno\"></td></tr>\n");
      out.write("                 <tr><td><label>Source</label></td> <td><input type=\"text\" name=\"source\"></td></tr>\n");
      out.write("                 <tr><td><label>Destination</label></td> <td><input type=\"text\" name=\"destination\"></td></tr>\n");
      out.write("                 <tr><td><label>Name</label> </td><td><input type=\"text\" name=\"tname\"></td></tr>\n");
      out.write("                 <tr><td><label>departure</label></td> <td><input type=\"text\" name=\"deptim\"></td></tr>\n");
      out.write("                 <tr><td><label>arrival</label> </td><td><input type=\"text\" name=\"arvtim\"></td></tr>\n");
      out.write("                 <tr><td><label>Select Days:</label><br></td>\n");
      out.write("                 <td><label>mon</label> <input type=\"checkbox\" name=\"mon\" value=\"yes\">\n");
      out.write("                 <label>tue</label> <input type=\"checkbox\" name=\"tue\" value=\"y\">\n");
      out.write("                 <label>wed</label> <input type=\"checkbox\" name=\"wed\" value=\"y\">\n");
      out.write("                 <label>thu</label> <input type=\"checkbox\" name=\"thr\" value=\"y\">\n");
      out.write("                 <label>fri</label> <input type=\"checkbox\" name=\"fri\" value=\"y\">\n");
      out.write("                 <label>sat</label> <input type=\"checkbox\" name=\"sat\" value=\"y\">\n");
      out.write("                 <label>sun</label> <input type=\"checkbox\" name=\"sun\" value=\"y\"></td></tr>\n");
      out.write("                 <tr><td><label>1st c cost</label></td><td> <input type=\"text\" name=\"cost1\"></td></tr>\n");
      out.write("                 <tr><td><label>2nd c cost</label> </td><td><input type=\"text\" name=\"cost2\"></td></tr>\n");
      out.write("                 <tr><td><label>Second class seats</label></td><td> <input type=\"text\" name=\"seats1\"></td></tr>\n");
      out.write("                 <tr><td><label>1st class seats</label> </td><td><input type=\"text\" name=\"seats2\"></td></tr>\n");
      out.write("                 <tr><td><label>total seats</label></td> <td><input type=\"text\" name=\"totalseats\"></td></tr>\n");
      out.write("                 <tr><td><input type=\"submit\" name=\"b\" value=\"Insert\" ></td></tr>\n");
      out.write("                 </table>\n");
      out.write("                 </form>\n");
      out.write("             </center>\n");
      out.write("         </div>\n");
      out.write("      \n");
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
