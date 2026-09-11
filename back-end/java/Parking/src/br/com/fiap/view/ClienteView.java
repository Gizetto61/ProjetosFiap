package br.com.fiap.view;

import br.com.fiap.controller.CarroController;
import br.com.fiap.controller.ClienteController;
import br.com.fiap.model.dao.IDAO;

import javax.swing.*;

public class ClienteView {
    static void main() {
        int idCliente;
        String nome;
        String placa;
        String[] escolha = {"Inserir", "Alterar", "Excluir", "Listar"};
        int opcao;
        ClienteController clienteCtrl = new ClienteController();
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
                switch (opcao){
                    case 0:
                        nome = JOptionPane.showInputDialog("Digite o nome do cliente:");
                        placa = JOptionPane.showInputDialog("Digite a placa do carro do cliente:");
                        JOptionPane.showMessageDialog(null, clienteCtrl.inserirCliente(nome, placa));
                        break;
                    case 1:
                        idCliente = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do cliente que deseja alterar:"));
                        nome = JOptionPane.showInputDialog("Digite o novo nome do cliente:");
                        placa = JOptionPane.showInputDialog("Digite a nova placa:");
                        JOptionPane.showMessageDialog(null, clienteCtrl.alterarCliente(idCliente, nome, placa));
                        break;
                    case 2:
                        idCliente = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do cliente que deseja excluir:"));
                        JOptionPane.showMessageDialog(null, clienteCtrl.excluirCliente(idCliente));
                        break;
                    case 3:
                        idCliente = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do cliente que deseja listar:"));
                        JOptionPane.showMessageDialog(null, clienteCtrl.listarUm(idCliente));
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
