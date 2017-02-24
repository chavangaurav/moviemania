<%-- 
    Document   : backend
    Created on : 25 May, 2016, 8:10:07 PM
    Author     : hp
--%>

<%@page import="java.io.PrintWriter"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import ="java.sql.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="CSS/main.css" rel="stylesheet" type="text/css"/>
        <title>Edit Movie</title>
    </head>
    <%
    String movie_id = request.getParameter("movie_id");
    %> 
    <body>
<sql:setDataSource var="snapshot" driver="sun.jdbc.odbc.JdbcOdbcDriver" url="jdbc:odbc:movie_mania"/>
 
<sql:query dataSource="${snapshot}" var="result">
    SELECT * from movie where movie_id=<%=movie_id%>;
</sql:query>        
        <%@include file="header_backend.jsp" %>
        
        
        <div id="bdy">
            <hr>
                <div id="nav">
            <ul>
                    <li><a href="backend_home.jsp">Home</a></li>
                    <li><a href="backend_add_movie.jsp">Movies</a></li>
                    <li><a href="backend_add_event.jsp">Events</a></li>
                    <li><a href="ViewUser_sql">Users</a></li>
                    <li><a href="backend_about.jsp">About</a></li>
            </ul>
            </div>
               
            <div id="section">
                 
                <div style="display:block;background-color:black;width:883px;margin: 0 auto;" >
            <h3 style="color:white;font-family: 'Source Sans Pro', sans-serif;padding:10px ">
                Edit User
            </h3>
                    
        </div>
               <c:forEach var="row" items="${result.rows}">  
               <form action="Update_movie" method="post" enctype="multipart/form-data">
                    <table id="tab" style="width:500px;" align="center" >
                        <tr >
                    <td>
                        Movie Name
                    </td>
                    <td>
                        <input type="text" name="movie_name" value="${row.movie_name}">
                        <input type="hidden" name="movie_id" value="${row.movie_id}"
                    </td>
                </tr>
                <tr>
                    <td>
                        Movie Trailor
                    </td>
                    <td>
                        <input type="url" name="movie_trailor" value="${row.movie_trailor}">
                    </td>
                </tr>
                <tr>
                    <td>
                        Genre
                    </td>
                    <td>
                        <input type="text" name="genre" value="${row.genre}">
                    </td>
                </tr>
                <tr>
                    <td>
                        Release Date
                    </td>
                    <td>
                        <input type="date" name="release_date" value="${row.release_date}">
                    </td>
                </tr>
                <tr>
                    <td>
                        Duration
                    </td>
                    <td>
                        <input type="text" name="duration" value="${row.duration}">
                    </td>
                </tr>
                <tr>
                    <td>
                        Cast
                    </td>
                    <td>
                        <input type="text" name="cast" value="${row.cast}">
                    </td>
                </tr>
                <tr>
                    <td>
                        Production
                    </td>
                    <td>
                        <input type="text" name="production" value="${row.production}">
                    </td>
                </tr>
                <tr>
                    <td>
                        Description
                    </td>
                    <td>
                        <textarea rows="4" cols="25" name="description">${row.description}</textarea>
                    </td>
                </tr>
                <tr>
                    <td>
                        Rating
                    </td>
                    <td>
                        <input type="number" name="rating" min="1" max="5" value="${row.intrating}"/>
                    </td>
                </tr>
                
                        <tr>
                     <td colspan="2">
                 <center>
                        <input type="submit" value="Update">
                        <input type="reset" value="Reset">
                </center>
                        </td>
                </tr>
                    </table>
                    </form>
                    </c:forEach>
        </div>
               
              </div>

        
            <div id="footer">
                <p>All Right Reserve with S121135300133</p>
            </div>
    </body>
</html>
