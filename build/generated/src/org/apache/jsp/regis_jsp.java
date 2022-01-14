package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class regis_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\t\n");
      out.write("\t</script>\t\n");
      out.write("\t\t<meta charset=\"utf-8\">\n");
      out.write("\t\t<title>Ville de Tours</title>\n");
      out.write("\t<style type=\"text/css\">\n");
      out.write("body\n");
      out.write("{\n");
      out.write("\tmargin: 0;\n");
      out.write("\tpadding: 0;\n");
      out.write("\tbackground-image: linear-gradient(rgba(0,0,0,0.8),rgba(0,0,0,0.8)), url(park/boro.jpg);\n");
      out.write("\tbackground-size: cover;\n");
      out.write("\tfont-family: sans-serif;\n");
      out.write("}\n");
      out.write(".loginBox\n");
      out.write("{\n");
      out.write("\tborder-radius: 5%;\n");
      out.write("\tposition: absolute;\n");
      out.write("\ttop: 50%;\n");
      out.write("\tleft: 50%;\n");
      out.write("\ttransform: translate(-50%,-50%);\n");
      out.write("\twidth: 350px;\n");
      out.write("\theight: 650px;\n");
      out.write("\tpadding: 80px 40px;\n");
      out.write("\tbox-sizing: border-box;\n");
      out.write("\tbackground: rgba(0,0,0,.5);\n");
      out.write("}\n");
      out.write(".user\n");
      out.write("{\n");
      out.write("\twidth: 100px;\n");
      out.write("\theight: 100px;\n");
      out.write("\tborder-radius: 50%;\n");
      out.write("\toverflow: hidden;\n");
      out.write("\tposition: absolute;\n");
      out.write("\ttop: calc(-100px/2);\n");
      out.write("\tleft: calc(50% - 50px);\n");
      out.write("}\n");
      out.write("h2\n");
      out.write("{\n");
      out.write("\tmargin: 0;\n");
      out.write("\tpadding: 0 0 20px;\n");
      out.write("\tcolor: #fff;\n");
      out.write("\ttext-align: center;\n");
      out.write("}\n");
      out.write(".loginBox p\n");
      out.write("{\n");
      out.write("\tmargin: 0;\n");
      out.write("\tpadding: 0;\n");
      out.write("\tfont-weight: bold;\n");
      out.write("\tcolor: #fff;\n");
      out.write("}\n");
      out.write(".loginBox input\n");
      out.write("{\n");
      out.write("\twidth: 100%;\n");
      out.write("\tmargin-bottom: 20px;\n");
      out.write("}\n");
      out.write(".loginBox input[type=\"text\"],\n");
      out.write(".loginBox input[type=\"password\"]\n");
      out.write("{\n");
      out.write("\tborder: none;\n");
      out.write("\tborder-bottom: 1px solid #fff;\n");
      out.write("\tbackground: transparent;\n");
      out.write("\toutline: none;\n");
      out.write("\theight: 40px;\n");
      out.write("\tcolor: #fff;\n");
      out.write("\tfont-size: 16px;\n");
      out.write("}\n");
      out.write("::placeholder\n");
      out.write("{\n");
      out.write("\tcolor: rgba(255,255,255,.5);\n");
      out.write("}\n");
      out.write(".loginBox input[type=\"submit\"]\n");
      out.write("{\n");
      out.write("\tborder: none;\n");
      out.write("\toutline: none;\n");
      out.write("\theight: 40px;\n");
      out.write("\tcolor: #fff;\n");
      out.write("\tfont-size: 16px;\n");
      out.write("\tbackground: #000;\n");
      out.write("\tcursor: pointer;\n");
      out.write("\tborder-radius: 20px;\n");
      out.write("}\n");
      out.write(".loginBox input[type=\"submit\"]:hover\n");
      out.write("{\n");
      out.write("\tbackground: #efed40;\n");
      out.write("\tcolor: #262626;\n");
      out.write("}\n");
      out.write(".loginBox a\n");
      out.write("{\n");
      out.write("\tcolor: #fff;\n");
      out.write("\tfont-size: 14px;\n");
      out.write("\tfont-weight: bold;\n");
      out.write("\ttext-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("button {\n");
      out.write("  background-color: #4CAF50;\n");
      out.write("  color: white;\n");
      out.write("  padding: 14px 20px;\n");
      out.write("  margin: 8px 0;\n");
      out.write("  border: none;\n");
      out.write("  cursor: pointer;\n");
      out.write("  width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("button:hover \n");
      out.write("{\n");
      out.write("  opacity: 0.8;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".close{\n");
      out.write("  position: absolute;\n");
      out.write("  right: 25px;\n");
      out.write("  top: 0;\n");
      out.write("  color: #000;\n");
      out.write("  font-size: 35px;\n");
      out.write("  font-weight: bold;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".close:hover,\n");
      out.write(".close:focus {\n");
      out.write("  color: red;\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("</style>\t\n");
      out.write("</head>\n");
      out.write("\t<body>\t\n");
      out.write("\t\t\t<div class=\"loginBox\">\n");
      out.write("\t\t\t\t<h2>Register In Here</h2>\n");
      out.write("\t\t\t\t<div id=\"id01\" class=\"modal\">\n");
      out.write("\t\t\t\t\t<form class=\"modal\" action=\"regisload.jsp\" method=\"post\" >\n");
      out.write("\t\t\t\t\t\t<div class=\"closeh\">\n");
      out.write("\t\t\t\t\t\t<a href=\"login.jsp\"><span class=\"close\" title=\"Close Modal\">&times;</a></span>\n");
      out.write("\t\t\t\t\t\t<p>Username</p>\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"username\" placeholder=\"Enter Username\" required=\"\">\n");
      out.write("                                                \t\t\t\t<p>Password</p>\n");
      out.write("\t\t\t\t\t\t<input type=\"password\" name=\"\" placeholder=\"??????\" required=\"\">\n");
      out.write("\t\t\t\t\t\t<p>First Name</p>\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"first\" placeholder=\"Enter First Name\" required=\"\">\n");
      out.write("\t\t\t\t\t\t<p>Last Name</p>\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"last\" placeholder=\"Enter Last Name\" required=\"\">\n");
      out.write("\t\t\t\t\t\t<p>Email</p>\n");
      out.write("\t\t\t\t\t\t<input type=\"Email\" name=\"email\" placeholder=\"Enter Your Email\" required=\"\">\n");
      out.write("\t\t\t\t\t\t<p>Phone Number</p>\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"phone\" placeholder=\"Enter Phone Number\" required=\"\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" name=\"\" value=\"Register\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t    </form>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t</body>\n");
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
