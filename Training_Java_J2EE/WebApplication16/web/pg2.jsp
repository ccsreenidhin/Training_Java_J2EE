<%-- 
    Document   : pg2
    Created on : Jan 31, 2017, 2:02:16 PM
    Author     : cc4
--%>


<%@page import="java.sql.ResultSet"%>
<%@page import="pack.mrbean"%>
<%@page import="pack.dbcon"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>dfsghgfh</h1>
        <jsp:useBean id="mrbean" scope="page" class="pack.mrbean" />
        <jsp:setProperty name="mrbean" property="*" />
       
        
        <%
            
            try{
           
            dbcon db=new dbcon();
            
          
          
            
           if(request.getParameter("button").equals("insert"))
              db.insert(mrbean);
           else if(request.getParameter("button").equals("delete"))
              db.delete(mrbean);
           else if(request.getParameter("button").equals("update"))
            {
            db.update(mrbean);
            }
            }catch (NullPointerException r)
            {
            }
        %>
    </body>
</html>
