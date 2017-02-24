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

@WebServlet(name="Checkout_event", urlPatterns={"/Checkout_event"})     // specify urlPattern for servlet
public class Checkout_event extends HttpServlet {
   
    @EJB
    private MailSenderBean sendMail;
        
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
  
            String event_name = request.getParameter("event_name");
            String date = request.getParameter("date");
            String seat = request.getParameter("seat");
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
            String subject = "E-Ticket for "+event_name;
            String finalmsg = 
                    "<table border='1px'><tr>"+
                    "<td>Event Name</td>"+
                    "<td>"+event_name+"</td></tr>"+
                    "<tr>"+
                    "<td>Date</td>"+
                    "<td>"+date+"</td></tr>"+
                    "<tr>"+
                    "<td>Seats</td>"+
                    "<td>"+seat+"</td></tr>"+
                    "<tr>"+
                    "<td>Customer Name</td>"+
                    "<td>"+name+"</td></tr>"+
                    "<tr>"+
                    "<td>Number</td>"+
                    "<td>"+contact_number+"</td></tr></table>";
            
            sendMail.sendMail(subject, finalmsg, from, to, username, password);
            //--------------------------------------------------
            
            //con = null;
            //stmt = null;
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection("jdbc:odbc:movie_mania");
            Statement stmt = con.createStatement();   
            String sql = "insert into transact_event (event_name, date, seat, fare, name, email_id, contact_number, card_type, card_name, card_number) values ('"+event_name+"', '"+date+"', "+seat+", "+fare+", '"+name+"', '"+email_id+"', '"+contact_number+"', '"+card_type+"', '"+card_name+"', '"+card_number+"');";
            stmt.executeUpdate(sql);
            response.sendRedirect("confirmation_event.jsp");
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