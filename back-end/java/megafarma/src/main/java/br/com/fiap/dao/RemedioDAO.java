package br.com.fiap.dao;

import br.com.fiap.to.RemedioTO;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

public class RemedioDAO {
    // Listar todos os remédios
    // SELECT
    public ArrayList<RemedioTO> findAll() {
        // Lista de remedios
        ArrayList<RemedioTO> remedios = new ArrayList<>();
        // Objeto remedio
        RemedioTO remedio = new RemedioTO();
        // Preenchimento de objeto com passagem de parâmetro
        remedio = new RemedioTO(1L, "Loratadina", 7.93, LocalDate.parse("2023-10-10"), LocalDate.parse("2026-10-10"));
        // Adição de remédio à lista
        remedios.add(remedio);

        // Preenchimento de objeto com passagem de parâmetro
        remedio = new RemedioTO(2L, "Amoxicilina", 26.50, LocalDate.now(), LocalDate.now().plusYears(2));
        // Adição de remédio à lista
        remedios.add(remedio);

        // Preenchimento de objeto com passagem de parâmetro
        remedio = new RemedioTO(3L, "Metformina", 9.99, LocalDate.now().minusYears(1), LocalDate.now().plusYears(1));
        // Adição de remédio à lista
        remedios.add(remedio);

        // Retorno da lista
        return remedios;
    }

    // CREATE / INSERT
    public RemedioTO save(RemedioTO remedio) {
        String sql = "INSERT INTO DDD_REMEDIOS(nome, preco, data_de_fabricacao, data_de_validade) VALUES(?, ?, ?, ?)";
        try (PreparedStatement ps = ConnectionFactory.getConnection().prepareStatement(sql)){
            ps.setString(1, remedio.getNome());
            ps.setDouble(2, remedio.getPreco());
            ps.setDate(3, Date.valueOf(remedio.getDataDeFabicacao()));
            ps.setDate(4, Date.valueOf(remedio.getDataDeValidade()));
            if (ps.executeUpdate() > 0) {
                return remedio;
            } else {
                return null;
            }
        } catch (SQLException e) {
            System.out.println("Erro ao salvar: " + e.getMessage());
        } finally {
            ConnectionFactory.closeConnection();
        }
        return null;
    }
}
