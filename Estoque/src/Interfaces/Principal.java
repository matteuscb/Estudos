/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        super("Controle de Estoque");
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Painel = new javax.swing.JDesktopPane();
        JMenu = new javax.swing.JMenuBar();
        jMEstoque = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMCliente = new javax.swing.JMenu();
        jMCadastrar_Cliente = new javax.swing.JMenuItem();
        jMIPesquisar_Cliente = new javax.swing.JMenuItem();
        jMVenda = new javax.swing.JMenu();
        jMIVenda = new javax.swing.JMenuItem();
        jMIRomaneio = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMEstoque.setText("Estoque");
        jMEstoque.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItem1.setText("Cadastrar Produto");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMEstoque.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItem2.setText("Pesquisa - Produtos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMEstoque.add(jMenuItem2);

        JMenu.add(jMEstoque);

        jMCliente.setText("Cliente");
        jMCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMCadastrar_Cliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMCadastrar_Cliente.setText("Cadastrar Cliente");
        jMCadastrar_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMCadastrar_ClienteActionPerformed(evt);
            }
        });
        jMCliente.add(jMCadastrar_Cliente);

        jMIPesquisar_Cliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMIPesquisar_Cliente.setText("Pesquisar Cliente");
        jMIPesquisar_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIPesquisar_ClienteActionPerformed(evt);
            }
        });
        jMCliente.add(jMIPesquisar_Cliente);

        JMenu.add(jMCliente);

        jMVenda.setText("Venda");
        jMVenda.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMIVenda.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMIVenda.setText("Venda Produto");
        jMIVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIVendaActionPerformed(evt);
            }
        });
        jMVenda.add(jMIVenda);

        jMIRomaneio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMIRomaneio.setText("Pesquisar Romaneio");
        jMIRomaneio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIRomaneioActionPerformed(evt);
            }
        });
        jMVenda.add(jMIRomaneio);

        JMenu.add(jMVenda);

        setJMenuBar(JMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel, javax.swing.GroupLayout.DEFAULT_SIZE, 1366, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel, javax.swing.GroupLayout.DEFAULT_SIZE, 741, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Cadastro_Produto cad = new Cadastro_Produto();
        Painel.add(cad);
        cad.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMCadastrar_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMCadastrar_ClienteActionPerformed

        try {
            Cadastro_Cliente cad = new Cadastro_Cliente();
            Painel.add(cad);
            cad.setVisible(true);
        } catch (ParseException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMCadastrar_ClienteActionPerformed

    private void jMIVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIVendaActionPerformed
        Venda_Produto ven = new Venda_Produto();
        Painel.add(ven);
        ven.setVisible(true);
    }//GEN-LAST:event_jMIVendaActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Pesquisa_Produto pes = new Pesquisa_Produto();
        Painel.add(pes);
        pes.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMIPesquisar_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIPesquisar_ClienteActionPerformed
        Pesquisa_Cliente pes = new Pesquisa_Cliente();
        Painel.add(pes);
        pes.setVisible(true);
    }//GEN-LAST:event_jMIPesquisar_ClienteActionPerformed

    private void jMIRomaneioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIRomaneioActionPerformed
        Pesquisa_Romaneio pes = new Pesquisa_Romaneio();
        Painel.add(pes);
        pes.setVisible(true);
    }//GEN-LAST:event_jMIRomaneioActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar JMenu;
    private javax.swing.JDesktopPane Painel;
    private javax.swing.JMenuItem jMCadastrar_Cliente;
    private javax.swing.JMenu jMCliente;
    private javax.swing.JMenu jMEstoque;
    private javax.swing.JMenuItem jMIPesquisar_Cliente;
    private javax.swing.JMenuItem jMIRomaneio;
    private javax.swing.JMenuItem jMIVenda;
    private javax.swing.JMenu jMVenda;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    // End of variables declaration//GEN-END:variables
}
