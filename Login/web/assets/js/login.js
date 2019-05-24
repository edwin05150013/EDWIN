$(document).ready(function(){
    $("#signin").click(function(){
       var email = $("#inputEmail").val();
       var password = $("#inputPassword").val();
      
       $.ajax({
            dataType:"json",
            url:"my-validator-servlet",
            type:"GET",
            data:{
                txtEmail:email,
                txtPassword:password
            },
            success:function(result){
                
                if(result.id!=0){
                    window.location.href="index.jsp";
                }else{
                    alert("email/password incorrectos.");
                }
                
            }
            
       });
    });
});