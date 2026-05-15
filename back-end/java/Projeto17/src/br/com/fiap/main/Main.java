package br.com.fiap.main;

import br.com.fiap.bean.Freelancer;
import br.com.fiap.bean.Vendedor;
import br.com.fiap.bean.VigiaNoturno;

import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        String nome;
        long cnpj;
        float valorHoraTrabalho, adicionalNoturno, comissao;
        do {
            try {
                int opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha o tipo de funcionário:\n1 - Vigia Noturno\n2 - Vendedor\n3 - Freelancer"));
                switch (opcao){
                    case 1:
                        nome = JOptionPane.showInputDialog("Informe o nome do vigia: ");
                        valorHoraTrabalho = Float.parseFloat(JOptionPane.showInputDialog("Informe o Valor da hora de trabalho"));
                        adicionalNoturno = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor do adicional noturno"));
                        VigiaNoturno vigiaNoturno = new VigiaNoturno(nome, valorHoraTrabalho, adicionalNoturno);
                        JOptionPane.showMessageDialog(null, String.format("Vigia Noturno\nNome: %s\nSalário: %.2f", vigiaNoturno.getNome(), vigiaNoturno.calcularSalario()), "Vigia Noturno", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 2:
                        nome = JOptionPane.showInputDialog("Informe o nome do vendedor");
                        valorHoraTrabalho = Float.parseFloat(JOptionPane.showInputDialog("Informe o Valor da hora de trabalho"));
                        comissao = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor da comissão em porcentagem"));
                        Vendedor vendedor = new Vendedor(nome, valorHoraTrabalho, comissao);
                        JOptionPane.showMessageDialog(null, String.format("Vendedor\nNome: %s\nSalário: %.2f", vendedor.getNome(), vendedor.calcularSalario()), "Vendedor", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 3:
                        nome = JOptionPane.showInputDialog("Informe o nome do freelancer");
                        valorHoraTrabalho = Float.parseFloat(JOptionPane.showInputDialog("Informe o Valor da hora de trabalho"));
                        cnpj = Long.parseLong(JOptionPane.showInputDialog("Informe o CNPJ"));
                        Freelancer freelancer = new Freelancer(nome, valorHoraTrabalho, cnpj);
                        JOptionPane.showMessageDialog(null, String.format("Freelancer\nNome: %s\nCNPJ: %d\nSalário: %.2f", freelancer.getNome(), freelancer.getCNPJ(), freelancer.calcularSalario()), "Freelancer", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        throw new Exception("Opção Inválida!");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } while (JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
    JOptionPane.showMessageDialog(null, "Programa encerrado", "Alerta", JOptionPane.WARNING_MESSAGE);
    }
}
