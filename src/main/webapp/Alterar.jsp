<%-- 
    Document   : Alterar
    Created on : 08/07/2018, 16:17:33
    Author     : lucas
--%>

<%@page import="Biblioteca.BancoFake"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="Estilos.css" />
    </head>
    <body>
        
       
        <% int index = Integer.parseInt(request.getParameter("id"));
        if(request.getAttribute("i") != null){
            out.println("<script type='text/javascript'>alert('Todos os campos são obrigatórios');</script>");
        }
        else if(request.getAttribute("e") != null){
            out.println("<script type='text/javascript'>alert('Campo Invalido! Preço e Quantidade aceitam apenas numeros');</script>");
        };
        out.println("<div class='container'>");
        out.println("<div class='box2'>");
        out.println("<form action='alterar' method='post'>");
        out.println("<h1>Cadastro de Produtos</h1>");
        out.println("Nome: <br><input pattern='.{1,25}' required title='1 a 25 caracteres'"
                    + " value='"+BancoFake.GetLivro(index).getNome()+"' type='text' name='txtNome'> Nome atual: "
                    +BancoFake.GetLivro(index).getNome()+"<br>");
        
        out.println("Preço: <br><input pattern='.{1,25}' required title='1 a 25 caracteres"
                    + " e apenas numeros' value='"+BancoFake.GetLivro(index).getPreco()+"' type='text' name='txtPreco'> Preço atual: "
                    +BancoFake.GetLivro(index).getPreco()+"<br>");
        
        out.println("Quantidade: <br><input pattern='.{1,25}' required title='1 a 25 caracteres"
                    + " e apenas numeros' value='"+BancoFake.GetLivro(index).getQuantidade()+"' type='text' name='txtQuantidade'> Quantidade atual: "
                    +BancoFake.GetLivro(index).getQuantidade()+"<br>");
        
        out.println("Data de Cadastro: <br><input pattern='.{1,25}' required title='1 a 25 caracteres'"
                    + " value='"+BancoFake.GetLivro(index).getDataCadastro()+"' type='text' name='txtData'> Data atual: "
                    +BancoFake.GetLivro(index).getDataCadastro()+"<br>");
        
        out.println("<br><input type='submit' name='btnEnviar' value='Atualizar'><br>");
        out.println("<br><input type='hidden' name='id' value='"+index+"'><br>");
        out.println("</form>");
        out.println("<form action='exibir' method='GET'><input type='submit' value='Voltar'></form>");
        out.println("</div>");
        out.println("</div>");
        %>
        
    </body>
</html>
