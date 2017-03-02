<%-- 
    Document   : newjsp
    Created on : Feb 6, 2017, 10:18:44 AM
    Author     : cc4
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%@taglib uri="/WEB-INF/tlds/newtag_library.tld" prefix="p" %>
        <p:print star="hello"/>
        
    </body>
</html>
