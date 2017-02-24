<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%
    String Itemid = request.getParameter("itemID");
%> 
<html>
<head>
<title>SELECT Operation</title>
</head>
<body>
 
<sql:setDataSource var="snapshot" driver="sun.jdbc.odbc.JdbcOdbcDriver"
     url="jdbc:odbc:movie_mania"/>
 
<sql:query dataSource="${snapshot}" var="result">
    SELECT * from event where event_id=<%=Itemid%>;
</sql:query>
 
<table border="1" width="100%">
<tr>
   <th>Event Name</th>
   <th>Genre</th>
   <th>Event Time</th>
   <th>Event Date</th>
</tr>
<c:forEach var="row" items="${result.rows}">
<tr>
   <td><c:out value="${row.event_name}"/></td>
   <td><c:out value="${row.genre}"/></td>
   <td><c:out value="${row.event_time}"/></td>
   <td><c:out value="${row.event_date}"/></td>
</tr>
</c:forEach>
</table>
 
</body>
</html>
