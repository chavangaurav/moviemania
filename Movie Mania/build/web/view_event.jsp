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
        <title>Events</title>
    </head>
    <%
    String event_id = request.getParameter("event_id");
    %>
    <body>
    <sql:setDataSource var="snapshot" driver="sun.jdbc.odbc.JdbcOdbcDriver" url="jdbc:odbc:movie_mania"/>
 
    <sql:query dataSource="${snapshot}" var="result">
    SELECT * from event where event_id=<%=event_id%>;
    </sql:query>        

        <body>
            <%@include file="frontend_header.jsp" %>
            <div id="container" style="width:71.5%">
            
            <c:forEach var="row" items="${result.rows}">
            <form action="checkout_event.jsp" method="post">
            <div style="display:block;background-color:#333; padding: 10px 10px 23px 10px" >
            <div style="color:white;font-family: 'Source Sans Pro', sans-serif;  ">
                <div style="float:right"><button id="btn" type="submit" name="event_id" value="${row.event_id}" >Book Now</button>&nbsp;</div>
                
                ${row.event_name}
            
            </div>
            </div>    
            <div>
                <img style="margin-left:0px " src="${row.image}"  height="301.5">
            </div>
                    <div style="display:block;background-color:#333;margin-top:-4px; " >
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
                <div style="display:block;background-color:#777;margin-top:-4px " >
                    <div style="color:white;font-family: 'Source Sans Pro', sans-serif; padding:10px ">
                        Info <br>
                        <div style="color:white;font-family: 'Source Sans Pro', sans-serif; padding:10px; font-size: 15px;">
                         ${row.info}   
                        </div>
                    </div> 
                </div>
                <div style="padding:10px 10px 10px 20px;">
                <h3>Book Your Tickets</h3>
                <div>
                    <a id="ticket" rel="gold">
                        <table id="tab3">
                            <tr>
                                <td>Gold</td>
                                <td rowspan="2">Rs.${row.gold_fare}</td>
                                <td rowspan="2">
                                    <input type="number" name="gold_seats" value='0' min="0" max="${row.gold_seating}" />
                                    <input type="hidden" name="gold_fare" value="${row.gold_fare}" />
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
                                    <input type="number" name="silver_seats" value='0' min="0" max="${row.silver_seating}" />
                                    <input type="hidden" name="silver_fare" value="${row.silver_fare}" />
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
                                    <input type="number" name="stall_seats" value='0'min="0" max="${row.stall_seating}" />
                                    <input type="hidden" name="stall_fare" value="${row.stall_fare}" />
                                </td>
                            </tr>
                            <tr>
                                <td>
                                Available Seats : ${row.stall_seating} seats
                                </td>
                            </tr>
                        </table>
                    </a>
                    </div>
                    </div>
                    </form>            
                    </c:forEach>
            <%@include file="footer.jsp" %>
            </div>
    </body>
</html>