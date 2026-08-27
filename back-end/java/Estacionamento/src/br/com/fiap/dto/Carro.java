package br.com.fiap.dto;

public class Carro {
    // Atributos
    private String placa;
    private String cor;
    private String descricao;

    // Construtor vazio
    public Carro(){
    }

    // Getter e Setter
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
