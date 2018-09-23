/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dao;



import br.com.connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos
 */
public class UsuarioDao {
    
    
    public boolean logar(String nome_usuario, String senha){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet result = null;
        boolean logado = false;
        
       
        
        try {
            stmt = con.prepareStatement("SELECT * FROM usuario WHERE nome_usuario = ? and senha = ?");
           stmt.setString(1, nome_usuario);
           stmt.setString(2, senha);
           result = stmt.executeQuery();
           
           if(result.next()){
               
               logado = true;
               
              
               
               
           }
               
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            
            ConnectionFactory.closeConnection(con, stmt, result);
        }
        
        return logado;
    }
    
}
