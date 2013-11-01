/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import DAO.DAO;
import Modelo.Nome;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author matteus
 */
public class Pesquisa_Nome extends javax.swing.JFrame {

    /**
     * Creates new form Pesquisa_Nome
     */
    DAO<Modelo.Nome> dao = new DAO<Modelo.Nome>(Modelo.Nome.class);
    DefaultTableModel tmNome = new DefaultTableModel(null, new String[]{"ID", "Nome"});
    List<Nome> nomes;

    public Pesquisa_Nome() {
        super("HIBERNATE");
        this.setResizable(false);
        initComponents();
        setLocationRelativeTo(null);
        tabela.setRowHeight(23);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLNome = new javax.swing.JLabel();
        jBAlterar = new javax.swing.JButton();
        jBDeletar = new javax.swing.JButton();
        jBLimpa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jTNome = new javax.swing.JTextField();
        jBVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLNome.setText("Nome:");

        jBAlterar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBAlterar.setText("Alterar");
        jBAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAlterarActionPerformed(evt);
            }
        });

        jBDeletar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBDeletar.setText("Deletar");
        jBDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDeletarActionPerformed(evt);
            }
        });

        jBLimpa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBLimpa.setText("Limpar");
        jBLimpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpaActionPerformed(evt);
            }
        });

        tabela.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tabela.setModel(tmNome);
        jScrollPane1.setViewportView(tabela);

        jTNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNomeActionPerformed(evt);
            }
        });
        jTNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTNomeKeyTyped(evt);
            }
        });

        jBVoltar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBVoltar.setText("Voltar");
        jBVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLNome)
                        .addGap(18, 18, 18)
                        .addComponent(jTNome))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBLimpa)
                    .addComponent(jBDeletar)
                    .addComponent(jBAlterar))
                .addGap(40, 40, 40))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBVoltar)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBAlterar, jBDeletar, jBLimpa});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNome)
                    .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(jBDeletar)
                        .addGap(18, 18, 18)
                        .addComponent(jBLimpa)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jBVoltar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNomeActionPerformed
        while (tmNome.getRowCount() > 0) {
            tmNome.removeRow(0);
        }

        nomes = dao.buscaPorNome(jTNome.getText());

        for (int i = 0; i < nomes.size(); i++) {
            tmNome.addRow(new String[]{null, null, null, null});
            tmNome.setValueAt(nomes.get(i).getId(), i, 0);
            tmNome.setValueAt(nomes.get(i).getNome(), i, 1);
        }
    }//GEN-LAST:event_jTNomeActionPerformed

    private void jTNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNomeKeyTyped
        while (tmNome.getRowCount() > 0) {
            tmNome.removeRow(0);
        }

        nomes = dao.buscaPorNome(jTNome.getText());

        for (int i = 0; i < nomes.size(); i++) {
            tmNome.addRow(new String[]{null, null, null, null});
            tmNome.setValueAt(nomes.get(i).getId(), i, 0);
            tmNome.setValueAt(nomes.get(i).getNome(), i, 1);
        }
    }//GEN-LAST:event_jTNomeKeyTyped

    private void jBDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDeletarActionPerformed
        dao.remover(nomes.get(tabela.getSelectedRow()));
        JOptionPane.showMessageDialog(null, "Nome Deletado.");
    }//GEN-LAST:event_jBDeletarActionPerformed

    private void jBLimpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpaActionPerformed
        jTNome.setText("");
        nomes = null;
        dao = new DAO<Modelo.Nome>(Modelo.Nome.class);
        while (tmNome.getRowCount() > 0) {
            tmNome.removeRow(0);
        }
    }//GEN-LAST:event_jBLimpaActionPerformed

    private void jBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlterarActionPerformed
        if (tabela.getSelectedRowCount() < 1) {
            JOptionPane.showMessageDialog(null, "Selecione um cadastro a ser alterado.");
        } else {
            Alterar_Nome an = new Alterar_Nome(nomes.get(tabela.getSelectedRow()));
            an.setVisible(true);
        }
    }//GEN-LAST:event_jBAlterarActionPerformed

    private void jBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVoltarActionPerformed
        Inicio in = new Inicio();
        in.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jBVoltarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAlterar;
    private javax.swing.JButton jBDeletar;
    private javax.swing.JButton jBLimpa;
    private javax.swing.JButton jBVoltar;
    private javax.swing.JLabel jLNome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTNome;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
