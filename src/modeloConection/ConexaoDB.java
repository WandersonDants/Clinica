/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloConection;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


import javax.swing.JOptionPane;

/**
 *
 * @author wanderson
 */
public class ConexaoDB {
    //modelo para conectar com o DB
    
    public Statement  stn; // realizar pesquisa no banco de dados
    public ResultSet rs; // armazenar o resultado da pesquisa
    private final String driver = "org.postgresql.Driver"; // identifica o serviço 
    private final String caminho = "jdbc:postgresql://localhost:5432/projetoClinica";// qual o caminho locado
    private String usuario = "postgres"; // usuario do db
    private String senha = "7826748"; // senha do Db
    public Connection con; // responsavel pela conexao 
    
    public void conexao(){
        System.setProperty("jdbc.Drivers",driver);
            try {
                con=DriverManager.getConnection(caminho,usuario,senha);
                JOptionPane.showMessageDialog(null,"Conexao efetuada com sucesso!");
            } catch (SQLException ex) {
                Logger.getLogger(ConexaoDB.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Erro ao se conectar com o DB!\n" + ex);
            }
        }
    //metodo para realizar pesquisa no sql
    public void executaSql(String sql){
      
        /* TYPE_SCROLL_INSENSITIVE - realizará uma pesquisa tanto em maiusculo quanto em minusculo
          CONCUR_READ_ONLY - será uma pesquinasa desde do inico quanto para o ultimo item a ser pesquisado*/ 
        try {
            stn = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
            rs = stn.executeQuery(sql);
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Erro ao SQL !\n" + ex);
            Logger.getLogger(ConexaoDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public void desconecta(){
            try {
                con.close();
                //JOptionPane.showMessageDialog(null,"DB Desconectado com sucesso!");
            } catch (SQLException ex) {
                Logger.getLogger(ConexaoDB.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"ERRO AO FECHAR CONEXAO COM DB:\n!" + ex.getMessage());
            }
            }
        }
