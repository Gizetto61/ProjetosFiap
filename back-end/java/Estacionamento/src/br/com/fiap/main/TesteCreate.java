package br.com.fiap.main;

import br.com.fiap.dao.CarroDAO;
import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.ConnectionFactory;
import br.com.fiap.dto.Carro;
import br.com.fiap.dto.Cliente;

import java.sql.Connection;

public class TesteCreate {
    static void main() {
        Connection con = ConnectionFactory.abrirConexao();


        Carro carro = new Carro();
        carro.setPlaca("JKK1902");
        carro.setCor("Preto");
        carro.setDescricao("Sonata");
        CarroDAO carroDAO = new CarroDAO(con);
        System.out.println(carroDAO.inserir(carro));


        carro.setPlaca("JKK1903");
        carro.setCor("Cinza");
        carro.setDescricao("Mini Cooper");
        System.out.println(carroDAO.inserir(carro));

        Cliente cliente = new Cliente();
        cliente.setIdCliente(2);
        cliente.setNomeCliente("Felipe Lima");
        cliente.setPlaca(carro.getPlaca());
        ClienteDAO clienteDAO = new ClienteDAO(con);
        System.out.println(clienteDAO.inserir(cliente));

        cliente.setIdCliente(3);
        cliente.setNomeCliente("Raphael Gomes");
        cliente.setPlaca(carro.getPlaca());
        System.out.println(clienteDAO.inserir(cliente));
        ConnectionFactory.fecharConexao(con);
    }
}
