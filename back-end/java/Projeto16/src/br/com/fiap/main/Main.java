package br.com.fiap.main;

import br.com.fiap.bean.ContaPoupanca;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        float valor;
        int opcao;
        Scanner scan;
        String escolha = "sim";
        while (escolha.equalsIgnoreCase("sim")){
            try {
                scan = new Scanner(System.in);
                System.out.println("Digite o número da conta e saldo: ");
                ContaPoupanca cp = new ContaPoupanca();
                cp.setNumConta(scan.nextInt());
                cp.setSaldo(scan.nextFloat());
                System.out.println("Escolha uma operação\n1 - Saque\n2 - Depósito\n-> ");
                opcao = scan.nextInt();
                switch (opcao){
                    case 1:
                        System.out.println("Digite o valor a ser sacado: ");
                        valor = scan.nextFloat();
                        System.out.printf("Número da conta: %d\nSaldo Atual: R$%.2f\n", cp.getNumConta(), cp.sacar(valor));
                        break;
                    case 2:
                        System.out.println("Digite o valor a ser depositado: ");
                        valor = scan.nextFloat();
                        System.out.printf("Número da conta: %d\nSaldo Atual: R$%.2f\n", cp.getNumConta(), cp.depositar(valor));
                        break;
                    default:
                        System.out.println("Opção inválida");
                }
                System.out.println("Deseja continuar? ");
                escolha = scan.next();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Fim de programa");
    }
}
