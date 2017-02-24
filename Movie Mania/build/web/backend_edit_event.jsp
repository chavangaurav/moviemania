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
        <title>Edit Event</title>
    </head>
    <%
    String event_id = request.getParameter("event_id");
    %>
    <body>
<sql:setDataSource var="snapshot" driver="sun.jdbc.odbc.JdbcOdbcDriver" url="jdbc:odbc:movie_mania"/>
 
<sql:query dataSource="${snapshot}" var="result">
    SELECT * from event where event_id=<%=event_id%>;
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
            <div style="color:white;font-family: 'Source Sans Pro', sans-serif;padding:10px ">
                Add Event
            </div>
            </div>
               <form action="Edit_event" method="post" enctype="multipart/form-data">
                    <table id="tab" style="width:500px;" align="center" >
                        <tr>
                    <td>
                        Event Name
                    </td>       
                    <td>
                        <input type="text" name="event_name" value="${row.event_name}">
                        <input type="hidden" name="event_id" value="${row.event_id}"
                    </td>
                </tr>
                <tr>
                    <td>
                        Event Date
                    </td>
                    <td>
                        <input type="date" name="event_date" value="${row.event_date}">
                    </td>
                </tr>
                <tr>
                    <td>
                        time
                    </td>
                    <td>
                        <input type="time" name="event_time" value="${row.event_time}">
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
                        Type
                    </td>
                    <td>
                        <input type="text" name="genre" value="${row.genre}">
                    </td>
                </tr>
                <tr>
                    <td>
                        Venue
                    </td>
                    <td>
                        <input type="text" name="venue" value="${row.venue}" >
                    </td>
                </tr>
                <tr>
                    <td>
                        Artist
                    </td>
                    <td>
                        <input type="text" name="artist" value="${row.artist}">
                    </td>
                </tr>
                <tr>
                    <td>
                        Info
                    </td>
                    <td>
                        <textarea rows="4" cols="25" name="info">${row.info}</textarea>
                    </td>
                </tr>
                <tr>
                    <td>
                        Gold Fare
                    </td>
                    <td>
                        <input type="number" name="gold_fare" value="${row.gold_fare}"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        Silver Fare
                    </td>
                    <td>
                        <input type="number" name="silver_fare" value="${row.silver_fare}"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        Stall Fare
                    </td>
                    <td>
                        <input type="number" name="stall_fare" value="${row.stall_fare}"/>
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
                        </c:forEach>
        </div>
               
              </div>
            
            </div>
        
            <div id="footer">
                <p>All Right Reserve with S121135300133</p>
            </div>
    </body>
</html>
