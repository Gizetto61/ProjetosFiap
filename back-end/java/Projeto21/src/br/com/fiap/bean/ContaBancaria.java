package br.com.fiap.bean;

import br.com.fiap.exceptions.SaldoInsuficienteException;

public class ContaBancaria {
    // Atributos
    private double saldo;

    // Construtores
    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    // Getter e Setter
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Métodos exclusivos
    public void sacar(double quantia) throws SaldoInsuficienteException {
        if (quantia > saldo) {
            throw new SaldoInsuficienteException("Saldo insufuciente para a realização deste saque");
        }
        saldo -= quantia;
    }
}
