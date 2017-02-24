<%-- 
    Document   : backend
    Created on : 25 May, 2016, 8:10:07 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.io.PrintWriter"%>
<%@ page import ="java.sql.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="CSS/main.css" rel="stylesheet" type="text/css"/>
        <title>Home</title>
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
            <sql:setDataSource var="snapshot" driver="sun.jdbc.odbc.JdbcOdbcDriver" url="jdbc:odbc:movie_mania"/>
            <sql:query dataSource="${snapshot}" var="result">
            SELECT * from movie order by movie_id desc;;
            </sql:query>
            
            <div style="display:block;background-color:black;width:883px;margin: 0 auto;" >
            <div style="color:white;font-family: 'Source Sans Pro', sans-serif;padding:10px ">
            Movies
            </div>
            </div>
            <div id="layout">
            <form action="backend_view_movie.jsp" method="post">
            <c:forEach var="row" items="${result.rows}">
                <table id="layout">
                    <tr>
                        <td>
                            <img src="${row.image}" width="184" height="290"><br><br>
                    <center>
                        <button id="btn" value="${row.movie_id}" type="submit" name="movie_id">${row.movie_name}</button>
                    </center>
                        </td>
                    </tr>
                </table>  
            </c:forEach>
            </form>
            </div>
            <div id="section">
            <sql:query dataSource="${snapshot}" var="event_result">
            select * from event order by event_id desc;
            </sql:query>
            <div style="display:block;background-color:black;width:875px;margin: 0 auto" >
            <div style="color:white;font-family: 'Source Sans Pro', sans-serif;padding:10px ">
            Event
            </div>
            </div>
            <div id="layout">
            <form action="backend_view_event_1.jsp" method="get">
            <c:forEach var="res" items="${event_result.rows}">
                <table id="layout2">
                    <tr>
                        <td>
                            <img src="${res.image}" width="250" height="100"><br><br>
                    <center>
                        <button id="btn" value="${res.event_id}" type="submit" name="event_id">${res.event_name}</button>
                    </center>
                        </td>
                    </tr>
                </table>  
            </c:forEach>
            </form>
            </div>
            </div>
            </div>
            <div id="footer">
                <p>All Right Reserve with S121135300133</p>
            </div>
    </body>
</html>
