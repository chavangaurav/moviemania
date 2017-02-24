<%-- 
    Document   : test
    Created on : 14 Jun, 2016, 1:04:41 PM
    Author     : hp
--%>

<%@page import="java.io.PrintWriter"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import ="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript">
        function Calculate()
        {
          var resources = document.getElementById('Resources').value;
          var minutes = document.getElementById('Minutes').value; 
          document.getElementById('answer').value=parseFloat(resources) * parseFloat(minutes);
          }
        </script>
        <title>Test</title>
    </head>
<body>
<input type='text' id='Resources'/>
<input type='text' id='Minutes' onblur='Calculate();'/>
<form name ="testarea" Method="Get" Action="youpage.html" id='form1'>
<input type='text' id='answer' name='ans' />
</form>
</body>
</html>
