package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import java.io.PrintWriter;
import java.util.*;
import java.sql.*;
import java.sql.*;

public final class checkout_005fmovie_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/frontend_header.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_setDataSource_var_url_driver_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_query_var_dataSource;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sql_setDataSource_var_url_driver_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sql_query_var_dataSource = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_sql_setDataSource_var_url_driver_nobody.release();
    _jspx_tagPool_sql_query_var_dataSource.release();
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
      out.write("        <title>Check out</title>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("        function Calculate()\n");
      out.write("        {\n");
      out.write("            var seats = document.getElementById('seats').value; \n");
      out.write("            document.getElementById('fare').value=parseFloat(seats) * 250;\n");
      out.write("            document.getElementById('seatsr').value= 18 - parseFloat(seats);\n");
      out.write("        }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    ");

    String movie_id = request.getParameter("movie_id");
    
      out.write("\n");
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
      out.write("            \n");
      out.write("        ");
      if (_jspx_meth_sql_setDataSource_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        ");
      //  sql:query
      org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_0 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_dataSource.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
      _jspx_th_sql_query_0.setPageContext(_jspx_page_context);
      _jspx_th_sql_query_0.setParent(null);
      _jspx_th_sql_query_0.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snapshot}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
      _jspx_th_sql_query_0.setVar("result");
      int[] _jspx_push_body_count_sql_query_0 = new int[] { 0 };
      try {
        int _jspx_eval_sql_query_0 = _jspx_th_sql_query_0.doStartTag();
        if (_jspx_eval_sql_query_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          if (_jspx_eval_sql_query_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
            out = _jspx_page_context.pushBody();
            _jspx_push_body_count_sql_query_0[0]++;
            _jspx_th_sql_query_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
            _jspx_th_sql_query_0.doInitBody();
          }
          do {
            out.write("\n");
            out.write("        SELECT * from movie where movie_id=");
            out.print(movie_id);
            out.write(";\n");
            out.write("        ");
            int evalDoAfterBody = _jspx_th_sql_query_0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
          if (_jspx_eval_sql_query_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
            out = _jspx_page_context.popBody();
            _jspx_push_body_count_sql_query_0[0]--;
        }
        if (_jspx_th_sql_query_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_sql_query_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_sql_query_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_sql_query_0.doFinally();
        _jspx_tagPool_sql_query_var_dataSource.reuse(_jspx_th_sql_query_0);
      }
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
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
      out.write("            \n");
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

  private boolean _jspx_meth_sql_setDataSource_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:setDataSource
    org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag _jspx_th_sql_setDataSource_0 = (org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag) _jspx_tagPool_sql_setDataSource_var_url_driver_nobody.get(org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag.class);
    _jspx_th_sql_setDataSource_0.setPageContext(_jspx_page_context);
    _jspx_th_sql_setDataSource_0.setParent(null);
    _jspx_th_sql_setDataSource_0.setVar("snapshot");
    _jspx_th_sql_setDataSource_0.setDriver("sun.jdbc.odbc.JdbcOdbcDriver");
    _jspx_th_sql_setDataSource_0.setUrl("jdbc:odbc:movie_mania");
    int _jspx_eval_sql_setDataSource_0 = _jspx_th_sql_setDataSource_0.doStartTag();
    if (_jspx_th_sql_setDataSource_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_setDataSource_var_url_driver_nobody.reuse(_jspx_th_sql_setDataSource_0);
      return true;
    }
    _jspx_tagPool_sql_setDataSource_var_url_driver_nobody.reuse(_jspx_th_sql_setDataSource_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("row");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${result.rows}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("            <form action=\"Checko\" method=\"post\">\n");
          out.write("            <table id=\"tab3\" style=\"width:600px; padding:5px;\" align=\"center\">\n");
          out.write("                <tr>\n");
          out.write("                    <td>\n");
          out.write("                        <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" width=\"200\" height=\"300\" >                       \n");
          out.write("                    </td>\n");
          out.write("                    <td>\n");
          out.write("                        <table id=\"tab3\" style=\"width:600px;\">\n");
          out.write("                            <tr>\n");
          out.write("                                <td>\n");
          out.write("                                    Movie Name\n");
          out.write("                                </td>\n");
          out.write("                                <td>\n");
          out.write("                                    <input type=\"text\" name=\"movie_name\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.movie_name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" disabled=\"true\">\n");
          out.write("                                </td>\n");
          out.write("                            </tr>\n");
          out.write("                            <tr>\n");
          out.write("                                <td>\n");
          out.write("                                    Date\n");
          out.write("                                </td>\n");
          out.write("                                <td>\n");
          out.write("                                    <input type=\"date\" name=\"date\">\n");
          out.write("                                </td>\n");
          out.write("                            </tr>\n");
          out.write("                            <tr>\n");
          out.write("                                <td>\n");
          out.write("                                    Time\n");
          out.write("                                </td>\n");
          out.write("                                <td>\n");
          out.write("                                    <input type=\"radio\" name=\"time\" value=\"10.00 AM\" checked> 10.00 AM\n");
          out.write("                                    <input type=\"radio\" name=\"time\" value=\"02.00 PM\"> 02.00 PM \n");
          out.write("                                    <input type=\"radio\" name=\"time\" value=\"06.00 PM\"> 06.00 PM\n");
          out.write("                                </td>\n");
          out.write("                            </tr>\n");
          out.write("                            <tr>\n");
          out.write("                                <td>\n");
          out.write("                                    Seats\n");
          out.write("                                </td>\n");
          out.write("                                <td>\n");
          out.write("                                    <input type=\"number\" value=\"1\" id='seats' name=\"seats\" min=\"1\" max='18' onblur='Calculate();'/>\n");
          out.write("                \n");
          out.write("                                </td>\n");
          out.write("                            </tr>\n");
          out.write("                            <tr>\n");
          out.write("                                <td>\n");
          out.write("                                    Seats Remaining\n");
          out.write("                                </td>\n");
          out.write("                                <td>\n");
          out.write("                                    <input type=\"number\" name=\"seatsr\" id='seatsr' value=\"18\"  disabled=\"true\"/>\n");
          out.write("                                </td>\n");
          out.write("                            </tr>\n");
          out.write("                            <tr>\n");
          out.write("                                <td>\n");
          out.write("                                    Fare\n");
          out.write("                                </td>\n");
          out.write("                                <td>\n");
          out.write("                                    <input type=\"number\" id='fare' name=\"fare\" value=\"250\" disabled=\"true\"/>\n");
          out.write("                                </td>\n");
          out.write("                            </tr>\n");
          out.write("                        </table>\n");
          out.write("                </tr>\n");
          out.write("                <tr>\n");
          out.write("                    <td colspan='2' align=\"center\">\n");
          out.write("                        <b>Personal Info</b>\n");
          out.write("                    </td>\n");
          out.write("                </tr>\n");
          out.write("                <tr>\n");
          out.write("                    <td>\n");
          out.write("                        Name\n");
          out.write("                    </td>\n");
          out.write("                    <td>\n");
          out.write("                        <input type=\"text\" name=\"name\" >\n");
          out.write("                    </td>\n");
          out.write("                </tr>\n");
          out.write("                <tr>\n");
          out.write("                    <td>\n");
          out.write("                        Email\n");
          out.write("                    </td>\n");
          out.write("                    <td>\n");
          out.write("                        <input type=\"text\" name=\"email_id\" >\n");
          out.write("                    </td>\n");
          out.write("                </tr>\n");
          out.write("                <tr>\n");
          out.write("                    <td>\n");
          out.write("                        Number\n");
          out.write("                    </td>\n");
          out.write("                    <td>\n");
          out.write("                        <input type=\"text\" name=\"contact_number\" maxlength=\"10\">\n");
          out.write("                    </td>\n");
          out.write("                </tr>\n");
          out.write("                <tr>\n");
          out.write("                    <td colspan='2' align=\"center\">\n");
          out.write("                        <b>Payment</b>\n");
          out.write("                    </td>\n");
          out.write("                </tr>\n");
          out.write("                <tr>\n");
          out.write("                <td colspan='2' align=\"center\">\n");
          out.write("                    <input type=\"radio\" name=\"card_type\" value=\"amex\" checked>  <img src='Image/amex.png' />\n");
          out.write("                    <input type=\"radio\" name=\"card_type\" value=\"visa\" checked>  <img src='Image/visa.png' />\n");
          out.write("                    <input type=\"radio\" name=\"card_type\" value=\"mastercard\">  <img src='Image/mastercard.png' /> \n");
          out.write("                    <input type=\"radio\" name=\"card_type\" value=\"dinersclub\">  <img src='Image/dinersclub.png' />\n");
          out.write("                    <input type=\"radio\" name=\"card_type\" value=\"discover\">  <img src='Image/discover.png' />\n");
          out.write("                    <input type=\"radio\" name=\"card_type\" value=\"giftcard\">  <img src='Image/giftcard.png' />\n");
          out.write("                    <input type=\"radio\" name=\"card_type\" value=\"check\">  <img src='Image/check.png' />\n");
          out.write("                </td>\n");
          out.write("                </tr>\n");
          out.write("                <tr>\n");
          out.write("                    <td>\n");
          out.write("                        Name on Card \n");
          out.write("                    </td>\n");
          out.write("                    <td>\n");
          out.write("                        <input type=\"text\" name=\"card_name\">\n");
          out.write("                    </td>\n");
          out.write("                </tr>\n");
          out.write("                <tr>\n");
          out.write("                    <td>\n");
          out.write("                        Card Number  \n");
          out.write("                    </td>\n");
          out.write("                    <td>\n");
          out.write("                        <input type=\"number\" name=\"card_number\">\n");
          out.write("                    </td>\n");
          out.write("                </tr>\n");
          out.write("                <tr>\n");
          out.write("                    <td>\n");
          out.write("                        CVV \n");
          out.write("                    </td>\n");
          out.write("                    <td> \n");
          out.write("                        <input style=\"width:40px \" type=\"password\" name=\"cvv\"   maxlength=\"3\">\n");
          out.write("                    </td>\n");
          out.write("                </tr>\n");
          out.write("                <tr>\n");
          out.write("                    <td colspan='2' >\n");
          out.write("                <center>\n");
          out.write("                        <input style=\"height: 30px; width: 100px;\" type=\"submit\" value=\"Proceed\" />\n");
          out.write("                        <input style=\"height: 30px; width: 100px;\" type=\"reset\" value=\"Reset\" />\n");
          out.write("                </center>   \n");
          out.write("                </td>\n");
          out.write("                </tr>\n");
          out.write("            </table>\n");
          out.write("            </form>\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
