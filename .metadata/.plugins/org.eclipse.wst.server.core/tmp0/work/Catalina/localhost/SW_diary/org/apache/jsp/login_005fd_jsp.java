/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.53
 * Generated at: 2019-11-23 08:04:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_005fd_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>오늘의 교환일기_login</title>\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" charset=\"UTF-8\" name=viewport\r\n");
      out.write("\t\tcontent=\"width=device-width, initial-scale=1, user-scalable=0\">\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("body{\r\n");
      out.write("\tmargin: 0px auto;\r\n");
      out.write("\tbackground-color: #FFFFFF;\r\n");
      out.write("\tbox-sizing : border-box;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("div.top{\r\n");
      out.write("\tbackground: #00218c;\r\n");
      out.write("    position: fixed;\r\n");
      out.write("\ttop:0;\r\n");
      out.write("    left: 0;\r\n");
      out.write("    right: 0;\r\n");
      out.write("\tbox-sizing : border-box;\r\n");
      out.write("    height: 70px;\r\n");
      out.write("    z-index: 1;\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    padding: 0;\r\n");
      out.write("}\r\n");
      out.write("p.appname{\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("\tpadding-top: 30%;\r\n");
      out.write("\tpadding-left: 30%;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("div.login{\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("\tpadding-top: 20%;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("footer{\r\n");
      out.write("\tposition: relative; \r\n");
      out.write("\tpadding-top: 40;\r\n");
      out.write("\tbottom: 10; \r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\t }\r\n");
      out.write("\r\n");
      out.write("input{\r\n");
      out.write("\tz-index: 1;\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\ttext-align: left;\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\tfont-size: 100%;\r\n");
      out.write("\tborder:none;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input.id{\r\n");
      out.write("\ttop: 28%;\r\n");
      out.write("\tleft: 36%;\r\n");
      out.write("\tfont-size: 100%;\r\n");
      out.write("\twidth: 35%;\r\n");
      out.write("\theight: 7%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input.pw{\r\n");
      out.write("\ttop: 41%;\r\n");
      out.write("\tleft: 55%;\r\n");
      out.write("\tfont-size: 100%;\r\n");
      out.write("\twidth: 35%;\r\n");
      out.write("\theight: 7%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input.login{\r\n");
      out.write("\ttop: 65%;\r\n");
      out.write("\tleft: 55%;\r\n");
      out.write("\tfont-size: 100%;\r\n");
      out.write("\twidth: 35%;\r\n");
      out.write("\theight: 9%;\r\n");
      out.write("\tborder:none;\r\n");
      out.write("\topacity: 0;\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input.signup{\r\n");
      out.write("\ttop: 78%;\r\n");
      out.write("\tleft: 55%;\r\n");
      out.write("\tfont-size: 100%;\r\n");
      out.write("\twidth: 35%;\r\n");
      out.write("\tborder:none;\r\n");
      out.write("\theight: 9%;\r\n");
      out.write("\topacity: 0;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"top\"></div>\r\n");
      out.write("\t<p class=\"appname\">\r\n");
      out.write("\t\t<img src=\"images/appname.png\" style=\"max-width: 80%; height: auto;\">\r\n");
      out.write("\t</p>\r\n");
      out.write("\t<div class=\"login\">\r\n");
      out.write("\t\t<img src=\"images/idpw.png\" style=\"max-width: 85%; height:auto;\">\r\n");
      out.write("\t\t<form method=\"post\" action=\"loginAction_d.jsp\">\r\n");
      out.write("\t\t\t\t<input class=\"id\" type=\"text\" class=\"form-control\" name=\"userID\" maxlength=\"20\">\r\n");
      out.write("\t\t\t\t<input class=\"pw\" type=\"password\" class=\"form-control\" name=\"userPassword\" maxlength=\"20\">\r\n");
      out.write("\t\t\t\t<input class=\"login\" class=\"form-control\" type=\"submit\">\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t<a href=\"join.jsp\"><input class=\"signup\" type=\"button\" name=\"signup\"></a>\r\n");
      out.write("\t\t<div></div>\r\n");
      out.write("\t\t<footer>\r\n");
      out.write("\t\t\t<img src=\"images/logo.png\" style=\"max-width: 10%;\">\r\n");
      out.write("\t\t</footer>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
