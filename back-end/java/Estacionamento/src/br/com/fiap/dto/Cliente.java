package br.com.fiap.dto;

public class Cliente {
    // Atributos
    private int idCliente;
    private String nomeCliente;
    private String placa;

    // Construtor vazio
    public Cliente(){
    }

    // Getter e Setter
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
