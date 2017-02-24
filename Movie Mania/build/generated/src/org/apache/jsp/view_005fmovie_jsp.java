package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.PrintWriter;
import java.sql.*;
import java.sql.*;

public final class view_005fmovie_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Movies</title>\n");
      out.write("    </head>\n");
      out.write("    ");

    String movie_id = request.getParameter("movie_id");
    
      out.write("\n");
      out.write("    <body>\n");
      out.write("    ");
      if (_jspx_meth_sql_setDataSource_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write(" \n");
      out.write("    ");
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
            out.write("    SELECT * from movie where movie_id=");
            out.print(movie_id);
            out.write(";\n");
            out.write("    ");
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
      out.write("        \n");
      out.write("\n");
      out.write("        <body>\n");
      out.write("            ");
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
      out.write("            <div id=\"container\" style=\"width:71.5%\">\n");
      out.write("            \n");
      out.write("            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            ");
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
      out.write("    </body>\n");
      out.write("</html>");
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
          out.write("    \n");
          out.write("                <div style=\"display:block;background-color:#333;margin: 0 auto;padding:15px 15px 15px 15px\" >\n");
          out.write("                    \n");
          out.write("            <div style=\"color:white;font-family: 'Source Sans Pro', sans-serif; \">\n");
          out.write("                <form action=\"checkout_movie.jsp\" method=\"post\">\n");
          out.write("                <div style=\"float:right;align:middle;margin-top: -6px\"><button id=\"btn\" type=\"submit\" name=\"movie_id\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.movie_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" >Book Now</button></div>\n");
          out.write("                </form>\n");
          out.write("                    ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.movie_name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("            </div>\n");
          out.write("                    \n");
          out.write("                    \n");
          out.write("        </div>\n");
          out.write("               <form action=\"Add_movie\" method=\"post\" enctype=\"multipart/form-data\">\n");
          out.write("                    <table id=\"tab3\" style=\"width:500px;\" align=\"center\" >\n");
          out.write("                        <tr>\n");
          out.write("                        <td colspan=\"2\">\n");
          out.write("                            <embed width=\"640\" height=\"390\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.movie_trailor}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                    </td>\n");
          out.write("                </tr>\n");
          out.write("                <tr>\n");
          out.write("                    <td>\n");
          out.write("                        <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" width=\"200\" height=\"300\" >                       \n");
          out.write("                    </td>\n");
          out.write("                    <td>\n");
          out.write("                        <table id=\"tab3\">\n");
          out.write("                            <tr>\n");
          out.write("                                <td>\n");
          out.write("                                    <b>Genre</b>\n");
          out.write("                                </td>\n");
          out.write("                                <td>\n");
          out.write("                                    ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.genre}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                </td>\n");
          out.write("                            </tr>\n");
          out.write("                            <tr>\n");
          out.write("                                <td>\n");
          out.write("                                    <b>Release Date</b>\n");
          out.write("                                </td>\n");
          out.write("                                <td>\n");
          out.write("                                    ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.release_date}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                </td>\n");
          out.write("                            </tr>\n");
          out.write("                            <tr>\n");
          out.write("                                <td>\n");
          out.write("                                    <b>Duration</b>\n");
          out.write("                                </td>\n");
          out.write("                                <td>\n");
          out.write("                                    ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.duration}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                </td>\n");
          out.write("                            </tr>\n");
          out.write("                            <tr>\n");
          out.write("                                <td>\n");
          out.write("                                    <b>Cast</b>\n");
          out.write("                                </td>\n");
          out.write("                                <td>\n");
          out.write("                                    ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.cast}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                </td>\n");
          out.write("                            </tr>\n");
          out.write("                            <tr>\n");
          out.write("                                <td>\n");
          out.write("                                    <b>Production</b>\n");
          out.write("                                </td>\n");
          out.write("                                <td>\n");
          out.write("                                    ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.production}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                </td>\n");
          out.write("                            </tr>\n");
          out.write("                            <tr>\n");
          out.write("                                <td>\n");
          out.write("                                    <b>Rating</b>\n");
          out.write("                                </td>\n");
          out.write("                                <td>\n");
          out.write("                                    <img width=\"180\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.rating}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" />\n");
          out.write("                                </td>\n");
          out.write("                            </tr>\n");
          out.write("                        </table>\n");
          out.write("                    </td>\n");
          out.write("                </tr>\n");
          out.write("                <tr>\n");
          out.write("                    <td colspan=\"2\">\n");
          out.write("                        <b>Description</b>\n");
          out.write("                    </td>                 \n");
          out.write("                </tr>\n");
          out.write("                 <tr>\n");
          out.write("                    <td colspan=\"2\">\n");
          out.write("                        ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                    </td>                 \n");
          out.write("                </tr>\n");
          out.write("                \n");
          out.write("                    </table>\n");
          out.write("                    </form>                       \n");
          out.write("                ");
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
