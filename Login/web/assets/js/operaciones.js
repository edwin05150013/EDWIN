$(document).ready(function(){
    $("#btnAgregar").click(function(){
        var email = $("#txtEmail").val();
        var password = $("#txtPassword").val();
        var name = $("#txtName").val();
        var status = $("#txtStatus").val();

        $.ajax({
            url:"crear-usuario-servlet",
            dataType:"json",
            type:"GET",
            data:{
                txtEmail:email,
                txtPassword:password,
                txtName:name,
                txtStatus:status
            },
            success:function(result){
                if(result.records==0){
                    alert("no se ha podido agregar al usuario, intente nuevamente...");
                }else{
                    $.ajax({
                        url:"listar-usuario-servlet",
                        type:"GET",
                        success:function(result){
                            $("#listaUsuarios").append(result);    
                        }
                    });
                }
                
            }
        });
    });
    
    
    
    
    
    
    
    
});
//vincular el boton del modal al javascript
    function actualizar(){
        $('#mymodal').modal('hide');
        var id = $("#txtIdModal").val();
        var email = $("#txtEmailModal").val();
        var password = $("#txtPasswordModal").val();
        var name = $("#txtNameModal").val();        
        $.ajax({
            url:"actualizar-usuario-servlet",
            dataType:"json",
            type:"GET",
            data:{
                txtId:id,
                txtEmail:email,
                txtPassword:password,
                txtName:name
            },
            success:function(result){
                if(result.records==0){
                    alert("no se ha podido agregar al usuario, intente nuevamente...");
                }else{
                    $.ajax({
                        url:"listar-usuario-servlet",
                        type:"GET",
                        success:function(result){
                            $("#listaUsuarios").html(result);    
                        }
                    });
                }
                
            }
        });
    }
    
    
function editar(id){        
        
        $.ajax({
            url:'editar-usuario-servlet',
            dataType:'json',
            type:'GET',
            data:{
                txtId:id
            },
            success:function(data){
                var result = data[0];
                if(result.id==0){
                    alert('no se ha podido agregar al usuario, intente nuevamente...');
                }else{
                    
                    //poner datos en modal oculto
                    $('#txtIdModal').val(result.id);
                    $('#txtNameModal').val(result.name);
                    $('#txtEmailModal').val(result.email);
                    $('#txtPasswordModal').val(result.password);
                    //hacer visible el modal oculto
                    $('#mymodal').modal('show');
                    console.log(result.email);
                }  
            },fail:function(result){
                console.log("ha sucedido un error interno");
            }            
        });
    }
    
    
function eliminar(id){
        
        $.ajax({
            url:"eliminar-usuario-servlet",
            dataType:"json",
            type:"GET",
            data:{
                txtId:id
            },
            success:function(result){
                console.log(result)
                if(result.records==0){
                    alert("no se ha podido agregar al usuario, intente nuevamente...");
                }else{
                    $.ajax({
                        url:"listar-usuario-servlet",
                        type:"GET",
                        success:function(result){
                            $("#listaUsuarios").html(result);    
                        }
                    });
                }
                
            }
        });
    }


    