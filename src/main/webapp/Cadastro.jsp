<%-- 
    Document   : Cadastro
    Created on : 07/07/2018, 23:24:35
    Author     : lucas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro</title>
        <link rel="stylesheet" type="text/css" href="Estilos.css" />
    </head>
    <body>
        <div class="container">
            <div class="box2">
                <form action="cadastrar" method="post">
                    <h1>Cadastro de Produtos</h1>
                    <% 
                        if(request.getAttribute("i") != null){
                           out.println("<script type='text/javascript'>alert('Todos os campos são obrigatórios');</script>");
                        }
                        else if(request.getAttribute("e") != null){
                           out.println("<script type='text/javascript'>alert('Campo Invalido! Preço e Quantidade aceitam apenas numeros');</script>");
                        };
                        
                    %>
              
                    Nome: <br><input pattern=".{1,25}" required title="1 a 25 caracteres" type="text" name="txtNome"><br>
                    Preço: <br><input pattern=".{1,25}" required title="1 a 25 caracteres e apenas numeros" type="text" name="txtPreco"><br>
                    Quantidade: <br><input pattern=".{1,25}" required title="1 a 25 caracteres e apenas numeros" type="text" name="txtQuantidade"><br>
                    Data de Cadastro: <br><input pattern=".{1,25}" required title="1 a 25 caracteres" type="text" name="txtData"><br>
                    <br><input type="submit" name="btnEnviar" value="Enviar">
                </form> <br><br>
                <form action='exibir' method='GET'><input type='submit' value='Voltar'></form>
            </div>
        </div>
    </body>
</html>
