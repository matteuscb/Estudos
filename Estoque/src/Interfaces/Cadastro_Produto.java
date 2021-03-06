/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import DAO.ProdutoDAO;
import Modelo.Cliente;
import Modelo.Produto;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class Cadastro_Produto extends javax.swing.JInternalFrame {

    /**
     * Creates new form Cadastro_Produto
     */
    public Cadastro_Produto() {
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

        jLCodigo = new javax.swing.JLabel();
        jTCodigo = new javax.swing.JTextField();
        jLProduto = new javax.swing.JLabel();
        jLMarca = new javax.swing.JLabel();
        jLQnt = new javax.swing.JLabel();
        jLQntProd = new javax.swing.JLabel();
        jLQntMin = new javax.swing.JLabel();
        jLValorCompra = new javax.swing.JLabel();
        jLValorVenda = new javax.swing.JLabel();
        jLDataCompra = new javax.swing.JLabel();
        jLDataVencimento = new javax.swing.JLabel();
        jLLote = new javax.swing.JLabel();
        jLCategoria = new javax.swing.JLabel();
        jLOBS = new javax.swing.JLabel();
        jTProduto = new javax.swing.JTextField();
        jTmarca = new javax.swing.JTextField();
        jTQnt = new javax.swing.JTextField();
        jTQntProd = new javax.swing.JTextField();
        jTQntMin = new javax.swing.JTextField();
        jTValorCompra = new javax.swing.JTextField();
        jTValorVenda = new javax.swing.JTextField();
        jTLote = new javax.swing.JTextField();
        jLCabecalho = new javax.swing.JLabel();
        jCBCategoria = new javax.swing.JComboBox();
        jDCCompra = new com.toedter.calendar.JDateChooser();
        jDCVencimento = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTPOBS = new javax.swing.JTextPane();
        jBCadastrar = new javax.swing.JButton();
        jBLimpar = new javax.swing.JButton();

        setClosable(true);

        jLCodigo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCodigo.setText("Código:");

        jTCodigo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLProduto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLProduto.setText("Produto:");

        jLMarca.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLMarca.setText("Marca:");

        jLQnt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLQnt.setText("Quantidade:");

        jLQntProd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLQntProd.setText("Quantidade de Produtos:");

        jLQntMin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLQntMin.setText("Quantidade Mínina no Estoque:");

        jLValorCompra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLValorCompra.setText("Valor de Compra:");

        jLValorVenda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLValorVenda.setText("Valor de Venda:");

        jLDataCompra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLDataCompra.setText("Data de Compra:");

        jLDataVencimento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLDataVencimento.setText("Data de Vencimento:");

        jLLote.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLLote.setText("Lote:");

        jLCategoria.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCategoria.setText("Categoria:");

        jLOBS.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLOBS.setText("Observação:");

        jTProduto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTmarca.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTQnt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTQntProd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTQntMin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTValorCompra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTValorVenda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTLote.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLCabecalho.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLCabecalho.setText("Cadastro de Produtos no Estoque");

        jCBCategoria.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Alimentos", "Cama Mesa e Banho", "Limpeza", "Roupa", " ", " " }));

        jScrollPane1.setViewportView(jTPOBS);

        jBCadastrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBCadastrar.setText("Cadastrar");
        jBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarActionPerformed(evt);
            }
        });

        jBLimpar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBLimpar.setText("Limpar");
        jBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLCodigo)
                                    .addComponent(jLProduto)
                                    .addComponent(jLMarca))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTmarca, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLQnt)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTQnt, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                                    .addComponent(jTCodigo)
                                    .addComponent(jTProduto)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLValorVenda)
                                    .addComponent(jLValorCompra)
                                    .addComponent(jLCategoria)
                                    .addComponent(jLDataCompra)
                                    .addComponent(jLDataVencimento)
                                    .addComponent(jLLote))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTValorCompra)
                                    .addComponent(jTValorVenda)
                                    .addComponent(jDCCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jDCVencimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTLote)
                                    .addComponent(jCBCategoria, 0, 132, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLOBS)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLCabecalho)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLQntProd)
                                .addGap(18, 18, 18)
                                .addComponent(jTQntProd, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLQntMin)
                                .addGap(18, 18, 18)
                                .addComponent(jTQntMin, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 42, Short.MAX_VALUE)))
                .addGap(54, 54, 54))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBCadastrar)
                .addGap(33, 33, 33)
                .addComponent(jBLimpar)
                .addGap(42, 42, 42))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBCadastrar, jBLimpar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLCabecalho)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCodigo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLProduto)
                    .addComponent(jTProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLMarca)
                    .addComponent(jTmarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLQnt)
                    .addComponent(jTQnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLQntProd)
                            .addComponent(jTQntProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLQntMin)
                            .addComponent(jTQntMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLValorCompra)
                            .addComponent(jTValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLValorVenda)
                            .addComponent(jTValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLCategoria)
                                    .addComponent(jCBCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLDataCompra))
                            .addComponent(jDCCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLDataVencimento)
                            .addComponent(jDCVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLOBS)
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLLote)
                    .addComponent(jTLote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCadastrar)
                    .addComponent(jBLimpar))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        jTCodigo.setText("");
        jTLote.setText("");
        jTPOBS.setText("");
        jTProduto.setText("");
        jTQnt.setText("");
        jTQntMin.setText("");
        jTQntProd.setText("");
        jTValorCompra.setText("");
        jTValorVenda.setText("");
        jTmarca.setText("");

    }//GEN-LAST:event_jBLimparActionPerformed

    private void jBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarActionPerformed
        Produto produto = new Produto();
        produto.setCodigo(jTCodigo.getText());
        produto.setNome(jTProduto.getText());
        produto.setMarca(jTmarca.getText());
        produto.setLote(jTLote.getText());
        produto.setCategoria((String) jCBCategoria.getSelectedItem());
        produto.setObs(jTPOBS.getText());
        produto.setQuant_pacote(Double.parseDouble(jTQnt.getText()));
        produto.setQuant_min(Double.parseDouble(jTQntMin.getText()));
        produto.setQuant_itens(Double.parseDouble(jTQntProd.getText()));
        produto.setValor_compra(Double.parseDouble(jTValorCompra.getText()));
        produto.setValor_venda(Double.parseDouble(jTValorVenda.getText()));
        produto.setData_compra(jDCCompra.getDate());
        produto.setData_vencimento(jDCVencimento.getDate());


        try {
            ProdutoDAO pdao = new ProdutoDAO();
            pdao.adicionar(produto);
        } catch (SQLException ex) {
            Logger.getLogger(Cadastro_Produto.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jBCadastrarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JButton jBLimpar;
    private javax.swing.JComboBox jCBCategoria;
    private com.toedter.calendar.JDateChooser jDCCompra;
    private com.toedter.calendar.JDateChooser jDCVencimento;
    private javax.swing.JLabel jLCabecalho;
    private javax.swing.JLabel jLCategoria;
    private javax.swing.JLabel jLCodigo;
    private javax.swing.JLabel jLDataCompra;
    private javax.swing.JLabel jLDataVencimento;
    private javax.swing.JLabel jLLote;
    private javax.swing.JLabel jLMarca;
    private javax.swing.JLabel jLOBS;
    private javax.swing.JLabel jLProduto;
    private javax.swing.JLabel jLQnt;
    private javax.swing.JLabel jLQntMin;
    private javax.swing.JLabel jLQntProd;
    private javax.swing.JLabel jLValorCompra;
    private javax.swing.JLabel jLValorVenda;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTCodigo;
    private javax.swing.JTextField jTLote;
    private javax.swing.JTextPane jTPOBS;
    private javax.swing.JTextField jTProduto;
    private javax.swing.JTextField jTQnt;
    private javax.swing.JTextField jTQntMin;
    private javax.swing.JTextField jTQntProd;
    private javax.swing.JTextField jTValorCompra;
    private javax.swing.JTextField jTValorVenda;
    private javax.swing.JTextField jTmarca;
    // End of variables declaration//GEN-END:variables
}
