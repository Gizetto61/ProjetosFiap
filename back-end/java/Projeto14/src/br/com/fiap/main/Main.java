package br.com.fiap.main;

import br.com.fiap.bean.Funcionario;
import br.com.fiap.bean.Vendedor;
import br.com.fiap.bean.VigiaNoturno;

import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        // Variáveis de apoio na execução
        String auxiliar, nome, exibe, escolha = "sim";
        float valorHora, salario;
        // repetição até usuário desejar
        while (escolha.equalsIgnoreCase("sim")){
            // Tratamento de erros
            try {
                // Escolha de opção
                auxiliar = JOptionPane.showInputDialog("Qual é o tipo de funcionário?\n1 - NOMAL\n2 - VIGIA NOTURNO\n3 - VENDEDOR");
                // Converção para inteiro
                int opcao = Integer.parseInt(auxiliar);
                // Entrada de nome e valor da hora de trabalho do funcionário
                nome = JOptionPane.showInputDialog("Qual o seu nome? ");
                auxiliar = JOptionPane.showInputDialog("Qual é o valor da hora de trabalho? R$");
                // Converção para real
                valorHora = Float.parseFloat(auxiliar);
                // Condicional analizando a opção escolhida
                switch (opcao){
                    case 1:
                        // Criação e instanciação do funcionário normal
                        Funcionario normal = new Funcionario(nome, valorHora);
                        salario = normal.calcularSalario();
                        exibe = String.format("Nome: %s\nSalário: R$%.2f", normal.getNome(), salario);
                        break;
                    case 2:
                        // Entrada de adicional noturno
                        auxiliar = JOptionPane.showInputDialog("Qual é o valor do adicional noturno? R$");
                        // Converção para real
                        float adicional = Float.parseFloat(auxiliar);
                        // Criação e instanciação do funcionário vigia
                        VigiaNoturno vigia = new VigiaNoturno(nome, valorHora, adicional);
                        salario = vigia.calcularSalario();
                        exibe = String.format("Nome: %s\nSalário: R$%.2f", vigia.getNome(), salario);
                        break;
                    case 3:
                        // Entrada de comissão
                        auxiliar = JOptionPane.showInputDialog("Qual é o valor da comissão? R$");
                        // Converção para real
                        float comissao = Float.parseFloat(auxiliar);
                        // Criação e instanciação do funcionário vendedor
                        Vendedor vendedor = new Vendedor(nome, valorHora, comissao);
                        salario = vendedor.calcularSalario();
                        exibe = String.format("Nome: %s\nSalário: R$%.2f", vendedor.getNome(), salario);
                        break;
                    default:
                        exibe = "Opção Inválida!";
                }
                JOptionPane.showMessageDialog(null, exibe);
                escolha = JOptionPane.showInputDialog("Deseja continuar?");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        JOptionPane.showMessageDialog(null,"Fim de programa. Volte sempre!");
    }
}
