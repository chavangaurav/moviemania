import com.moviemania.bean.MailSenderBean;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/MailDispatcherServlet"})
public class MailDispatcherServlet extends HttpServlet {

    @EJB
    private MailSenderBean sendMail;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) 
        {
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String message = request.getParameter("message");
            String from = "moviemaniabygaurav@gmail.com";
            String to = "chavangaurav@hotmail.com";
            String username = "moviemaniabygaurav";
            String password = "dummypassword";
            String subject = "Enquiry";
            String finalmsg = 
                    "<table border='1px'><tr>"+
                    "<td>Name</td>"+
                    "<td>"+name+"</td></tr>"+
                    "<tr>"+
                    "<td>Email</td>"+
                    "<td>"+email+"</td></tr>"+
                    "<tr><td colspan='2'>"+message+"</td></tr></table>";
            
            sendMail.sendMail(subject, finalmsg, from, to, username, password);
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Mail Demo</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Mail Status</h1>");
            out.println("<b>Mail Sent Successfully</b>");
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
