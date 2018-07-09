<%-- 
    Document   : ExibirProdutos
    Created on : 07/07/2018, 23:51:09
    Author     : lucas
--%>

<%@page import="java.io.PrintWriter"%>
<%@page import="Biblioteca.BancoFake"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exibir Produtos</title>
        <link rel="stylesheet" type="text/css" href="Estilos.css" />
    </head>
    <body>

        <%
            out.println("<div class='container'>");
            out.println("<div class='box2'>");
            out.println("<h1>Produtos Cadastrados</h1>");
            out.println("<div id='scrolltable'>");
            out.println("<table>");
            out.println("<thead>");
            out.println("<tr>");
            out.println("<th>");
            out.println("Nome");
            out.println("</th>");
            out.println("<th>");
            out.println("Preco");
            out.println("</th>");
            out.println("<th>");
            out.println("Quantidade");
            out.println("</th>");
            out.println("<th>");
            out.println("Data");
            out.println("</th>");
            out.println("</tr>");
            out.println("</thead>");
            out.println("<tbody>");

            for (int i = 0; i < BancoFake.Size(); i++) {

                out.println("<tr>");
                out.println("<td>");
                out.println(BancoFake.GetLivro(i).getNome());
                out.println("</td>");
                out.println("<td>");
                out.println(BancoFake.GetLivro(i).getPreco());
                out.println("</td>");
                out.println("<td>");
                out.println(BancoFake.GetLivro(i).getQuantidade());
                out.println("</td>");
                out.println("<td>");
                out.println(BancoFake.GetLivro(i).getDataCadastro());
                out.println("</td>");
                out.println("<td>");
                out.println("<form action='Excluir' method='GET'><input type='hidden' name='id' value='" + i + "'><input type='submit' class='delete' value='X'></form> <br>");
                out.println("</td>");
                out.println("<td>");
                out.println("<form action='Alterar' method='GET'><input type='hidden' name='id' value='" + i + "'><input type='submit' class='alterar' value='Editar'></form> <br>");
                out.println("</td>");
                
            }
            out.println("<tbody>");
            out.println("</table>");
            out.println("</div>");
            out.println("<form action='Cadastrar' method='GET'><input type='submit' value='+'></form> <br>");
            out.println("</div>");
            out.println("</div>");
        %>
    </body>
</html>
