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
import javax.servlet.RequestDispatcher;

/**
 *
 * @author hp
 */
@WebServlet(urlPatterns = {"/home"})
public class home extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
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
            out.println("<li><a href=\"backend_add_event.jsp\">Events</a></li>");
            out.println("<li><a href=\"#about\">About</a></li>");
            out.println("</ul>");
            out.println("</div>");
            out.println("<div id=\"section\">");
            out.println("<div style=\"display:block;background-color:black;width:883px;margin: 0 auto;\" >");
            out.println("<h3 style=\"color:white;font-family: 'Source Sans Pro', sans-serif;padding:10px \">");
            out.println(" Movies");
            out.println("</h3>");
            out.println("</div>");
            out.println("<div id=\"layout\">");
            out.println("<form action=\"backend_view_movie.jsp\" method=\"post\">");
            try
                    {
            Statement stmt = null;
            Connection c = null;
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            c = DriverManager.getConnection("jdbc:odbc:movie_mania");
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery( "select image, movie_id from movie ORDER BY movie_id desc" );
            while ( rs.next() ) {
            String  image = rs.getString("image");
            int movie_id = rs.getInt("movie_id");
            out.println("<table id=\"layout\">");
            out.println("<tr>\n" +
"                        <td>\n" +
"                            <img src="+image+" width=\"180\" height=\"280\"> <br>  <br>\n" +
"                            <center>\n" +
"                            <button id=\"btn\" value="+movie_id+" type=\"submit\" name=\"movie_id\">View Details</button>" +
"                            </center>\n" +
"                        </td>\n" +
"                    </tr>\n" +
"                </table>");
            
               }
                    }
            catch (SQLException e)
                    {
                        
                    }
            catch (ClassNotFoundException e)
                    {
                        
                    }
            out.println( "</form>" );
            out.println( "</div>" );
            out.println("<div id=\"section\">");
            out.println("<div style=\"display:block;background-color:black;width:876px;margin: 0 auto;\" >");
            out.println("<h3 style=\"color:white;font-family: 'Source Sans Pro', sans-serif;padding:10px \">");
            out.println(" Event");
            out.println("</h3>");
            out.println("</div>");
            out.println("<div id=\"layout\">");
            out.println("<form action=\"backend_view_event_1.jsp\" method=\"get\">");
            try
                    {
            Statement stmte = null;
            Connection con = null;
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            con = DriverManager.getConnection("jdbc:odbc:movie_mania");
            stmte = con.createStatement();
            ResultSet rse = stmte.executeQuery( "select image, event_name,event_id from event" );
            while ( rse.next() ) {
            String  event_image = rse.getString("image");
            String event_name = rse.getString("event_name");
            int event_id = rse.getInt("event_id");
            out.println("<table id=\"layout2\">");
            out.println("<tr>\n" +
"                        <td>\n" +
"                            <img src="+event_image+" width=\"250\" heigth=\"70\"> <br>  <br>\n" +
"                            <center>\n" +
"                            <button id=\"btn\" value="+event_id+" type=\"submit\" name=\"event_id\">"+event_name+"</button>" +
"                            </center>\n" +
"                        </td>\n" +
"                    </tr>\n" +
"                </table>");
               }
                    }
            catch (SQLException e)
                    {
                        
                    }
            catch (ClassNotFoundException e)
                    {
                        
                    }
            out.println( "</form>" );
            out.println( "</div>" );
            out.println( "</div>" );
            out.println( "</div>" );
            out.println( "<div id=\"footer\">" );
            out.println( "<p>All Right Reserve with S121135300133</p>" );
            out.println( "</div>" );
            out.println("</body>");
            out.println("</html>");

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}       
