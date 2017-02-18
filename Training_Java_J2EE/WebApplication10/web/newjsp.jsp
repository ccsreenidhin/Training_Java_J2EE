<%-- 
    Document   : newjsp
    Created on : Jan 28, 2017, 3:41:43 PM
    Author     : cc4
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <%
        
        Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/irctc","root","root");
            Statement nm=con.createStatement();
            
       String s="Select * from traindet";
     
       ResultSet rs=nm.executeQuery(s);
       %>
        <table border="1">
            <thead>
                <tr>
                    <th>TN</th>
                    <th>S</th>
                    <th>D</th>
                </tr>
            </thead>
            <%
       while(rs.next())
       {
           %>
           
            <tbody>
                <tr>
                    <td><% out.println(rs.getString(2)); %></td>
                    <td><% out.println(rs.getString(3)); %></td>
                    <td><% out.println(rs.getString(4)); %></td>
                </tr>
              
            </tbody>
     

          
           
          
       <%     
        }
        
        
        %>
       
           </table>
        
    </body>
</html>
