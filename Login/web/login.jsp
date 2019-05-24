<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css"/>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"/>
        <link rel="stylesheet" href="assets/css/main.css"/>
       <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.bundle.min.js"></script>
        <script src="assets/js/login.js"></script>
        <title>Usando Servlets, Bootstrap, Jquery, Ajax y BD</title>
    </head>
    <body>
        <div class="container">
            <form action="my-validator-servlet" method="GET"> 
                <div class="row">
                  <div class="col-sm-9 col-md-7 col-lg-5 mx-auto">
                    <div class="card card-signin my-5">
                      <div class="card-body">
                        <h5 class="card-title text-center">Idat</h5>
                        <form class="form-signin">
                          <div class="form-label-group">
                            <input type="email" id="inputEmail" class="form-control" placeholder="Email address" >
                            <label for="inputEmail">Email address</label>
                          </div>                        
                          <div class="form-label-group">
                            <input type="password" id="inputPassword" class="form-control" placeholder="Password" >
                            <label for="inputPassword">Password</label>
                          </div>
                          <div class="custom-control custom-checkbox mb-3">
                            <input type="checkbox" class="custom-control-input" id="customCheck1">
                            <label class="custom-control-label" for="customCheck1">Remember password</label>
                          </div>
                          <button class="btn btn-lg btn-primary btn-block text-uppercase" type="button" id="signin">Sign in</button>
                          <hr class="my-4">
                          <button class="btn btn-lg btn-google btn-block text-uppercase" type="button">
                              <i class="fab fa-google mr-2"></i> Sign in with Google
                          </button>
                          <button class="btn btn-lg btn-facebook btn-block text-uppercase" type="button">
                              <i class="fab fa-facebook-f mr-2"></i> Sign in with Facebook
                          </button>
                        </form>
                      </div>
                    </div>
                  </div>
                </div>
            </form>
        </div>
        
         
    </body>
</html>
