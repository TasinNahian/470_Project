package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("     <title>Home</title>\n");
      out.write("\t <!link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n");
      out.write("         <style>\n");
      out.write("             *{\n");
      out.write("\tmargin: 0;\n");
      out.write("\tpadding: 0;\n");
      out.write("\tfont-family: Century Gothic;\n");
      out.write("}\n");
      out.write("header{\n");
      out.write("\tbackground-image:linear-gradient(rgba(0,0,0,1),rgba(0,0,0,0.1)), url(img/Background.jpg);\n");
      out.write("\theight: 100vh;\n");
      out.write("\tbackground-size: cover;\n");
      out.write("\tbackground-position: center;\n");
      out.write("\t\n");
      out.write("}\n");
      out.write("ul{\n");
      out.write("\tfloat: right;\n");
      out.write("\tlist-style-type: none;\n");
      out.write("\tmargin-top: 25px;\n");
      out.write("}\n");
      out.write("ul li{\n");
      out.write("\tdisplay: inline-block;\n");
      out.write("\t\n");
      out.write("}\n");
      out.write("ul li a{\n");
      out.write("\ttext-decoration: none;\n");
      out.write("\tcolor: #fff;\n");
      out.write("\tpadding: 5px 20px;\n");
      out.write("\tborder: 1px solid transparent;\n");
      out.write("\ttransition: 0.6s ease;\n");
      out.write("\t\n");
      out.write("}\n");
      out.write("ul li a:hover{\n");
      out.write("\tbackground-color: #fff;\n");
      out.write("\tcolor: #000;\n");
      out.write("\t\n");
      out.write("}\n");
      out.write("ul li.active a{\n");
      out.write("\tbackground-color:#fff;\n");
      out.write("\tcolor: #000;\n");
      out.write("}\n");
      out.write(".logo img{\n");
      out.write("\tfloat: left;\n");
      out.write("\twidth: 170px;\n");
      out.write("\theight: 150px;\n");
      out.write("\t\n");
      out.write("}\n");
      out.write("\n");
      out.write(".main{\n");
      out.write("\tmax-width: 18000px;\n");
      out.write("\tmargin: auto\n");
      out.write("}\n");
      out.write(".title {\n");
      out.write("\tposition: absolute;\n");
      out.write("\ttop: 35%;\n");
      out.write("\tleft: 50%;\n");
      out.write("\ttransform: translate(-50%,-50%);\n");
      out.write("}\n");
      out.write(".title h1{\n");
      out.write("\tcolor: #fff;\n");
      out.write("\tfont-size: 45px;\n");
      out.write("\t\n");
      out.write("}\n");
      out.write(".button{\n");
      out.write("\tposition: absolute;\n");
      out.write("\ttop: 60%;\n");
      out.write("\tleft: 50%;\n");
      out.write("\ttransform: translate(-50%,-50%);\n");
      out.write("\t\n");
      out.write("}\n");
      out.write(".btn{\n");
      out.write("\tborder: 1px solid #fff;\n");
      out.write("\tpadding:20px 40px;\n");
      out.write("\tcolor: #fff;\n");
      out.write("\ttext-decoration: none;\n");
      out.write("\ttransition:1s ease;\n");
      out.write("}\n");
      out.write(".btn:hover{\n");
      out.write("\tbackground-color: #fff;\n");
      out.write("\tcolor: #000;\n");
      out.write("        \n");
      out.write("}\n");
      out.write("\n");
      out.write("         </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("     <header>\n");
      out.write("\t <div class=\"main\">\n");
      out.write("\t     <div class=\"logo\">\n");
      out.write("\t\t     \n");
      out.write("                 <img src=\"img/logo.jpg\" />\n");
      out.write("\t     <ul>\n");
      out.write("\t\t    <!--<li class=\"active\"><a href=\"#\">Home</a></li>-->\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<li><a href=\"#\">About</a></li>\n");
      out.write("\t\t\t<li><a href=\"#\">Contact Us & Feedback</a></li>\n");
      out.write("\t\t </ul>\n");
      out.write("\t\t <div class=\"title\">\n");
      out.write("\t\t     <h1> Mastermind School </h1>\n");
      out.write("\t\t </div>\n");
      out.write("\t\t <div class=\"button\">\n");
      out.write("\t\t     <a href=\"#\" class=\"btn\">STUDENTS</a>\n");
      out.write("\t\t\t <a href=\"#\" class=\"btn\">TEACHERS</a>\n");
      out.write("\t\t\t <a href=\"#\" class=\"btn\">ROUTINE</a>\n");
      out.write("\t\t\t <a href=\"#\" class=\"btn\">STAFF</a>\n");
      out.write("\t\t </div>\n");
      out.write("\t </div>\n");
      out.write("\t </header>\n");
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
