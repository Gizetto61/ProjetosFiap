package br.com.fiap.main;

import br.com.fiap.dao.CarroDAO;
import br.com.fiap.dao.ConnectionFactory;
import br.com.fiap.dto.Carro;

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

        ConnectionFactory.fecharConexao(con);
    }
}
