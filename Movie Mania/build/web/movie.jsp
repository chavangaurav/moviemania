<%-- 
    Document   : movie
    Created on : Aug 14, 2016, 3:23:56 PM
    Author     : Gaurav Chavan
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
        <title>Movies</title>
    </head>
    <body>
        <body id="background">
        <%@include file="frontend_header.jsp" %>
        <%@include file="slider.html" %>
        <div id="container">
        <sql:setDataSource var="snapshot" driver="sun.jdbc.odbc.JdbcOdbcDriver" url="jdbc:odbc:movie_mania"/>
            <sql:query dataSource="${snapshot}" var="result">
            SELECT * from movie order by movie_id desc;
            </sql:query>
            <div style="font-size:18px;color:white;padding:10px ">
                <table width="102.2%" style="background-color: black;padding:0px 0px 0px 10px;margin-left: -10px;margin-right: -20px;">
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
                            <img src="${row.image}" width="205" height="310"><br><br>
                    <center>
                        <button id="btn" value="${row.movie_id}" type="submit" name="movie_id">${row.movie_name}</button>
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