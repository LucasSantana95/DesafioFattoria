
package com.mycompany.desafio.Modelos;

public class Livro {
    private String nome;
    private double preco;
    private int quantidade;
    private String dataCadastro;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    
    @Override
    public String toString(){
        return "Nome: " + nome + " Preço: " + preco + " Quantidade: " + quantidade + " Data do cadastro: " + dataCadastro;
    }
}
