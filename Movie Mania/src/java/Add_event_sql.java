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

@WebServlet(name="Add_event_sql", urlPatterns={"/Add_event_sql"})     // specify urlPattern for servlet
@MultipartConfig                                               // specifies servlet takes multipart/form-data
public class Add_event_sql extends HttpServlet {
   
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            // get access to file that is uploaded from client
            Part p1 = request.getPart("file");
            InputStream is = p1.getInputStream();

            // read filename which is sent as a part
            Part p2  = request.getPart("event_name");
            Scanner s = new Scanner(p2.getInputStream());
            String filename = s.nextLine();    // read filename from stream

            // get filename to use on the server
            String outputfile = this.getServletContext().getRealPath("\\Image\\Events\\"+filename)+".jpg";  // get path on the server
            String filepath = "Image/Events/"+filename+".jpg";
            FileOutputStream os = new FileOutputStream (outputfile);
            
            // write bytes taken from uploaded file to target file
            int ch = is.read();
            while (ch != -1) {
                 os.write(ch);
                 ch = is.read();
            }
            os.close();
            
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
            String sql = "INSERT INTO event (event_name, event_date, event_time, duration, genre, venue, artist, info,  image, "
                    + "gold_seating, gold_fare, silver_seating, silver_fare , stall_seating, stall_fare) "
                    + "values ('"+event_name+"', '"+event_date+"', '"+event_time+"', '"+duration+"', '"+genre+"', '"+venue+"','"+artist+"',"
                    + "'"+info+"','"+filepath+"','20','"+gold_fare+"','30','"+silver_fare+"','50','"+stall_fare+"')";
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
