package br.com.fiap.dao;

import br.com.fiap.dto.Carro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CarroDAO {
    // Atributo
    private Connection con;

    // Construtor com passagem de parêmetro
    public CarroDAO(Connection con) {
        this.con = con;
    }

    // Metodo Getter
    public Connection getCon() {
        return con;
    }

    // Metodos exclusivos
    public String inserir(Carro carro) {
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

    public String alterar(Carro carro) {
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

    public String excluir(Carro carro) {
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

    public ArrayList<Carro> listarTodos() {
        String sql = "SELECT * FROM DDD_CARRO ORDER BY placa";
        ArrayList<Carro> listaCarro = new ArrayList<>();
        try(PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery()) {
            if (ps != null) {
                while (rs.next()) {
                    Carro carro = new Carro();
                    carro.setPlaca(rs.getString(1));
                    carro.setCor(rs.getString(2));
                    carro.setDescricao(rs.getString(3));
                    listaCarro.add(carro);
                }
                return listaCarro;
            } else {
                return null;
            }
        } catch (SQLException e) {
            System.out.println("Erro de SQL!" + e.getMessage());
            return null;
        }
    }
}
