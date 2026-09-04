package br.com.fiap.main;

import br.com.fiap.dao.CarroDAO;
import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.ConnectionFactory;
import br.com.fiap.dto.Carro;
import br.com.fiap.dto.Cliente;

import java.sql.Connection;

public class TesteUpdate {
    static void main() {
        // Abertura da conexão e armazenamento no objeto con
        Connection con = ConnectionFactory.abrirConexao();
        // criação e instanciação do objeto carro
        Carro carro = new Carro();
        carro.setPlaca("JKK1900");
        carro.setCor("Azul");
        carro.setDescricao("Jeep");
        // Criação e instanciação do objeto carroDAO
        CarroDAO carroDAO = new CarroDAO(con);
        System.out.println(carroDAO.alterar(carro));

        Cliente cliente = new Cliente();
        cliente.setIdCliente(2);
        cliente.setNomeCliente("Felipe de Oliveira");
        cliente.setPlaca(carro.getPlaca());
        ClienteDAO clienteDAO = new ClienteDAO(con);
        System.out.println(clienteDAO.alterar(cliente));

        // Fechamento da conexão
        ConnectionFactory.fecharConexao(con);
    }
}
