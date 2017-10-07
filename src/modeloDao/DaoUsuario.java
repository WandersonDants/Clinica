/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modeloBeans.BeansUsuario;

import modeloConection.ConexaoDB;

/**
 *
 * @author wanderson
 */
public class DaoUsuario {
     ConexaoDB conex = new ConexaoDB();
     BeansUsuario mod = new BeansUsuario();
     // METODO RESPONSAVEL DE SALVAR OS DADOS
     public void salvar(BeansUsuario mod){
         conex.conexao();
            try {
                PreparedStatement pst = conex.con.prepareStatement("insert into usuarios(usua_nome,usua_senha,usua_tipo) values (?,?,?)");

                pst.setString(1,mod.getUsuNome());
                pst.setString(2,mod.getUsuSenha());
                pst.setString(3,mod.getUsuTipo());
                pst.execute();
                JOptionPane.showConfirmDialog(null,"Usuários inseridos com SUCESSO");
            } catch (SQLException ex) {
                JOptionPane.showConfirmDialog(null,"Erro ao inserir o Usuário" + ex);

            }
         conex.desconecta(); 
     }
      public BeansUsuario buscaUsuario(BeansUsuario mod){
            conex.conexao();
            conex.executaSql("select *from usuarios where usua_nome like'%" + mod.getUsupesquisar()+"%'");
            try {
                conex.rs.first(); // pegando o primeiro resultado que está no DB

                mod.setUsuCod(conex.rs.getInt("usua_cod"));
                mod.setUsuNome(conex.rs.getString("usua_nome"));
                mod.setUsuSenha(conex.rs.getString("usua_senha"));
                mod.setUsuTipo(conex.rs.getString("usua_tipo"));
               
            } catch (SQLException ex) {

                JOptionPane.showConfirmDialog(null,"O usuário não Cadastrado!" + ex);
            }
            conex.desconecta();
             return mod;
         }   
      public void Alterar(BeansUsuario mod){
            conex.conexao();
           try {
               PreparedStatement pst = conex.con.prepareStatement("update usuarios set usua_nome =?,usua_senha =?,usua_tipo =? where usua_cod =?");
               pst.setString(1, mod.getUsuNome());
               pst.setString(2, mod.getUsuSenha());
               pst.setString(3, mod.getUsuTipo());
               pst.setInt(4, mod.getUsuCod());
               pst.execute();
                JOptionPane.showConfirmDialog(null,"Usuário alterado com sucesso!");
           } catch (SQLException ex) {
               JOptionPane.showConfirmDialog(null,"Erro ao Alterar o usuário! n/" + ex);
           }

           conex.desconecta();
        }
      public void Excluir(BeansUsuario mod){
          conex.conexao();
          try {
       
             PreparedStatement pst = conex.con.prepareStatement("Delete from usuarios where usua_cod =?");
             pst.setInt(1,mod.getUsuCod());
             pst.execute();
             JOptionPane.showMessageDialog(null,"Usuário excluido com sucesso!");
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Erro ao Excluir o usuário!" + ex);
             Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, null, ex);
         }
           conex.desconecta();
      }
     
}
