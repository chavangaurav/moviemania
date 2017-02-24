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
        <title>Add Movie</title>
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
                    <li><a href="backend_about.jsp">About</a></li>
            </ul>
            </div>
               
            <div id="section">
                <div style="display:block;background-color:black;width:883px;margin: 0 auto;" >
            <div style="color:white;font-family: 'Source Sans Pro', sans-serif;padding:10px ">
                Add Movie
            </div>
                    
        </div>
               <form action="Add_movie" method="post" enctype="multipart/form-data">
                    <table id="tab" style="width:500px;" align="center" >
                        <tr >
                    <td>
                        Movie Name
                    </td>
                    <td>
                        <input type="text" name="movie_name">
                    </td>
                </tr>
                <tr>
                    <td>
                        Movie Trailor
                    </td>
                    <td>
                        <input type="url" name="movie_trailor">
                    </td>
                </tr>
                <tr>
                    <td>
                        Genre
                    </td>
                    <td>
                        <input type="text" name="genre">
                    </td>
                </tr>
                <tr>
                    <td>
                        Release Date
                    </td>
                    <td>
                        <input type="date" name="release_date">
                    </td>
                </tr>
                <tr>
                    <td>
                        Duration
                    </td>
                    <td>
                        <input type="text" name="duration">
                    </td>
                </tr>
                <tr>
                    <td>
                        Cast
                    </td>
                    <td>
                        <input type="text" name="cast">
                    </td>
                </tr>
                <tr>
                    <td>
                        Production
                    </td>
                    <td>
                        <input type="text" name="production">
                    </td>
                </tr>
                <tr>
                    <td>
                        Description
                    </td>
                    <td>
                        <textarea rows="4" cols="25" name="description"></textarea>
                    </td>
                </tr>
                <tr>
                    <td>
                        Image
                    </td>
                    <td>
                        <input type="file" name="file" size="50" />
                    </td>
                </tr>
                <tr>
                    <td>
                        Rating
                    </td>
                    <td>
                        <input type="number" name="rating" min="1" max="5" />
                    </td>
                </tr>
                
                        <tr>
                     <td colspan="2">
                 <center>
                        <input type="submit" value="Submit">
                        <input type="reset" value="Reset">
                </center>
                        </td>
                </tr>
                    </table>
                    </form>                       
        </div>
               
              </div>
            
            </div>
        
            <div id="footer">
                <p>All Right Reserve with S121135300133</p>
            </div>
    </body>
</html>
