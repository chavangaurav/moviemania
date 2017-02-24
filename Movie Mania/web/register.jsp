<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="frontend_header.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="CSS/main.css" rel="stylesheet" type="text/css">
        <title>JSP Page</title>
    </head>
    <body>
        <div id="container">
            <br>
        <div style="display:block;background-color:black;margin: 0 auto;" >
            <h2 style="color:white;font-family: 'Source Sans Pro', sans-serif;padding:10px ">
                Registration
            </h2>
        </div>
        <form action="registration_validate.jsp" method="post">
            <table id="tab" style="width:500px;" align="center" >
                <tr >
                    <td>
                        First Name
                    </td>
                    <td>
                        <input type="text" name="firstname" width="200px">
                    </td>
                </tr>
                <tr>
                    <td>
                        Last Name
                    </td>
                    <td>
                        <input type="text" name="lastname">
                    </td>
                </tr>
                <tr>
                    <td>
                        Email ID
                    </td>
                    <td>
                        <input type="text" name="email">
                    </td>
                </tr>
                <tr>
                    <td>
                        Mobile Number
                    </td>
                    <td>
                        <input type="text" name="mobileno">
                    </td>
                </tr>
                <tr>
                    <td>
                        Username
                    </td>
                    <td>
                        <input type="text" name="username">
                    </td>
                </tr>
                <tr>
                    <td>
                        Password
                    </td>
                    <td>
                        <input type="password" name="password">
                    </td>
                </tr>
                 <tr>
                     <td colspan="2">
                 <center>
                        <input type="submit" value="Submit">
                        <input type="reset" value="Reset">
                </center>
                        </td>
                </tr>
            </table>
        </form> 
        <%@include file="footer.jsp" %>
        </div>
    </body>
</html>
