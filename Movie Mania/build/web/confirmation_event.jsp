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
        
    </head>
    <body>
        <%@include file="frontend_header.jsp" %>
            <div id="container">
            
        <sql:setDataSource var="snapshot" driver="sun.jdbc.odbc.JdbcOdbcDriver" url="jdbc:odbc:movie_mania"/>
        <sql:query dataSource="${snapshot}" var="result">
        select top 1 * from transact_event order by transaction_id desc;
        </sql:query>
        <c:forEach var="row" items="${result.rows}">
            <br>
            <p style="margin-bottom: 15px;margin-left: 15px;font-family:Arial;font-size: 18px;">
                Congratulation!!! You have successfully booked the ticket. </p>
            <center><table id="tab3" style="width:400px;" border="1px">
                            <tr>
                                <td>
                                    Transaction ID
                                </td>
                                <td>
                                    MOV100${row.transaction_id}
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    Event Name
                                </td>
                                <td>
                                    ${row.event_name}
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    Date
                                </td>
                                <td>
                                    ${row.date}
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    Seats
                                </td>
                                <td>
                                    ${row.seat}
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    Customer Name
                                </td>
                                <td>
                                    ${row.name}
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    Contact Number
                                </td>
                                <td>
                                    ${row.contact_number}
                                </td>
                            </tr>
                            <tr>
                                <td colspan="2">
                            <center>
                                    <a href="javascript:print()"><input type='button'  value="Print"></a>
                                    <a href="home.jsp"><input type='button'  value="Home"></a>
                            </center>    
                            </td>
                            </tr>
                        </table>
            </center>
            <br>
        </c:forEach>
        <%@include file="footer.jsp" %>
            </div>
            
    </body>
</html>
