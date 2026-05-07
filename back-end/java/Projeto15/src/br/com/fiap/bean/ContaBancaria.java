package br.com.fiap.bean;

import javax.swing.*;

public class ContaBancaria {
    // Atributos
    private String cliente;
    private int numConta;
    private float saldo;

    // Contrutor
    public ContaBancaria(){
    }

    // Getter e Setter
    public String getCliente()
    {
        return cliente;
    }

    public void setCliente(String cliente)
    {
        this.cliente = cliente;
    }

    public int getNumConta()
    {
        return numConta;
    }

    public void setNumConta(int numConta)
    {
        this.numConta = numConta;
    }

    public float getSaldo()
    {
        return saldo;
    }

    public void setSaldo(float saldo)
    {
        this.saldo = saldo;
    }

    // Métodos exclusivos
    public float sacar(float valor)
    {
        if (valor < saldo){
            setSaldo(saldo - valor);
        } else {
            JOptionPane.showMessageDialog(null, "Saldo Insuficiente!");
        }
        return saldo;
    }

    public float depositar(float valor)
    {
        setSaldo(saldo + valor);
        return saldo;
    }
}
