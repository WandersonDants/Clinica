/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import modeloConection.ConexaoDB;

/**
 *
 * @author wanderson
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    
    ConexaoDB connecta = new ConexaoDB();
    
    public TelaPrincipal() {
        initComponents();
        connecta.conexao();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrameBemvindo = new javax.swing.JInternalFrame();
        jPanelInterno = new javax.swing.JPanel();
        jLabelCadastros = new javax.swing.JLabel();
        jButtonMedicos = new javax.swing.JButton();
        jButtonPacientes = new javax.swing.JButton();
        jButtonEnfermeiros = new javax.swing.JButton();
        jLabelAgendar = new javax.swing.JLabel();
        jButtonAgendamento = new javax.swing.JButton();
        jLabelPainelFundo = new javax.swing.JLabel();
        jLabelSGC = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabelTelaPrincipal = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastros = new javax.swing.JMenu();
        jMenuItemMedicos = new javax.swing.JMenuItem();
        jMenuItemPacientes = new javax.swing.JMenuItem();
        jMenuItemEnfermeiros = new javax.swing.JMenuItem();
        jMenuItemUsuarios = new javax.swing.JMenuItem();
        jMenuRelatorios = new javax.swing.JMenu();
        jMenuFerramentas = new javax.swing.JMenu();
        jMenuItemTelaBenVindo = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jInternalFrameBemvindo.setTitle("Bem-Vindo");
        jInternalFrameBemvindo.setVisible(true);
        jInternalFrameBemvindo.getContentPane().setLayout(null);

        jPanelInterno.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelInterno.setLayout(null);

        jLabelCadastros.setText("Cadastros:");
        jPanelInterno.add(jLabelCadastros);
        jLabelCadastros.setBounds(160, -20, 460, 70);

        jButtonMedicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/CadMedicos.png"))); // NOI18N
        jButtonMedicos.setToolTipText("Medicos");
        jButtonMedicos.setPreferredSize(new java.awt.Dimension(73, 23));
        jButtonMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMedicosActionPerformed(evt);
            }
        });
        jPanelInterno.add(jButtonMedicos);
        jButtonMedicos.setBounds(20, 30, 110, 110);

        jButtonPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cadPacientes.png"))); // NOI18N
        jButtonPacientes.setToolTipText("Pacientes");
        jButtonPacientes.setPreferredSize(new java.awt.Dimension(73, 23));
        jPanelInterno.add(jButtonPacientes);
        jButtonPacientes.setBounds(280, 30, 100, 110);

        jButtonEnfermeiros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon-infermeira.png"))); // NOI18N
        jButtonEnfermeiros.setText("jButton3");
        jButtonEnfermeiros.setToolTipText("Enfermeiros");
        jButtonEnfermeiros.setPreferredSize(new java.awt.Dimension(73, 23));
        jPanelInterno.add(jButtonEnfermeiros);
        jButtonEnfermeiros.setBounds(150, 30, 100, 110);

        jLabelAgendar.setText("Agendamentos:");
        jPanelInterno.add(jLabelAgendar);
        jLabelAgendar.setBounds(160, 180, 100, 14);

        jButtonAgendamento.setIcon(new javax.swing.ImageIcon("C:\\Users\\wanderson\\Documents\\NetBeansProjects\\Clinica\\src\\imagens\\Agenda.png")); // NOI18N
        jButtonAgendamento.setToolTipText("Agendar");
        jPanelInterno.add(jButtonAgendamento);
        jButtonAgendamento.setBounds(280, 160, 110, 110);

        jLabelPainelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/internalframe.png"))); // NOI18N
        jPanelInterno.add(jLabelPainelFundo);
        jLabelPainelFundo.setBounds(0, 0, 1030, 410);

        jInternalFrameBemvindo.getContentPane().add(jPanelInterno);
        jPanelInterno.setBounds(0, 40, 1030, 270);

        jLabelSGC.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelSGC.setText("Sistema de Gerenciamento de Cadastros");
        jInternalFrameBemvindo.getContentPane().add(jLabelSGC);
        jLabelSGC.setBounds(360, 10, 460, 24);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\wanderson\\Documents\\NetBeansProjects\\Clinica\\src\\imagens\\fundo_telaprincipal.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        jInternalFrameBemvindo.getContentPane().add(jLabel1);
        jLabel1.setBounds(-10, 310, 1040, 150);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/exit.png"))); // NOI18N
        jButton1.setToolTipText("Fechar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jInternalFrameBemvindo.getContentPane().add(jButton1);
        jButton1.setBounds(890, 10, 40, 30);

        getContentPane().add(jInternalFrameBemvindo);
        jInternalFrameBemvindo.setBounds(20, 20, 950, 400);

        jLabelTelaPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo_telaprincipal.jpg"))); // NOI18N
        getContentPane().add(jLabelTelaPrincipal);
        jLabelTelaPrincipal.setBounds(0, 0, 1060, 490);

        jMenuCadastros.setText("Cadastros");

        jMenuItemMedicos.setText("Medicos");
        jMenuItemMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMedicosActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemMedicos);

        jMenuItemPacientes.setText("Pacientes");
        jMenuCadastros.add(jMenuItemPacientes);

        jMenuItemEnfermeiros.setText("Enfermeiros");
        jMenuCadastros.add(jMenuItemEnfermeiros);

        jMenuItemUsuarios.setText("Usuarios");
        jMenuCadastros.add(jMenuItemUsuarios);

        jMenuBar1.add(jMenuCadastros);

        jMenuRelatorios.setText("Relatorios");
        jMenuBar1.add(jMenuRelatorios);

        jMenuFerramentas.setText("Ferramentas");

        jMenuItemTelaBenVindo.setText("Tela Bem-Vindo");
        jMenuItemTelaBenVindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTelaBenVindoActionPerformed(evt);
            }
        });
        jMenuFerramentas.add(jMenuItemTelaBenVindo);

        jMenuBar1.add(jMenuFerramentas);

        jMenuSair.setText("Sair");

        jMenuItemSair.setText("Sair");
        jMenuItemSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItemSairMouseClicked(evt);
            }
        });
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuSair.add(jMenuItemSair);

        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jInternalFrameBemvindo.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
        
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuItemTelaBenVindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTelaBenVindoActionPerformed
        // TODO add your handling code here:
        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItemTelaBenVindoActionPerformed

    private void jButtonMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMedicosActionPerformed
        // TODO add your handling code here:
        TelaMedico tela = new TelaMedico();
        tela.setVisible(true);

    }//GEN-LAST:event_jButtonMedicosActionPerformed

    private void jMenuItemMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMedicosActionPerformed
        // TODO add your handling code here:
        TelaMedico tela = new TelaMedico();
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItemMedicosActionPerformed

    private void jMenuItemSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItemSairMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemSairMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAgendamento;
    private javax.swing.JButton jButtonEnfermeiros;
    private javax.swing.JButton jButtonMedicos;
    private javax.swing.JButton jButtonPacientes;
    private javax.swing.JInternalFrame jInternalFrameBemvindo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAgendar;
    private javax.swing.JLabel jLabelCadastros;
    private javax.swing.JLabel jLabelPainelFundo;
    private javax.swing.JLabel jLabelSGC;
    private javax.swing.JLabel jLabelTelaPrincipal;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastros;
    private javax.swing.JMenu jMenuFerramentas;
    private javax.swing.JMenuItem jMenuItemEnfermeiros;
    private javax.swing.JMenuItem jMenuItemMedicos;
    private javax.swing.JMenuItem jMenuItemPacientes;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemTelaBenVindo;
    private javax.swing.JMenuItem jMenuItemUsuarios;
    private javax.swing.JMenu jMenuRelatorios;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JPanel jPanelInterno;
    // End of variables declaration//GEN-END:variables
}
