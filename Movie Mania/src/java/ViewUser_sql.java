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
@WebServlet(urlPatterns = {"/ViewUser_sql"})
public class ViewUser_sql extends HttpServlet {

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
            out.println("<li><a href=\"backend_home.jsp\">Home</a></li>");
            out.println("<li><a href=\"backend_add_movie.jsp\">Movies</a></li>");
            out.println("<li><a href=\"backend_add_event.jsp\">Events</a></li>");
            out.println("<li><a href=\"ViewUser_sql\">Users</a></li>");
            out.println("<li><a href=\"backend_about.jsp\">About</a></li>");
            out.println("</ul>");
            out.println("</div>");
            out.println("<div id=\"section\">");
            out.println("<div style=\"display:block;background-color:black;width:883px;margin: 0 auto;\" >");
            out.println("<h3 style=\"color:white;font-family: 'Source Sans Pro', sans-serif;padding:10px \">\n" +
"                Add User\n" +
"            </h3>");
            out.println("</div>\n" +
"               <form action=\"registration_sql\" method=\"post\">\n" +
"                    <table id=\"tab\" style=\"width:500px;\" align=\"center\" >\n" +
"                        <tr >\n" +
"                    <td>\n" +
"                        First Name \n" +
"                    </td>\n" +
"                    <td>\n" +
"                        <input type=\"text\" name=\"firstname\">\n" +
"                    </td>\n" +
"                </tr>\n" +
                    
"                <tr>\n" +
"                    <td>\n" +
"                        Last Name \n" +
"                    </td>\n" +
"                    <td>\n" +
"                        <input type=\"text\" name=\"lastname\">\n" +
"                    </td>\n" +
"                </tr>\n" +
                    
                      
"                <tr>\n" +
"                    <td>\n" +
"                        Email \n" +
"                    </td>\n" +
"                    <td>\n" +
"                        <input type=\"text\" name=\"email\">\n" +
"                    </td>\n" +
"                </tr>\n" +
                    
"                <tr>\n" +
"                    <td>\n" +
"                        Mobile Number \n" +
"                    </td>\n" +
"                    <td>\n" +
"                        <input type=\"text\" name=\"number\">\n" +
"                    </td>\n" +
"                </tr>\n" +
                 
                    
"                <tr>\n" +
"                    <td>\n" +
"                        Username\n" +
"                    </td>\n" +
"                    <td>\n" +
"                        <input type=\"text\" name=\"username\">\n" +
"                    </td>\n" +
"                </tr>\n" +
"                <tr>\n" +
"                    <td>\n" +
"                        Password\n" +
"                    </td>\n" +
"                    <td>\n" +
"                        <input type=\"password\" name=\"password\">\n" +
"                    </td>\n" +
"                </tr>\n" +
"                        <tr>\n" +
"                     <td colspan=\"2\">\n" +
"                 <center>\n" +
"                        <input type=\"submit\" value=\"Submit\">\n" +
"                        <input type=\"reset\" value=\"Reset\">\n" +
"                </center>\n" +
"                        </td>\n" +
"                </tr>\n" +
"                    </table>\n" +
"                    </form>");
            out.println("<div style=\"display:block;background-color:black;width:883px;margin: 0 auto;\" >");
            out.println("<h3 style=\"color:white;font-family: 'Source Sans Pro', sans-serif;padding:10px \">");
            out.println(" View User");
            out.println("</h3>");
            out.println("</div>");
            out.println("<form action=\"DeleteUser_sql\" method=\"post\">");
            out.println("<table id=\"tab2\" align=\"center\" >");
            out.println("<tr>");
            out.println("<td>");
            out.println("Sr.No");
            out.println("</td>");
            
            out.println("<td>");
            out.println("Name");
            out.println("</td>");
            
            out.println("<td>");
            out.println("Email");
            out.println("</td>");
            
            out.println("<td>");
            out.println("Mobile No.");
            out.println("</td>");
            
            out.println("<td>");
            out.println("Username");
            out.println("</td>");
            
            out.println("<td>");
            out.println("Action");
            out.println("</td>");
            out.println("</tr>");
            try
                    {
            int i = 0;
            Statement stmt = null;
            Connection c = null;
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            c = DriverManager.getConnection("jdbc:odbc:movie_mania");
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery( "select username, userid, FirstName, LastName, email, mobile from login ORDER BY userid desc" );
            while ( rs.next() ) {
            i++;
            String  name = rs.getString("username");
            int Userid = rs.getInt("userid");
            String  fname = rs.getString("FirstName");
            String  lname = rs.getString("LastName");
            String  email = rs.getString("email");
            String  mobile = rs.getString("mobile");
            out.println( "<tr>" );
            out.println("<td>");
            out.println( ""+ i );
            out.println("</td>");
            
            out.println("<td>");
            out.println( "" + fname + " " + lname );
            out.println("</td>");
            
            out.println("<td>");
            out.println( "" + email );
            out.println("</td>");
            
            
            out.println("<td>");
            out.println( "" + mobile );
            out.println("</td>");
            
            out.println("<td>");
            out.println( "" + name );
            out.println("</td>");
            out.println("<td>");
            out.println( "<button type=\"submit\" name=\"sendid\" value=\""+Userid+"\">Delete</button>");
            out.println("</td>");
            out.println( "</tr>" );
               }
                    }
            catch (SQLException e)
                    {
                        
                    }
            catch (ClassNotFoundException e)
                    {
                        
                    }
            out.println("</table>");
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
