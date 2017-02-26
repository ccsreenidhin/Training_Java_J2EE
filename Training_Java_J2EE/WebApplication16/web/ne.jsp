<%-- 
    Document   : ne
    Created on : Feb 2, 2017, 3:45:34 PM
    Author     : cc4
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="pack.dbcon"%>
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
            try{
            String s=request.getParameter("v");
            out.println(s);
            dbcon db=new dbcon();
          
            ResultSet r=db.select1(s);
            while(r.next())
            {
                 %>
               
                <input type="text" name="roll" value=" <%=r.getString(3)%>">
                <input type="text" name="addr" value=" <%=r.getString(4)%>">
                <input type="text" name="phno" value=" <%=r.getString(5)%>">
                <input type="text" name="email" value=" <%=r.getString(6)%>">
                <%
            }
         }catch (NullPointerException r)
            {
            }
        %>
    </body>
</html>
