<%-- 
    Document   : home
    Created on : 18 May, 2016, 6:59:57 PM
    Author     : hp
--%>
<%@page import="java.io.PrintWriter"%>
<%@ page import ="java.sql.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <link href="CSS/main.css" rel="stylesheet" type="text/css">
    </head>
    <body id="background" >
        <%@include file="frontend_header.jsp" %>
        <%@include file="slider.html" %>
        <div id="container">    
        <sql:setDataSource var="snapshot" driver="sun.jdbc.odbc.JdbcOdbcDriver" url="jdbc:odbc:movie_mania"/>
            <sql:query dataSource="${snapshot}" var="result">
            SELECT * from movie order by movie_id desc;
            </sql:query>
            
            <div style="font-size:25px;color:white;padding:10px ">
                <table width="100%" style="background-color: black;padding:10px 10px 10px 0px;">
                    <tr>
                        <td>
                            Movie
                        </td>
                    </tr>
                </table>
            </div><div id="layout_movie">
            <form action="view_movie.jsp" method="post">
            <c:forEach var="row" items="${result.rows}">
                <table id="layout_movie">
                    <tr>
                        <td>
                            <img src="${row.image}" width="200" height="310"><br><br>
                    <center>
                        <button id="btn" value="${row.movie_id}" type="submit" name="movie_id">${row.movie_name}</button>
                    </center>
                        </td>
                    </tr>
                </table>  
            </c:forEach>
            </form>
            </div>
            </div>
            <div id="container">    
            <sql:query dataSource="${snapshot}" var="event_result">
            select * from event order by event_id desc;
            </sql:query>
            <div style="font-size:25px;color:white;padding:10px ">
                <table width="100%" style="background-color: black;padding:10px 10px 10px 0px;">
                    <tr>
                        <td>
                            Event
                        </td>
                    </tr>
                </table>
            </div>
            <div id="layout_event">
            <form action="view_event.jsp" method="get">
            <c:forEach var="res" items="${event_result.rows}">
                <table id="layout_event">
                    <tr>
                        <td>
                            <img src="${res.image}" width="275" height="125"><br><br>
                    <center>
                        <button id="btn" value="${res.event_id}" type="submit" name="event_id">${res.event_name}</button>
                    </center>
                        </td>
                    </tr>
                </table>  
            </c:forEach>
            </form>
            </div>
            <%@include file="footer.jsp" %>
            </div>        
    </body>
</html>