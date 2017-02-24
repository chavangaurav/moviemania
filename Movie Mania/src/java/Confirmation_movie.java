/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Gaurav Chavan
 */
@WebServlet(urlPatterns = {"/Confirmation_movie"})
public class Confirmation_movie extends HttpServlet {

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
            try
            {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet test</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet test at " + request.getContextPath() + "</h1>");
            Connection con = null;
            Statement stmt = null;
            String movie_name = request.getParameter("movie_name");
            String date = request.getParameter("date");
            String time = request.getParameter("time");
            int seats = Integer.parseInt(request.getParameter("seats"));
            int fare = Integer.parseInt(request.getParameter("fare"));
            String name = request.getParameter("name");
            String email_id = request.getParameter("email_id");
            String contact_number = request.getParameter("contact_number");
            String card_type = request.getParameter("card_type");
            String card_name = request.getParameter("card_name");
            String card_number = request.getParameter("card_number");
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            con = DriverManager.getConnection("jdbc:odbc:movie_mania");
            stmt = con.createStatement();
            String sql = ("insert into transact_movie \n" +
"(movie_name,date,time,seats,fare,name,email_id,contact_number,card_type,card_name,card_number)\n" +
"values \n" +
"('"+movie_name+"','"+date+"','"+time+"',"+seats+","+fare+",'"+name+"','"+email_id+"','"+contact_number+"','"+card_type+"','"+card_name+"','"+card_number+"');");
            stmt.executeUpdate(sql);
            response.sendRedirect("home.jsp");
            String Name = "Hi How Are You".replaceAll(" ", "_").toLowerCase();;
            out.println("<h1>Servlet test at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("<h3> "+Name);
            out.println("</h3>");
            out.println("</html>");
            }
            catch (ClassNotFoundException | SQLException e)
            {
                
            }
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
