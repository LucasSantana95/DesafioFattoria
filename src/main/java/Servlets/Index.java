
package Servlets;

import Biblioteca.BancoFake;
import com.mycompany.desafio.Modelos.Livro;
import com.mycompany.desafio.Modelos.Usuarios;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Index", urlPatterns = {"/Index","/index"})
public class Index extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("index.html").forward(request, response);
    }
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        BancoFake BancoFake = new BancoFake();
        
        //Cadastro de algumas informações para fim de demonstração das funcionalidades
        Usuarios usuario = new Usuarios();
        usuario.setUsuario("admin");
        usuario.setSenha("admin");
        BancoFake.AddUsuario(usuario);
 
        Livro livro = new Livro();
        livro.setNome("A batalha do Apocalipse");
        livro.setPreco(72.5);
        livro.setQuantidade(5);
        livro.setDataCadastro("08/07/2018");
        BancoFake.Add(livro);
        
        Livro livro2 = new Livro();
        livro2.setNome("Trono de Vidro");
        livro2.setPreco(49.9);
        livro2.setQuantidade(5);
        livro2.setDataCadastro("08/07/2018");
        BancoFake.Add(livro2);
        
        String usuarioLogin = request.getParameter("txtUsuario");
        String senhaLogin = request.getParameter("txtSenha");
        for(int i=0;i < BancoFake.SizeUsuarios();i++){
            if(BancoFake.GetUsuario(i).getUsuario().equals(usuarioLogin)){
                if(BancoFake.GetUsuario(i).getSenha().equals(senhaLogin)){

                    request.getRequestDispatcher("ExibirProdutos.jsp").forward(request, response);
                }
                else{
                    request.getRequestDispatcher("AcessoNegado.jsp").forward(request, response);
                }
            }
            else{
                request.getRequestDispatcher("AcessoNegado.jsp").forward(request, response);
            }
        }
    }

}
