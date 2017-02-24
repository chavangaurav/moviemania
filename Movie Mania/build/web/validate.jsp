<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
 
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Authentication page</title>
  </head>
  <body>
    
    <c:if test="${ empty param.username or empty param.password}">
      <c:redirect url="login.jsp" >
              <c:param name="errMsgb" value="Please Enter UserName and Password" />
      </c:redirect>
       
    </c:if>
     
    <c:if test="${not empty param.username and not empty param.password}">
    <sql:setDataSource var="snapshot" driver="sun.jdbc.odbc.JdbcOdbcDriver" url="jdbc:odbc:movie_mania"/>
    <sql:query dataSource="${snapshot}" var="result">
    SELECT count(*) as kount from login where username='${param.username}' and password='${param.password}';
    </sql:query>
    <c:forEach items="${result.rows}" var="r">
            <c:if test="${r.kount gt 0}">
            <c:set scope="session" var="userid" value="${param.username}" />
            <c:redirect url="backend_home.jsp"/>
            </c:if>
            <c:redirect url="login.jsp" >
            <c:param name="errMsgb" value="Incorrect combination of username & password" />
            </c:redirect>
    </c:forEach>
    </c:if>
 
  </body>
</html>