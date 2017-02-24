<%-- 
    Document   : sessionin
    Created on : 23 May, 2016, 7:25:15 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title></title>
        <link href="CSS/main.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        <div id="backend-cont">
            <img src="Image/logo.png" height="100" width="180"/>
           
            <%
                if ((session.getAttribute("userid") == null) || (session.getAttribute("userid") == "")) {
            %>
            <p style="float:right">You are not logged in <a href="login.jsp">Please Login</a></p>
            <%} else {
            %>
            <p style="float:right">Welcome <%=session.getAttribute("userid")%> | <a href='logout.jsp'>Log out</a></p>
            <%
                }
            %>
         </div>
</body>
</html>
