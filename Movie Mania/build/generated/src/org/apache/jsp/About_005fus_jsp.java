package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import java.io.PrintWriter;
import java.util.*;
import java.sql.*;
import java.sql.*;

public final class About_005fus_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/frontend_header.jsp");
    _jspx_dependants.add("/footer.jsp");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>About Us</title>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <link href=\"CSS/main.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        \n");
      out.write("        </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"cont\">\n");
      out.write("        <img src=\"Image/logo.png\" height=\"120\" width=\"240\"/>\n");
      out.write("        \n");
      out.write("        ");

                if ((session.getAttribute("user") == null) || (session.getAttribute("user") == "")) {
            
      out.write("\n");
      out.write("        <form method=\"post\" action=\"validate_login.jsp\" style=\"float:right;position:relative;margin-top:10px \">\n");
      out.write("        <table>\n");
      out.write("        <tr>\n");
      out.write("        <td>\n");
      out.write("        Username\n");
      out.write("        </td>\n");
      out.write("        <td>\n");
      out.write("        Password\n");
      out.write("        </td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            \n");
      out.write("            <td> <input type=\"text\" name=\"username\"> </td>\n");
      out.write("            <td> <input type=\"password\" name=\"password\"> </td>\n");
      out.write("        </tr>\n");
      out.write("        <tr >\n");
      out.write("            <td colspan=\"2\" align=\"right\"> <input type=\"submit\" name=\"authenticate\" value=\"Log in\">  \n");
      out.write("                 <input type=\"button\" name=\"register\" value=\"Register\"> </td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td colspan=\"2\" align=\"right\">\n");
      out.write("                ");

                    if (request.getParameter("errMsg")!=null)
                    {
                
      out.write("\n");
      out.write("                <div style=\"color:red\" align=\"center\">\n");
      out.write("                    ");
 out.println(request.getParameter("errMsg")); 
      out.write("\n");
      out.write("                </div>\n");
      out.write("                ");

                    }                
                
      out.write("\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        </table>\n");
      out.write("        </form>\n");
      out.write("                \n");
      out.write("        ");
} else {
            
      out.write("\n");
      out.write("            <p style=\"float:right\">Welcome ");
      out.print(session.getAttribute("user"));
      out.write(" | <a href='logoutf.jsp'>Log out</a></p>\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("        <div id=\"menu\">\n");
      out.write("        \n");
      out.write("        \n");
      out.write("            <ul id=\"menu\">\n");
      out.write("                <li id=\"menu\"><a class=\"active\" href=\"home.jsp\">Home</a></li>\n");
      out.write("                <li ><a href=\"movie.jsp\">Movies</a></li>\n");
      out.write("                <li > <a href=\"event.jsp\">Events</a> </li>\n");
      out.write("                <li> <a href=\"#contact\">Contact</a></li>\n");
      out.write("                <li><a href=\"#about\">About</a></li>\n");
      out.write("                <form>\n");
      out.write("                        <input type=\"text\" name=\"search\" placeholder=\"Movies, Event..\">\n");
      out.write("                </form>\n");
      out.write("            </ul>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("        </div>\n");
      out.write("        </div>  \n");
      out.write("        \n");
      out.write("    </body> \n");
      out.write("</html>\n");
      out.write("\n");
      out.write("            <div id=\"container\">\n");
      out.write("                <img src=\"Image/logo.png\" height=\"150px\" >\n");
      out.write("                <p style=\"position: relative;\">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce scelerisque elit diam, sed cursus massa pellentesque sit amet. Morbi blandit sapien ut erat mattis, ac rhoncus velit semper. Maecenas vehicula erat lacus, ut posuere tellus efficitur pharetra. Fusce porttitor nisl vitae malesuada tempus. Integer egestas purus sed nulla eleifend, sed aliquam elit volutpat. Morbi lacinia urna ut vulputate eleifend. Quisque accumsan sit amet est eu malesuada. Curabitur quis purus a neque dictum pharetra. Duis in tellus libero. Aenean elementum tellus a purus tempor, in gravida erat dignissim. Suspendisse non eleifend lacus. Suspendisse pretium, magna vitae auctor hendrerit, magna elit porta quam, eu efficitur nunc dui vitae mauris. Donec risus arcu, finibus et fermentum vel, condimentum a dui. Vivamus id tellus ipsum.\n");
      out.write("\n");
      out.write("Etiam est est, aliquet non nisi fermentum, rutrum dictum leo. Vivamus lacinia feugiat egestas. Sed tincidunt enim nec viverra suscipit. Praesent euismod felis ac purus consectetur imperdiet. Sed nunc nisl, cursus in tincidunt in, consequat et massa. Donec auctor ut justo maximus lobortis. Proin eu ex est. Aliquam erat volutpat.\n");
      out.write("\n");
      out.write("Mauris malesuada euismod magna in vestibulum. In non diam eu tellus pellentesque luctus ac sit amet metus. Mauris sed fringilla augue, eu rutrum ex. Aenean pellentesque in purus quis elementum. Sed sit amet lobortis orci, sit amet ultrices ligula. Etiam a diam eget turpis facilisis feugiat sed sed nunc. Nulla feugiat condimentum elit ac accumsan. Sed condimentum varius sem vel malesuada. Donec ac libero eu mauris lobortis tempor.\n");
      out.write("\n");
      out.write("Vestibulum rutrum eu orci non varius. Ut quis lacus at risus vulputate posuere in id ligula. Etiam congue sollicitudin leo eu sagittis. Nullam et sodales arcu. Cras lacinia malesuada orci, id blandit eros elementum consequat. Etiam suscipit quam nisi, eu malesuada est finibus hendrerit. Aliquam ut mauris accumsan, condimentum sem eget, lobortis neque. Vivamus id velit commodo, sagittis libero volutpat, feugiat neque. Nullam eros justo, laoreet nec tempus gravida, euismod et tellus. Proin ullamcorper, turpis hendrerit maximus consequat, ex nisi tincidunt enim, tincidunt vehicula arcu nulla sit amet dui. Sed dignissim urna eu massa rutrum efficitur. Aliquam dui tellus, malesuada sit amet justo et, blandit auctor diam. Donec feugiat condimentum tortor, quis faucibus tortor porta id. Donec auctor iaculis neque, sed pellentesque leo.\n");
      out.write("\n");
      out.write("Cras feugiat vehicula lectus et congue. Aliquam cursus nunc a diam sodales mollis. Vestibulum felis lectus, tempor rhoncus pharetra ac, viverra ut orci. Ut facilisis lectus nibh, vel ultricies leo dapibus vitae. Donec egestas, arcu ac tincidunt lacinia, ex nisl congue felis, ac convallis arcu orci ut sapien. Ut nulla odio, malesuada eu ex eget, ultrices rhoncus nulla. Sed feugiat aliquet enim, quis condimentum mi scelerisque id. Nam nunc velit, finibus eu eleifend ornare, sagittis at ante. Vestibulum leo mauris, ornare ac aliquet vel, cursus tempus nunc. Aliquam eu ligula mauris. Nunc pulvinar hendrerit tellus, quis commodo nisi sollicitudin eu. Fusce nec tellus nibh. Nullam metus erat, consequat et felis consequat, tincidunt ultricies justo.\n");
      out.write("\n");
      out.write("</p>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Footer</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"footerf\">\n");
      out.write("                <p>All Right Reserve with Gaurav | S121135300133</p>\n");
      out.write("            </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <p></p>\n");
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
