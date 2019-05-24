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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.6.3/css/all.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/main.css\"/>\n");
      out.write("       <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/login.js\"></script>\n");
      out.write("        <title>Usando Servlets, Bootstrap, Jquery, Ajax y BD</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <form action=\"my-validator-servlet\" method=\"GET\"> \n");
      out.write("                <div class=\"row\">\n");
      out.write("                  <div class=\"col-sm-9 col-md-7 col-lg-5 mx-auto\">\n");
      out.write("                    <div class=\"card card-signin my-5\">\n");
      out.write("                      <div class=\"card-body\">\n");
      out.write("                        <h5 class=\"card-title text-center\">Idat</h5>\n");
      out.write("                        <form class=\"form-signin\">\n");
      out.write("                          <div class=\"form-label-group\">\n");
      out.write("                            <input type=\"email\" id=\"inputEmail\" class=\"form-control\" placeholder=\"Email address\" >\n");
      out.write("                            <label for=\"inputEmail\">Email address</label>\n");
      out.write("                          </div>                        \n");
      out.write("                          <div class=\"form-label-group\">\n");
      out.write("                            <input type=\"password\" id=\"inputPassword\" class=\"form-control\" placeholder=\"Password\" >\n");
      out.write("                            <label for=\"inputPassword\">Password</label>\n");
      out.write("                          </div>\n");
      out.write("                          <div class=\"custom-control custom-checkbox mb-3\">\n");
      out.write("                            <input type=\"checkbox\" class=\"custom-control-input\" id=\"customCheck1\">\n");
      out.write("                            <label class=\"custom-control-label\" for=\"customCheck1\">Remember password</label>\n");
      out.write("                          </div>\n");
      out.write("                          <button class=\"btn btn-lg btn-primary btn-block text-uppercase\" type=\"button\" id=\"signin\">Sign in</button>\n");
      out.write("                          <hr class=\"my-4\">\n");
      out.write("                          <button class=\"btn btn-lg btn-google btn-block text-uppercase\" type=\"button\">\n");
      out.write("                              <i class=\"fab fa-google mr-2\"></i> Sign in with Google\n");
      out.write("                          </button>\n");
      out.write("                          <button class=\"btn btn-lg btn-facebook btn-block text-uppercase\" type=\"button\">\n");
      out.write("                              <i class=\"fab fa-facebook-f mr-2\"></i> Sign in with Facebook\n");
      out.write("                          </button>\n");
      out.write("                        </form>\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("         \n");
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
