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
        <title>View Movie</title>
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
                <c:forEach var="row" items="${result.rows}">    
                <div style="display:block;background-color:black;width:883px;margin: 0 auto;" >
                    
            <div style="color:white;font-family: 'Source Sans Pro', sans-serif; padding:20px ">
                <form action="Delete_movie" method="post">
                <div style="float:right"><button id="btn" type="submit" name="movie_id" value="${row.movie_id}" >Delete</button></div>
                </form>
                <form action="backend_edit_movie.jsp" method="get">
                <div style="float:right"><button id="btn" type="submit" name="movie_id" value="${row.movie_id}" >Edit</button>&nbsp;</div>
                </form>
                    ${row.movie_name}
            </div>
                    
                    
        </div>
               <form action="Add_movie" method="post" enctype="multipart/form-data">
                    <table id="tab3" style="width:500px;" align="center" >
                        <tr>
                        <td colspan="2">
                            <embed width="640" height="390" src="${row.movie_trailor}">
                    </td>
                </tr>
                <tr>
                    <td>
                        <img src="${row.image}" width="200" height="300" >                       
                    </td>
                    <td>
                        <table id="tab3">
                            <tr>
                                <td>
                                    <b>Genre</b>
                                </td>
                                <td>
                                    ${row.genre}
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <b>Release Date</b>
                                </td>
                                <td>
                                    ${row.release_date}
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <b>Duration</b>
                                </td>
                                <td>
                                    ${row.duration}
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <b>Cast</b>
                                </td>
                                <td>
                                    ${row.cast}
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <b>Production</b>
                                </td>
                                <td>
                                    ${row.production}
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <b>Rating</b>
                                </td>
                                <td>
                                    <img width="180" src="${row.rating}" />
                                </td>
                            </tr>
                        </table>
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <b>Description</b>
                    </td>                 
                </tr>
                 <tr>
                    <td colspan="2">
                        ${row.description}
                    </td>                 
                </tr>
                
                    </table>
                    </form>                       
                </c:forEach>
                </div>
               
              </div>
            
            </div>
        
            <div id="footer">
                <p>All Right Reserve with S121135300133</p>
            </div>
    </body>
</html>