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

@WebServlet(name="Add_movie", urlPatterns={"/Add_movie"})     // specify urlPattern for servlet
@MultipartConfig                                               // specifies servlet takes multipart/form-data
public class Add_movie extends HttpServlet {
   
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            // get access to file that is uploaded from client
            Part p1 = request.getPart("file");
            InputStream is = p1.getInputStream();

            // read filename which is sent as a part
            Part p2  = request.getPart("movie_name");
            Scanner s = new Scanner(p2.getInputStream());
            String filename = s.nextLine();    // read filename from stream

            // get filename to use on the server
            String outputfile = this.getServletContext().getRealPath("\\Image\\Movies\\"+filename)+".jpg";  // get path on the server
            String filepath = "Image/Movies/"+filename+".jpg";
            FileOutputStream os = new FileOutputStream (outputfile);
            
            // write bytes taken from uploaded file to target file
            int ch = is.read();
            while (ch != -1) {
                 os.write(ch);
                 ch = is.read();
            }
            os.close();
            String movie_name = request.getParameter("movie_name");
            String movie_trailor = request.getParameter("movie_trailor");
            String genre = request.getParameter("genre");
            String release_date = request.getParameter("release_date");
            String duration = request.getParameter("duration");
            String cast = request.getParameter("cast");
            String production = request.getParameter("production");
            String description = request.getParameter("description");
            int rating = Integer.parseInt(request.getParameter("rating"));
            
            String rating_path=null;
            if(rating==1)
            {
                rating_path="Image/onestar.png";
            }
            if (rating==2)
            {
                rating_path="Image/twostar.png";
            }
            if (rating==3)
            {
                rating_path="Image/threestar.png";
            }
            if (rating==4)
            {
                rating_path="Image/fourstar.png";
            }
            if (rating==5)
            {
                rating_path="Image/fivestar.png";
            }
            Connection con = null;
            Statement stmt = null;
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            con = DriverManager.getConnection("jdbc:odbc:movie_mania");
            stmt = con.createStatement();
            String sql = "INSERT INTO movie (movie_name, movie_trailor, genre, release_date, duration, cast, production, description, rating, image , intrating) "
                    + "VALUES ('"+movie_name + "','"+movie_trailor + "','"+genre + "','"+release_date + "',"
                    + "'"+duration + "','"+ cast + "','"+ production + "','"+ description + "','"+ rating_path+ "','"+ filepath + "', '"+rating+"')";
            stmt.executeUpdate(sql);
            response.sendRedirect("backend_home.jsp");
        }
        catch(Exception ex) {
           out.println("Exception -->" + ex.getMessage());
        }
        finally { 
            out.close();
        }
    } // end of doPost()
 } // end of UploadServlet
