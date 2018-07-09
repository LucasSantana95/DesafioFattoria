
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Biblioteca.BancoFake;
import com.mycompany.desafio.Modelos.Livro;
import static java.lang.System.out;

@WebServlet(name = "Cadastrar", urlPatterns = {"/cadastrar","/Cadastrar"})
public class Cadastrar extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("Cadastro.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
            Livro livro = new Livro();
            String nome = request.getParameter("txtNome");
            String dataCadastro = request.getParameter("txtData");

            String regex = "\\s*";
            if(nome.matches(regex) || dataCadastro.matches(regex) ){
                request.setAttribute("i", regex);
                request.getRequestDispatcher("Cadastro.jsp").forward(request, response);
            }
            else{
                double preco = Double.parseDouble(request.getParameter("txtPreco"));
                int quantidade = Integer.parseInt(request.getParameter("txtQuantidade"));
                livro.setNome(nome);
                livro.setPreco(preco);
                livro.setQuantidade(quantidade);
                livro.setDataCadastro(dataCadastro);
                BancoFake.Add(livro);
                request.getRequestDispatcher("ExibirProdutos.jsp").forward(request, response);  
            }
            
        }
        catch(NullPointerException i){
            request.setAttribute("i", i);
            request.getRequestDispatcher("Cadastro.jsp").forward(request, response);
        }
        catch(NumberFormatException e){
            request.setAttribute("e", e);
            request.getRequestDispatcher("Cadastro.jsp").forward(request, response);
        }

        
    }

}
