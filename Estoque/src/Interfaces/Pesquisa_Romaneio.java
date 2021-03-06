/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import DAO.ClienteDAO;
import DAO.VendaDAO;
import Jasper.JasperReport;
import Modelo.Cliente;
import Modelo.Venda;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;

/**
 *
 * @author user
 */
public class Pesquisa_Romaneio extends javax.swing.JInternalFrame {

    /**
     * Creates new form Pesquisa_Romaneio
     */
    DefaultTableModel tmCliente = new DefaultTableModel(null, new String[]{"Nome", "RG", "Endereço", "Telefone", "Nascimento"});
    List<Cliente> clientes;
    ListSelectionModel lsmCliente;
    DefaultTableModel tmVenda = new DefaultTableModel(null, new String[]{"Código", "Cliente", "Produto", "Quantidade", "Valor Produto", "Total da Compra", "Data"});
    List<Venda> vendas;
    ListSelectionModel lsmVenda;

    public Pesquisa_Romaneio() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLCliente = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaVenda = new javax.swing.JTable();
        jTCliente = new javax.swing.JTextField();
        jBPesquisar = new javax.swing.JButton();
        jBRomaneio = new javax.swing.JButton();
        jLCabecalho = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelaCliente = new javax.swing.JTable();
        jLVenda = new javax.swing.JLabel();

        setClosable(true);

        jLCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCliente.setText("Cliente:");

        TabelaVenda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TabelaVenda.setModel(tmVenda);
        jScrollPane1.setViewportView(TabelaVenda);

        jTCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jBPesquisar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBPesquisar.setText("Pesquisar");
        jBPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarActionPerformed(evt);
            }
        });

        jBRomaneio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBRomaneio.setText("Gerar Romaneio");
        jBRomaneio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRomaneioActionPerformed(evt);
            }
        });

        jLCabecalho.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLCabecalho.setText("Pesquisa - Romaneio");

        TabelaCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TabelaCliente.setModel(tmCliente);
        TabelaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaClienteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TabelaCliente);

        jLVenda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLVenda.setText("Venda:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLCabecalho)
                .addGap(176, 176, 176))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLVenda)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBPesquisar))
                            .addComponent(jBRomaneio))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLCabecalho)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBPesquisar)
                    .addComponent(jTCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCliente))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLVenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBRomaneio)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarActionPerformed
        try {
            ClienteDAO cdao = new ClienteDAO();
            clientes = cdao.listarNome("%" + jTCliente.getText() + "%");
            String endereco;

            while (tmCliente.getRowCount() > 0) {
                tmCliente.removeRow(0);
            }

            String[] linha = new String[]{null, null, null, null};
            for (int i = 0; i < clientes.size(); i++) {
                endereco = clientes.get(i).getRua() + " " + clientes.get(i).getNumero() + ", " + clientes.get(i).getBairro() + " - " + clientes.get(i).getCidade();
                tmCliente.addRow(linha);
                tmCliente.setValueAt(clientes.get(i).getNome(), i, 0);
                tmCliente.setValueAt(clientes.get(i).getCpf_cnpj(), i, 1);
                tmCliente.setValueAt(endereco, i, 2);
                tmCliente.setValueAt(clientes.get(i).getTelefone1(), i, 3);
                tmCliente.setValueAt(clientes.get(i).getPessoa(), i, 4);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jBPesquisarActionPerformed

    private void TabelaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaClienteMouseClicked
        try {
            VendaDAO vdao = new VendaDAO();
            vendas = vdao.listar(clientes.get(TabelaCliente.getSelectedRow()).getCodigo());
            System.out.println(clientes.get(TabelaCliente.getSelectedRow()).getCodigo());

            while (tmVenda.getRowCount() > 0) {
                tmVenda.removeRow(0);
            }

            String[] linha = new String[]{null, null, null, null};
            for (int i = 0; i < vendas.size(); i++) {
                tmVenda.addRow(linha);
                tmVenda.setValueAt(vendas.get(i).getCodigo(), i, 0);
                tmVenda.setValueAt(vendas.get(i).getCliente().getCodigo(), i, 1);
                tmVenda.setValueAt(vendas.get(i).getProduto().getCodigo(), i, 2);
                tmVenda.setValueAt(vendas.get(i).getQnt_produto(), i, 3);
                tmVenda.setValueAt(format(vendas.get(i).getValor_produto()), i, 4);
                tmVenda.setValueAt(format(vendas.get(i).getValor_total()), i, 5);
                tmVenda.setValueAt(formatData(vendas.get(i).getData()), i, 6);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Pesquisa_Romaneio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_TabelaClienteMouseClicked

    private void jBRomaneioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRomaneioActionPerformed
        try {
            JasperReport jasper = new JasperReport();
            jasper.gerar(vendas.get(TabelaVenda.getSelectedRow()).getCodigo(), clientes.get(TabelaCliente.getSelectedRow()).getCodigo());
        } catch (JRException ex) {
            Logger.getLogger(Pesquisa_Romaneio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Pesquisa_Romaneio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBRomaneioActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaCliente;
    private javax.swing.JTable TabelaVenda;
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JButton jBRomaneio;
    private javax.swing.JLabel jLCabecalho;
    private javax.swing.JLabel jLCliente;
    private javax.swing.JLabel jLVenda;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTCliente;
    // End of variables declaration//GEN-END:variables

    public static String format(double x) {
        return String.format("R$ %.2f", x);
    }

    public static String formatData(java.util.Date d) {
        String aux, aux2 = "";
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        int ano = cal.get(Calendar.YEAR);
        int mes = cal.get(Calendar.MONTH) + 1;
        int dia = cal.get(Calendar.DAY_OF_MONTH);
        if (mes < 10) {
            aux = "0" + String.valueOf(mes);
        } else {
            aux = String.valueOf(mes);
        }
        if (dia < 10) {
            aux2 = "0" + String.valueOf(dia);
        } else {
            aux2 = String.valueOf(dia);
        }
        String sData = aux2 + "/" + aux + "/" + String.valueOf(ano);
        return sData;
    }
}
