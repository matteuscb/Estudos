/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author user
 */
public class Produto {

    private String codigo;
    private String nome;
    private String marca;
    private String lote;
    private String categoria;
    private String obs;
    private Double quant_pacote;
    private Double quant_min;
    private Double quant_itens;
    private Double valor_compra;
    private Double valor_venda;
    private Date data_cadastro;
    private Date data_vencimento;
    private Date data_compra;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Double getQuant_pacote() {
        return quant_pacote;
    }

    public void setQuant_pacote(Double quant_pacote) {
        this.quant_pacote = quant_pacote;
    }

    public Double getQuant_min() {
        return quant_min;
    }

    public void setQuant_min(Double quant_min) {
        this.quant_min = quant_min;
    }

    public Double getQuant_itens() {
        return quant_itens;
    }

    public void setQuant_itens(Double quant_itens) {
        this.quant_itens = quant_itens;
    }

    public Double getValor_compra() {
        return valor_compra;
    }

    public void setValor_compra(Double valor_compra) {
        this.valor_compra = valor_compra;
    }

    public Double getValor_venda() {
        return valor_venda;
    }

    public void setValor_venda(Double valor_venda) {
        this.valor_venda = valor_venda;
    }

    public Date getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(Date data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    public Date getData_vencimento() {
        return data_vencimento;
    }

    public void setData_vencimento(Date data_vencimento) {
        this.data_vencimento = data_vencimento;
    }

    public Date getData_compra() {
        return data_compra;
    }

    public void setData_compra(Date data_compra) {
        this.data_compra = data_compra;
    }
}
