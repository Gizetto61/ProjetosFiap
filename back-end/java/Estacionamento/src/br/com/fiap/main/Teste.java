package br.com.fiap.main;

import br.com.fiap.dao.CarroDAO;
import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dto.Carro;
import br.com.fiap.dao.ConnectionFactory;
import br.com.fiap.dto.Cliente;

import javax.swing.*;
import java.sql.Connection;
import java.util.ArrayList;

public class Teste {
    static void main() {
        int opcao, contador = 1;
        Connection con = ConnectionFactory.abrirConexao();
        do {
            try {
                opcao = Integer.parseInt(JOptionPane.showInputDialog("MENU\nQuem deseja manipular?\n\n1 - CARRO\n2 - CLIENTE"));
                switch (opcao){
                    case 1:
                        Carro carro = new Carro();
                        CarroDAO carroDAO = new CarroDAO(con);
                        manipularCarro(carro, carroDAO);
                        break;
                    case 2:
                        Cliente cliente = new Cliente();
                        ClienteDAO clienteDAO = new ClienteDAO(con);
                        manipularCliente(cliente, clienteDAO, contador);
                        contador++;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida!", "Erro", JOptionPane.ERROR_MESSAGE);
                        continue;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } while (JOptionPane.showConfirmDialog(null, "Deseja Continuar?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 0);
        ConnectionFactory.fecharConexao(con);
    }

    public static void manipularCarro(Carro carro, CarroDAO carroDAO){
        int opcao = Integer.parseInt(JOptionPane.showInputDialog("CARRO\n\n1 - Inserir\n2 - Alterar\n3 - Remover"));
        switch (opcao){
            case 1:
                carro.setPlaca(JOptionPane.showInputDialog("Qual a Placa?"));
                carro.setCor(JOptionPane.showInputDialog("Qual a cor?"));
                carro.setDescricao(JOptionPane.showInputDialog("Qual a marca e o modelo?"));
                JOptionPane.showMessageDialog(null, carroDAO.inserir(carro), "Info", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                carro.setPlaca(JOptionPane.showInputDialog("Informe a placa do carro que deseja alterar:"));
                carro.setCor(JOptionPane.showInputDialog("Informe a nova cor:"));
                carro.setDescricao(JOptionPane.showInputDialog("Informe a nova marca e/ou o novo modelo:"));
                JOptionPane.showMessageDialog(null, carroDAO.alterar(carro), "Info", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 3:
                carro.setPlaca(JOptionPane.showInputDialog("Informe a placa do carro que deseja remover:"));
                JOptionPane.showMessageDialog(null, carroDAO.excluir(carro), "Info", JOptionPane.INFORMATION_MESSAGE);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        ArrayList<Carro> lista = carroDAO.listarTodos();
        String listagem = "";
        if (lista != null){
            for (Carro carro1 : lista){
                listagem += String.format("Placa: %s\nCor: %s\nDescrição: %s\n\n", carro1.getPlaca(), carro1.getCor(), carro1.getDescricao());
            }
            JOptionPane.showMessageDialog(null, listagem, "Info", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Tabela não existe ou está vazia", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void manipularCliente(Cliente cliente, ClienteDAO clienteDAO, int idCliente){
        int opcao = Integer.parseInt(JOptionPane.showInputDialog("CLIENTE\n\n1 - Inserir\n2 - Alterar\n3 - Remover"));
        switch (opcao){
            case 1:
                cliente.setIdCliente(idCliente);
                cliente.setNomeCliente(JOptionPane.showInputDialog("Qual o nome?"));
                cliente.setPlaca(JOptionPane.showInputDialog("Qual a placa do carro do cliente?"));
                JOptionPane.showMessageDialog(null, clienteDAO.inserir(cliente), "Info", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                cliente.setIdCliente(Integer.parseInt(JOptionPane.showInputDialog("Informe o id do cliente que deseja alterar:")));
                cliente.setNomeCliente(JOptionPane.showInputDialog("Informe o novo nome:"));
                cliente.setPlaca(JOptionPane.showInputDialog("Informe a nova placa:"));
                JOptionPane.showMessageDialog(null, clienteDAO.alterar(cliente), "Info", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 3:
                cliente.setIdCliente(Integer.parseInt(JOptionPane.showInputDialog("Informe o id do cliente que deseja remover:")));
                JOptionPane.showMessageDialog(null, clienteDAO.excluir(cliente), "Info", JOptionPane.INFORMATION_MESSAGE);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        ArrayList<Cliente> lista = clienteDAO.listarTodos();
        String listagem = "";
        if (lista != null){
            for (Cliente cliente1 : lista){
                listagem += String.format("ID: %s\nNome: %s\nPlaca: %s\n\n", cliente1.getIdCliente(), cliente1.getNomeCliente(), cliente1.getPlaca());
            }
            JOptionPane.showMessageDialog(null, listagem, "Info", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Tabela não existe ou está vazia", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
