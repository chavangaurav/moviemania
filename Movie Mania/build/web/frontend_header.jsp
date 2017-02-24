<%-- 
    Document   : frontend_header
    Created on : 11 Jun, 2016, 12:34:59 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import ="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <link href="CSS/main.css" rel="stylesheet" type="text/css">
        
        </head>
    <body>
        <div id="cont">
        <img src="Image/logo.png" height="120" width="240"/>
        
        <%
                if ((session.getAttribute("user") == null) || (session.getAttribute("user") == "")) {
            %>
        <form method="post" action="validate_login.jsp" style="float:right;position:relative;margin-top:10px ">
        <table>
        <tr>
        <td>
        Username
        </td>
        <td>
        Password
        </td>
        </tr>
        <tr>
            
            <td> <input type="text" name="username"> </td>
            <td> <input type="password" name="password"> </td>
        </tr>
        <tr >
            <td colspan="2" align="right"> <input type="submit" name="authenticate" value="Log in">  
                <a href="register.jsp"><input type="button" name="register" value="Register"></a> </td>
        </tr>
        <tr>
            <td colspan="2" align="right">
                <%
                    if (request.getParameter("errMsg")!=null)
                    {
                %>
                <div style="color:red" align="center">
                    <% out.println(request.getParameter("errMsg")); %>
                </div>
                <%
                    }                
                %>
            </td>
        </tr>
        </table>
        </form>
                
        <%} else {
            %>
            <p style="float:right">Welcome <%=session.getAttribute("user")%> | <a href='logoutf.jsp'>Log out</a></p>
            <%
                }
            %>
        <div id="menu">
        
        
            <ul id="menu">
                <li id="menu"><a class="active" href="home.jsp">Home</a></li>
                <li ><a href="movie.jsp">Movies</a></li>
                <li > <a href="event.jsp">Events</a> </li>
                <li> <a href="Contact_us.jsp">Contact</a></li>
                <li><a href="About_us.jsp">About</a></li>
                <form>
                        <input type="text" name="search" placeholder="Movies, Event..">
                </form>
            </ul>
                
                
        </div>
        </div>  
        
    </body> 
</html>
