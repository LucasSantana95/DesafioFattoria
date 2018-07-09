
package Servlets;

import Biblioteca.BancoFake;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lucas
 */
@WebServlet(name = "Excluir", urlPatterns = {"/Excluir","/excluir"})
public class Excluir extends HttpServlet {
        

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            request.getRequestDispatcher("Excluir.jsp").forward(request, response);
            
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int index =Integer.parseInt(request.getParameter("id"));
        BancoFake.DeleteIndex(index);
        request.getRequestDispatcher("ExibirProdutos.jsp").forward(request, response);
    }

}
