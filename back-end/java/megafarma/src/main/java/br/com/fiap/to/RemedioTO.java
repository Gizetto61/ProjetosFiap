package br.com.fiap.to;

import java.time.LocalDate;

public class RemedioTO {
    // Atributos
    private Long codigo;
    private String nome;
    private Double preco;
    private LocalDate dataDeFabicacao;
    private LocalDate dataDeValidade;

    // Construtores
    public RemedioTO() {
    }

    public RemedioTO(Long codigo, String nome, Double preco, LocalDate dataDeFabicacao, LocalDate dataDeValidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.dataDeFabicacao = dataDeFabicacao;
        this.dataDeValidade = dataDeValidade;
    }

    // Getter e Setter
    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public LocalDate getDataDeFabicacao() {
        return dataDeFabicacao;
    }

    public void setDataDeFabicacao(LocalDate dataDeFabicacao) {
        this.dataDeFabicacao = dataDeFabicacao;
    }

    public LocalDate getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(LocalDate dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }
}
