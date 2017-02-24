<%-- 
    Document   : checkout_movie
    Created on : Feb 17, 2017, 11:44:41 PM
    Author     : Gaurav Chavan
--%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.util.*"%>
<%@ page import ="java.sql.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Check out</title>
        <script type="text/javascript">
        function Calculate()
        {
            var seats = document.getElementById('seats').value; 
            document.getElementById('fare').value=parseFloat(seats) * 250;
            document.getElementById('seatsr').value= 18 - parseFloat(seats);
        }
        </script>
    </head>
    <%
    String movie_id = request.getParameter("movie_id");
    %>
    <body>
        <%@include file="frontend_header.jsp" %>
            <div id="container">
            
        <sql:setDataSource var="snapshot" driver="sun.jdbc.odbc.JdbcOdbcDriver" url="jdbc:odbc:movie_mania"/>
        <sql:query dataSource="${snapshot}" var="result">
        SELECT * from movie where movie_id=<%=movie_id%>;
        </sql:query>
        <c:forEach var="row" items="${result.rows}">
            <form action="Checkout_movie" method="post">
            <table id="tab3" style="width:600px; padding:5px;" align="center">
                <tr>
                    <td>
                        <img src="${row.image}" width="200" height="300" >                       
                    </td>
                    <td>
                        <table id="tab3" style="width:600px;">
                            <tr>
                                <td>
                                    Movie Name
                                </td>
                                <td>
                                    <input type="text" name="movie_name" value="${row.movie_name}">
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    Date
                                </td>
                                <td>
                                    <input type="date" name="date">
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    Time
                                </td>
                                <td>
                                    <input type="radio" name="time" value="10.00 AM" checked> 10.00 AM
                                    <input type="radio" name="time" value="02.00 PM"> 02.00 PM 
                                    <input type="radio" name="time" value="06.00 PM"> 06.00 PM
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    Seats
                                </td>
                                <td>
                                    <input type="number" value="1" id='seats' name="seats" min="1" max='18' onblur='Calculate();'/>
                
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    Seats Remaining
                                </td>
                                <td>
                                    <input type="number" name="seatsr" id='seatsr' value="18"  disabled="true"/>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    Fare
                                </td>
                                <td>
                                    <input type="number" id='fare' name="fare" value="250"/>
                                </td>
                            </tr>
                        </table>
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
                </tr>
            </table>
            </form>
        </c:forEach>
        <%@include file="footer.jsp" %>
            </div>
            
    </body>
</html>
