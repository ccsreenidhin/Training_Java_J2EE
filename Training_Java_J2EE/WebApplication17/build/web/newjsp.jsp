<%-- 
    Document   : newjsp
    Created on : Feb 4, 2017, 10:26:10 AM
    Author     : cc4
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="pack.db"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Insert</h1>
        <div>
            <form action="newjsp1.jsp">
                <input type="text" name="name" value="name">
                <input type="text" name="rollno" value="rollno">
                <input type="text" name="address" value="address">
                <input type="text" name="phno" value="phno">
                <input type="text" name="email" value="email">
                <input type="submit" name="b" value="insert">
            </form>
        </div>
        <h1>Delete</h1>
        <div id="d2" style="position:relative;">
            <form action="newjsp1.jsp">
                <select name="name" value="name">    
                <%
                    db q=new db();
                    List l=q.select();
                    Iterator it=l.iterator();
                    while(it.hasNext())
                       
                    {
                         %>
                        <option><%=it.next()%></option>
                        <%
                    }
                    %>
           
                </select>  
                 <input type="submit" name="b" value="delete">
            </form>
         </div>
          <h1>Update</h1>
          
        <div id="d3" style="position:realtive;">
            <form action="newjsp1.jsp">
            <select name="name" value="name">    
                <%
                    db w=new db();
                    List m=w.select();
                    Iterator itr=m.iterator();
                    while(itr.hasNext())
                       
                    {
                         %>
                        <option><%=itr.next()%></option>
                        <%
                    }
                    %>
           
                </select>  
                <input type="text" name="rollno" value="rollno">
                <input type="text" name="address" value="address">
                <input type="text" name="phno" value="phno">
                <input type="text" name="email" value="email">    
                <input type="submit" name="b" value="update"> 
           </form>
        </div>
    </body>
</html>
