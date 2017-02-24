/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 *
 * @author hp
 */
@WebServlet(urlPatterns = {"/View_event_sql"})
public class View_event_sql extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
            out.println("<link href=\"CSS/main.css\" rel=\"stylesheet\" type=\"text/css\"/>");
            out.println("<title>Servlet ViewUser</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<jsp:include file=\"header_backend.jsp\" >");
            request.getRequestDispatcher("header_backend.jsp").include(request, response);
            out.println("<div id=\"bdy\">");
            out.println("<hr>");
            out.println("<div id=\"nav\">");
            out.println("<ul>");
            out.println("<li><a href=\"home\">Home</a></li>");
            out.println("<li><a href=\"backend_add_movie.jsp\">Movies</a></li>");
            out.println("<li><a href=\"#contact\">Events</a></li>");
            out.println("<li><a href=\"ViewUser\">Users</a></li>");
            out.println("<li><a href=\"#about\">About</a></li>");
            out.println("</ul>");
            out.println("</div>");
            out.println("<div id=\"section\">");
            out.println("<div style=\"display:block;background-color:black;width:883px;margin: 0 auto;\" >");
            out.println("<div style=\"color:white;font-family: 'Source Sans Pro', sans-serif; padding:10px \">");
            System.out.println("Hello World");
            
            int event_id = Integer.parseInt(request.getParameter("event_id"));
            System.out.println("Hi "+ event_id);
            try
                    {
            System.out.println(event_id);
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection c = DriverManager.getConnection("jdbc:odbc:movie_mania");
            Statement stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery( "select event_name,event_name,event_date from event where event_id="+event_id+" ");
            String  event_name = rs.getString("event_name");
            String  event_date = rs.getString("event_date");
            String  event_time  = rs.getString("event_time");
            String  duration   = rs.getString("duration");
            String  genre   = rs.getString("genre");
            String  venue  = rs.getString("venue");
            String  artist = rs.getString("artist");
            String  info = rs.getString("info");
            String  image = rs.getString("image");
            int gold_fare = Integer.parseInt(request.getParameter("gold_fare"));
            int silver_fare = Integer.parseInt(request.getParameter("silver_fare"));
            int stall_fare = Integer.parseInt(request.getParameter("stall_fare"));
            int gold_seating = Integer.parseInt(request.getParameter("gold_seating"));
            int silver_seating = Integer.parseInt(request.getParameter("silver_seating"));
            int stall_seating = Integer.parseInt(request.getParameter("stall_seating"));
            System.out.println(event_name);
            out.println("<form action=\"Delete_event\" method=\"post\">");
            out.println("<div style=\"float:right\"><button id=\"btn\" type=\"submit\" name=\"delete_button\" value=\""+event_id+"\">Delete</button></div>");
            out.println("</form>");
            out.println("<form action=\"Edit_event\" method=\"post\">");
            out.println("<div style=\"float:right\"><button id=\"btn\" type=\"submit\" name=\"edit_button\" value=\""+event_id+"\">Edit</button>&nbsp;</div>");
            out.println("</form>");
            out.println(""+event_name);
            out.println("</div>");
            out.println("</div>");
            out.println("<div>");
            out.println("<img style=\"margin-left:0px \" src=\""+image+"\" width=\"883\" height=\"280\">");
            out.println("</div>");
            out.println("<div style=\"display:block;background-color:black;width:883px;margin-top:-4px \" >");
            out.println("<div style=\"color:white;font-family: 'Source Sans Pro', sans-serif; padding:10px \">");
            out.println("<img src=\"Image/calander.png\" width=\"18\" >");
            out.println(""+event_date);
            out.println("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
            out.println("<img src=\"Image/clock.png\" width=\"15\">");
            out.println(""+event_time+" | "+duration+"");
            out.println("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
            out.println("<img src=\"Image/type.png\" width=\"18\">");
            out.println(""+genre);
            out.println("<br>");
            out.println("<img src=\"Image/venue.png\" width=\"15\">");
            out.println(""+venue);
            out.println("<br>");
            out.println("<img src=\"Image/artist.png\" width=\"18\">");
            out.println(""+artist);
            out.println("</div>");
            out.println("</div>");
            out.println("<div style=\"display:block;background-color:#777;width:883px;margin-top:-4px \" >");
            out.println("<div style=\"color:white;font-family: 'Source Sans Pro', sans-serif; padding:10px \">");
            out.println("Info <br>");
            out.println("<div style=\"color:white;font-family: 'Source Sans Pro', sans-serif; padding:10px; font-size: 15px;\">");
            out.println(""+info);
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");
            out.println("<h3>Book Your Tickets</h3>");
            out.println("<div>");
            out.println("<a id=\"ticket\" rel=\"gold\">");
            out.println("<table id=\"tab3\">");
            out.println("<tr>");
            out.println("<td>Gold</td>");
            out.println("<td rowspan=\"2\">Rs."+gold_fare+"</td>");
            out.println("<td rowspan=\"2\">");
            out.println("<input type=\"number\" name=\"gold_seating\" min=\"1\" max=\"5\" />");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>");
            out.println("Available Seats : "+gold_seating+" seats");
            out.println("</td>");
            out.println("</tr>");
            out.println("</table>");
            out.println("</a>");
            out.println("<a id=\"ticket\" rel=\"silver\">");
            out.println("<table id=\"tab3\">");
            out.println("<tr>");
            out.println("<td>Silver</td>");
            out.println("<td rowspan=\"2\">Rs."+silver_fare+"</td>");
            out.println("<td rowspan=\"2\">");
            out.println("<input type=\"number\" name=\"silver_seating\" min=\"1\" max=\"5\" />");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>");
            out.println("Available Seats : "+silver_seating+" seats");
            out.println("</td>");
            out.println("</tr>");
            out.println("</table>");
            out.println("</a>");
            out.println("<a id=\"ticket\" rel=\"stall\">");
            out.println("<table id=\"tab3\">");
            out.println("<tr>");
            out.println("<td>stall</td>");
            out.println("<td rowspan=\"2\">Rs."+stall_fare+"</td>");
            out.println("<td rowspan=\"2\">");
            out.println("<input type=\"number\" name=\"stall_seating\" min=\"1\" max=\"5\" />");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>");
            out.println("Available Seats : "+stall_seating+" seats");
            out.println("</td>");
            out.println("</tr>");
            out.println("</table>");
            out.println("</a>");
                    }
            catch (SQLException | ClassNotFoundException e)
                    {
                        
                    }
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");
            out.println( "<div id=\"footer\">" );
            out.println( "<p>All Right Reserve with S121135300133</p>" );
            out.println( "</div>" );
            out.println("</body>");
            out.println("</html>");

        }
    }
}