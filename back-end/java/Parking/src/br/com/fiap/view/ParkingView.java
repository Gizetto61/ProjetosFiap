package br.com.fiap.view;

import br.com.fiap.controller.CarroController;
import br.com.fiap.controller.ClienteController;

import javax.swing.*;

public class ParkingView {
    static void main() {
        int idCliente;
        String nome, placa, cor, descricao;
        String[] escolha = {"Inserir", "Alterar", "Excluir", "Listar"};
        String[] manipular = {"Carro", "Cliente"};
        int opcao;
        CarroController carroCtrl = new CarroController();
        ClienteController clienteCtrl = new ClienteController();
        do {
            try {
                opcao = JOptionPane.showOptionDialog(
                        null,
                        "Escolha uma das opções abaixo",
                        "Faça sua escolha",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        manipular,
                        manipular[0]
                );
            switch (opcao){
                case 0:
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
                    break;
                case 1:
                    opcao = JOptionPane.showOptionDialog(
                            null,
                            "Escolha uma das opções abaixo para manipular um cliente",
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
                    break;
                default:
                    break;
            }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } while (JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Controle", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 0);
        JOptionPane.showMessageDialog(null, "Fim de programa");
    }
}
