package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.User;
import util.UserPojo;

@WebServlet(name = "ListarUsuarioServlet", urlPatterns = {"/listar-usuario-servlet"})
public class ListarUsuarioServlet extends HttpServlet {
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ListarUsuarioServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ListarUsuarioServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
     
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        try {
            User usuario = new User();
            ArrayList<UserPojo> usuarios = usuario.listar();
            PrintWriter out = response.getWriter();
            String script ="function editar(id){"
        +"console.log('this is my id:',id); "
                    + "$.ajax({"
            +"url:'editar-usuario-servlet',"
            +"dataType:'json',"
            +"type:'GET',"
            +"data:{"
                +"txtId:id"
            +"},"
            +"success:function(result){"
                +"console.log(result);"
                +"if(result.id==0){"
                    +"alert('no se ha podido agregar al usuario, intente nuevamente...');"
                +"}else{"
                    +"$('#txtIdModal').val(result.id);"
                    +"$('#txtNameModal').val(result.name);"
                    +"$('#txtEmailModal').val(result.email);"
                    +"$('#txtPasswordModal').val(result.password);"
                    +"$('.ui.modal').modal();"
                +"}                "
            +"},fail:function(result){"
                +"console.log(result);"
            +"}            "
        +"});"
    +"}";
            //out.print("<script>"+ script+ "</script>");
            for(UserPojo row: usuarios){
                out.print("<tr>"
                    +"<td class='collapsing'>"
                        +"<a href='javascript:editar(\""+row.getId()+"\");' ><i class='pencil icon'></i>editar</a>"
                        +"<a href='javascript:eliminar(\""+row.getId()+"\");' ><i class='trash icon'></i>eliminar</a>"
                    +"</td>"
                    +"<td class='collapsing'>"
                      +"<i class='address book icon'></i>"+row.getName()
                    +"</td>"
                    +"<td>"+row.getEmail()+"</td>"
                    +"<td class='right aligned collapsing'>"+row.getStatus()+"</td>"
                  +"</tr>");
            }
            
        }catch (SQLException ex) {
            Logger.getLogger(CrearUsuarioServlet.class.getName()).log(Level.SEVERE, null, ex);
           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CrearUsuarioServlet.class.getName()).log(Level.SEVERE, null, ex);
          
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
