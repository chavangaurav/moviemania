<%-- 
    Document   : newjsp
    Created on : 23 May, 2016, 4:05:14 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="org.sqlite.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table>
            <thead>
                <tr>
                    <th>Item No.</th>
                    <th>Name</th>
                    <th>Price</th>
                    <th>Description</th>
                </tr>
            </thead>
            <tbody>
            <%
                Class.forName("org.sqlite.JDBC");
                Connection conn =
                     DriverManager.getConnection("jdbc:sqlite:C:\\Users\\hp\\Documents\\NetBeansProjects\\Movie Mania\\web\\Data\\webshop.sqlite");
                Statement stat = conn.createStatement();
 
                ResultSet rs = stat.executeQuery("select * from products;");
 
                while (rs.next()) {
                    out.println("<tr>");
                    out.println("<td>" + rs.getString("id") + "</td>");
                    out.println("<td>" + rs.getString("title") + "</td>");
                    out.println("<td>" + rs.getString("price") + " kr.</td>");
                    out.println("<td>" + rs.getString("description") + "</td>");
                    out.println("</tr>");
                }
 
                rs.close();
                conn.close();
            %>
            </tbody>
        </table>
    </body>
</html>
