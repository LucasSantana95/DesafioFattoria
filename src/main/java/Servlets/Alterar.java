package Servlets;

import Biblioteca.BancoFake;
import com.mycompany.desafio.Modelos.Livro;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Alterar", urlPatterns = {"/Alterar","/alterar"})
public class Alterar extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("Alterar.jsp").forward(request, response);
        String index = request.getParameter("id");
        request.setAttribute("id", index);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            Livro livro = new Livro();
            String nome = request.getParameter("txtNome");
            String dataCadastro = request.getParameter("txtData");

            String regex = "\\s*";
            if (nome.matches(regex) || dataCadastro.matches(regex)) {
                request.setAttribute("i", regex);
                request.getRequestDispatcher("Alterar.jsp").forward(request, response);
            } 
            else {
                double preco = Double.parseDouble(request.getParameter("txtPreco"));
                int quantidade = Integer.parseInt(request.getParameter("txtQuantidade"));
                livro.setNome(nome);
                livro.setPreco(preco);
                livro.setQuantidade(quantidade);
                livro.setDataCadastro(dataCadastro);
                int index = Integer.parseInt(request.getParameter("id"));
                BancoFake.DeleteIndex(index);
                BancoFake.Alterar(index, livro);
                request.getRequestDispatcher("ExibirProdutos.jsp").forward(request, response);
            }
        } 
        catch (NullPointerException i) {
            request.setAttribute("i", i);
            request.getRequestDispatcher("Alterar.jsp").forward(request, response);
        } 
        catch (NumberFormatException e) {
            request.setAttribute("e", e);
            request.getRequestDispatcher("Alterar.jsp").forward(request, response);
        }
    }
}
