package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.Member;
import DatAccess.*;
import java.util.*;

public final class memberakun_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("</html>\n");
      out.write("<head>\n");
      out.write("\t<title>Ville de Tours</title>\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, intial-scale=1.0\">\n");
      out.write("\t<style type=\"text/css\">\n");
      out.write("\t\t*{\n");
      out.write("\t\t\tmargin: 0;\n");
      out.write("\t\t\tpadding: 0;\n");
      out.write("            font-family: Century Gothic;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\tfooter {\n");
      out.write("            position: fixed;\n");
      out.write("            padding-top: -5px;\n");
      out.write("            left: 0;\n");
      out.write("            bottom: 0;\n");
      out.write("            height: 40px;\n");
      out.write("            width: 100%;\n");
      out.write("            background-color: black;\n");
      out.write("            color: white;\n");
      out.write("            font-size: 15px;\n");
      out.write("       }\n");
      out.write("\n");
      out.write("       \tnav{\n");
      out.write("\t\t\twidth: 100%;\n");
      out.write("\t\t\theight: 50px;\n");
      out.write("\t\t\tline-height: 40px;\n");
      out.write("\t\t\tz-index: 999;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\tnav img {\n");
      out.write("\t\t\tmargin-top: -40px;\n");
      out.write("\t\t\tmargin-left: 0%;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\tnav ul{\n");
      out.write("\t\t\tfloat: left;\n");
      out.write("\t\t\tmargin-right: 95px;\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\tnav ul li{\n");
      out.write("\t\t\tlist-style-type: none;\n");
      out.write("\t\t\tdisplay: inline-block;\n");
      out.write("\t\t\ttransition: 0.5s all;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\tnav ul li:hover{\n");
      out.write("\t\t\tbackground-color: #000;\t\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\tnav ul li.active{\n");
      out.write("\t\t\tbackground-color: #000;\n");
      out.write("\t        color: #fff;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\tnav ul li a{\n");
      out.write("\t\t\ttext-decoration: none;\n");
      out.write("\t\t\tcolor: #fff;\n");
      out.write("\t\t\tpadding: 30px;\n");
      out.write("\t\t\tfont-weight: bold;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("       .tblmember {\n");
      out.write("       \t\tborder-collapse: collapse;\n");
      out.write("       \t\tborder: 2px solid #000;\n");
      out.write("       \t\tmargin-top: 4%;\n");
      out.write("       \t\tposition: absolute;\n");
      out.write("       \t\tmargin-left: 4%;\n");
      out.write("       \t\tmargin-top: 4%;\n");
      out.write("       }\n");
      out.write("\n");
      out.write("       .tblmember th {\n");
      out.write("       \t\ttext-align: left;\n");
      out.write("       \t\tbackground-color: #fff;\n");
      out.write("       \t\tcolor: #000;\n");
      out.write("       \t\tpadding: 4px 20px 4px 8px;\n");
      out.write("       }\n");
      out.write("\n");
      out.write("       .tblmember td {\n");
      out.write("       \t\tpadding: 4px 8px;\n");
      out.write("       \t\tbackground-color: #000;\n");
      out.write("       \t\tcolor: #fff;\n");
      out.write("       }\n");
      out.write("\n");
      out.write("\t\t.main{\n");
      out.write("\t\t\twidth: 120%;\n");
      out.write("\t\t\theight: 100vh;\n");
      out.write("\t\t\tbackground-image: linear-gradient(rgba(0,0,0,0.4),rgba(0,0,0,0.4)), url(duda.jpg);\n");
      out.write("\t\t\tbackground-size: cover;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t.drop1 ul \n");
      out.write("\t\t{\n");
      out.write("\t\t    position:absolute;\n");
      out.write("\t\t    left:-9999px;\n");
      out.write("\t\t    top:-9999px;\n");
      out.write("\t\t    list-style-type:none;\n");
      out.write("\t\t    z-index: 999;\n");
      out.write("\t\t}\n");
      out.write("\t\t.drop1 li:hover { position:relative; background:black; }\n");
      out.write("\t\t.drop1 li:hover ul \n");
      out.write("\t\t{\n");
      out.write("\t\t    left:0px;\n");
      out.write("\t\t    top:38px;\n");
      out.write("\t\t    background:black;\n");
      out.write("\t\t    padding:0px;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t.drop1 li:hover ul li a \n");
      out.write("\t\t{\n");
      out.write("\t\t    padding:5px;\n");
      out.write("\t\t    display:block;\n");
      out.write("\t\t    width:200px;\n");
      out.write("\t\t    text-indent:5px;\n");
      out.write("\t\t    background-color:black;\n");
      out.write("\t\t}\n");
      out.write("\t\t.drop1 li:hover ul li a:hover { background:red; }\n");
      out.write("\n");
      out.write("\t</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("        \n");
      out.write("\n");
      out.write("\t<div class=\"main\">\n");
      out.write("\t\t<nav>\n");
      out.write("\t\t\t<img src=\"img/tours.png\" width=\"270\" height=\"190\">\n");
      out.write("\t\t\t<ul class=\"drop1\">\n");
      out.write("\t\t\t\t<li><a href=\"membereserv.jsp\">Reservation Member</a></li>\n");
      out.write("\t\t\t\t<li class=\"active\"><a href=\"memberakun.jsp\">Member Account</a><br></li>\n");
      out.write("\t\t\t\t<li><a href=\"memberfeedback.jsp\">Member Feedback</a></li>\n");
      out.write("                <li><a href=\"#\"><img src=\"img/000.png\" width=\"15\" height=\"15\"></a>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href='utama.html'>Homepage</a></li><br>\n");
      out.write("                        <li><a href='admin.jsp'>Logout</a></li><br>\n");
      out.write("                   </ul>\n");
      out.write("                </li>\t\t\t\t\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</nav>\n");
      out.write("\t\t\t\t\t<div class=\"tblmember\">\n");

List<Member> list=MemberDAO.getAllRecords();
request.setAttribute("list",list);

      out.write("\n");
      out.write("\t\t\t\t\t\t<table>\n");
      out.write("\t\t\t\t         <tr>\n");
      out.write("\t\t\t\t            <th>ID</th>\n");
      out.write("\t\t\t\t            <th>Username</th>\n");
      out.write("\t\t\t\t            <th>First Name</th>\n");
      out.write("\t\t\t\t            <th>Last Name</th>\n");
      out.write("\t\t\t\t            <th>Email</th>\n");
      out.write("\t\t\t\t            <th>Phone Number</th>\n");
      out.write("\t\t\t\t            <th>Password</th>\n");
      out.write("\t\t\t\t            <th>Edit</th>\n");
      out.write("                                                                                    <th>Delete</th>\n");
      out.write("\t\t\t\t         </tr>\n");
      out.write("                                                                                  ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t       </table> \n");
      out.write("\t\t\t\t    </div>   \n");
      out.write("\t</div>\n");
      out.write("</body>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("b");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t         <tr>\n");
          out.write("\t\t\t\t         \t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.getUserid()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("\t\t\t\t         \t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.getUsername()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("\t\t\t\t         \t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.getFirst()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("\t\t\t\t         \t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.getLast()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("\t\t\t\t         \t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.getEmail()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("\t\t\t\t         \t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.getPhone()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("\t\t\t\t         \t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.getPassword()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("            <td><a href=\"editmemberform.jsp?userid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.getUserid()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Edit</a></td>                                                                                                        \n");
          out.write("            <td><a href=\"deletemember.jsp?userid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.getUserid()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Delete</a></td>\n");
          out.write("\t\t\t\t         </tr>\n");
          out.write("                                                                                  ");
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
