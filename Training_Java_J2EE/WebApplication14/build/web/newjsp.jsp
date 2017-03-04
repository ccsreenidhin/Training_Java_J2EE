<%-- 
    Document   : newjsp
    Created on : Feb 1, 2017, 2:27:45 PM
    Author     : cc4
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script>
            function ajax()
            {
                var ax=new XMLHttpRequest();
                ax.open("GET","hel.jsp",true);
                ax.send();
                ax.onreadystatechange = function()
               {
                    if(ax.readyState == 4 && ax.status == 200)
                    {
                    document.getElementById("a1").innerHTML=ax.responseText;
                    }
               }    
                    
            }
         </script>
    </head>
    <body>
        <input type="text" onkeyup="ajax()">
        
        <p id="a1">sdcfsdbf jksbncvjkxc jkxbvhbxhcv zxjkcvnj klxbcvbzc
        cvsbv hjbxv jknxjk cvnxklcv kldsz vkxdnvjkndc vn
        sc jnvckn xc vmxzc klvm
        </p>
    </body>
</html>
