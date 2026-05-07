package br.com.fiap.main;

import br.com.fiap.bean.ContaBancaria;
import br.com.fiap.bean.ContaPoupanca;

import javax.swing.*;
import java.time.LocalDate;

public class Main
{
    public static void main(String[] args)
    {
        // Variáveis de apoio
        String auxiliar, cliente, escolha = "sim";
        int numConta, diaDeRendimento;
        float saldo, limite;
        // Repetição até o usuario desejar
        while (escolha.equalsIgnoreCase("sim")){
            // Tratamento de erros
            try {
                // Armazenamento de opção
                auxiliar = JOptionPane.showInputDialog("Qual é o tipo da sua conta?\n1 - NORMAL\n2 - POUPANÇA\n3 - ESPECIAL");
                int opcao = Integer.parseInt(auxiliar);
                // Entrada de nome, numero da conta e saldo
                cliente = JOptionPane.showInputDialog("Informe seu nome");
                auxiliar = JOptionPane.showInputDialog("Qual é o número da sua conta? ");
                numConta = Integer.parseInt(auxiliar);
                auxiliar = JOptionPane.showInputDialog("Qual é o saldo da sua conta? R$");
                saldo = Float.parseFloat(auxiliar);
                // Condição para execultar opção
                switch (opcao){
                    case 1:
                        ContaBancaria normal = new ContaBancaria();
                        normal.setCliente(cliente);
                        normal.setNumConta(numConta);
                        normal.setSaldo(saldo);
                        int opcao2;
                        auxiliar = JOptionPane.showInputDialog("1 - Sacar\n2 - Depositar");
                        opcao2 = Integer.parseInt(auxiliar);
                        if (opcao2 == 1) {
                            auxiliar = JOptionPane.showInputDialog("Digite o valor que deseja sacar: ");
                            float vlSaque = Float.parseFloat(auxiliar);
                            JOptionPane.showMessageDialog(null, String.format("Saque concluído\nSaldo atual: R$%.2f", normal.sacar(vlSaque)));
                        } else {
                            auxiliar = JOptionPane.showInputDialog("Digite o valor que deseja depositar: ");
                            float vlDeposito = Float.parseFloat(auxiliar);
                            JOptionPane.showMessageDialog(null, String.format("Depósito concluído\nSaldo atual: R$%.2f", normal.depositar(vlDeposito)));
                        }
                        break;
                    case 2:
                        ContaPoupanca poupanca = new ContaPoupanca();
                        poupanca.setCliente(cliente);
                        poupanca.setNumConta(numConta);
                        poupanca.setSaldo(saldo);
                        auxiliar = JOptionPane.showInputDialog("Digite o dia que rende a poupança:");
                        diaDeRendimento = Integer.parseInt(auxiliar);
                        auxiliar = JOptionPane.showInputDialog("Digite a taxa de rendimento em porcentágem:");
                        float rendimento = Float.parseFloat(auxiliar);
                        LocalDate diaAtual = LocalDate.now();
                        if (diaAtual.getDayOfMonth() >= diaDeRendimento) {
                            JOptionPane.showMessageDialog(null, String.format("Dinheiro já rendeu!\nNovo Saldo: R$%.2f", poupanca.novoSaldo(rendimento / 100)));
                        } else {
                            JOptionPane.showMessageDialog(null, "A poupança ainda não rendeu");
                        }
                        break;
                    case 3:
                        
                        break;
                    default:
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        JOptionPane.showMessageDialog(null, "Fim de programa. Volte sempre!");
    }
}
