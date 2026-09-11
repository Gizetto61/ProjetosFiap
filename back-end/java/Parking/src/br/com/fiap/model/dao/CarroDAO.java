package br.com.fiap.model.dao;

import br.com.fiap.model.dto.Carro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CarroDAO implements IDAO {
    // Atributo
    private Connection con;
    private Carro carro;

    // Construtor com passagem de parêmetro
    public CarroDAO(Connection con) {
        this.con = con;
    }

    // Metodo Getter
    public Connection getCon() {
        return con;
    }

    // Metodos exclusivos
    public String inserir(Object object) {
        // Conversão
        carro = (Carro) object;
        // Comando SQL na variável
        String sql = "INSERT INTO DDD_CARRO(placa, cor, descricao) VALUES(?, ?, ?)";
        // try-with-resources
        // Objeto criado dentro do try com a instancia passando o comando SQL
        try(PreparedStatement ps = getCon().prepareStatement(sql)) {
            // Substituindo ? para valores reais
            ps.setString(1, carro.getPlaca());
            ps.setString(2, carro.getCor());
            ps.setString(3, carro.getDescricao());
            // Verificação de operação
            if (ps.executeUpdate() > 0) {
                return "Inserido com sucesso";
            } else {
                return "Erro ao inserir";
            }
        } catch (SQLException e) {
            return "Erro de SQL" + e.getMessage();
        }
    }

    public String alterar(Object object) {
        // Conversão
        carro = (Carro) object;
        // Comando SQL na variável
        String sql = "UPDATE DDD_CARRO SET cor = ?, descricao = ? WHERE placa = ?";
        // try-with-resources
        // Objeto criado dentro do try com a instancia passando o comando SQL
        try(PreparedStatement ps = getCon().prepareStatement(sql)) {
            // Substituindo ? para valores reais
            ps.setString(1, carro.getCor());
            ps.setString(2, carro.getDescricao());
            ps.setString(3, carro.getPlaca());
            // Verificação de operação
            if (ps.executeUpdate() > 0) {
                return "Alterado com sucesso";
            } else {
                return "Erro ao alterar";
            }
        } catch (SQLException e) {
            return "Erro de SQL" + e.getMessage();
        }
    }

    public String excluir(Object object) {
        // Conversão
        carro = (Carro) object;
        // Comando SQL na variável
        String sql = "DELETE FROM DDD_CARRO WHERE placa = ?";
        // try-with-resources
        // Objeto criado dentro do try com a instancia passando o comando SQL
        try(PreparedStatement ps = getCon().prepareStatement(sql)) {
            // Substituindo ? para valores reais
            ps.setString(1, carro.getPlaca());
            // Verificação de operação
            if (ps.executeUpdate() > 0) {
                return "Excluido com sucesso";
            } else {
                return "Erro ao excluir";
            }
        } catch (SQLException e) {
            return "Erro de SQL" + e.getMessage();
        }
    }

    public String listarUm(Object object) {
        // Conversão
        carro = (Carro) object;
        String sql = "SELECT * FROM DDD_CARRO WHERE placa = ?";
        try(PreparedStatement ps = getCon().prepareStatement(sql)) {
            ps.setString(1, carro.getPlaca());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return "Placa: " + carro.getPlaca() + "\nCor: " + rs.getString("cor") + "\nDescrição: " + rs.getString("descricao");
            } else {
                return "Registro não encontrado!";
            }
        } catch (SQLException e) {
            return "Erro de SQL!" + e.getMessage();
        }
    }
}
