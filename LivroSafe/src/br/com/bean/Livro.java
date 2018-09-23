/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bean;

import java.sql.Date;

/**
 *
 * @author Carlos
 */
public class Livro {
    
    private int codigoLivro;
    private String nome_livro;
    private String autor;
    private String imagem_livro;
    private String ano_edicao;
    private String nota_usuario;
    private String resenha;
    private String data_cadastro;
    

    public int getCodigoLivro() {
        return codigoLivro;
    }

    public void setCodigoLivro(int codigoLivro) {
        this.codigoLivro = codigoLivro;
    }

    public String getNome_livro() {
        return nome_livro;
    }

    public void setNome_livro(String nome_livro) {
        this.nome_livro = nome_livro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getImagem_livro() {
        return imagem_livro;
    }

    public void setImagem_livro(String imagem_livro) {
        this.imagem_livro = imagem_livro;
    }

    public String getAno_edicao() {
        return ano_edicao;
    }

    public void setAno_edicao(String ano_edicao) {
        this.ano_edicao = ano_edicao;
    }

    public String getNota_usuario() {
        return nota_usuario;
    }

    public void setNota_usuario(String nota_usuario) {
        this.nota_usuario = nota_usuario;
    }

    public String getResenha() {
        return resenha;
    }

    public void setResenha(String resenha) {
        this.resenha = resenha;
    }

    public String getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(String data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

   
    
    
    
}
