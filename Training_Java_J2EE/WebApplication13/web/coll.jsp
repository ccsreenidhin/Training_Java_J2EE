<%-- 
    Document   : coll
    Created on : Feb 1, 2017, 9:48:02 AM
    Author     : cc4
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>University Of Applied Matthematics </title>
        <script>
            function login()
            {
              document.getElementById("log").style.visibility="visible";  
            }
        </script>
    </head>
    <body>
    <center>
        <div style="border-style: solid; border-color: green;">
            <h1>University Of Applied Matthematics</h1>
        </div>
        <div style="border-style: solid; border-color: forestgreen;">
            <h2 onclick="login()">Login</h2>
        </div>
        <div id="log" style="border-style: solid; border-color: forestgreen;visibility:hidden; width:800px; height:400px">
            <form action="logd.jsp">
                <table border="0">
                     <tbody>
                        <tr>
                            <td>Name</td>
                            <td><input type="text" name="Name" value="name" /></td>
                        </tr>
                        <tr>
                            <td>Password</td>
                            <td><input type="password" name="Password" value="password" /></td>
                        </tr>
                    </tbody>
                </table>
                <input type="submit" name="button" value="Signin" name="sign" />
            </form>
        </div>
     </center>   
    </body>
</html>
