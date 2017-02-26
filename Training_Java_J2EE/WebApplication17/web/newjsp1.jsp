<%-- 
    Document   : newjsp1
    Created on : Feb 4, 2017, 10:29:41 AM
    Author     : cc4
--%>

<%@page import="pack.db"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <jsp:useBean id="student" scope="page" class="pack.Student" />
        <jsp:setProperty name="student" property="*" />
        
        <%
            try{
            db d= new db();
            if(request.getParameter("b").equals("insert"))
            d.insert(student);
            else if(request.getParameter("b").equals("delete"))
            d.delete(student);
             else if(request.getParameter("b").equals("update"))
            d.update(student);
            }catch(NullPointerException e){}
            %>
    </body>
</html>
