/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author allan
 */
public class ConnectionFactory {
    public Connection getConexao(){
        Connection connection = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            String serverName = "localhost:3306";
            String mydatabase = "aps";
            String url = "jdbc:mysql://" + serverName + "/" + mydatabase + "?autoReconnect=true&useSSL=false";
            String username = "root";
            String password = "a12345a";
            
            connection = DriverManager.getConnection(url, username, password);
            
            return connection;
            
        }catch(Exception erro){
            throw new RuntimeException("Erro 1:" + erro);
        }
    }
}