package br.com.fiap.dao;

import br.com.fiap.dto.Carro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
}
