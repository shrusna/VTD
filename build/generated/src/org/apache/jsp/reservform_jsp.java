package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reservform_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\tfunction sub()\n");
      out.write("\t\t{\n");
      out.write("\t\t\tif ((document.form1.no.value>0)) \n");
      out.write("\t\t\t{\n");
      out.write("\t\t\t\talert(\"Check Your Email for Your Verification\")\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t</script>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("  window.totalIt= function() {\n");
      out.write("  var input = document.getElementsByName(\"harga\");\n");
      out.write("  var total = 0;\n");
      out.write("  for (var i = 0; i < input.length; i++) {\n");
      out.write("    if (input[i].checked) {\n");
      out.write("      total += parseFloat(input[i].value);\n");
      out.write("    }\n");
      out.write("  }\n");
      out.write("  document.getElementById(\"total\").value = \"0\" + total.toFixed(2);\n");
      out.write("  return total;\n");
      out.write("}\n");
      out.write("\n");
      out.write("window.totalAll = function()\n");
      out.write("{\n");
      out.write("  document.getElementById(\"total\").value = (totalIt() + totalPrisClass()).toFixed(2) ;\n");
      out.write("}\n");
      out.write("\n");
      out.write("window.totalPrisClass= function() {\n");
      out.write("  var input = document.getElementsByName(\"class\");\n");
      out.write("  var total = 0;\n");
      out.write("  for (var i = 0; i < input.length; i++) {\n");
      out.write("    if (input[i].checked) {\n");
      out.write("      total += parseFloat(input[i].value);\n");
      out.write("    }\n");
      out.write("  }\n");
      out.write("  document.getElementById(\"total\").value = \"0\" + total.toFixed(2);\n");
      out.write("  return total;\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\t<meta charset=\"UTF-8\">\n");
      out.write("\t<title>Ville de Tours</title>\n");
      out.write("\t<style type=\"text/css\">\n");
      out.write("*{\n");
      out.write("   margin: 0;\n");
      out.write("   padding: 0;\n");
      out.write("   font-family: Century Gothic;\n");
      out.write("   color: #000;\n");
      out.write("}\n");
      out.write("ul{\n");
      out.write("\tfloat: right;\n");
      out.write("\tlist-style-type: none;\n");
      out.write("\tmargin: 50px;\n");
      out.write("\tpadding-right: 45px;\n");
      out.write("    word-spacing: 10px;\n");
      out.write("    font-weight: bold;\n");
      out.write("    font-size: 20px;\n");
      out.write("\t}\t\n");
      out.write("\n");
      out.write("\tul li\n");
      out.write("\t{\n");
      out.write("\tdisplay: inline-block;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tul li a\n");
      out.write("\t{\n");
      out.write("\ttext-decoration: none;\n");
      out.write("\tcolor: #000;\n");
      out.write("\tpadding: 5px 20px;\n");
      out.write("\ttransition: 0.6s ease;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tul li a:hover\n");
      out.write("\t{\n");
      out.write("\tbackground-color: #000;\n");
      out.write("\tcolor: #fff;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tul li.active a\n");
      out.write("\t{\n");
      out.write("\tbackground-color: #000;\n");
      out.write("\tcolor: #fff;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write(".logo img\n");
      out.write("\t{\n");
      out.write("\tmargin: 25px;\n");
      out.write("\tpadding-left: 35px;\n");
      out.write("\tfloat: left;\n");
      out.write("\twidth: 150px;\n");
      out.write("\theight: auto;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("body{\n");
      out.write("        margin: 0;\n");
      out.write("        padding: 0;\n");
      out.write("    }\n");
      out.write("        body:before{\n");
      out.write("            content: '';\n");
      out.write("            position: fixed;\n");
      out.write("            width: 100vw;\n");
      out.write("            height: 100vh;\n");
      out.write("            background-image: linear-gradient(rgba(0,0,0,0.4),rgba(0,0,0,0.4)), url(\"duda.jpg\");\n");
      out.write("            background-position: center center;\n");
      out.write("            background-repeat: no-repeat;\n");
      out.write("            background-attachment: fixed;\n");
      out.write("            background-size: cover;\n");
      out.write("            -webkit-filter: blur(10px);\n");
      out.write("            -moz-filter: blur(10px);\n");
      out.write("            -o-filter: blur(10px);\n");
      out.write("            -ms-filter: blur(10px);\n");
      out.write("            filter: blur(10px);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .contact-form\n");
      out.write("        {\n");
      out.write("            position: absolute;\n");
      out.write("            top: 120%;\n");
      out.write("            left: 49%;\n");
      out.write("            transform: translate(-50%,-50%);\n");
      out.write("            width: 700px;\n");
      out.write("            height: 1300px;\n");
      out.write("            padding: 30px 40px;\n");
      out.write("            box-sizing: border-box;\n");
      out.write("            background: #fff;\n");
      out.write("            border-radius: 50px;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .contact-form2\n");
      out.write("        {\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0 0 20px;\n");
      out.write("            text-align: center;\n");
      out.write("            position: absolute;\n");
      out.write("            top: 3%;\n");
      out.write("            left: 48.5%;\n");
      out.write("            transform: translate(-50%,-50%);\n");
      out.write("            width: 800px;\n");
      out.write("            height: 5px;\n");
      out.write("            padding: 40px 20px;\n");
      out.write("            box-sizing: border-box;\n");
      out.write("            background: rgba(0,0,0,0);\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .form\n");
      out.write("        {\n");
      out.write("        \tmargin: 0;\n");
      out.write("            padding: 0 0 20px;\n");
      out.write("            position: fixed;\n");
      out.write("            top: 10%;\n");
      out.write("            right: 18%;\n");
      out.write("            transform: translate(-50%,-50%);\n");
      out.write("            width: 50px;\n");
      out.write("            height: 80px;\n");
      out.write("            padding: 40px 20px;\n");
      out.write("            box-sizing: border-box;\n");
      out.write("            background: rgba(0,0,0,0);\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("        .butt1\n");
      out.write("        {\n");
      out.write("        \tmargin: 0;\n");
      out.write("            padding: 0 0 20px;\n");
      out.write("            position: fixed;\n");
      out.write("            top: 35%;\n");
      out.write("            right: 12%;\n");
      out.write("            transform: translate(-50%,-50%);\n");
      out.write("            width: 50px;\n");
      out.write("            height: 50px;\n");
      out.write("            padding: 40px 20px;\n");
      out.write("            box-sizing: border-box;\n");
      out.write("            background: rgba(0,0,0,0);\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("         .butt2\n");
      out.write("        {\n");
      out.write("        \tmargin: 0;\n");
      out.write("            padding: 0 0 20px;\n");
      out.write("            position: fixed;\n");
      out.write("            top: 54%;\n");
      out.write("            right: 12.5%;\n");
      out.write("            transform: translate(-50%,-50%);\n");
      out.write("            width: 50px;\n");
      out.write("            height: 50px;\n");
      out.write("            padding: 40px 20px;\n");
      out.write("            box-sizing: border-box;\n");
      out.write("            background: rgba(0,0,0,0);\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("         .butt3\n");
      out.write("        {\n");
      out.write("        \tmargin: 0;\n");
      out.write("            padding: 0 0 20px;\n");
      out.write("            position: fixed;\n");
      out.write("            top: 75%;\n");
      out.write("            right: 12%;\n");
      out.write("            transform: translate(-50%,-50%);\n");
      out.write("            width: 50px;\n");
      out.write("            height: 50px;\n");
      out.write("            padding: 40px 20px;\n");
      out.write("            box-sizing: border-box;\n");
      out.write("            background: rgba(0,0,0,0);\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("        .contact-form p\n");
      out.write("        {\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            width: 150px;\n");
      out.write("            font-weight: bold;\n");
      out.write("            color: #000;\n");
      out.write("            font-size: 15px;\n");
      out.write("        }\n");
      out.write("        .contact-form input\n");
      out.write("        {\n");
      out.write("            width: 100%;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("            padding-top: 15px;\n");
      out.write("            font-size: 15px;\n");
      out.write("        }\n");
      out.write("        .contact-form input[type=\"text\"],\n");
      out.write("        .contact-form input[type=\"password\"],\n");
      out.write("        .contact-form input[type=\"date\"],\n");
      out.write("        .contact-form select,\n");
      out.write("        .contact-form textarea,\n");
      out.write("        .contact-form input[type=\"email\"],\n");
      out.write("        .contact-form input[type=\"phone\"],\n");
      out.write("        .contact-form input[type=\"number\"],\n");
      out.write("        .contact-form datalist,\n");
      out.write("        .contact-form input[list=\"stat\"]\n");
      out.write("        {\n");
      out.write("            border: none;\n");
      out.write("            border-bottom: 4px solid #000;\n");
      out.write("            background: transparent;\n");
      out.write("            outline: none;\n");
      out.write("            height: 25px;\n");
      out.write("            color: #000;\n");
      out.write("            font-size: 13px;\n");
      out.write("        }\n");
      out.write("        .contact-form input[type=\"submit\"] {\n");
      out.write("            height: 40px;\n");
      out.write("            color: #fff;\n");
      out.write("            font-size: 15px;\n");
      out.write("            background: #000;\n");
      out.write("            cursor: pointer;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            border: none;\n");
      out.write("            outline: none;\n");
      out.write("            margin-top: 0%;\n");
      out.write("            font-weight: bold;\n");
      out.write("            border-color: #000;\n");
      out.write("            position: relative;\n");
      out.write("        }\n");
      out.write("        .contact-form a\n");
      out.write("        {\n");
      out.write("            color: #000;\n");
      out.write("            font-size: 20px;\n");
      out.write("            font-weight: bold;\n");
      out.write("            text-decoration: none;\n");
      out.write("        }\n");
      out.write("        input[type=\"checkbox\"] \n");
      out.write("        {\n");
      out.write("            width: 20%;\n");
      out.write("        }\n");
      out.write("       .tr1 input[type=\"text\"]\n");
      out.write("        {\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("        .tr2 input[type=\"text\"]\n");
      out.write("        {\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("<div class=\"contact-form\">\n");
      out.write("    <form action=\"reservation.jsp\" name=\"form1\" >\n");
      out.write("    \t<table class=\"table1\">\n");
      out.write("    <tfoot>\n");
      out.write("    \t<tr>\n");
      out.write("            <td colspan=\"6\"> <input id=\"button\" type=\"submit\" name=\"\" value=\"SUBMIT\"></td>\n");
      out.write("        </tr>\n");
      out.write("    </tfoot>\n");
      out.write("    <tr>\n");
      out.write("        <td><p>NIK*</p></td>\n");
      out.write("        <td><H1> : </H1></td>\n");
      out.write("        <td colspan=\"2\"><input type=\"text\" name=\"nik\" placeholder=\"NIK\" required=\"\"></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>    \n");
      out.write("        <td width=\"100\"></td>\n");
      out.write("    </tr>   \n");
      out.write("    <tr>\n");
      out.write("        <td><p>First Name*</p></td>\n");
      out.write("        <td><H1> : </H1></td>\n");
      out.write("        <td colspan=\"2\"><input type=\"text\" name=\"reservfirst\" placeholder=\"First Name\" required=\"\"></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td><p>Last Name</p></td>\n");
      out.write("        <td><H1> : </H1></td>\n");
      out.write("        <td colspan=\"2\"><input type=\"text\" name=\"reservlast\" placeholder=\"Last Name\"></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td><p>Gender*</p></td>\n");
      out.write("        <td><H1> : </H1></td>\n");
      out.write("        <td><input name=\"gender\" value=\"MALE\" type=\"radio\" id=\"p1\"/><p align=\"center\">Male</p></td>\n");
      out.write("        <td><input name=\"gender\" value=\"FEMALE\" type=\"radio\" id=\"p2\" /><p align=\"center\">Female</p></td>\n");
      out.write("        </td>\n");
      out.write("    </tr>\n");
      out.write("    <tr class=\"tr1\">\n");
      out.write("        <td><p>Date of Birth*</p></td>\n");
      out.write("        <td><H1> : </H1></td>\n");
      out.write("        <td><input align=\"center\" name=\"datebd\" type=\"number\" min=\"1\" max=\"30\" required=\"\" placeholder=\"DD\"></td>\n");
      out.write("        <td><input align=\"center\" name=\"datebm\" type=\"text\" max=\"20\" required=\"\" placeholder=\"MM\"></td>\n");
      out.write("        <td><input align=\"center\" name=\"dateby\" type=\"number\" min=\"1970\" max=\"2019\" required=\"\" placeholder=\"YYYY\"></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td><p>ADDRESS*</p></td>\n");
      out.write("        <td><H1> : </H1></td>\n");
      out.write("        <td colspan=\"2\"><input type=\"text\" name=\"address\" rows=\"5\" cols=\"30\" required=\"\"></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td><p>Email*</p></td>\n");
      out.write("        <td><H1> : </H1></td>\n");
      out.write("        <td colspan=\"2\"><input type=\"email\" name=\"reservemail\" placeholder=\"Enter Your Email\" required=\"\"></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>    \n");
      out.write("        <td><p>Phone No.*</p></td>\n");
      out.write("        <td><H1> : </H1></td>\n");
      out.write("        <td colspan=\"2\"><input type=\"text\" name=\"reservphone1\" placeholder=\"Phone No.\" required=\"\"></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>    \n");
      out.write("        <td><p>Phone No.</p></td>\n");
      out.write("        <td><H1> : </H1></td>\n");
      out.write("        <td colspan=\"2\"><input type=\"text\" name=\"reservphone2\" placeholder=\"Phone No.\"></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr class=\"tr2\">    \n");
      out.write("        <td><p>Date of Departure*</p></td>\n");
      out.write("        <td><H1> : </H1></td>\n");
      out.write("        <td><input align=\"center\" name=\"datedd\" type=\"number\" min=\"1\" max=\"30\" required=\"\" placeholder=\"DD\"></td>\n");
      out.write("        <td><input align=\"center\" name=\"datedm\" type=\"text\" max=\"20\" required=\"\" placeholder=\"MM\"></td>\n");
      out.write("        <td><input align=\"center\" name=\"datedy\" type=\"number\" min=\"2010\" max=\"2019\" required=\"\" placeholder=\"YYYY\"></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td><p>Destination</p></td>\n");
      out.write("        <td><h1> : </h1></td>\n");
      out.write("        <td><input align=\"center\" name=\"destination\" value=\"4833055\" type=\"radio\" id=\"p1\" onclick=\"totalAll()\" /><p align=\"center\">Ngarai Sianok</p>  </td>\n");
      out.write("        <td><input align=\"center\" name=\"destination\" value=\"4717060\" type=\"radio\" id=\"p2\" onclick=\"totalAll()\" /><p align=\"center\">Fort Marlborough</p></td>\n");
      out.write("        <td><input align=\"center\" name=\"destination\" value=\"9201995\" type=\"radio\" id=\"p3\" onclick=\"totalAll()\" /><p align=\"center\">Tangkuban Perahu</p></td>\n");
      out.write("        </td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td></td>\n");
      out.write("        <td></td>\n");
      out.write("        <td><input align=\"center\" name=\"destination\" value=\"5042824\" type=\"radio\" id=\"4\" onclick=\"totalAll()\" /><p align=\"center\">Pantai Sumurtiga</p></td>\n");
      out.write("        <td><input align=\"center\" name=\"destination\" value=\"3239000\" type=\"radio\" id=\"p5\" onclick=\"totalAll()\" /><p align=\"center\">Pantai Peucang Banten</p></td>\n");
      out.write("        <td><input align=\"center\" name=\"destination\" value=\"7999550\" type=\"radio\" id=\"p6\" onclick=\"totalAll()\" /><p align=\"center\">Kelingking Beachi</p></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td></td>\n");
      out.write("        <td></td>\n");
      out.write("        <td><input align=\"center\" name=\"destination\" value=\"7864593\" type=\"radio\" id=\"p7\" onclick=\"totalAll()\" /><p align=\"center\">Gunung Rinjani</p></td>\n");
      out.write("        <td><input align=\"center\" name=\"destination\" value=\"3832000\" type=\"radio\" id=\"p8\" onclick=\"totalAll()\" /><p align=\"center\">Taman Laut Bunaken</p></td>\n");
      out.write("        <td><input align=\"center\" name=\"destination\" value=\"6314544\" type=\"radio\" id=\"p9\" onclick=\"totalAll()\" /><p align=\"center\">Pulau Wakatobi</p></td>\n");
      out.write("    </tr>       \n");
      out.write("    <tr>\n");
      out.write("        <td></td>\n");
      out.write("        <td></td>\n");
      out.write("        <td><input align=\"center\" name=\"destination\" value=\"8698400\" type=\"radio\" id=\"p10\" onclick=\"totalAll()\" /><p align=\"center\">Halmahera</p></td>\n");
      out.write("        <td><input align=\"center\" name=\"destination\" value=\"8867500\" type=\"radio\" id=\"p11\" onclick=\"totalAll()\" /><p align=\"center\">Pantai Ora</p></td>\n");
      out.write("        <td><input align=\"center\" name=\"destination\" value=\"10257907\" type=\"radio\" id=\"p12\" onclick=\"totalAll()\" /><p align=\"center\">Raja Ampat</p></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td></td>\n");
      out.write("        <td></td>\n");
      out.write("        <td></td>\n");
      out.write("        <td><input align=\"center\" name=\"destination\" value=\"4080000\" type=\"radio\" id=\"p13\" onclick=\"totalAll()\" /><p align=\"center\">Danau Sentani</p></td>\n");
      out.write("        <td></td>\n");
      out.write("    </tr>   \n");
      out.write("    <tr>\n");
      out.write("            <td height=\"20\"></td>\n");
      out.write("        </tr>     \n");
      out.write("    <tr>\n");
      out.write("        <td><p>Transportation</p></td>\n");
      out.write("        <td><h1> : </h1></td>\n");
      out.write("        <td><input name=\"class\" name=\"transportation\" value=\"500000\" type=\"radio\" id=\"p14\" onclick=\"totalAll()\"/><p align=\"center\">Rent Car</p></td>\n");
      out.write("        <td><input name=\"class\" name=\"transportation\" value=\"100000\" type=\"radio\" id=\"p15\" onclick=\"totalAll()\"/><p align=\"center\">MIGO</p></td>    \n");
      out.write("        <td></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td><p>MEMO</p></td>\n");
      out.write("        <td><H1> : </H1></td>\n");
      out.write("        <td colspan=\"2\"><input type=\"text\" name=\"memo\" rows=\"5\" cols=\"30\"></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td><p>Total Price</p></td>\n");
      out.write("        <td><H1> : </H1></td>\n");
      out.write("        <td colspan=\"2\"><input name=\"harga\" readonly type=\"text\" id=\"total\" /></td>\n");
      out.write("        <td><p>Rp</p></td>\n");
      out.write("    </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td height=\"20\"></td>\n");
      out.write("        </tr>\n");
      out.write("    \t</table>\n");
      out.write("    </form>\n");
      out.write("</div>\n");
      out.write("<div class=\"contact-form2\">\n");
      out.write("\t<a href=\"reservid.jsp\"><img src=\"img/reserve.png\"></a>\n");
      out.write("</div>\n");
      out.write("<div class=\"form\">\n");
      out.write("\t<a href=\"home.jsp\"><img src=\"img/tours.png\"></a>\n");
      out.write("</div>\n");
      out.write("<div class=\"butt1\">\n");
      out.write("\t<a href=\"destination.html\"><img src=\"img/888.png\">\n");
      out.write("</div>\n");
      out.write("<div class=\"butt2\">\n");
      out.write("\t<a href=\"galeri.html\"><img src=\"img/galeri.png\">\n");
      out.write("</div>\n");
      out.write("<div class=\"butt3\">\n");
      out.write("\t<a href=\"kontak.jsp\"><img src=\"img/kontak.png\">\n");
      out.write("</div>\n");
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
}