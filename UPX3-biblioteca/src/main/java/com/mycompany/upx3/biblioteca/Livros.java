package com.mycompany.upx3.biblioteca;

/**
 *
 * @author regis
 */
public abstract class Livros {
    int ID;
    String nome;
    String autor;
    String genero;
    int qtdPaginas;
    
    public Livros()    {
    }
    public Livros(int ID, String nome, String autor, String genero, int qtdPaginas) {
        this.ID = ID;
        this.nome = nome;
        this.autor = autor;
        this.genero = genero;
        this.qtdPaginas = qtdPaginas;
    
    }
    
}
