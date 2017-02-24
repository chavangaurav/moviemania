<%-- 
    Document   : backend
    Created on : 25 May, 2016, 8:10:07 PM
    Author     : hp
--%>

<%@page import="java.io.PrintWriter"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import ="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="CSS/main.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        
        <%@include file="header_backend.jsp" %>
        
        
        <div id="bdy">
            <hr>
                <div id="nav">
            <ul>
                <li><a href="backend_home.jsp">Home</a></li>
                    <li><a href="backend_add_movie.jsp">Movies</a></li>
                    <li><a href="backend_add_event.jsp">Events</a></li>
                    <li><a href="ViewUser_sql">Users</a></li>
                    <li><a href="#about">About</a></li>
            </ul>
            </div>
               
            <div id="section">
            <div style="padding: 1px 20px 1px 20px; font-family: Arial;font-size: 18px;text-align: justify;" align="">
                    <p>
                    <center><img src="Image/logo.png" height="100px" /></center>
                        <br>
                        <br>
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce scelerisque elit diam, sed cursus massa pellentesque sit amet. Morbi blandit sapien ut erat mattis, ac rhoncus velit semper. Maecenas vehicula erat lacus, ut posuere tellus efficitur pharetra. Fusce porttitor nisl vitae malesuada tempus. Integer egestas purus sed nulla eleifend, sed aliquam elit volutpat. Morbi lacinia urna ut vulputate eleifend. Quisque accumsan sit amet est eu malesuada. Curabitur quis purus a neque dictum pharetra. Duis in tellus libero. Aenean elementum tellus a purus tempor, in gravida erat dignissim. Suspendisse non eleifend lacus. Suspendisse pretium, magna vitae auctor hendrerit, magna elit porta quam, eu efficitur nunc dui vitae mauris. Donec risus arcu, finibus et fermentum vel, condimentum a dui. Vivamus id tellus ipsum.  
                      <br>
                      <br>
                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Etiam est est, aliquet non nisi fermentum, rutrum dictum leo. Vivamus lacinia feugiat egestas. Sed tincidunt enim nec viverra suscipit. Praesent euismod felis ac purus consectetur imperdiet. Sed nunc nisl, cursus in tincidunt in, consequat et massa. Donec auctor ut justo maximus lobortis. Proin eu ex est. Aliquam erat volutpat.
                      <br>
                      <br>
                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Mauris malesuada euismod magna in vestibulum. In non diam eu tellus pellentesque luctus ac sit amet metus. Mauris sed fringilla augue, eu rutrum ex. Aenean pellentesque in purus quis elementum. Sed sit amet lobortis orci, sit amet ultrices ligula. Etiam a diam eget turpis facilisis feugiat sed sed nunc. Nulla feugiat condimentum elit ac accumsan. Sed condimentum varius sem vel malesuada. Donec ac libero eu mauris lobortis tempor.
                    </p>
                    
                </div>      
            </div>
        </div>
            <div id="footer">
                <p>All Right Reserve with S121135300133</p>
            </div>
    </body>
</html>
