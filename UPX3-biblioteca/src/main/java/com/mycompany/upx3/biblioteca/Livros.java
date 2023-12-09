package com.mycompany.upx3.biblioteca;

/**
 *
 * @author regis
 */
public class Livros {
    
    /**
     * Iniciando as variaveis necessarias
     */
    private int id;
    private String nome;
    private String autor;
    private String genero;
    private int qtdPaginas;
    private int disponiveis;
        
   public Livros(){}
   public Livros(int id, String nome, String autor, String genero, int qtdPaginas, int disponiveis) {
       this.id = id;
       this.nome = nome;
       this.autor = autor;
       this.genero = genero;
       this.qtdPaginas = qtdPaginas;
       this.disponiveis = disponiveis;
   }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getQtdPaginas() {
        return qtdPaginas;
    }

    public void setQtdPaginas(int qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }

    public int getDisponiveis() {
        return disponiveis;
    }

    public void setDisponiveis(int disponiveis) {
        this.disponiveis = disponiveis;
    }
   
}
