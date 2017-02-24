<%-- 
    Document   : backend
    Created on : 25 May, 2016, 8:10:07 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                    <li><a href="ViewUser">Users</a></li>
                    <li><a href="#about">About</a></li>
            </ul>
            </div>
               
            <div id="section"></div>
            </div>
        
            <div id="footer">
                <p>All Right Reserve with S121135300133</p>
            </div>
    </body>
</html>
