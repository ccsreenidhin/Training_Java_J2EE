<%-- 
    Document   : dbase
    Created on : Jan 28, 2017, 3:06:27 PM
    Author     : cc4
--%>


<%@page import="jav.Dbcon"%>
<%@page import="jav.Traindet"%>

<%@page import="java.sql.ResultSet"%>
<%@page import=" java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.util.logging.Level"%>
<%@page import="java.util.logging.Logger"%>
<%@page import="java.io.IOException"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.util.logging.Level"%>
<%@page import="java.util.logging.Logger"%>
<%@page import="javax.servlet.ServletException"%>
<%@page import="javax.servlet.http.HttpServlet"%>
<%@page import="javax.servlet.http.HttpServletRequest"%>
<%@page import="javax.servlet.http.HttpServletResponse"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
            String src="request.getParameter(Source)";
            String dst="request.getParameter(Destination)";
          /*  String src="Chennai";
            String dst="mangalore";
            int ts=12;
           // String tno="1235";
        Traindet t=new Traindet();
        t.setTrainno(ts);
        t.setDestination(dst);
        t.setSource(src);
    
     
        Dbcon db=new Dbcon();
        db.insert(t);*/
 
        
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
           if(src.equals(rs.getString(3))&&dst.equals(rs.getString(4)))
           %>
           
            <tbody>
                <tr>
                    <td><% out.println(rs.getString(2)); %></td>
                    <td><% out.println(rs.getString(3)); %></td>
                    <td><% out.println(rs.getString(4)); %></td>
                </tr>
              
            </tbody>
            <% }
            %>
        </div>
    </body>
</html>
