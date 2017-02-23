<%-- 
    Document   : newjsp
    Created on : Feb 1, 2017, 2:55:32 PM
    Author     : cc4
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <script>
            function ajax(qw)
            {
                var ax=new XMLHttpRequest();
                ax.open("GET","newjsp1.jsp?v="+qw,true);
                ax.send();
                ax.onreadystatechange=function()
                {
                    if(ax.readyState == 4 && ax.status == 200)
                    {
                    document.getElementById("a1").value=ax.responseText;
                    }
                }
            }
            </script>
    </head>
    <body>
        <form>
        <input type="text"  name="b" onkeyup="ajax(this.value)">
        <input type="text" id="a1" name="b" >
        </form>
        <p  >
        sdcfsdbf jksbncvjkxc jkxbvhbxhcv zxjkcvnj klxbcvbzc
        cvsbv hjbxv jknxjk cvnxklcv kldsz vkxdnvjkndc vn
        sc jnvckn xc vmxzc klvm
        </p>
    </body>
</html>
