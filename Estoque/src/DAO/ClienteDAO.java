/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.ConnectionFactory;
import Modelo.Cliente;
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
public class ClienteDAO {

    private Connection conexao;

    public ClienteDAO() {
        this.conexao = ConnectionFactory.getConexao();
    }

    public void adicionar(Cliente cliente) throws SQLException {

        String sql = "insert into cliente (cli_nome,cli_pessoa,cli_cpf_cnpj,cli_telefone1,cli_telefone2,"
                + "cli_celular1,cli_celular2,cli_email,cli_rua,cli_numero,cli_bairro,cli_cidade,cli_cep) "
                + "values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = this.conexao.prepareStatement(sql);
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getPessoa());
            stmt.setString(3, cliente.getCpf_cnpj());
            stmt.setString(4, cliente.getTelefone1());
            stmt.setString(5, cliente.getTelefone2());
            stmt.setString(6, cliente.getCelular1());
            stmt.setString(7, cliente.getCelular2());
            stmt.setString(8, cliente.getEmail());
            stmt.setString(9, cliente.getRua());
            stmt.setString(10, cliente.getNumero());
            stmt.setString(11, cliente.getBairro());
            stmt.setString(12, cliente.getCidade());
            stmt.setString(13, cliente.getCep());

            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        }
    }

    public List<Cliente> listarNome(String nome) throws SQLException {
        String sql = "select * from cliente where cli_nome ilike ? order by cli_nome";
        PreparedStatement pstmt = this.conexao.prepareStatement(sql);
        pstmt.setString(1, nome);

        ResultSet rs = pstmt.executeQuery();
        List<Cliente> clientes = new ArrayList<>();

        while (rs.next()) {

            Cliente cliente = new Cliente();
            cliente.setCodigo(rs.getInt("cli_codigo"));
            cliente.setNome(rs.getString("cli_nome"));
            cliente.setPessoa(rs.getString("cli_pessoa"));
            cliente.setCpf_cnpj(rs.getString("cli_cpf_cnpj"));
            cliente.setTelefone1(rs.getString("cli_telefone1"));
            cliente.setTelefone2(rs.getString("cli_telefone2"));
            cliente.setCelular1(rs.getString("cli_celular1"));
            cliente.setCelular2(rs.getString("cli_celular2"));
            cliente.setEmail(rs.getString("cli_email"));
            cliente.setRua(rs.getString("cli_rua"));
            cliente.setNumero(rs.getString("cli_numero"));
            cliente.setBairro(rs.getString("cli_bairro"));
            cliente.setCidade(rs.getString("cli_cidade"));
            cliente.setCep(rs.getString("cli_cep"));
            clientes.add(cliente);
        }
        rs.close();
        pstmt.close();
        return clientes;
    }

    public List<Cliente> listarCPF(String cpf) throws SQLException {
        String sql = "select * from cliente where cli_cpf_cnpj ilike ? order by cli_nome";
        PreparedStatement pstmt = this.conexao.prepareStatement(sql);
        pstmt.setString(1, cpf);

        ResultSet rs = pstmt.executeQuery();
        List<Cliente> clientes = new ArrayList<>();

        while (rs.next()) {

            Cliente cliente = new Cliente();
            cliente.setCodigo(rs.getInt("cli_codigo"));
            cliente.setNome(rs.getString("cli_nome"));
            cliente.setPessoa(rs.getString("cli_pessoa"));
            cliente.setCpf_cnpj(rs.getString("cli_cpf_cnpj"));
            cliente.setTelefone1(rs.getString("cli_telefone1"));
            cliente.setTelefone2(rs.getString("cli_telefone2"));
            cliente.setCelular1(rs.getString("cli_celular1"));
            cliente.setCelular2(rs.getString("cli_celular2"));
            cliente.setEmail(rs.getString("cli_email"));
            cliente.setRua(rs.getString("cli_rua"));
            cliente.setNumero(rs.getString("cli_numero"));
            cliente.setBairro(rs.getString("cli_bairro"));
            cliente.setCidade(rs.getString("cli_cidade"));
            cliente.setCep(rs.getString("cli_cep"));
            clientes.add(cliente);
        }
        rs.close();
        pstmt.close();
        return clientes;
    }
}
