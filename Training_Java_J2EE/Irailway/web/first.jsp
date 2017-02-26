<%-- 
    Document   : first
    Created on : Feb 7, 2017, 2:51:15 PM
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
        <title>Indian Railway</title>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
         <script>
             
             function windsd(element,clr)
             {
               document.getElementById("srcd").style.visibility="visible";
               document.getElementById("bk").style.visibility="hidden";
               document.getElementById("sa").style.visibility="hidden";
               document.getElementById("td").style.visibility="hidden";
               document.getElementById("t15").style.visibility="hidden";
             }
             function windbk(element,clr)
             {
              document.getElementById("bk").style.visibility="visible";
               document.getElementById("srcd").style.visibility="hidden";
               document.getElementById("sa").style.visibility="hidden";
               document.getElementById("td").style.visibility="hidden";
               document.getElementById("t15").style.visibility="hidden";
             }
             
             function windtd(element,clr)
             {
             document.getElementById("sa").style.visibility="visible";
             document.getElementById("srcd").style.visibility="hidden";
             document.getElementById("bk").style.visibility="hidden";
             document.getElementById("td").style.visibility="hidden";
             document.getElementById("t15").style.visibility="hidden";
             }
              function windsa(element,clr)
             {
             document.getElementById("td").style.visibility="visible";
             document.getElementById("srcd").style.visibility="hidden";
             document.getElementById("sa").style.visibility="hidden";
             document.getElementById("bk").style.visibility="hidden";
             document.getElementById("t15").style.visibility="hidden";
             }
             function windin(element,clr)
             {
             document.getElementById("t15").style.visibility="visible";
             document.getElementById("srcd").style.visibility="hidden";
             document.getElementById("sa").style.visibility="hidden";
             document.getElementById("bk").style.visibility="hidden";
             document.getElementById("td").style.visibility="hidden";
             }
         </script>
    </head>
    <body>
        <div id="t1" style=""></div>
        <a id="t2" STYLE=" "><b><font size="5">INDIAN RAILWAYS PASSENGER RESERVATION ENQUIRY</b></font></a>
        <a id="t3" STYLE=""><b><font size="3"><u>Hindi Version</u></font></a>
        <img src="IMAGES/raillogo.gif" style="position:fixed; top:30px; left:220px;"/>
        <img src="IMAGES/Fblogo.jpg" style="position:fixed; top:90px; right:440px;"/>
        <img src="IMAGES/Twitl.jpg" style="position:fixed; top:90px; right:410px;"/>
        <img src="IMAGES/youtube.jpg" style="position:fixed; top:90px; right:360px;"/>
        <img src="IMAGES/cris.gif" style="position:fixed; top:70px; right:280px;"/>
        <img src="IMAGES/indiagov.gif" style="position:fixed; top:45px; right:210px;"/>
        <a id="t4" STYLE=""><b><font size="3"><u>Accident Train Chart (XYZ Express  Train No:18448)</u></font></a>
    `   <marquee vspace="110px" hspace="200px"> 
        <div>
            <img id="i1" src="IMAGES/animated-train-image-0031.gif" height="40px" width="70px"/>
         <a Style="color:blue;"><u><font size="3"><u>Please help Indian railways and government of India in moving towards a digitized and cashless economy. Eradicate black money.</u></font></a>
        </div></marquee>
       
       
       
        <div id="t5" style=" ">
            <table id="op" style="cursor:pointer;">
                <tr>
                    <td><p id="e" onclick="windin(this, 'black')"><font size="3">Insert &nbsp;&nbsp;&nbsp;</font></p></td>
                   
                      <td>  <p id="a" onclick="windsd(this, 'black')"><font size="3"> Train Between Stations &nbsp;&nbsp;&nbsp;</font></p></td>
                 
                        <td><p id="b" onclick="windsa(this, 'black')"><font size="3">Seat Availability &nbsp;&nbsp;&nbsp;</font></p></td>
                   
                        <td><p id="c" onclick="windbk(this, 'black')"><font size="3">Book Tickets &nbsp;&nbsp;&nbsp;</font></p></td>
                   
                        <td><p id="d" onclick="windtd(this, 'black')"><font size="3">Train Details &nbsp;&nbsp;&nbsp;</font></p></td> 
                        
                        <td><form action="login.jsp"><input type="submit" class="btn btn-primary" name="b" value="login" style="cursor:pointer"></form></td>
                </tr>
            </table>         
            
        </div>
    
         <img src="IMAGES/header.JPG" style="position:fixed; top:230px; right:210px;"/>
         <img src="IMAGES/experiance.jpg" style="position:fixed; top:480px; left:430px;"/>
         <img src="IMAGES/india.gif" style="position:fixed; top:460px; right:220px;"/>
         <a id="t6" STYLE=""><font size="2px">India has some of the most spectacular and unforgettable rail journeys in the world. Here you experience a simple<br> way to find out everything you need to know in one easy place. There's no better way to enjoy India's outback, cities,<br> coastal towns andregional areas in comfort.</font></a>
         
         <div id="t7" style=""> <a>Services</a></div>
            
         
         <div id="t8" style="">
            <table border="5" bordercolor="blue" >
                <tr>
                <td style="width:200px"><li><a><font size="2">Mobile Ticketing</font></a></li> 
                
                <li><a><font size="2"> Registration of Train<br> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Tariff Rate</font></a></li>
                
                <li><a><font size="2">Availability at Stations</font></a></li>
                
                <li><a><font size="2">Reserved Train Schedule</font></a> </li>
                
                <li> <a><font size="2">National Train Enquiry</font></a> </li>
                
                <li><a><font size="2">SMS Service</font></a></li>
                
                <li> <a><font size="2">Current Booking </font></a></li>
                
                <li><a><font size="2">Train Berth </font></a></li></td>
                
                </tr>                    
            </table> 
         </div>
         
         
         <div id="t9" style=""><a>Information</a></div>
         
         <div id="t10" style="">
            <table border="5" bordercolor="blue">
                <tr><td style="width:200px">  
                <li> <a><font size="2">Trains at a Glance</font></a></li> 
                
                <li> <a><font size="2"> Catering Charges</font></a> </li>
                
                <li> <a><font size="2">Train Type </font></a></li>
                
                <li><a><font size="2">View Codes</font></a></li>
                
                <li><a><font size="2">Rules</font></a></li>
                
                <li><a><font size="2">International Tourists</font></a></li>
                
                <li><a><font size="2">Tatkal Scheme</font></a></li>
                
                <li><a><font size="2">Other Railway Websites</font></a></li>
                </td></tr>                    
            </table> 
         </div>
         
         
         <div  id="srcd" Style="" >
             <center>
             <form id="sd" action="action.jsp">
                <table>
                    <tr> <td>Source Station :</td><td><select name="source">
                    <%
                dbcon i=new dbcon();
                ResultSet t=i.select();
                try{
                while(t.next())
                {
                    %>
                    <option><%=t.getString(3)%></option>
                   <% } %>
                    </select></td></tr>
              
                     <tr> <td>Destination Station :</td><td><select name="destination">
                   <%
                dbcon j=new dbcon();
                ResultSet u=j.select();
                while(u.next())
                {
                    %>
                    <option><%=u.getString(3)%></option>
                   <% } }catch(NullPointerException ex){}%>
                    </select></td></tr>
                
              
                     <tr><td> <input type="submit" name="b" value="Submit"></td></tr>
                 
            </table>
           </form>
             
             <a>*Train details are shown only for reserved trains defined in the PRS system.</a>
             </center>
         </div>
         
         <div  id="sa" Style="" >
             <center>
             <form id="sd" action="action.jsp">
                 <p>Select train :<select name="tname" style="position:relative;">
                    <%
                dbcon e=new dbcon();
                ResultSet s=e.select();
                try{
                while(s.next())
                {
                    %>
                    <option><%=s.getString(5)%></option>
                   <% } }catch(NullPointerException ex){}%>
                     </select></p> <br> <br>
                 
                 <input type="submit" value="Details" style="position:relative;"> <br> <br>
                 
                 <a> 
                     *Train details are shown only for reserved trains defined in the PRS system.</a>
             </form>
         </center>
         </div>
         
         
         <div  id="bk" Style="" >
             <center>
             <form id="sd" action="action.jsp">
                 <table>
                     <tr><td>Name:</td><td><input type="text" value="Name"></td>
                     <tr><td>Age:</td><td><input type="text" value="Age"></td>
                     <tr><td>ID Card :</td><td><select name="Id">
                    <option value="Passport">Passport</option>
                    <option value="D license">D license</option>
                    <option value="Adhar">Adhar</option>
                    <option value="Pan Card">Pan Card</option>
                     </select></td></tr> 
                     <tr><td>Identity Card Details(NO):</td><td><input type="text" value="id"></td>
                     <tr><td>Source Station :</td><td><select name="source">
                    <%
                dbcon f=new dbcon();
                ResultSet rs=f.select();
                try{
                while(rs.next())
                {
                    %>
                    <option><%=rs.getString(3)%></option>
                   <% } }catch(NullPointerException ex){}%>
                     </select></td></tr> 

                 
                     <tr><td>Destination Station :</td><td><select name="destination">
                    <%
                dbcon g=new dbcon();
                ResultSet sr=g.select();
                try{
                while(sr.next())
                {
                    %>
                    <option><%=sr.getString(4)%></option>
                   <% }}catch(NullPointerException ecp){} %>
                    </select></td></tr> 
                

                     <tr><td>AC<input id="tp" type="radio" value="AC" > 
                     SL<input id="tp" type="radio" value="SL" ></td></tr> 
                 
                     <tr><td><input type="submit" name="b" value="Book" ></td></tr> 
                 
                 
                 </table>  
             </form>
             </center>
         </div>
         
         
         <div  id="td" Style="" >
             <center>
             <form id="sd" action="action.jsp">
                 <table>
                     <tr><td>Select train :</td><td><select name="tnam">
                    <%
                dbcon h=new dbcon();
                ResultSet r=h.select();
                try{
                while(r.next())
                {
                    %>
                    <option><%=r.getString(1)%></option>
                   <% }}catch(NullPointerException x){} %>
                         </select></td></tr>
               
                     <tr> <td><input type="submit" name="b" value="Seats"></td></tr>
                 
                 </table>
             </form>
              <a>  *Train details are shown only for reserved trains defined in the PRS system.</a>
             </center>
         </div>
        
         <div id="t15" style="">
             <center>
                 <form action="action.jsp">
                 <table>
                 <tr><td><label>Train No</label></td> <td><input type="text" name="trainno"></td></tr>
                 <tr><td><label>Source</label></td> <td><input type="text" name="source"></td></tr>
                 <tr><td><label>Destination</label></td> <td><input type="text" name="destination"></td></tr>
                 <tr><td><label>Name</label> </td><td><input type="text" name="tname"></td></tr>
                 <tr><td><label>departure</label></td> <td><input type="text" name="deptim"></td></tr>
                 <tr><td><label>arrival</label> </td><td><input type="text" name="arvtim"></td></tr>
                 <tr><td><label>Select Days:</label><br></td>
                 <td><label>mon</label> <input type="checkbox" name="mon" value="yes">
                 <label>tue</label> <input type="checkbox" name="tue" value="y">
                 <label>wed</label> <input type="checkbox" name="wed" value="y">
                 <label>thu</label> <input type="checkbox" name="thr" value="y">
                 <label>fri</label> <input type="checkbox" name="fri" value="y">
                 <label>sat</label> <input type="checkbox" name="sat" value="y">
                 <label>sun</label> <input type="checkbox" name="sun" value="y"></td></tr>
                 <tr><td><label>1st c cost</label></td><td> <input type="text" name="cost1"></td></tr>
                 <tr><td><label>2nd c cost</label> </td><td><input type="text" name="cost2"></td></tr>
                 <tr><td><label>Second class seats</label></td><td> <input type="text" name="seats1"></td></tr>
                 <tr><td><label>1st class seats</label> </td><td><input type="text" name="seats2"></td></tr>
                 <tr><td><label>total seats</label></td> <td><input type="text" name="totalseats"></td></tr>
                 <tr><td><input type="submit" name="b" value="Insert" ></td></tr>
                 </table>
                 </form>
             </center>
         </div>
      
    </body>
</html>
