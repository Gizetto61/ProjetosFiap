package br.com.fiap.main;

import br.com.fiap.dao.CarroDAO;
import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.ConnectionFactory;
import br.com.fiap.dto.Carro;
import br.com.fiap.dto.Cliente;

import java.sql.Connection;
import java.util.ArrayList;

public class TesteRead {
    static void main() {
        Connection con = ConnectionFactory.abrirConexao();

        CarroDAO carroDAO = new CarroDAO(con);
        ArrayList<Carro> resultado = carroDAO.listarTodos();
        if (resultado != null) {
            for (Carro carro : resultado) {
                System.out.println("\nPlaca: " + carro.getPlaca());
                System.out.println("\nCor: " + carro.getCor());
                System.out.println("\nDescrição: " + carro.getDescricao() + "\n");
            }
        } else {
            System.out.println("Tabela não existe, ou está vazia");
        }

        ClienteDAO clienteDAO = new ClienteDAO(con);
        ArrayList<Cliente> resultado1 = clienteDAO.listarTodos();
        if (resultado1 != null) {
            for (Cliente cliente : resultado1){
                System.out.println("\nID: " + cliente.getIdCliente());
                System.out.println("\nNome: " + cliente.getNomeCliente());
                System.out.println("\nPlaca: " + cliente.getPlaca() + "\n");
            }
        } else {
            System.out.println("Tabela vazia");
        }
        ConnectionFactory.fecharConexao(con);
    }
}
