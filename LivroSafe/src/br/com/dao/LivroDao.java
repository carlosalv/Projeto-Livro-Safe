/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dao;

import br.com.bean.Livro;
import br.com.connection.ConnectionFactory;
import br.com.visao.Home;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos
 */

public class LivroDao {
    
    public void cadastrarNovo(Livro livro){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO livros(codigo, nome_livro, "
                    + "autor, capa_imagem, ano_edicao,resenha,nota_usuario,data_cadastro) "
                    + "VALUES(?,?,?,?,?,?,?,?)");
            stmt.setInt(1, livro.getCodigoLivro());
            stmt.setString(2, livro.getNome_livro());
            stmt.setString(3, livro.getAutor());
            stmt.setString(4, livro.getImagem_livro());
            stmt.setString(5, livro.getAno_edicao());
            stmt.setString(6, livro.getResenha());
            stmt.setString(7, livro.getNota_usuario());
            stmt.setString(8, livro.getData_cadastro());
           
           
                stmt.executeUpdate();
            
            
            
            
            JOptionPane.showMessageDialog(null, "salvo com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao salvar" + ex);
            Logger.getLogger(LivroDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        
    }
        
    }
    
    public ArrayList<Livro> listar(){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet result = null;
        
        ArrayList<Livro> livros = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM livros ");
            result = stmt.executeQuery();
           
           while(result.next()){
               
               Livro livro = new Livro();
                
               livro.setCodigoLivro(result.getInt("codigo"));
               livro.setNome_livro(result.getString("nome_livro"));
               livro.setAutor(result.getString("autor"));
               livro.setImagem_livro(result.getString("capa_imagem"));
               livro.setAno_edicao(result.getString("ano_edicao"));
               livro.setResenha(result.getString("resenha"));
               livro.setNota_usuario(result.getString("nota_usuario"));
               livro.setData_cadastro(result.getString("data_cadastro"));
               
               livros.add(livro);
           }
               
        } catch (SQLException ex) {
            Logger.getLogger(LivroDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            
            ConnectionFactory.closeConnection(con, stmt, result);
        }
        
        return livros;
    }
    
    
    public void atualizar(Livro livro){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE livros SET codigo = ?, nome_livro = ?, "
                    + "autor = ?, capa_imagem = ?, ano_edicao = ?,resenha = ?,nota_usuario = ?,data_cadastro = ? "
                    + "WHERE codigo = ?");
            stmt.setInt(1, livro.getCodigoLivro());
            stmt.setString(2, livro.getNome_livro());
            stmt.setString(3, livro.getAutor());
            stmt.setString(4, livro.getImagem_livro());
            stmt.setString(5, livro.getAno_edicao());
            stmt.setString(6, livro.getResenha());
            stmt.setString(7, livro.getNota_usuario());
            stmt.setString(8, livro.getData_cadastro());
            stmt.setInt(9, livro.getCodigoLivro());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar" + ex);
            Logger.getLogger(LivroDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        
    }
        
    }
    
    
     public void deletar(Livro livro){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            String title = "EXCLUSÃO DE ITEM DA LISTA";
            
           
            int confirmacao =  JOptionPane.showConfirmDialog(null, "DESEJA REALMENTE EXCLUIR ESTE ITEM?", title, JOptionPane.YES_NO_OPTION);
            if (confirmacao == JOptionPane.YES_OPTION) {
            stmt = con.prepareStatement("DELETE FROM livros WHERE codigo = ? ");
                 
            stmt.setInt(1, livro.getCodigoLivro());
          
            
            stmt.executeUpdate();
           
            }else if (confirmacao == JOptionPane.NO_OPTION){
                
            } 
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir" + ex);
            Logger.getLogger(LivroDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        
    }
        
    }
}
