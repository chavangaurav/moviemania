import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet(name="Edit_event", urlPatterns={"/Edit_event"})     // specify urlPattern for servlet
@MultipartConfig                                               // specifies servlet takes multipart/form-data
public class Update_event extends HttpServlet {
   
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            int event_id = Integer.parseInt(request.getParameter("event_id"));
            String event_name = request.getParameter("event_name");
            String event_date = request.getParameter("event_date");
            String event_time = request.getParameter("event_time");
            String duration = request.getParameter("duration");
            String venue = request.getParameter("venue");
            String artist = request.getParameter("artist");
            String info = request.getParameter("info");
            String genre = request.getParameter("genre");
            int gold_fare = Integer.parseInt(request.getParameter("gold_fare"));
            int silver_fare = Integer.parseInt(request.getParameter("silver_fare"));
            int stall_fare = Integer.parseInt(request.getParameter("stall_fare"));

            
            Connection con = null;
            Statement stmt = null;
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            con = DriverManager.getConnection("jdbc:odbc:movie_mania");
            stmt = con.createStatement();   
            String sql = "update event set event_name ='"+event_name+"', event_date ='"+event_date+"', event_time='"+event_time+"', duration='"+duration+"', genre='"+genre+"', venue='"+venue+"',\n" +
            "artist='"+artist+"', info='"+info+"', gold_fare="+gold_fare+", silver_fare="+silver_fare+", stall_fare="+stall_fare+" where event_id="+event_id+";";
            stmt.executeUpdate(sql);
            response.sendRedirect("backend_home.jsp");
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
