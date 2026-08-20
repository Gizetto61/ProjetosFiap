package br.com.fiap.main;

import br.com.fiap.bean.ContaBancaria;
import br.com.fiap.exceptions.SaldoInsuficienteException;

public class MainContaBancaria {
    static void main() {
        ContaBancaria conta = new ContaBancaria(1000);
        try {
            conta.sacar(1200);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        System.out.println("Saldo atual: R$" + conta.getSaldo());
    }
}
