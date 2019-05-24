<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.4.1/semantic.min.css">
        <link rel="stylesheet" href="assets/css/modal.min.css"/>
        
        
        <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.4.1/semantic.min.js"></script>
        <script src="assets/js/modal.min.js"></script>
        <script src="assets/js/operaciones.js"></script>
        <title>Usando Servlets, Bootstrap, Jquery, Ajax y BD</title>
    </head>
    <body>
        
        
        <!--aquí el modal -->
        <div class="ui modal" id="mymodal">
            <i class="close icon"></i>
            <div class="header">
              Actualizar información .. 
            </div>
            <div class="image content">
              <form class="ui form">
                <div class="field">
                  <label>Name/label>
                  <input type="text" id="txtNameModal" value="">
                </div>
                <div class="field">
                  <label>Email</label>
                  <input type="text" id="txtEmailModal" value="">
                </div>
                <div class="field">
                  <label>Password</label>
                  <input type="text" id="txtPasswordModal" value="">
                </div>
                  <input type="hidden" id="txtIdModal">
              </form>
            </div>
            <div class="actions">
              <div class="ui button negative">Cancel</div>
              <div class="ui button positive" onclick="actualizar()">Actualizar</div>
            </div>
          </div>
        
        <div class="ui segment">
            <div class="ui three column doubling stackable grid container">
                <div class="column">
                    <form class="ui form">
                        <div class="field">
                          <label>e-mail</label>
                          <input type="text" name="txtEmail" id="txtEmail" value="boot@soyunboot.com" placeholder="Debe ser un e-mail válido">
                        </div>
                        <div class="field">
                          <label>password</label>
                          <input type="password" name="txtPassword" id="txtPassword" value="1234" placeholder="Debe contener al menos números y letras">
                        </div>
                        <div class="field">
                          <label>name</label>
                          <input type="text" name="txtName" id="txtName" value="Soy un boot" placeholder="Primer nombre y apellido">
                        </div>
                        <input type="hidden" name="txtStatus" id="txtStatus">
                        <div class="field">
                          <div class="ui checkbox">
                            <input type="checkbox" tabindex="0" class="hidden">
                            <label>I agree to the Terms and Conditions</label>
                          </div>
                        </div>
                        <button class="ui yellow button" type="button" id="btnAgregar">Agregar</button>
                    </form>
                </div>
                <div class="column">
                    <table class="ui celled striped table">
                        <thead>
                          <tr><th colspan="4">
                            Lista de Usuarios
                          </th>
                        </tr></thead>
                        <tbody id="listaUsuarios">
                          
                        </tbody>
                      </table>
                </div>
            </div>
        </div>
        
        
    </body>
</html>