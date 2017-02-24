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
        <title>View Event</title>
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
            <div style="display:block;background-color:black;width:863px; padding: 10px 10px 23px 10px" >
            <div style="color:white;font-family: 'Source Sans Pro', sans-serif;  ">
            <form action="Delete_event" method="post">
                <div style="float:right"><button id="btn" type="submit" name="event_id" value="${row.event_id}" >Delete</button></div>
                </form>
                <form action="backend_edit_event.jsp" method="get">
                <div style="float:right"><button id="btn" type="submit" name="event_id" value="${row.event_id}" >Edit</button>&nbsp;</div>
                </form>
                ${row.event_name}
            
            </div>
            </div>    
            <div>
                <img style="margin-left:0px " src="${row.image}" width="883" height="280">
            </div>
                    <div style="display:block;background-color:black;width:883px;margin-top:-4px; " >
                <div style="color:white;font-family: 'Source Sans Pro', sans-serif; padding:10px ">
                    <img src="Image/calander.png" width="18" >
                    ${row.event_date}
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <img src="Image/clock.png" width="15">
                    ${row.event_time} | ${row.duration}
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <img src="Image/type.png" width="18">  ${row.genre}
                    <br>
                    <img src="Image/venue.png" width="15">
                    ${row.venue} <br>
                    <img src="Image/artist.png" width="18">  ${row.artist}
                </div>   
                </div>
                <div style="display:block;background-color:#777;width:883px;margin-top:-4px " >
                    <div style="color:white;font-family: 'Source Sans Pro', sans-serif; padding:10px ">
                        Info <br>
                        <div style="color:white;font-family: 'Source Sans Pro', sans-serif; padding:10px; font-size: 15px;">
                         ${row.info}   
                        </div>
                    </div> 
                </div>
                <h3>Book Your Tickets</h3>
                <div style="float:right;width:300px;height:400px;margin-right: 40px">
                    
                </div>
                <div>
                    <a id="ticket" rel="gold">
                        <table id="tab3">
                            <tr>
                                <td>Gold</td>
                                <td rowspan="2">Rs.${row.gold_fare}</td>
                                <td rowspan="2">
                                    <input type="number" name="seats" min="1" max="${row.gold_seating}" />
                                </td>
                            </tr>
                            <tr>
                                <td>
                                Available Seats : ${row.gold_seating} seats
                                </td>
                            </tr>
                        </table>
                    </a>
                    <a rel="silver">
                        <table id="tab3">
                            <tr>
                                <td>
                                Silver
                                </td>
                                <td rowspan="2">
                                Rs.${row.silver_fare}
                                </td>
                                <td rowspan="2">
                                    <input type="number" name="seats" min="1" max="${row.silver_seating}" />
                                </td>
                            </tr>
                            <tr>
                                <td>
                                Available Seats : ${row.silver_seating} seats
                                </td>
                            </tr>
                        </table>
                    </a>
                    <a rel="stall">
                        <table id="tab3">
                            <tr>
                                <td>
                                Stall
                                </td>
                                <td rowspan="2">
                                Rs.${row.stall_fare}
                                </td>
                                <td rowspan="2">
                                    <input type="number" name="seats" min="1" max="${row.stall_seating}" />
                                </td>
                            </tr>
                            <tr>
                                <td>
                                Available Seats : ${row.stall_seating} seats
                                </td>
                            </tr>
                        </table>
                    </a>
                    </c:forEach>
                </div>   
            </div>
            <div id="footer">
                <p>All Right Reserve with S121135300133</p>
            </div>
    </body>
</html>
