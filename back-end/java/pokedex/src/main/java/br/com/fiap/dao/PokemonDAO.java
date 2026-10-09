package br.com.fiap.dao;

import br.com.fiap.to.PokemonTO;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

public class PokemonDAO {
    // Mock SELECT
    public ArrayList<PokemonTO> findAll() {
        // Lista
        ArrayList<PokemonTO> pokemons = new ArrayList<>();

        String sql = "SELECT * FROM DDD_POKEMON ORDER BY codigo";
        try (PreparedStatement ps = ConnectionFactory.getConnection().prepareStatement(sql)){
            ResultSet rs = ps.executeQuery();
            if (rs != null) {
                while (rs.next()){
                    PokemonTO pokemon = new PokemonTO();
                    pokemon.setCodigo(rs.getLong("codigo"));
                    pokemon.setNome(rs.getString("nome"));
                    pokemon.setAltura(rs.getDouble("altura"));
                    pokemon.setPeso(rs.getDouble("peso"));
                    pokemon.setCategoria(rs.getString("categoria"));
                    pokemon.setDataDaCaptura(rs.getDate("data_de_captura").toLocalDate());

                    pokemons.add(pokemon);
                }
            } else {
                return null;
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar:" + e.getMessage());
        } finally {
            ConnectionFactory.closeConnection();
        }

        return pokemons;
    }

    // Buscar um pokemon específico
    // SELECT
    public PokemonTO findByCodigo(Long codigo) {
        PokemonTO pokemon = new PokemonTO();

        String sql = "SELECT * FROM DDD_POKEMON WHERE codigo = ?";
        try(PreparedStatement ps = ConnectionFactory.getConnection().prepareStatement(sql)) {
            ps.setLong(1, codigo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                pokemon.setCodigo(rs.getLong("codigo"));
                pokemon.setNome(rs.getString("nome"));
                pokemon.setAltura(rs.getDouble("altura"));
                pokemon.setPeso(rs.getDouble("peso"));
                pokemon.setCategoria(rs.getString("categoria"));
                pokemon.setDataDaCaptura(rs.getDate("data_de_captura").toLocalDate());
            } else {
                return null;
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar:" + e.getMessage());
        } finally {
            ConnectionFactory.closeConnection();
        }
        return pokemon;
    }

    // CREATE / INSERT
    public PokemonTO save(PokemonTO pokemon) {
        String sql = "INSERT INTO DDD_POKEMON(nome, altura, peso, categoria, data_de_captura) VALUES(?, ?, ?, ?, ?)";
        try (PreparedStatement ps = ConnectionFactory.getConnection().prepareStatement(sql)){
            ps.setString(1, pokemon.getNome());
            ps.setDouble(2, pokemon.getAltura());
            ps.setDouble(3, pokemon.getPeso());
            ps.setString(4, pokemon.getCategoria());
            ps.setDate(5, Date.valueOf(pokemon.getDataDaCaptura()));
            if (ps.executeUpdate() > 0) {
                return pokemon;
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
    public PokemonTO update(PokemonTO pokemon) {
        String sql = "UPDATE DDD_POKEMON SET nome = ?, altura = ?, peso = ?, categoria = ?, data_de_captura = ? WHERE codigo = ?";
        try(PreparedStatement ps = ConnectionFactory.getConnection().prepareStatement(sql)) {
            ps.setString(1, pokemon.getNome());
            ps.setDouble(2, pokemon.getAltura());
            ps.setDouble(3, pokemon.getPeso());
            ps.setString(4, pokemon.getCategoria());
            ps.setDate(5, Date.valueOf(pokemon.getDataDaCaptura()));
            ps.setLong(6, pokemon.getCodigo());

            if (ps.executeUpdate() > 0) {
                return pokemon;
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
        String sql = "DELETE FROM DDD_POKEMON WHERE codigo = ?";
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
