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

@WebServlet(name="Update_movie", urlPatterns={"/Update_movie"})     // specify urlPattern for servlet
@MultipartConfig                                               // specifies servlet takes multipart/form-data
public class Update_movie extends HttpServlet {
   
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            int movie_id = Integer.parseInt(request.getParameter("movie_id"));
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
            String sql =null;
            Connection con = null;
            Statement stmt = null;
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            con = DriverManager.getConnection("jdbc:odbc:movie_mania");
            stmt = con.createStatement();
            
             sql = "UPDATE movie set movie_name = '"+movie_name + "', movie_trailor = '"+movie_trailor + "', genre = '"+genre + "', "
                    + "release_date = '"+release_date + "', duration = '"+duration + "', cast = '"+ cast + "', production = '"+ production + "', "
                    + "description = '"+ description + "', rating = '"+ rating_path+ "', intrating='"+rating+"' WHERE movie_id = '"+movie_id+"'";
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
