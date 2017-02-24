<%-- 
    Document   : img_upload
    Created on : 4 Jul, 2016, 11:10:02 AM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    <body>
        <form action="upload" method="post" enctype="multipart/form-data">

        <table>
            <tr>
                <td>Select File : </td>
                <td><input  name="file" type="file"/> </td>
            </tr>
            <tr>
                <td>Enter Filename : </td>
                <td><input type="text" name="photoname" size="20"/> </td>
            </tr>
        </table>
        <p/>
        <input type="submit" value="Upload File"/>
    </form>

    </body>
</html>
