<%-- 
    Document   : newjsp1
    Created on : Feb 1, 2017, 2:55:37 PM
    Author     : cc4
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

         <%
             String s=request.getParameter("v");
             if(s.equals("w"))
             {
             out.println("invisible text");
             }
             %>
  