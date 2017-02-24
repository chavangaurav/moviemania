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
@WebServlet(urlPatterns = {"/Edit_movie"})
public class Edit_movie extends HttpServlet {

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
            out.println("Edit Movie");
            out.println("</h3>");
            out.println("</div>");
            try
                    {
            int movie_id = Integer.parseInt(request.getParameter("edit_button"));
            Statement stmt = null;
            Connection c = null;
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            c = DriverManager.getConnection("jdbc:odbc:movie_mania");
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery( "select * from movie where movie_id='"+movie_id+"'");
            String  movie_name = rs.getString("movie_name");
            String  movie_trailor = rs.getString("movie_trailor");
            String  genre  = rs.getString("genre");
            String  release_date  = rs.getString("release_date");
            String  duration  = rs.getString("duration");
            String  cast   = rs.getString("cast");
            String  production = rs.getString("production");
            String  rating_path = rs.getString("rating");
            //String  image = rs.getString("image");
            String  description = rs.getString("description");
            int rating=1;
            if(rating_path.equals("Image/onestar.png"))
            {
                rating=1;
            }
            if (rating_path.equals("Image/twostar.png"))
            {
                rating=2;
            }
            if (rating_path.equals("Image/threestar.png"))
            {
                rating=3;
            }
            if (rating_path.equals("Image/fourstar.png"))
            {
                rating=4;
            }
            if (rating_path.equals("Image/fivestar.png"))
            {
                rating=5;
            }
            out.println("<form action=\"Update_movie\" method=\"post\" enctype=\"multipart/form-data\">");
            out.println("<table id=\"tab\" style=\"width:500px;\" align=\"center\" >");
            out.println("<tr>");
            out.println("<td>");
            out.println("Movie Name");
            out.println("</td>");
            out.println("<td>");
            out.println("<input type=\"text\" name=\"movie_name\" value='"+movie_name+"'>");
            out.println("<input type=\"hidden\" name=\"movie_id\" value='"+movie_id+"'>");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>");
            out.println("Movie Trailor");
            out.println("</td>");
            out.println("<td>");
            out.println("<input type=\"url\" name=\"movie_trailor\" value='"+movie_trailor+"'>");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>");
            out.println("Genre");
            out.println("</td>");
            out.println("<td>");
            out.println("<input type=\"text\" name=\"genre\" value='"+genre+"'>");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>");
            out.println("Release Date");
            out.println("</td>");
            out.println("<td>");
            out.println("<input type=\"date\" name=\"release_date\" value='"+release_date+"'>");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>");
            out.println("Duration");
            out.println("</td>");
            out.println("<td>");
            out.println("<input type=\"text\" name=\"duration\" value='"+duration+"'>");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>");
            out.println("Cast");
            out.println("</td>");
            out.println("<td>");
            out.println("<input type=\"text\" name=\"cast\" value='"+cast+"'>");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>");
            out.println("Production");
            out.println("</td>");
            out.println("<td>");
            out.println("<input type=\"text\" name=\"production\" value='"+production+"'>");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>");
            out.println("Description");
            out.println("</td>");
            out.println("<td>");
            out.println("<textarea rows=\"4\" cols=\"25\" name=\"description\">"+description+"</textarea>");
            out.println("</td>");
            out.println("</tr>");
            /*out.println("<tr>");
            out.println("<td>");
            out.println("Image");
            out.println("</td>");
            out.println("<td>");
            out.println("<input type=\"file\" name=\"file\" id=\"fileupload\" size=\"50\" value='"+image+"'/>");
            out.println("</td>");
            out.println("</tr>");*/
            out.println("<tr>");
            out.println("<td>");
            out.println("Rating");
            out.println("</td>");
            out.println("<td>");
            out.println("<input type=\"number\" name=\"rating\" min=\"1\" max=\"5\" value="+rating+">");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td colspan=\"2\">");
            out.println("<center>");
            out.println("<input type=\"submit\" value=\"Submit\">");
            out.println("<input type=\"reset\" value=\"Reset\">");
            out.println("</center>");
            out.println("</td>");
            out.println("</tr>");
            out.println("</table>");
            out.println("</form>");
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
