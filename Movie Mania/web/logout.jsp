<%-- 
    Document   : logout
    Created on : Jun 17, 2016, 9:06:20 PM
    Author     : Developer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
                       session.setAttribute("userid", null);
                       response.sendRedirect("login.jsp");
        %>
    </body>
</html>
