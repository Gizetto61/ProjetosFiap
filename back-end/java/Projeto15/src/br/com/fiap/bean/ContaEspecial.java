package br.com.fiap.bean;

import javax.swing.*;

public class ContaEspecial extends ContaBancaria
{
    // Atributos
    private float limite;

    // Construtor
    public ContaEspecial(){
    }

    // Getter e Setter
    public float getLimite()
    {
        return limite;
    }

    public void setLimite(float limite)
    {
        this.limite = limite;
    }

    // Métodos esclusivos
    public float sacar(float valor) {
        if (valor <= limite) {
            setSaldo(valor - getSaldo());
        } else {
            JOptionPane.showMessageDialog(null, "Valor acima do limite!");
        }
        return getSaldo();
    }
}
