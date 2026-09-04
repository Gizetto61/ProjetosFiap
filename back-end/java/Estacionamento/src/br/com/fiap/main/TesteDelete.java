package br.com.fiap.main;

import br.com.fiap.dao.CarroDAO;
import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.ConnectionFactory;
import br.com.fiap.dto.Carro;
import br.com.fiap.dto.Cliente;

import java.sql.Connection;

public class TesteDelete {
    static void main() {
        Connection con = ConnectionFactory.abrirConexao();
        /*
        * Carro carro = new Carro();
        carro.setPlaca("JKK1902");

        CarroDAO carroDAO = new CarroDAO(con);
        System.out.println(carroDAO.excluir(carro));
        * */


        Cliente cliente = new Cliente();
        cliente.setIdCliente(2);
        ClienteDAO clienteDAO = new ClienteDAO(con);
        System.out.println(clienteDAO.excluir(cliente));

        ConnectionFactory.fecharConexao(con);
    }
}
