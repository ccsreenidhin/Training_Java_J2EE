<%-- 
    Document   : login
    Created on : Feb 3, 2017, 3:01:01 PM
    Author     : cc4
--%>


<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"> 
        <link rel="stylesheet" type="text/css" href="style.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title>IRCTC</title>
        <script>
            function register()
            {
                document.getElementById("div1").style.visibility="hidden";
                document.getElementById("div2").style.visibility="visible";
            }
        </script>
    </head>
    <body >
        <div id="t1" style=""></div>
        <a id="t2" STYLE=" "><font size="5"><b>INDIAN RAILWAYS</b> CUSTOMER PORTAL</font></a>
        <a id="t3" STYLE=""><b><font size="3"><u>Hindi Version</u></font></a>
        <img src="IMAGES/raillogo.gif" style="position:fixed; top:30px; left:220px;"/>
        <img src="IMAGES/Fblogo.jpg" style="position:fixed; top:90px; right:440px;"/>
        <img src="IMAGES/Twitl.jpg" style="position:fixed; top:90px; right:410px;"/>
        <img src="IMAGES/youtube.jpg" style="position:fixed; top:90px; right:360px;"/>
        <img src="IMAGES/cris.gif" style="position:fixed; top:70px; right:280px;"/>
        <img src="IMAGES/indiagov.gif" style="position:fixed; top:45px; right:210px;"/>
        <a id="t4" STYLE=""><b><font size="3"><u>Accident Train Chart (Hirakhand Express  Train No:18448)</u></font></a>
    `   <marquee vspace="110px" hspace="200px"> 
        <div>
            <img id="i1" src="IMAGES/animated-train-image-0031.gif" height="40px" width="70px"/>
         <a Style="color:blue;"><u><font size="3"><u>INDIAN RAILWAY WELCOMES YOU</u></font></a>
        </div></marquee>
      
        <div id="l1" style="background-image: url(IMAGES/traind2.jpg);width:1400px;height:500px;position:fixed;top:200px;"></div>
        
            <center>
                
                    <div id="div1" style="color:white; position:absolute; top:200px;left:500px;">
                        <h1>NEW USER??</h1><p id="dn1" onclick="register()">Click Here</p>
                        <p>or</p>
                        <h2><b>Login</b> here</h2>
                    <form>
                        <table>
                            <tr><td><label>Name:</label></td><td><input type="text"></td></tr>
                         <tr><td><label>Password</label></td><td><input type="password"></td></tr>
                         <tr><td><input type="submit"  class="btn btn-success" value="Submit"></td></tr>
                        </table>
                    </form>
                   </div>
            </center>

    <div>   
        <center>
            <div id="div2" style="color:white; position:fixed;  top:200px;left:500px; visibility:hidden;">
                <h1>New User?? Register Here.....</h1>
                <form>
                    <table>
                    <tr><td><label>Name:</label></td><td><input type="text"></td></tr>
                    <tr><td><label>Password:</label></td><td><input type="password"></td></tr>
                    <tr><td><label>Email:</label></td><td><input type="text"></td></tr>
                    <tr><td><label>Mobile</label></td><td><input type="text"></td></tr>
                    <tr><td><input type="submit" class="btn btn-success" value="Submit">
                    </table>
                </form>
            </div>
        </center>
    </div>
    </body>
</html>
