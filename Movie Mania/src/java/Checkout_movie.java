import com.moviemania.bean.MailSenderBean;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="Checkout_movie", urlPatterns={"/Checkout_movie"})     // specify urlPattern for servlet
public class Checkout_movie extends HttpServlet {
   
    @EJB
    private MailSenderBean sendMail;
    
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
  
            String movie_name = request.getParameter("movie_name");
            String date = request.getParameter("date");
            String time = request.getParameter("time");
            String seats = request.getParameter("seats");
            String fare = request.getParameter("fare");
            String name = request.getParameter("name");
            String email_id = request.getParameter("email_id");
            String contact_number = request.getParameter("contact_number");
            String card_type = request.getParameter("card_type");
            String card_name = request.getParameter("card_name");
            String card_number = request.getParameter("card_number");
            
            //mail Implementation
            String from = "moviemaniabygaurav@gmail.com";
            String to = email_id;
            String username = "moviemaniabygaurav";
            String password = "dummypassword";
            String subject = "E-Ticket for "+movie_name;
            String finalmsg = 
                    "<table border='1px'><tr>"+
                    "<td>Movie Name</td>"+
                    "<td>"+movie_name+"</td></tr>"+
                    "<tr>"+
                    "<td>Date</td>"+
                    "<td>"+date+"</td></tr>"+
                    "<tr>"+
                    "<td>Seats</td>"+
                    "<td>"+seats+"</td></tr>"+
                    "<tr>"+
                    "<td>Customer Name</td>"+
                    "<td>"+name+"</td></tr>"+
                    "<tr>"+
                    "<td>Number</td>"+
                    "<td>"+contact_number+"</td></tr></table>";
            
            sendMail.sendMail(subject, finalmsg, from, to, username, password);
            //--------------------------------------------------
            
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection("jdbc:odbc:movie_mania");
            Statement stmt = con.createStatement();   
            String sql = "insert into transact_movie (movie_name, time, seats, fare, name, email_id, contact_number, card_type, card_name, card_number,date) values ('"+movie_name+"','"+time+"',"+seats+","+fare+",'"+name+"','"+email_id+"','"+contact_number+"','"+card_type+"','"+card_name+"','"+card_number+"','"+date+"');";
            stmt.executeUpdate(sql);
            response.sendRedirect("confirmation_movie.jsp");
        }
        catch(Exception ex) {
           out.println("Exception -->" + ex.getMessage());
           out.println("Exception -->" + ex.getStackTrace());
        }
        finally { 
            out.close();
        }
    } // end of doPost()
 } // end of UploadServlet