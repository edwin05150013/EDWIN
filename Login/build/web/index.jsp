<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>   
        <%
        try{
            Cookie[] cookies = request.getCookies();
            if(cookies != null){
                for(Cookie cookie : cookies){
                    if(cookie.getName().equals("token")){
                        if(cookie.getValue().equals("1234")){
                            out.println("<h1>Bienvenido</h1>");    
                        }else{
                            out.println("qwe");
                        
                            response.sendRedirect("login.jsp");
                        }
                    }
                }
            }else{
                response.sendRedirect("login.jsp");
            }

        }catch(Exception e){
            response.sendRedirect("login.jsp");
        }
        %>
    </body>
</html>
