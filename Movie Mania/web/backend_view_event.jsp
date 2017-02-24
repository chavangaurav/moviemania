<%-- 
    Document   : backend
    Created on : 25 May, 2016, 8:10:07 PM
    Author     : hp
--%>

<%@page import="java.io.PrintWriter"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import ="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="CSS/main.css" rel="stylesheet" type="text/css"/>
        <title>View Event</title>
    </head>
    <body>
        
        <%@include file="header_backend.jsp" %>
        
        
        <div id="bdy">
            <hr>
                <div id="nav">
            <ul>
                    <li><a href="backend_home.jsp">Home</a></li>
                    <li><a href="backend_add_movie.jsp">Movies</a></li>
                    <li><a href="backend_add_event.jsp">Events</a></li>
                    <li><a href="ViewUser">Users</a></li>
                    <li><a href="backend_about.jsp">About</a></li>
            </ul>
            </div>
               
            <div id="section">
            <div style="display:block;background-color:black;width:883px;margin: 0 auto;" >
            <h3 style="color:white;font-family: 'Source Sans Pro', sans-serif; padding:10px ">
            Events
            <div style="float:right"><button>Book Now</button></div>
                
            </h3>
                    
                    
        </div>
               <form action="Add_movie" method="post" enctype="multipart/form-data">
                    <table id="tab3" style="width:500px;" align="center" >
                        <tr>
                        <td colspan="2">
                            <embed width="640" height="390" src="https://www.youtube.com/v/2T57r1RENVc">
                    </td>
                </tr>
                <tr>
                    <td>
                        <img src="Image/events.jpg" width="350" >                       
                    </td>
                    <td>
                        <table id="tab3">
                            <tr>
                                <td>
                                    Type
                                </td>
                                <td>
                                    Music
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    Date
                                </td>
                                <td>
                                    08-07-2016
                                </td>
                            </tr>
                             <tr>
                                <td>
                                    Days
                                </td>
                                <td>
                                    3 days
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    Time
                                </td>
                                <td>
                                    7.00 am
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    Duration
                                </td>
                                <td>
                                    2 hrs 30 min
                                </td>
                            </tr>
                            
                        </table>
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                                    <table id="tab3">
                                        <tr>
                                            <td>Venue</td>
                                            <td>Conference Hall, National College, Linking Road, Bandra West</td>
                                            <tr>
                                            <td>Artisk</td>
                                            <td>Conference Hall, National College, Linking Road, Bandra West</td>
                                        </tr>
                                        <tr>
                                            <td colspan="2">Description</td>                 
                                        </tr>
                                        <tr>
                                        <td colspan="2">
                                        Shaktimaan is back again to save the world from Kill - Vish Terror. Kilvish has became the most powerfull person on this earth, will shaktimaan defeat him and save us? Watch out the full Trailer, Share your love so that we can develop our webseries on Shaktimaan.
                                        </td>                 
                                            </tr>
                                    </table>
                
                
                    </table>
                    </form>                       
        </div>
               
              </div>
            
            </div>
        
            <div id="footer">
                <p>All Right Reserve with S121135300133</p>
            </div>
    </body>
</html>
