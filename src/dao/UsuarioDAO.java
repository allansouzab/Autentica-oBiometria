/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import model.Sessao;
import model.Usuario;

/**
 *
 * @author allan
 */
public class UsuarioDAO {
    
    private Connection conn;
    private PreparedStatement stmt;
    private Statement st;
    private ResultSet rs;
    
    public UsuarioDAO(){
        conn = new ConnectionFactory().getConexao();
    }
    
    
    public boolean inserir (Usuario usuario){
        String sql = "INSERT INTO usuario (usu_nome, usu_login, usu_senha, usu_nivel, usu_digital) VALUES (?, ?, ?, ?, ?)";
        try{
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, usuario.getUsu_nome());
            stmt.setString(2, usuario.getUsu_login());
            stmt.setString(3, usuario.getUsu_senha());
            stmt.setString(4, usuario.getUsu_nivel());
            stmt.setString(5, usuario.getUsu_digital());
            stmt.execute();
            stmt.close();
            return true;
        }catch(Exception erro){
            throw new RuntimeException("Erro 2:" + erro);
        }
    }
    
    public void alterar_senha (Usuario usuario){
        String sql = "UPDATE usuario SET usu_nome = ?, usu_senha = ?, usu_nivel = ? WHERE usu_login = ?";
        Sessao sessao = Sessao.getInstance();
        
        try{
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, usuario.getUsu_nome());
            stmt.setString(2, usuario.getUsu_senha());
            stmt.setString(3, usuario.getUsu_nivel());
            stmt.setString(4, sessao.getLogin());
            stmt.execute();
            stmt.close();
        }catch(Exception erro){
            throw new RuntimeException("Erro 3:" + erro);
        }
    }
    
    public void alterar (Usuario usuario){
        String sql = "UPDATE usuario SET usu_nome = ?, usu_nivel = ? WHERE usu_login = ?";
        Sessao sessao = Sessao.getInstance();
        
        try{
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, usuario.getUsu_nome());
            stmt.setString(2, usuario.getUsu_nivel());
            stmt.setString(3, sessao.getLogin());
            stmt.execute();
            stmt.close();
        }catch(Exception erro){
            throw new RuntimeException("Erro 3:" + erro);
        }
    }
    
    public void excluir (String Cpf){
        String sql = "DELETE FROM usuario WHERE usu_login = " + "'" + Cpf + "'" + ";";
        
        try{
            st = conn.createStatement();
            st.execute(sql);
            st.close();
        }catch(Exception erro){
            throw new RuntimeException("Erro 4:" + erro);
        }
    }
    
    public boolean verificarUsuario(String login, String senha){
        String sql = "SELECT usu_nome, usu_login, usu_nivel, usu_digital FROM usuario WHERE usu_login = " + "'" + login + "'" + "AND usu_senha = " + "'" + senha + "'" + ";";
        try{
            
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            
            if(rs.next()){
                Sessao sessao = Sessao.getInstance();
                sessao.setNome(rs.getString("usu_nome"));
                sessao.setLogin(rs.getString("usu_login"));
                sessao.setNivel(rs.getString("usu_nivel"));
                sessao.setDigital(rs.getString("usu_digital"));
                
                return true;
            }
            else{
                return false;
            }
            
        }catch (Exception erro){
            throw new RuntimeException("Erro 10:" + erro);
        }
    }
    
}
