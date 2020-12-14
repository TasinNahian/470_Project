package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("     <title>LogIn</title>\n");
      out.write("\t <!link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n");
      out.write("         <style>\n");
      out.write("         body{\n");
      out.write("\tmargin: 0;\n");
      out.write("\tpadding: 0;\n");
      out.write("\tbackground-image:url(img/Background.jpg);\n");
      out.write("\tfont-family: Century Gothic;\n");
      out.write("\tbackground-position: center;\n");
      out.write("\theight: 100vh;\n");
      out.write("\tbackground-size: cover;\n");
      out.write("}\n");
      out.write(".box{\n");
      out.write("\twidth: 320px;\n");
      out.write("\theight: 380px;\n");
      out.write("\tbackground-color: #000000b3;\n");
      out.write("\tcolor: #fff;\n");
      out.write("\tposition: absolute;\n");
      out.write("\ttop: 50%;\n");
      out.write("\tleft: 50%;\n");
      out.write("\ttransform: translate(-50%,-50%);\n");
      out.write("\tpadding: 70px 30px;\n");
      out.write("\tbox-sizing: border-box;\n");
      out.write("\tborder-radius: 10px;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write(".avatar{\n");
      out.write("\twidth: 120px;\n");
      out.write("\theight: 120px;\n");
      out.write("\tborder-radius: 50%;\n");
      out.write("\tposition: absolute;\n");
      out.write("\ttop: -20%;\n");
      out.write("\tleft: calc(50% - 50px);\n");
      out.write("}\n");
      out.write("\n");
      out.write("h1{\n");
      out.write("\tmargin: 0;\n");
      out.write("\tpadding: 0 0 20px;\n");
      out.write("\ttext-align: center;\n");
      out.write("\tfont-size: 22px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".box input{\n");
      out.write("\twidth: 100%;\n");
      out.write("\tmargin-bottom: 20px;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write(".box input[type= \"text\"],input[type=\"password\"]\n");
      out.write("{\n");
      out.write("\tborder: none;\n");
      out.write("\tborder-bottom: 1px solid #fff;\n");
      out.write("\tbackground-color: transparent;\n");
      out.write("\toutline: none;\n");
      out.write("\theight: 40px;\n");
      out.write("\tcolor: #fff;\n");
      out.write("\tfont-size: 16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".box input[type= \"submit\"]{\n");
      out.write("\tborder: none;\n");
      out.write("\tbackground-color:#fb2525;\n");
      out.write("\toutline: none;\n");
      out.write("\theight: 40px;\n");
      out.write("\tcolor: #fff;\n");
      out.write("\tfont-size: 18px;\n");
      out.write("\tborder-radius: 20px;\n");
      out.write("\ttransition: 0.4s;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".box input[type= \"submit\"]:hover{\n");
      out.write("\tcursor: pointer\n");
      out.write("\tbackground-color:#ffc107;\n");
      out.write("\tcolor: #000;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write(".box a{\n");
      out.write("\ttext-decoration: none;\n");
      out.write("\tfont-size: 12px;\n");
      out.write("\tline-height: 20px;\n");
      out.write("\tcolor: darkgrey;\n");
      out.write("\ttransition: 0.4s ease;\n");
      out.write("}\n");
      out.write(".box a:hover{\n");
      out.write("\tcolor: #ffc107;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write(" <div class=\"box\"/>\n");
      out.write(" \t<img src=\"img/avatar.png\" class=\"avatar\"/>\n");
      out.write(" \t<h2>Login here</h2>\n");
      out.write(" \t<form>\n");
      out.write(" \t\t<input type=\"text\" name\"\" placeholder=\"Enter Username\">\n");
      out.write(" \t\t<input type=\"password\" name\"\" placeholder=\"Enter Password\">\n");
      out.write(" \t\t<!--input type=\"submit\" name\"\" value=\"Login\"-->\n");
      out.write("                <!--form action = \"http://localhost:8080/SchoolMAnagementSystem/home.jsp\">\n");
      out.write("                    <input type =\"submit\" value =\"Login\"\n");
      out.write("                </form-->\n");
      out.write("                <!--a href =\"http://localhost:8080/SchoolMAnagementSystem/home.jsp\"><!button>Login</button></a-->\n");
      out.write("              <a href=\"home.jsp\">login</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t</body>\n");
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
