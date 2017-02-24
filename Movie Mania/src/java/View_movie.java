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
@WebServlet(urlPatterns = {"/View_movie"})
public class View_movie extends HttpServlet {

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
            out.println("<li><a href=\"#contact\">Events</a></li>");
            out.println("<li><a href=\"ViewUser\">Users</a></li>");
            out.println("<li><a href=\"#about\">About</a></li>");
            out.println("</ul>");
            out.println("</div>");
            out.println("<div id=\"section\">");
            out.println("<div style=\"display:block;background-color:black;width:883px;margin: 0 auto;\" >");
            out.println("<h3 style=\"color:white;font-family: 'Source Sans Pro', sans-serif;padding:20px;\">");
            try
                    {
            int movie_id = Integer.parseInt(request.getParameter("movie_id"));
            Statement stmt = null;
            Connection c = null;
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\hp\\Documents\\NetBeansProjects\\Movie Mania\\web\\Data\\login.sqlite");
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery( "select * from movie where movie_id='"+movie_id+"'" );
            String  movie_name = rs.getString("movie_name");
            String  movie_trailor = rs.getString("movie_trailor");
            String  genre  = rs.getString("genre");
            String  release_date  = rs.getString("release_date");
            String  duration  = rs.getString("duration");
            String  cast   = rs.getString("cast");
            String  production = rs.getString("production");
            String  rating = rs.getString("rating");
            String  image = rs.getString("image");
            String  description = rs.getString("description");
            out.println("<form action=\"Delete_movie\" method=\"post\">");
            out.println("<div style=\"float:right\"><button id=\"btn\" type=\"submit\" name=\"edit_button\" value=\""+movie_id+"\">Delete</button></div>");
            out.println("</form>");
            out.println("<form action=\"Edit_movie\" method=\"post\">");
            out.println("<div style=\"float:right\"><button id=\"btn\" type=\"submit\" name=\"edit_button\" value=\""+movie_id+"\">Edit</button>&nbsp;</div>");
            out.println("</form>");
            out.println(""+movie_name);
            out.println("</h3>");
            out.println("</div>");
            out.println("<table id=\"tab3\" style=\"width:500px;\" align=\"center\" >");
            out.println("<tr>");
            out.println("<td colspan=\"2\">");
            out.println("<embed width=\"640\" height=\"390\" src="+movie_trailor+">");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>");
            out.println("<img src="+image+" width=\"200\" >");
            out.println("</td>");
            out.println("<td>");
            out.println("<table id=\"tab3\">");
            out.println("<tr>");
            out.println("<td>");
            out.println("Genre");
            out.println("</td>");
            out.println("<td>");
            out.println(""+genre);
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>");
            out.println("Release Date");
            out.println("</td>");
            out.println("<td>");
            out.println(""+release_date);
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>");
            out.println("Duration");
            out.println("</td>");
            out.println("<td>");
            out.println(""+duration);
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>");
            out.println("Cast");
            out.println("</td>");
            out.println("<td>");
            out.println(""+cast);
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>");
            out.println("Production");
            out.println("</td>");
            out.println("<td>");
            out.println(""+production);
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>");
            out.println("Rating");
            out.println("</td>");
            out.println("<td>");
            out.println("<img width=\"180\" src="+rating+" />");
            out.println("</td>");
            out.println("</tr>");
            out.println("</table>");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td colspan=\"2\">");
            out.println("Description");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td colspan=\"2\">");
            out.println(""+description);
            out.println("</td>");
            out.println("</tr>");
            out.println("</table>");
            
                    }
            catch (SQLException e)
                    {
                        
                    }
            catch (ClassNotFoundException e)
                    {
                        
                    }
            out.println("</div>");
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
