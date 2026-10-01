package br.com.fiap.to;

import java.time.LocalDate;

public class PokemonTO {
    // Atributos
    private Long codigo;
    private String nome;
    private Double altura;
    private Double peso;
    private String categoria;
    private LocalDate dataDaCaptura;

    // Construtores
    public PokemonTO() {
    }

    public PokemonTO(Long codigo, String nome, Double altura, Double peso, String categoria, LocalDate dataDaCaptura) {
        this.codigo = codigo;
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.categoria = categoria;
        this.dataDaCaptura = dataDaCaptura;
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

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public LocalDate getDataDaCaptura() {
        return dataDaCaptura;
    }

    public void setDataDaCaptura(LocalDate dataDaCaptura) {
        this.dataDaCaptura = dataDaCaptura;
    }
}
