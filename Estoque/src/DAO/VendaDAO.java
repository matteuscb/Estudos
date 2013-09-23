/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.ConnectionFactory;
import Modelo.Cliente;
import Modelo.Produto;
import Modelo.Venda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class VendaDAO {

    private Connection conexao;

    public VendaDAO() {
        this.conexao = ConnectionFactory.getConexao();
    }

    public void adicionar(Venda venda) throws SQLException {

        String sql = "insert into venda (ven_codigo,ven_cliente,ven_produto,ven_valor_total,ven_valor_produto,ven_data,ven_qnt_produto) "
                + "values (?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = this.conexao.prepareStatement(sql);
            stmt.setInt(1, venda.getCodigo());
            stmt.setInt(2, venda.getCliente().getCodigo());
            stmt.setString(3, venda.getProduto().getCodigo());
            stmt.setDouble(4, venda.getValor_total());
            java.util.Date date = new java.util.Date();
            stmt.setDouble(5, venda.getValor_produto());
            stmt.setDate(6, new java.sql.Date(date.getTime()));
            stmt.setDouble(7, venda.getProduto().getQuant_itens());


            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        }
    }

    public List<Venda> listar(int codigo) throws SQLException {
        String sql = "select cli_codigo,cli_nome,ven_codigo,ven_produto,ven_valor_total,ven_valor_produto,ven_data,ven_qnt_produto from venda inner join cliente on venda.ven_cliente = cliente.cli_codigo where cli_codigo = ?";
        PreparedStatement pstmt = this.conexao.prepareStatement(sql);
        pstmt.setInt(1, codigo);

        ResultSet rs = pstmt.executeQuery();
        List<Venda> vendas = new ArrayList<>();

        while (rs.next()) {

            Venda venda = new Venda();
            Cliente cliente = new Cliente();
            Produto produto = new Produto();

            venda.setCodigo(rs.getInt("ven_codigo"));
            cliente.setCodigo(rs.getInt("cli_codigo"));
            cliente.setNome(rs.getString("cli_nome"));
            produto.setCodigo(rs.getString("ven_produto"));
            venda.setValor_total(rs.getDouble("ven_valor_total"));
            venda.setValor_produto(rs.getDouble("ven_valor_produto"));
            venda.setData(rs.getDate("ven_data"));
            venda.setQnt_produto(rs.getInt("ven_qnt_produto"));
            venda.setCliente(cliente);
            venda.setProduto(produto);
            vendas.add(venda);
        }
        rs.close();
        pstmt.close();
        return vendas;
    }

    public int PegarId() throws SQLException {
        int aux = 0;
        String sql = "select max(ven_codigo) from venda";
        PreparedStatement pstmt = conexao.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();

        while (rs.next()) {
            aux = rs.getInt("max");
        }
        return aux + 1;
    }
}
