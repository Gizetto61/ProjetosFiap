package br.com.fiap.controller;

import br.com.fiap.model.dao.CarroDAO;
import br.com.fiap.model.dao.ConnectionFactory;
import br.com.fiap.model.dto.Carro;

import java.sql.Connection;
import java.sql.SQLException;

public class CarroController {
    public String inserirCarro(String placa, String cor, String descricao) throws ClassNotFoundException, SQLException {
        String resultado;
        Connection con = ConnectionFactory.abrirConexao();
        Carro carro = new Carro();
        carro.setPlaca(placa);
        carro.setCor(cor);
        carro.setDescricao(descricao);
        CarroDAO carroDAO = new CarroDAO(con);
        resultado = carroDAO.inserir(carro);
        ConnectionFactory.fecharConexao(con);
        return resultado;
    }

    public String alterarCarro(String placa, String cor, String descricao) throws ClassNotFoundException, SQLException {
        String resultado;
        Connection con = ConnectionFactory.abrirConexao();
        Carro carro = new Carro();
        carro.setPlaca(placa);
        carro.setCor(cor);
        carro.setDescricao(descricao);
        CarroDAO carroDAO = new CarroDAO(con);
        resultado = carroDAO.alterar(carro);
        ConnectionFactory.fecharConexao(con);
        return resultado;
    }

    public String excluirCarro(String placa) throws ClassNotFoundException, SQLException {
        String resultado;
        Connection con = ConnectionFactory.abrirConexao();
        Carro carro = new Carro();
        carro.setPlaca(placa);
        CarroDAO carroDAO = new CarroDAO(con);
        resultado = carroDAO.excluir(carro);
        ConnectionFactory.fecharConexao(con);
        return resultado;
    }

    public String listarUm(String placa) throws ClassNotFoundException, SQLException {
        String resultado;
        Connection con = ConnectionFactory.abrirConexao();
        Carro carro = new Carro();
        carro.setPlaca(placa);
        CarroDAO carroDAO = new CarroDAO(con);
        resultado = carroDAO.listarUm(carro);
        ConnectionFactory.fecharConexao(con);
        return resultado;
    }
}
