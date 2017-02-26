<%-- 
    Document   : fst
    Created on : Jan 31, 2017, 10:00:21 AM
    Author     : cc4
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="pack.dbcon"%>
<%@page import="pack.mrbean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%! static ResultSet rs; %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="style.css">
        <title>CLASSROOM</title>
        <script>
            function insert()
            {
            document.getElementById("ins").style.visibility="visible";
            document.getElementById("del").style.visibility="hidden";
            document.getElementById("up").style.visibility="hidden";
            document.getElementById("sel").style.visibility="hidden";
            }
            function del()
            {
            document.getElementById("del").style.visibility="visible";
            document.getElementById("ins").style.visibility="hidden";
            document.getElementById("up").style.visibility="hidden";
            document.getElementById("sel").style.visibility="hidden";
            }
            function update()
            {
            document.getElementById("up").style.visibility="visible";
            document.getElementById("del").style.visibility="hidden";
            document.getElementById("ins").style.visibility="hidden";
            document.getElementById("sel").style.visibility="hidden";
            }
            function select()
            {
            document.getElementById("sel").style.visibility = "visible";
            document.getElementById("del").style.visibility="hidden";
            document.getElementById("up").style.visibility="hidden";
            document.getElementById("ins").style.visibility="hidden";
            }
            
            function ajax(qw)
            {
                alert("yes");
               var ax=new XMLHttpRequest();
                ax.open("GET","ne.jsp?v="+qw,true);
                ax.send();
                ax.onreadystatechange=function()
                {
                    if(ax.readyState==4 && ax.status==200)
                    {
                    document.getElementById("gg").innerHTML=ax.responseText;
                    }
                } 
            }
            
        </script>
    </head>
    <body>
        <div class="w" style="">
                <h1 style="">FACULTY</h1>
         </div>
        <div class="q" STYLE="">            
            <center><table >
             <tr>
                 <td><p id="i" onclick="insert()">INSERT</p></td>
                 <td><p id="d" onclick="del()">DELETE</p></td>
                 <td><p id="u" onclick="update()">UPDATE</p></td>
                 <%-- <td><p id="s" onclick="select()">SELECT</p></td> --%>
            </tr>
            </table>
            </center>
        </div>
        
        <div id="up">
           
            <form action="pg2.jsp">
            <center>
                
                    Select User Name 
                     <select id="s1" onchange="ajax(this.value)" name="name" style="">
                                     <%
                dbcon e=new dbcon();
                rs=e.select();
                while(rs.next())
                {
                    %>
                    <option><%=rs.getString(2)%></option>
                <% } %>
                     </select>
                  
           
                     
                     <span id="gg">
                   
                        <table>
                        
                 
                       </table>     
                
                </span>
                     
                <input type="submit" name="button" value="update">
                </center>
                </form>
      
        
        
        </div>
                     
                     
                     
                     
                     
          
        <div id="ins">        
        <form action="pg2.jsp">
         <center>
        <table border="0" width="500">
            
                <tbody>
                    <tr>
                        <td>Name:</td>
                        <td><input type="text" name="name"></td>
                    </tr>
                    <tr>
                        <td>Rollno:</td>
                        <td><input type="text" name="roll"></td>
                    </tr>
                    <tr>
                        <td>Address:</td>
                        <td><input type="text" name="addr"></td>
                    </tr>
                    <tr>
                        <td>Phoneno:</td>
                        <td><input type="text" name="phno"</td>
                    </tr>
                    <tr>
                        <td>email:</td>
                        <td><input type="text" name="email"></td>
                    </tr>
                     
                </tbody>
        </table>
                <input type="submit" name="button" value="insert" >  
                </center>
                </form>
        </div>
        <center>
        <div id="del">
             <form id="sd" action="pg2.jsp">
                 Select User Name 
                     <select name="name" style="">
                                     <%
                dbcon d=new dbcon();
              rs=d.select();
                while(rs.next())
                {
                    %>
                    <option><%=rs.getString(2)%></option>
                   <% } %>
                     </select>
                    <input type="submit" name="button" value="delete">
             </form>
        </div>
      </center>
        
    </body>
</html>
