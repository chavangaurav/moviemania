package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.PrintWriter;
import java.sql.*;

public final class backend_005fabout_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header_backend.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"CSS/main.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title></title>\n");
      out.write("        <link href=\"CSS/main.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"backend-cont\">\n");
      out.write("            <img src=\"Image/logo.png\" height=\"100\" width=\"180\"/>\n");
      out.write("           \n");
      out.write("            ");

                if ((session.getAttribute("userid") == null) || (session.getAttribute("userid") == "")) {
            
      out.write("\n");
      out.write("            <p style=\"float:right\">You are not logged in <a href=\"login.jsp\">Please Login</a></p>\n");
      out.write("            ");
} else {
            
      out.write("\n");
      out.write("            <p style=\"float:right\">Welcome ");
      out.print(session.getAttribute("userid"));
      out.write(" | <a href='logout.jsp'>Log out</a></p>\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("         </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div id=\"bdy\">\n");
      out.write("            <hr>\n");
      out.write("                <div id=\"nav\">\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"backend_home.jsp\">Home</a></li>\n");
      out.write("                    <li><a href=\"backend_add_movie.jsp\">Movies</a></li>\n");
      out.write("                    <li><a href=\"backend_add_event.jsp\">Events</a></li>\n");
      out.write("                    <li><a href=\"ViewUser_sql\">Users</a></li>\n");
      out.write("                    <li><a href=\"#about\">About</a></li>\n");
      out.write("            </ul>\n");
      out.write("            </div>\n");
      out.write("               \n");
      out.write("            <div id=\"section\">\n");
      out.write("            <div style=\"padding: 1px 20px 1px 20px; font-family: Arial;font-size: 18px;text-align: justify;\" align=\"\">\n");
      out.write("                    <p>\n");
      out.write("                    <center><img src=\"Image/logo.png\" height=\"100px\" /></center>\n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce scelerisque elit diam, sed cursus massa pellentesque sit amet. Morbi blandit sapien ut erat mattis, ac rhoncus velit semper. Maecenas vehicula erat lacus, ut posuere tellus efficitur pharetra. Fusce porttitor nisl vitae malesuada tempus. Integer egestas purus sed nulla eleifend, sed aliquam elit volutpat. Morbi lacinia urna ut vulputate eleifend. Quisque accumsan sit amet est eu malesuada. Curabitur quis purus a neque dictum pharetra. Duis in tellus libero. Aenean elementum tellus a purus tempor, in gravida erat dignissim. Suspendisse non eleifend lacus. Suspendisse pretium, magna vitae auctor hendrerit, magna elit porta quam, eu efficitur nunc dui vitae mauris. Donec risus arcu, finibus et fermentum vel, condimentum a dui. Vivamus id tellus ipsum.  \n");
      out.write("                      <br>\n");
      out.write("                      <br>\n");
      out.write("                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Etiam est est, aliquet non nisi fermentum, rutrum dictum leo. Vivamus lacinia feugiat egestas. Sed tincidunt enim nec viverra suscipit. Praesent euismod felis ac purus consectetur imperdiet. Sed nunc nisl, cursus in tincidunt in, consequat et massa. Donec auctor ut justo maximus lobortis. Proin eu ex est. Aliquam erat volutpat.\n");
      out.write("                      <br>\n");
      out.write("                      <br>\n");
      out.write("                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Mauris malesuada euismod magna in vestibulum. In non diam eu tellus pellentesque luctus ac sit amet metus. Mauris sed fringilla augue, eu rutrum ex. Aenean pellentesque in purus quis elementum. Sed sit amet lobortis orci, sit amet ultrices ligula. Etiam a diam eget turpis facilisis feugiat sed sed nunc. Nulla feugiat condimentum elit ac accumsan. Sed condimentum varius sem vel malesuada. Donec ac libero eu mauris lobortis tempor.\n");
      out.write("                    </p>\n");
      out.write("                    \n");
      out.write("                </div>      \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("            <div id=\"footer\">\n");
      out.write("                <p>All Right Reserve with S121135300133</p>\n");
      out.write("            </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
