/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;

import modeloConection.ConexaoDB;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modeloBeans.BeansMedico;

/**
 *
 * @author wanderson
 * Modelo para realizar alteraçoes no DB como inserir,excluir,alterar,deletar;
 */
public class DaoMedico {
     ConexaoDB conex = new ConexaoDB();
     BeansMedico mod = new BeansMedico();
     // METODO RESPONSAVEL DE SALVAR OS DADOS
     public void salvar(BeansMedico mod){
         conex.conexao();
            try {
                PreparedStatement pst = conex.con.prepareStatement("insert into medicos(nome_medicos,especialidade,crm) values (?,?,?)");

                pst.setString(1,mod.getNome_medicos());
                pst.setString(2,mod.getEspecializacao());
                pst.setInt(3,mod.getCrm());
                pst.execute();
                JOptionPane.showConfirmDialog(null,"DADOS INSERIDOS COM SUCESSO");
            } catch (SQLException ex) {
                JOptionPane.showConfirmDialog(null,"DADOS INSERIDOS COM SUCESSO" + ex);

            }
         conex.desconecta(); 
     }
      public BeansMedico buscaMedico(BeansMedico mod){
            conex.conexao();
            conex.executaSql("select *from medicos where nome_medicos like'%" + mod.getPesquisa()+"%'");
            try {
                conex.rs.first(); // pegando o primeiro resultado que está no DB

                mod.setCodigo(conex.rs.getInt("cod_medico"));
                mod.setNome_medicos(conex.rs.getString("nome_medicos"));
                mod.setEspecializacao(conex.rs.getString("especialidade"));
                mod.setCrm(conex.rs.getInt("crm"));
            } catch (SQLException ex) {

                JOptionPane.showConfirmDialog(null,"Medico não Cadastrado!");
            }
            conex.desconecta();
             return mod;
         }   
      
      public void editar(BeansMedico mod){
            conex.conexao();
           try {
               PreparedStatement pst = conex.con.prepareStatement("update medicos set nome_medicos =?,especialidade =?,crm =? where cod_medico =?");
               pst.setString(1, mod.getNome_medicos());
               pst.setString(2, mod.getEspecializacao());
               pst.setInt(3, mod.getCrm());
               pst.setInt(4, mod.getCodigo());
               pst.execute();
                JOptionPane.showConfirmDialog(null,"Dados alterados com sucesso!");
           } catch (SQLException ex) {
               Logger.getLogger(DaoMedico.class.getName()).log(Level.SEVERE, null, ex);
               JOptionPane.showConfirmDialog(null,"Erro ao Editar o Médico! n/" + ex);
           }

           conex.desconecta();
        }

      public void Excluir(BeansMedico mod){
        conex.conexao();
           try {
               PreparedStatement pst = conex.con.prepareStatement("delete from medicos where cod_medico=?");
               pst.setInt(1, mod.getCodigo());
               pst.execute();
               JOptionPane.showMessageDialog(null,"Dados excluido com Sucesso");
           } catch (SQLException ex) {
               Logger.getLogger(DaoMedico.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,"Erro ao Excluir o médico! n/" + ex);
           }
           conex.desconecta();

          } 
}

   

