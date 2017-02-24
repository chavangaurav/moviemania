<%-- 
    Document   : login
    Created on : 11 Jun, 2016, 12:31:43 PM
    Author     : hp
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Login</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width">
        <style type="text/css">
        .style1
        {
            width: 100%;
        }
        
    #backgrnd
    {    
	background-image:url('Image/Elegant_Background-18.jpg');
    }
        .style2
        {
            width: 615px;
        }
    </style>
    </head>
    <body id="backgrnd">
        
        
                <form action="validate.jsp">
            <center>
            <table border="0" cellpadding="5" cellspacing="2">
                <thead>
                    <tr>
                        <th colspan="2"><img src="Image/logo.png" height="120" width="240"/>    </th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Username</td>
                        <td><input type="text" name="username" required/></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="password" name="password" required/></td>
                    </tr>
                    <tr>
                        <td colspan="2" align="center"><input type="submit" value="Login" />
                            &nbsp;&nbsp;
                            <input type="reset" value="Reset" />
                        </td>                        
                    </tr>                    
                </tbody>
            </table>
            </center>
        </form>
        <h3 style="color:red;" align="center">
        <c:if test="${not empty param.errMsgb}">
            <c:out value="${param.errMsgb}" />
        </c:if>
        </h3>
    </body>
</html>

