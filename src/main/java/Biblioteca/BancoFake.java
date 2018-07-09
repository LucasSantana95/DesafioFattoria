package Biblioteca;


import com.mycompany.desafio.Modelos.Livro;
import com.mycompany.desafio.Modelos.Usuarios;
import java.util.List;
import java.util.ArrayList;


public class BancoFake {
    private static List<Livro> LivrosDB;
    private static List<Usuarios> UsuariosDB;
    public BancoFake()
    {
        LivrosDB = new ArrayList();
        UsuariosDB = new ArrayList();
    }
    public static void Add(Livro livro)
    {
       LivrosDB.add(livro);
    }
    public static void Alterar(int index,Livro livro)
    {
       LivrosDB.add(index,livro);
    }
    public static void Delete(Livro livro)
    {
        LivrosDB.remove(livro);
    }
        public static void DeleteIndex(int i)
    {
        LivrosDB.remove(i);
    }
    public static int Size()
    {
        return LivrosDB.size(); 
    }
    public static Livro GetLivro(int i)
    {
        return LivrosDB.get(i);
    }
    
    
    public static void AddUsuario(Usuarios usuario)
    {
       UsuariosDB.add(usuario);
    }
    public static Usuarios GetUsuario(int i)
    {
       return UsuariosDB.get(i);
    }
    public static int SizeUsuarios()
    {
        return UsuariosDB.size(); 
    }
}
