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
    <%
    String movie_id = request.getParameter("movie_id");
    %>
    <body>
    <sql:setDataSource var="snapshot" driver="sun.jdbc.odbc.JdbcOdbcDriver" url="jdbc:odbc:movie_mania"/>
 
    <sql:query dataSource="${snapshot}" var="result">
    SELECT * from movie where movie_id=<%=movie_id%>;
    </sql:query>        

        <body>
            <%@include file="frontend_header.jsp" %>
            <div id="container" style="width:71.5%">
            
            <c:forEach var="row" items="${result.rows}">    
                <div style="display:block;background-color:#333;margin: 0 auto;padding:15px 15px 15px 15px" >
                    
            <div style="color:white;font-family: 'Source Sans Pro', sans-serif; ">
                <form action="checkout_movie.jsp" method="post">
                <div style="float:right;align:middle;margin-top: -6px"><button id="btn" type="submit" name="movie_id" value="${row.movie_id}" >Book Now</button></div>
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
            <%@include file="footer.jsp" %>
            </div>
    </body>
</html>