package br.com.fiap.dao;

import br.com.fiap.to.RemedioTO;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

public class RemedioDAO {
    // Listar todos os remédios
    // SELECT *
    public ArrayList<RemedioTO> findAll() {
        // Lista de remedios
        ArrayList<RemedioTO> remedios = new ArrayList<>();

        String sql = "SELECT * FROM DDD_REMEDIOS ORDER BY codigo";
        try (PreparedStatement ps = ConnectionFactory.getConnection().prepareStatement(sql)){
            ResultSet rs = ps.executeQuery();
            if (rs != null) {
                while (rs.next()){
                    RemedioTO remedio = new RemedioTO();
                    remedio.setCodigo(rs.getLong("codigo"));
                    remedio.setNome(rs.getString("nome"));
                    remedio.setPreco(rs.getDouble("preco"));
                    remedio.setDataDeFabricacao(rs.getDate("data_de_fabricacao").toLocalDate());
                    remedio.setDataDeValidade(rs.getDate("data_de_validade").toLocalDate());

                    remedios.add(remedio);
                }
            } else {
                return null;
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar: " + e.getMessage());
        } finally {
            ConnectionFactory.closeConnection();
        }

        // Retorno da lista
        return remedios;
    }

    // Buscar um remédio específico
    // SELECT
    public RemedioTO findByCodigo(Long codigo) {
        RemedioTO remedio = new RemedioTO();

        String sql = "SELECT * FROM DDD_REMEDIOS WHERE codigo = ?";
        try(PreparedStatement ps = ConnectionFactory.getConnection().prepareStatement(sql)) {
            ps.setLong(1, codigo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                remedio.setCodigo(rs.getLong("codigo"));
                remedio.setNome(rs.getString("nome"));
                remedio.setPreco(rs.getDouble("preco"));
                remedio.setDataDeFabricacao(rs.getDate("data_de_fabricacao").toLocalDate());
                remedio.setDataDeValidade(rs.getDate("data_de_validade").toLocalDate());
            } else {
                return null;
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar:" + e.getMessage());
        } finally {
            ConnectionFactory.closeConnection();
        }
        return remedio;
    }

    // CREATE / INSERT
    public RemedioTO save(RemedioTO remedio) {
        String sql = "INSERT INTO DDD_REMEDIOS(nome, preco, data_de_fabricacao, data_de_validade) VALUES(?, ?, ?, ?)";
        try (PreparedStatement ps = ConnectionFactory.getConnection().prepareStatement(sql)){
            ps.setString(1, remedio.getNome());
            ps.setDouble(2, remedio.getPreco());
            ps.setDate(3, Date.valueOf(remedio.getDataDeFabricacao()));
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

    // UPDATE
    public RemedioTO update(RemedioTO remedio) {
        String sql = "UPDATE DDD_REMEDIOS SET nome = ?, preco = ?, data_de_fabricacao = ?, data_de_validade = ? WHERE codigo = ?";
        try(PreparedStatement ps = ConnectionFactory.getConnection().prepareStatement(sql)) {
            ps.setString(1, remedio.getNome());
            ps.setDouble(2, remedio.getPreco());
            ps.setDate(3, Date.valueOf(remedio.getDataDeFabricacao()));
            ps.setDate(4, Date.valueOf(remedio.getDataDeValidade()));
            ps.setLong(5, remedio.getCodigo());

            if (ps.executeUpdate() > 0) {
                return remedio;
            } else {
                return null;
            }
        } catch (SQLException e) {
            System.out.println("Erro ao alterar: " + e.getMessage());
        } finally {
            ConnectionFactory.closeConnection();
        }
        return null;
    }

    // DELETE
    public boolean delete(Long codigo) {
        String sql = "DELETE FROM DDD_REMEDIOS WHERE codigo = ?";
        try(PreparedStatement ps = ConnectionFactory.getConnection().prepareStatement(sql)) {
            ps.setLong(1, codigo);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Erro ao excluir: " + e.getMessage());
        } finally {
            ConnectionFactory.closeConnection();
        }
        return false;
    }
}
