package br.com.fiap.main;

import br.com.fiap.dao.CarroDAO;
import br.com.fiap.dao.ConnectionFactory;
import br.com.fiap.dto.Carro;

import java.sql.Connection;

public class TesteUpdate {
    static void main() {
        // Abertura da conexão e armazenamento no objeto con
        Connection con = ConnectionFactory.abrirConexao();
        // criação e instanciação do objeto carro
        Carro carro = new Carro();
        carro.setPlaca("JKK1900");
        carro.setCor("Majenta");
        carro.setDescricao("Jeep");
        // Criação e instanciação do objeto carroDAO
        CarroDAO carroDAO = new CarroDAO(con);
        System.out.println(carroDAO.alterar(carro));

        // Fechamento da conexão
        ConnectionFactory.fecharConexao(con);
    }
}
