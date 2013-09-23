/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.ConnectionFactory;
import Modelo.Cliente;
import Modelo.Produto;
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
public class ProdutoDAO {

    private Connection conexao;

    public ProdutoDAO() {
        this.conexao = ConnectionFactory.getConexao();
    }

    public void adicionar(Produto produto) throws SQLException {

        String sql = "insert into produto (pro_codigo,pro_nome,pro_marca,pro_quantidade_pacote"
                + ",pro_quantidade_itens,pro_quantidade_minima,pro_valor_compra,pro_valor_venda"
                + ",pro_data_vencimento,pro_data_cadastro,pro_data_compra,pro_lote,pro_categoria,pro_obs) "
                + "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = this.conexao.prepareStatement(sql);
            stmt.setString(1, produto.getCodigo());
            stmt.setString(2, produto.getNome());
            stmt.setString(3, produto.getMarca());
            stmt.setDouble(4, produto.getQuant_pacote());
            stmt.setDouble(5, produto.getQuant_itens());
            stmt.setDouble(6, produto.getQuant_min());
            stmt.setDouble(7, produto.getValor_compra());
            stmt.setDouble(8, produto.getValor_venda());
            if ((produto.getData_vencimento()) == null) {
                stmt.setDate(9, null);
            } else {
                stmt.setDate(9, new java.sql.Date(produto.getData_vencimento().getTime()));
            }
            java.util.Date date = new java.util.Date();
            stmt.setDate(10, new java.sql.Date(date.getTime()));
            stmt.setDate(11, new java.sql.Date(produto.getData_compra().getTime()));
            stmt.setString(12, produto.getLote());
            stmt.setString(13, produto.getCategoria());
            stmt.setString(14, produto.getObs());

            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        }
    }

    public List<Produto> listarVencimento() throws SQLException {
        String sql = "select * from produto where "
                + "CURRENT_DATE  BETWEEN (pro_data_vencimento  - integer '15') AND pro_data_vencimento "
                + "OR pro_data_vencimento < current_date ORDER BY pro_data_vencimento DESC";

        PreparedStatement pstmt = this.conexao.prepareStatement(sql);

        ResultSet rs = pstmt.executeQuery();
        List<Produto> produtos = new ArrayList<>();

        while (rs.next()) {

            Produto produto = new Produto();
            produto.setCodigo(rs.getString("pro_codigo"));
            produto.setNome(rs.getString("pro_nome"));
            produto.setMarca(rs.getString("pro_marca"));
            produto.setQuant_pacote(rs.getDouble("pro_quantidade_pacote"));
            produto.setQuant_itens(rs.getDouble("pro_quantidade_itens"));
            produto.setQuant_min(rs.getDouble("pro_quantidade_minima"));
            produto.setValor_compra(rs.getDouble("pro_valor_compra"));
            produto.setValor_venda(rs.getDouble("pro_valor_venda"));
            produto.setData_cadastro(rs.getDate("pro_data_cadastro"));
            produto.setData_compra(rs.getDate("pro_data_compra"));
            produto.setData_vencimento(rs.getDate("pro_data_vencimento"));
            produto.setLote(rs.getString("pro_lote"));
            produto.setCategoria(rs.getString("pro_categoria"));
            produto.setObs(rs.getString("pro_obs"));

            produtos.add(produto);
        }
        rs.close();
        pstmt.close();
        return produtos;
    }

    public List<Produto> listarCategoria(String categoria) throws SQLException {
        String sql = "select * from produto where pro_categoria ilike ?";

        PreparedStatement pstmt = this.conexao.prepareStatement(sql);
        pstmt.setString(1, categoria);

        ResultSet rs = pstmt.executeQuery();
        List<Produto> produtos = new ArrayList<>();

        while (rs.next()) {

            Produto produto = new Produto();
            produto.setCodigo(rs.getString("pro_codigo"));
            produto.setNome(rs.getString("pro_nome"));
            produto.setMarca(rs.getString("pro_marca"));
            produto.setQuant_pacote(rs.getDouble("pro_quantidade_pacote"));
            produto.setQuant_itens(rs.getDouble("pro_quantidade_itens"));
            produto.setQuant_min(rs.getDouble("pro_quantidade_minima"));
            produto.setValor_compra(rs.getDouble("pro_valor_compra"));
            produto.setValor_venda(rs.getDouble("pro_valor_venda"));
            produto.setData_cadastro(rs.getDate("pro_data_cadastro"));
            produto.setData_compra(rs.getDate("pro_data_compra"));
            produto.setData_vencimento(rs.getDate("pro_data_vencimento"));
            produto.setLote(rs.getString("pro_lote"));
            produto.setCategoria(rs.getString("pro_categoria"));
            produto.setObs(rs.getString("pro_obs"));

            produtos.add(produto);
        }
        rs.close();
        pstmt.close();
        return produtos;
    }

    public List<Produto> listarQuantidade() throws SQLException {
        String sql = "select * from produto where pro_quantidade_minima <= ((pro_quantidade_itens*10)/100) order by pro_nome";

        PreparedStatement pstmt = this.conexao.prepareStatement(sql);

        ResultSet rs = pstmt.executeQuery();
        List<Produto> produtos = new ArrayList<>();

        while (rs.next()) {

            Produto produto = new Produto();
            produto.setCodigo(rs.getString("pro_codigo"));
            produto.setNome(rs.getString("pro_nome"));
            produto.setMarca(rs.getString("pro_marca"));
            produto.setQuant_pacote(rs.getDouble("pro_quantidade_pacote"));
            produto.setQuant_itens(rs.getDouble("pro_quantidade_itens"));
            produto.setQuant_min(rs.getDouble("pro_quantidade_minima"));
            produto.setValor_compra(rs.getDouble("pro_valor_compra"));
            produto.setValor_venda(rs.getDouble("pro_valor_venda"));
            produto.setData_cadastro(rs.getDate("pro_data_cadastro"));
            produto.setData_compra(rs.getDate("pro_data_compra"));
            produto.setData_vencimento(rs.getDate("pro_data_vencimento"));
            produto.setLote(rs.getString("pro_lote"));
            produto.setCategoria(rs.getString("pro_categoria"));
            produto.setObs(rs.getString("pro_obs"));

            produtos.add(produto);
        }
        rs.close();
        pstmt.close();
        return produtos;
    }

    public List<Produto> listarCodigo(String codigo) throws SQLException {
        String sql = "select * from produto where pro_codigo ilike ?";

        PreparedStatement pstmt = this.conexao.prepareStatement(sql);
        pstmt.setString(1, codigo);

        ResultSet rs = pstmt.executeQuery();
        List<Produto> produtos = new ArrayList<>();

        while (rs.next()) {

            Produto produto = new Produto();
            produto.setCodigo(rs.getString("pro_codigo"));
            produto.setNome(rs.getString("pro_nome"));
            produto.setMarca(rs.getString("pro_marca"));
            produto.setQuant_pacote(rs.getDouble("pro_quantidade_pacote"));
            produto.setQuant_itens(rs.getDouble("pro_quantidade_itens"));
            produto.setQuant_min(rs.getDouble("pro_quantidade_minima"));
            produto.setValor_compra(rs.getDouble("pro_valor_compra"));
            produto.setValor_venda(rs.getDouble("pro_valor_venda"));
            produto.setData_cadastro(rs.getDate("pro_data_cadastro"));
            produto.setData_compra(rs.getDate("pro_data_compra"));
            produto.setData_vencimento(rs.getDate("pro_data_vencimento"));
            produto.setLote(rs.getString("pro_lote"));
            produto.setCategoria(rs.getString("pro_categoria"));
            produto.setObs(rs.getString("pro_obs"));

            produtos.add(produto);
        }
        rs.close();
        pstmt.close();
        return produtos;
    }

    public Produto addProduto(String codigo) throws SQLException {
        String sql = "select * from produto where pro_codigo ilike '" + codigo + "'";
        PreparedStatement pstmt = this.conexao.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();

        Produto produto = new Produto();
        while (rs.next()) {

            produto.setCodigo(rs.getString("pro_codigo"));
            produto.setNome(rs.getString("pro_nome"));
            produto.setMarca(rs.getString("pro_marca"));
            produto.setQuant_pacote(rs.getDouble("pro_quantidade_pacote"));
            produto.setQuant_itens(rs.getDouble("pro_quantidade_itens"));
            produto.setQuant_min(rs.getDouble("pro_quantidade_minima"));
            produto.setValor_compra(rs.getDouble("pro_valor_compra"));
            produto.setValor_venda(rs.getDouble("pro_valor_venda"));
            produto.setData_cadastro(rs.getDate("pro_data_cadastro"));
            produto.setData_compra(rs.getDate("pro_data_compra"));
            produto.setData_vencimento(rs.getDate("pro_data_vencimento"));
            produto.setLote(rs.getString("pro_lote"));
            produto.setCategoria(rs.getString("pro_categoria"));
        }
        rs.close();
        pstmt.close();
        return produto;
    }
}