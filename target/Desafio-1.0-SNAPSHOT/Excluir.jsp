<%-- 
    Document   : Excluir
    Created on : 08/07/2018, 22:17:50
    Author     : lucas
--%>
<%@page import="Biblioteca.BancoFake"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Excluir</title>
        <style>
            .box2 {
                width: 500px;
                height: 400px;
                background: #fff;
                border: 4px solid #000000;
                border-radius:4px;
                display: flex;
                flex-direction: column;
                justify-content: center;
                align-items: center;
            }
            .container {
                width: 100vw;
                height: 100vh;
                background: #6C7A89;
                display: flex;
                flex-direction: row;
                justify-content: center;
                align-items: center
            }
            body {
                margin: 0px;
            }
        </style>
    </head>
    <body>
        <%
            out.println("<div class='container'>");
            out.println("<div class='box2'>");
            out.println("<h1>Deseja Realmente remover</h1>");
            out.println("<h1>este produto?</h1>");
            out.println("<table>");
            
            out.println("<tr>");
            out.println("Nome: "+BancoFake.GetLivro(Integer.parseInt(request.getParameter("id"))).getNome() + "<br><br>");
            out.println("</tr>");
            
            out.println("<tr>");
            out.println("Preço: R$"+BancoFake.GetLivro(Integer.parseInt(request.getParameter("id"))).getPreco()+ "<br><br>");
            out.println("</tr>");
            
            out.println("<tr>");
            out.println("Quantidade: "+BancoFake.GetLivro(Integer.parseInt(request.getParameter("id"))).getQuantidade()+ "<br><br>");
            out.println("</tr>");
            
            out.println("<tr>");
            out.println("Data do Cadastro: "+BancoFake.GetLivro(Integer.parseInt(request.getParameter("id"))).getDataCadastro()+ "<br><br>");
            out.println("</tr>");
            
            out.println("</table>");
            
            out.println("<form action='Excluir' method='POST'> <input type='hidden' name='id' value='"+request.getParameter("id")+"'>"
                    + "<input type='submit' value='Confirmar'></form>");
            
            out.println("<br><form action='exibir' method='GET'><input type='submit' value='Voltar'></form>");
            out.println("</div>");
            out.println("</div>");
        %>
    </body>
</html>
