package br.com.fiap.view;

import br.com.fiap.controller.CarroController;

import javax.swing.*;

public class CarroView {
    static void main() {
        String placa, cor, descricao;
        String[] escolha = {"Inserir", "Alterar", "Excluir", "Listar"};
        int opcao;
        CarroController carroCtrl = new CarroController();
        do {
            try {
                opcao = JOptionPane.showOptionDialog(
                        null,
                        "Escolha uma das opções abaixo para manipular um carro",
                        "Faça sua escolha",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        escolha,
                        escolha[0]
                );
                placa = JOptionPane.showInputDialog("Digite a placa do carro:");
                switch (opcao){
                    case 0:
                        cor = JOptionPane.showInputDialog("Digite a cor do carro:");
                        descricao = JOptionPane.showInputDialog("Digite o nome e o modelo do carro:");
                        JOptionPane.showMessageDialog(null, carroCtrl.inserirCarro(placa, cor, descricao));
                        break;
                    case 1:
                        cor = JOptionPane.showInputDialog("Digite a nova cor do carro:");
                        descricao = JOptionPane.showInputDialog("Digite o novo nome e o novo modelo do carro:");
                        JOptionPane.showMessageDialog(null, carroCtrl.alterarCarro(placa, cor, descricao));
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, carroCtrl.excluirCarro(placa));
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, carroCtrl.listarUm(placa));
                        break;
                    default:
                        break;
                }
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        } while (JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Controle", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 0);
        JOptionPane.showMessageDialog(null, "Fim de programa");
    }
}
