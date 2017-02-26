<%-- 
    Document   : action
    Created on : Feb 7, 2017, 2:46:44 PM
    Author     : cc4
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="pack.dbcon"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="style.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title>IRCTC</title>
    </head>
    <body>
        <div id="t1" style=""></div>
        <a id="t2" STYLE=" "><font size="5"><b>INDIAN RAILWAYS</b> CUSTOMER PORTAL</font></a>
        <a id="t3" STYLE=""><b><font size="3"><u>Hindi Version</u></font></a>
        <img src="IMAGES/raillogo.gif" style="position:absolute; top:30px; left:220px;"/>
        <img src="IMAGES/Fblogo.jpg" style="position:absolute; top:90px; right:440px;"/>
        <img src="IMAGES/Twitl.jpg" style="position:absolute; top:90px; right:410px;"/>
        <img src="IMAGES/youtube.jpg" style="position:absolute; top:90px; right:360px;"/>
        <img src="IMAGES/cris.gif" style="position:absolute; top:70px; right:280px;"/>
        <img src="IMAGES/indiagov.gif" style="position:absolute; top:45px; right:210px;"/>
        <a id="t4" STYLE=""><b><font size="3"><u>Accident Train Chart (XYZ Express  Train No:18448)</u></font></a>
    `   <marquee vspace="110px" hspace="200px"> 
        <div>
            <img id="i1" src="IMAGES/animated-train-image-0031.gif" height="40px" width="70px"/>
         <a Style="color:blue;"><u><font size="3"><u>INDIAN RAILWAY WELCOMES YOU</u></font></a>
        </div></marquee>
    
        <jsp:useBean id="bean" scope="page" class="pack.mrbean" />
        <jsp:setProperty name="bean" property="*"/>
        
     
        <div id="w1">
            <%
            try{
            dbcon d= new dbcon();
           
            if(request.getParameter("b").equals("Insert"))
            {
            d.insert(bean);
            %>
            <center>
                <table border="2px" style="table-layout: inherit; width:75%; ">
                    
                  
                    <tr><td>Train No</td><td><%= request.getParameter("trainno") %></td></tr>
                        <tr><td>Source</th><td><%= request.getParameter("source") %></td></tr>
                        <tr><td>Destination</td><td><%= request.getParameter("destination") %></td></tr>
                        <tr><td>Name</td><td><%= request.getParameter("tname") %></td></tr>
                        <tr><td>departure</td><td><%= request.getParameter("deptim") %></td></tr>
                        <tr><td>arrival</td><td><%= request.getParameter("arvtim") %></td></tr>
                        <tr><td>Days</td><td>
                                <table border="2px" style="table-layout: inherit; width:75%; "><tr>
                            <td>mon</td><td><%= request.getParameter("mon") %></td>
                            <td>tue</td><td><%= request.getParameter("tue") %></td>
                            <td>wed</td><td><%= request.getParameter("wed") %></td>
                            <td>thr</td><td><%= request.getParameter("thr") %></td>
                            <td>fri</td><td><%= request.getParameter("fri") %></td>
                            <td>sat</td><td><%= request.getParameter("sat") %></td>
                            <td>sun</td><td><%= request.getParameter("sun") %></td>
                                    </tr> </table>
                            </td></tr>
                        <tr><td>1st c cost</td><td><%= request.getParameter("cost1") %></td></tr>
                         <tr><td>2nd c cost</td><td><%= request.getParameter("cost2") %></td></tr>
                        <tr><td>Second class seats</td><td><%= request.getParameter("seats1") %></td></tr>
                        <tr><td>1st class seats</td><td><%= request.getParameter("seats2") %></td></tr>
                         <td>total seats</td><td><%= request.getParameter("totalseats") %></td></tr>
                </table>
            </center>
            <%
            }
            else if(request.getParameter("b").equals("book"))
            {
            //bvbhjbkjnjklm
            }
            else if(request.getParameter("b").equals("Details"))
            {
                ResultSet rs=d.select();
            
            %>
            <table border="2px" style="table-layout: inherit; width:75%; ">
                
                <th>Train No</th>
                <th>Source</th>
                <th>Departure</th>
                <th>Destination</th>
                <th>Arrival</th>
                <th>Days Available</th>
                <th>AC Seats available</th>
                <th>Non AC Seats available</th>
                <%
            while(rs.next())
                {
                    if(request.getParameter("tname").equals(rs.getString(5)))
                %>
                        <tr>
                            <td><%=rs.getString(5)%></td>
                            <td><%=rs.getString(2)%></td> 
                            <td><%=rs.getString(3)%></td>
                            <td><%=rs.getString(6)%></td>
                            <td><%=rs.getString(4)%></td>
                            <td><%=rs.getString(7)%></td>
                            <td>
                                <table border="2px" style="table-layout: inherit; width:75%; ">
                                    <th>sun</th>
                                    <th>mon</th>
                                    <th>tue</th>
                                    <th>wed</th>
                                    <th>thr</th>
                                    <th>fri</th>
                                    <th>sat</th>
                                <tr>
                                        <td><%=rs.getString(8)%></td>
                                        <td><%=rs.getString(9)%></td>
                                        <td><%=rs.getString(10)%></td>
                                        <td><%=rs.getString(11)%></td>
                                        <td><%=rs.getString(12)%></td>
                                        <td><%=rs.getString(13)%></td>
                                        <td><%=rs.getString(14)%></td>
                                </tr>
                                </table>
                            </td>
                            <td><%=rs.getString(17)%></td>
                            <td><%=rs.getString(18)%></td>
                        </tr>
                    
                   <% } %>
                   </table>
                   <%
             }
            else if(request.getParameter("b").equals("Submit"))
             {
                ResultSet rs=d.select();
            
            %>
            <table border="2px" style="table-layout: inherit; width:75%; ">
                <th>Train Name</th>
                <th>Train No</th>
                <th>Source</th>
                <th>Departure</th>
                <th>Destination</th>
                <th>Arrival</th>
                <th>Days Available</th>
                <th>AC Seats available</th>
                <th>Non AC Seats available</th>
                <%
            while(rs.next())
                {
                   if(request.getParameter("source").equals(rs.getString(3)) && request.getParameter("destination").equals(rs.getString(4))) 
                   {
                    %>
                    
                        <tr>
                            <td><%=rs.getString(5)%></td>
                            <td><%=rs.getString(2)%></td> 
                            <td><%=rs.getString(3)%></td>
                            <td><%=rs.getString(6)%></td>
                            <td><%=rs.getString(4)%></td>
                            <td><%=rs.getString(7)%></td>
                            <td>
                                <table border="2px" style="table-layout: inherit; width:75%; ">
                                    <th>sun</th>
                                    <th>mon</th>
                                    <th>tue</th>
                                    <th>wed</th>
                                    <th>thr</th>
                                    <th>fri</th>
                                    <th>sat</th>
                                <tr>
                                        <td><%=rs.getString(8)%></td>
                                        <td><%=rs.getString(9)%></td>
                                        <td><%=rs.getString(10)%></td>
                                        <td><%=rs.getString(11)%></td>
                                        <td><%=rs.getString(12)%></td>
                                        <td><%=rs.getString(13)%></td>
                                        <td><%=rs.getString(14)%></td>
                                </tr>
                                </table>
                            </td>
                            <td><%=rs.getString(17)%></td>
                            <td><%=rs.getString(18)%></td>
                        </tr>
                    
                   <% }} %>
                   </table>
                   <%
             }
            else if(request.getParameter("b").equals("Seats"))
            {
            ResultSet rs=d.select();
            %>
            <table border="2px" style="table-layout: inherit; width:75%; ">
                <th>Train Name</th>
                <th>Train No</th>
                <th>AC Seats</th>
                <th>Non AC Seats</th>
                <%
            while(rs.next())
                {
                    
                    if(request.getParameter("tnam").equals(rs.getString(5)))
                    %>
                    
                        <tr>
                            <td><%=rs.getString(5)%></td>
                            <td><%=rs.getString(2)%></td>
                            <td><%=rs.getString(17)%></td>
                            <td><%=rs.getString(18)%></td>
                        </tr>
                    
                   <% } %>
                   </table>
                   <%
             }
            }catch(NullPointerException e){}
            %>
        </div>
    </body>
</html>
