<%-- 
    Document   : registration_validate
    Created on : 11 Jun, 2016, 4:20:41 PM
    Author     : hp
--%>

<%@page import="java.io.PrintWriter"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import ="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body onload="aalert()">
        <script>
        function aalert() {
        alert("User has been successfully added");
        }
        </script>
        <%
            
        Connection c = null;
        Statement stmt = null;
        try 
        {
        String username =   request.getParameter("username");   
        String password =   request.getParameter("password");
        String firstname =  request.getParameter("firstname");
        String lastname =   request.getParameter("lastname");
        String email =      request.getParameter("email");  
        String mobileno =   request.getParameter("mobileno");
        
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        c = DriverManager.getConnection("jdbc:odbc:movie_mania");
        c.setAutoCommit(false);
        System.out.println("Opened database successfully");

        stmt = c.createStatement();
        String sql = "INSERT INTO users (firstname,lastname,username,password,email,mobile) VALUES ('"+ firstname + "','"+ lastname +"','"+ username +"','"+password+"','"+email+"','"+mobileno+"')";

        stmt.executeUpdate(sql);

        stmt.close();
        c.commit();
        c.close();
        session.setAttribute("user", username);
        } catch ( Exception e ) {
        System.err.println( e.getClass().getName() + ": " + e.getMessage() );
        System.exit(0);
        }
         System.out.println("Records created successfully"); 
        
             %>
        
        <%@include  file="register.jsp" %>
        
        
    </body>
</html>
