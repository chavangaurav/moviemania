package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import java.io.PrintWriter;
import java.util.*;
import java.sql.*;
import java.sql.*;

public final class Contact_005fus_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                <li><a href=\"About_us.jsp\">About</a></li>\n");
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
      out.write("                \n");
      out.write("                <div style=\"padding: 1px 20px 1px 20px; font-family: Arial;font-size: 16px;text-align: justify;\" align=\"\">\n");
      out.write("                  <div style=\"font-size:18px;color:white;padding:0px \">\n");
      out.write("                    <table width=\"100%\" style=\"background-color: black; padding:5px 10px 5px 10px;\">\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                Contact Us\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                  </div>\n");
      out.write("                    <form method=\"post\" action=\"MailDispatcherServlet\">\n");
      out.write("                    <table id=\"tab3\" style=\"width:400px;\">\n");
      out.write("                            <tr>\n");
      out.write("                                <td align=\"right\">\n");
      out.write("                                    Name\n");
      out.write("                                </td>\n");
      out.write("                                <td>\n");
      out.write("                                    <input type=\"text\" name=\"name\" size=\"40\" />\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td align=\"right\">\n");
      out.write("                                    Email\n");
      out.write("                                </td>\n");
      out.write("                                <td>\n");
      out.write("                                    <input type=\"text\" name=\"email\" size=\"73\" />\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td align=\"right\">\n");
      out.write("                                    Message\n");
      out.write("                                </td>\n");
      out.write("                                <td>\n");
      out.write("                                    <textarea rows=\"9\" cols=\"75\" name=\"message\"></textarea>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td colspan=\"2\">\n");
      out.write("                            <center>\n");
      out.write("                                <input style=\"width: 70px;height: 30px;\" type='submit'  value=\"Send\">\n");
      out.write("                                <input style=\"width: 70px;height: 30px;\" type='reset'  value=\"Reset\">\n");
      out.write("                            </center>    \n");
      out.write("                            </td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                    </form>\n");
      out.write("                </div>   \n");
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