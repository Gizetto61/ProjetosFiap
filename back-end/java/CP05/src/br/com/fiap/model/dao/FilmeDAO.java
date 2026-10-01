/*
 * Giovanni Zorzetto Oliveira - RM569464
 * Felipe Lima de Oliveira - RM569947
 * Raphael Gomes Brito - RM572637
 */

package br.com.fiap.model.dao;

import br.com.fiap.model.dto.Filme;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class FilmeDAO {
    // Atributos
    private Connection con;
    private Filme filme;

    // Construtor com passagem de parâmetro
    public FilmeDAO(Connection con) {
        this.con = con;
    }

    // Getter
    public Connection getCon() {
        return con;
    }

    // CRUD

    // CREATE / INSERT
    public String inserir(Object object){
        // Conversão
        filme = (Filme) object;
        // Comando SQL
        String sql = "INSERT INTO DDD_FILME(titulo, genero, produtora) VALUES (?, ?, ?)";
        // try-with-resources
        try (PreparedStatement ps = getCon().prepareStatement(sql)) {
            // Substituindo ? no insert
            ps.setString(1, filme.getTitulo());
            ps.setString(2, filme.getGenero());
            ps.setString(3, filme.getProdutora());
            // Verificação de operação
            if (ps.executeUpdate() > 0){
                return "Inserido com Sucesso!";
            } else {
                return "Erro ao Inserir";
            }
        } catch (SQLException e) {
            return "Erro de SQL: " + e.getMessage();
        }
    }

    // UPDATE
    public String alterar(Object object){
        // Conversão
        filme = (Filme) object;
        // Comando SQL
        String sql = "UPDATE DDD_FILME SET titulo = ?, genero = ?, produtora = ? WHERE codigo = ?";
        // try-with-resources
        try (PreparedStatement ps = getCon().prepareStatement(sql)) {
            // Substituindo ? no insert
            ps.setString(1, filme.getTitulo());
            ps.setString(2, filme.getGenero());
            ps.setString(3, filme.getProdutora());
            ps.setInt(4, filme.getCodigo());
            // Verificação de operação
            if (ps.executeUpdate() > 0){
                return "Alterado com Sucesso!";
            } else {
                return "Erro ao Alterar";
            }
        } catch (SQLException e) {
            return "Erro de SQL: " + e.getMessage();
        }
    }

    // DELETE
    public String excluir(Object object){
        // Conversão
        filme = (Filme) object;
        // Comando SQL
        String sql = "DELETE FROM DDD_FILME WHERE codigo = ?";
        // try-with-resources
        try (PreparedStatement ps = getCon().prepareStatement(sql)) {
            // Substituindo ? no insert
            ps.setInt(1, filme.getCodigo());
            // Verificação de operação
            if (ps.executeUpdate() > 0){
                return "Excluido com Sucesso!";
            } else {
                return "Erro ao Excluir";
            }
        } catch (SQLException e) {
            return "Erro de SQL: " + e.getMessage();
        }
    }

    // READ / SELECT
    public ArrayList<Filme> listarTodos(){
        // Comando SQL
        String sql = "SELECT * FROM DDD_FILME ORDER BY codigo";
        // Lista de filmes
        ArrayList<Filme> listaFilme = new ArrayList<>();
        // try-with-resources
        try (PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery()) {
            // Verificação se há filmes criados
            if (ps != null){
                // Laço que executa a quantidade de filmes na tabela
                while (rs.next()){
                    // Objeto filme
                    Filme filme = new Filme();
                    filme.setCodigo(rs.getInt("codigo"));
                    filme.setTitulo(rs.getString("titulo"));
                    filme.setGenero(rs.getString("genero"));
                    filme.setProdutora(rs.getString("produtora"));
                    listaFilme.add(filme);
                }
                return listaFilme;
            } else {
                return null;
            }
        } catch (SQLException e) {
            System.out.println("Erro de SQL: " + e.getMessage());
            return null;
        }
    }
}
