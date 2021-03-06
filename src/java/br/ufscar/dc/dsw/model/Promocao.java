package br.ufscar.dc.dsw.model;

import java.sql.Date;

public class Promocao {
    private int id_promocao;
    private double preco;
    private Date datetime;
    private String endereco_url;
    private int cnpj_teatro;
    private String nome_peca;

    public Promocao(int id_promocao, double preco, Date datetime, String endereco_url, int cnpj_teatro, String nome_peca) {
        this.id_promocao = id_promocao;
        this.preco = preco;
        this.datetime = datetime;
        this.endereco_url = endereco_url;
        this.cnpj_teatro = cnpj_teatro;
        this.nome_peca = nome_peca;
    }

    @Override
    public String toString() {
        return "Promocao{" + "id_promocao=" + id_promocao + ", preco=" + preco + ", datetime=" + datetime + ", endereco_url=" + endereco_url + ", cnpj_teatro=" + cnpj_teatro + ", nome_peca=" + nome_peca + '}';
    }
    

    public int getId_promocao() {
        return id_promocao;
    }

    public void setId_promocao(int id_promocao) {
        this.id_promocao = id_promocao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public String getEndereco_url() {
        return endereco_url;
    }

    public void setEndereco_url(String endereco_url) {
        this.endereco_url = endereco_url;
    }

    public int getCnpj_teatro() {
        return cnpj_teatro;
    }

    public void setCnpj_teatro(int cnpj_teatro) {
        this.cnpj_teatro = cnpj_teatro;
    }

    public String getNome_peca() {
        return nome_peca;
    }

    public void setNome_peca(String nome_peca) {
        this.nome_peca = nome_peca;
    }
}