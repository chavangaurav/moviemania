<%-- 
    Document   : checkout_movie
    Created on : Feb 17, 2017, 11:44:41 PM
    Author     : Gaurav Chavan
--%>
<%@ page import ="java.sql.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Check out</title>
    </head>
    <%
    String event_id = request.getParameter("event_id");
    int gold = Integer.parseInt(request.getParameter("gold_seats"));
    int silver = Integer.parseInt(request.getParameter("silver_seats"));
    int stall = Integer.parseInt(request.getParameter("stall_seats"));
    int gold_fare = Integer.parseInt(request.getParameter("gold_fare"));
    int silver_fare = Integer.parseInt(request.getParameter("silver_fare"));
    int stall_fare = Integer.parseInt(request.getParameter("stall_fare"));
    int seats = gold + silver + stall;
    int fare = (gold * gold_fare)+(silver*silver_fare)+(stall*stall_fare);
    //String seatss = Integer.toString(seats);
    %>
    <body>
        <%@include file="frontend_header.jsp" %>
            <div id="container">
            
        <sql:setDataSource var="snapshot" driver="sun.jdbc.odbc.JdbcOdbcDriver" url="jdbc:odbc:movie_mania"/>
        <sql:query dataSource="${snapshot}" var="result">
        SELECT * from event where event_id=<%=event_id%>;
        </sql:query>
        <c:forEach var="row" items="${result.rows}">
            <form action="Checkout_event" method="post">
                <center><table id="tab3" style="width:520px">
                            <tr>
                                <td colspan="2">
                                <img src="${row.image}" width="500" height="180" >                       
                            </td>
                            </tr>
                            <tr>
                                <td>
                                    Event Name
                                </td>
                                <td>
                                    <input type="text" name="event_name" value="${row.event_name}">
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    Date
                                </td>
                                <td>
                                    <input type="text" name="date" value="${row.event_date}">
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    Gold
                                </td>
                                <td>
                                    <input type="text" id="gold" name="gold" value="<%=gold%>" />
                                    
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    Silver
                                </td>
                                <td>
                                    <input type="text" id="silver" name="silver" value="<%=silver%>" />
                                    
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    Stall
                                </td>
                                <td>
                                    <input type="text" id="stall" name="stall" value="<%=stall%>" />
                                    
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    Seats
                                </td>
                                <td>
                                    <input type="text" name="seat" value='<%=seats%>' />
                
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    Fare
                                </td>
                                <td>
                                    <input type="number" id='fare' name="fare" value="<%=fare%>"/>
                                </td>
                            </tr>
                            <tr>
                    <td colspan='2' align="center">
                        <b>Personal Info</b>
                    </td>
                </tr>
                <tr>
                    <td>
                        Name
                    </td>
                    <td>
                        <input type="text" name="name" >
                    </td>
                </tr>
                <tr>
                    <td>
                        Email
                    </td>
                    <td>
                        <input type="text" name="email_id" >
                    </td>
                </tr>
                <tr>
                    <td>
                        Number
                    </td>
                    <td>
                        <input type="text" name="contact_number" maxlength="10">
                    </td>
                </tr>
                <tr>
                    <td colspan='2' align="center">
                        <b>Payment</b>
                    </td>
                </tr>
                <tr>
                <td colspan='2' align="center">
                    <input type="radio" name="card_type" value="amex" checked>  <img src='Image/amex.png' />
                    <input type="radio" name="card_type" value="visa" checked>  <img src='Image/visa.png' />
                    <input type="radio" name="card_type" value="mastercard">  <img src='Image/mastercard.png' /> 
                    <input type="radio" name="card_type" value="dinersclub">  <img src='Image/dinersclub.png' />
                    <input type="radio" name="card_type" value="discover">  <img src='Image/discover.png' />
                    <input type="radio" name="card_type" value="giftcard">  <img src='Image/giftcard.png' />
                    <input type="radio" name="card_type" value="check">  <img src='Image/check.png' />
                </td>
                </tr>
                <tr>
                    <td>
                        Name on Card 
                    </td>
                    <td>
                        <input type="text" name="card_name">
                    </td>
                </tr>
                <tr>
                    <td>
                        Card Number  
                    </td>
                    <td>
                        <input type="number" name="card_number">
                    </td>
                </tr>
                <tr>
                    <td>
                        CVV 
                    </td>
                    <td> 
                        <input style="width:40px " type="password" name="cvv"   maxlength="3">
                    </td>
                </tr>
                <tr>
                    <td colspan='2' >
                <center>
                        <input style="height: 30px; width: 100px;" type="submit" value="Proceed" />
                        <input style="height: 30px; width: 100px;" type="reset" value="Reset" />
                </center>   
                </td>
                
                        </table>
                </center>
            </form>
        </c:forEach>
        <%@include file="footer.jsp" %>
            </div>
            
    </body>
</html>
