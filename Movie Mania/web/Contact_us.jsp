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
        <title>About Us</title>
        
    </head>
    <body>
        <%@include file="frontend_header.jsp" %>
            <div id="container">
                
                <div style="padding: 1px 20px 1px 20px; font-family: Arial;font-size: 16px;text-align: justify;" align="">
                  <div style="font-size:18px;color:white;padding:0px ">
                    <table width="100%" style="background-color: black; padding:5px 10px 5px 10px;">
                        <tr>
                            <td>
                                Contact Us
                            </td>
                        </tr>
                    </table>
                  </div>
                    <form method="post" action="MailDispatcherServlet">
                    <table id="tab3" style="width:400px;">
                            <tr>
                                <td align="right">
                                    Name
                                </td>
                                <td>
                                    <input type="text" name="name" size="40" />
                                </td>
                            </tr>
                            <tr>
                                <td align="right">
                                    Email
                                </td>
                                <td>
                                    <input type="text" name="email" size="73" />
                                </td>
                            </tr>
                            <tr>
                                <td align="right">
                                    Message
                                </td>
                                <td>
                                    <textarea rows="9" cols="75" name="message"></textarea>
                                </td>
                            </tr>
                            <tr>
                                <td colspan="2">
                            <center>
                                <input style="width: 70px;height: 30px;" type='submit'  value="Send">
                                <input style="width: 70px;height: 30px;" type='reset'  value="Reset">
                            </center>    
                            </td>
                            </tr>
                        </table>
                    </form>
                </div>   
        <%@include file="footer.jsp" %>
            </div>
            <p></p>
    </body>
</html>
