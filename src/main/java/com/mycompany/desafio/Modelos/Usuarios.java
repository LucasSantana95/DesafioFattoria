
package com.mycompany.desafio.Modelos;

public class Usuarios {
    private String usuario;
    private String senha;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    public boolean confirmacaoUsuario(String usuario) {
        return this.usuario.contains(usuario);
    }
    public boolean confirmacaoSenha(String usuario) {
        return this.senha.contains(senha);
    }
    @Override
    public String toString(){
        return "Usuario: " + usuario + " e senha: " + senha;
    }
    
}
