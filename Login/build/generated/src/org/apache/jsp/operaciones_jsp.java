package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class operaciones_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.4.1/semantic.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/modal.min.css\"/>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.1.1.min.js\"></script>\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.4.1/semantic.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/modal.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/operaciones.js\"></script>\r\n");
      out.write("        <title>Usando Servlets, Bootstrap, Jquery, Ajax y BD</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <!--aquí el modal -->\r\n");
      out.write("        <div class=\"ui modal\" id=\"mymodal\">\r\n");
      out.write("            <i class=\"close icon\"></i>\r\n");
      out.write("            <div class=\"header\">\r\n");
      out.write("              Actualizar información .. \r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"image content\">\r\n");
      out.write("              <form class=\"ui form\">\r\n");
      out.write("                <div class=\"field\">\r\n");
      out.write("                  <label>Name/label>\r\n");
      out.write("                  <input type=\"text\" id=\"txtNameModal\" value=\"\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"field\">\r\n");
      out.write("                  <label>Email</label>\r\n");
      out.write("                  <input type=\"text\" id=\"txtEmailModal\" value=\"\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"field\">\r\n");
      out.write("                  <label>Password</label>\r\n");
      out.write("                  <input type=\"text\" id=\"txtPasswordModal\" value=\"\">\r\n");
      out.write("                </div>\r\n");
      out.write("                  <input type=\"hidden\" id=\"txtIdModal\">\r\n");
      out.write("              </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"actions\">\r\n");
      out.write("              <div class=\"ui button negative\">Cancel</div>\r\n");
      out.write("              <div class=\"ui button positive\" onclick=\"actualizar()\">Actualizar</div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"ui segment\">\r\n");
      out.write("            <div class=\"ui three column doubling stackable grid container\">\r\n");
      out.write("                <div class=\"column\">\r\n");
      out.write("                    <form class=\"ui form\">\r\n");
      out.write("                        <div class=\"field\">\r\n");
      out.write("                          <label>e-mail</label>\r\n");
      out.write("                          <input type=\"text\" name=\"txtEmail\" id=\"txtEmail\" value=\"boot@soyunboot.com\" placeholder=\"Debe ser un e-mail válido\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"field\">\r\n");
      out.write("                          <label>password</label>\r\n");
      out.write("                          <input type=\"password\" name=\"txtPassword\" id=\"txtPassword\" value=\"1234\" placeholder=\"Debe contener al menos números y letras\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"field\">\r\n");
      out.write("                          <label>name</label>\r\n");
      out.write("                          <input type=\"text\" name=\"txtName\" id=\"txtName\" value=\"Soy un boot\" placeholder=\"Primer nombre y apellido\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <input type=\"hidden\" name=\"txtStatus\" id=\"txtStatus\">\r\n");
      out.write("                        <div class=\"field\">\r\n");
      out.write("                          <div class=\"ui checkbox\">\r\n");
      out.write("                            <input type=\"checkbox\" tabindex=\"0\" class=\"hidden\">\r\n");
      out.write("                            <label>I agree to the Terms and Conditions</label>\r\n");
      out.write("                          </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <button class=\"ui yellow button\" type=\"button\" id=\"btnAgregar\">Agregar</button>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"column\">\r\n");
      out.write("                    <table class=\"ui celled striped table\">\r\n");
      out.write("                        <thead>\r\n");
      out.write("                          <tr><th colspan=\"4\">\r\n");
      out.write("                            Lista de Usuarios\r\n");
      out.write("                          </th>\r\n");
      out.write("                        </tr></thead>\r\n");
      out.write("                        <tbody id=\"listaUsuarios\">\r\n");
      out.write("                          \r\n");
      out.write("                        </tbody>\r\n");
      out.write("                      </table>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("    </body>\r\n");
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
