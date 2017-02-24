/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author Developer
 */
@WebServlet(urlPatterns = {"/registration"})
public class registration extends HttpServlet {

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
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String Firstname = request.getParameter("firstname");
            String Lastname = request.getParameter("lastname");
            String email = request.getParameter("email");
            String mobile = request.getParameter("number");
            
            
            usermodel um = new usermodel();
            um.setname(username);
            um.setpassword(password);
            um.setfirstname(Firstname);
            um.setlastname(Lastname);
            um.setemail(email);
            um.setmob(mobile);
         Connection con = null;
         Statement stmt = null;
            try
        {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\hp\\Documents\\NetBeansProjects\\Movie Mania\\web\\Data\\login.sqlite");
            stmt = con.createStatement();
            String sql = "INSERT INTO login (FirstName,LastName,username,password,email,mobile) VALUES ('"+ um.getfirstname()+ "','"+ um.getlastname()+ "','"+ um.getname() + "','"+ um.getpassword()+ "','"+ um.getemail()+ "','"+ um.getmob()+ "')";
            stmt.executeUpdate(sql);
            Cookie user_name = new Cookie(("username"), um.getname());
            Cookie first_name = new Cookie(("firstname"), um.getfirstname());
            Cookie last_name = new Cookie(("lastname"), um.getlastname());
            Cookie e_mail = new Cookie(("email"), um.getemail());
            Cookie mob_no = new Cookie(("mob"), um.getmob());
            user_name.setMaxAge(60*60*48);
            first_name.setMaxAge(60*60*48);
            last_name.setMaxAge(60*60*48);
            e_mail.setMaxAge(60*60*48);
            mob_no.setMaxAge(60*60*48);
            response.sendRedirect("ViewUser");
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
