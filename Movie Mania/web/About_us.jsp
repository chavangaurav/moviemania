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
                <div style="padding: 1px 20px 1px 20px; font-family: Arial;font-size: 18px;text-align: justify;" align="">
                    <p>
                    <center><img src="Image/logo.png" height="100px" /></center>
                        <br>
                        <br>
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce scelerisque elit diam, sed cursus massa pellentesque sit amet. Morbi blandit sapien ut erat mattis, ac rhoncus velit semper. Maecenas vehicula erat lacus, ut posuere tellus efficitur pharetra. Fusce porttitor nisl vitae malesuada tempus. Integer egestas purus sed nulla eleifend, sed aliquam elit volutpat. Morbi lacinia urna ut vulputate eleifend. Quisque accumsan sit amet est eu malesuada. Curabitur quis purus a neque dictum pharetra. Duis in tellus libero. Aenean elementum tellus a purus tempor, in gravida erat dignissim. Suspendisse non eleifend lacus. Suspendisse pretium, magna vitae auctor hendrerit, magna elit porta quam, eu efficitur nunc dui vitae mauris. Donec risus arcu, finibus et fermentum vel, condimentum a dui. Vivamus id tellus ipsum.  
                      <br>
                      <br>
                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Etiam est est, aliquet non nisi fermentum, rutrum dictum leo. Vivamus lacinia feugiat egestas. Sed tincidunt enim nec viverra suscipit. Praesent euismod felis ac purus consectetur imperdiet. Sed nunc nisl, cursus in tincidunt in, consequat et massa. Donec auctor ut justo maximus lobortis. Proin eu ex est. Aliquam erat volutpat.
                      <br>
                      <br>
                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Mauris malesuada euismod magna in vestibulum. In non diam eu tellus pellentesque luctus ac sit amet metus. Mauris sed fringilla augue, eu rutrum ex. Aenean pellentesque in purus quis elementum. Sed sit amet lobortis orci, sit amet ultrices ligula. Etiam a diam eget turpis facilisis feugiat sed sed nunc. Nulla feugiat condimentum elit ac accumsan. Sed condimentum varius sem vel malesuada. Donec ac libero eu mauris lobortis tempor.
                    </p>
                    
                </div>   
        <%@include file="footer.jsp" %>
            </div>
            <p></p>
    </body>
</html>
