/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos
 */
public class ConnectionFactory {
    
    private static final String DRIVER =  "org.postgresql.Driver";
    private static final String URL = "jdbc:postgresql://localhost:5432/bd_livros";
    private static final String USER = "postgres";
    private static final String PASS ="postgres";
    
    // VÊ O ESTADO DA CONEXÃO E FAZ O ACESSO VIA PARAMETROS
    public static Connection getConnection(){
        
        try {
            Class.forName(DRIVER);
              return DriverManager.getConnection(URL, USER, PASS);
            
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexão", ex);
        }
        
        
    }
    
      // FECHA A CONEXÃO
    
    public static void closeConnection(Connection con){
        
            try {
                if(con != null){
                con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
           // FAZ A 1º SOBRECARGA 
           
    public static void closeConnection(Connection con, PreparedStatement stmt){
        
        closeConnection(con);
         try {
                if(stmt != null){
                stmt.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }
    // FAZ A 2º SOBRECARGA 
    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet result){
        
        closeConnection(con, stmt);
        
        try {
                if(result != null){
                result.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }
        
    }
    
    

