package br.com.fiap.model.dao;

import br.com.fiap.model.dto.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClienteDAO implements IDAO {
    // Inicialização do connection
    private Connection con;
    private Cliente cliente;

    // Construtor com passagem de parâmetro
    public ClienteDAO(Connection con) {
        this.con = con;
    }

    // Getter
    public Connection getCon() {
        return con;
    }

    // Metodos exclusivos
    // Create
    public String inserir(Object object){
        // Concersão
        cliente = (Cliente) object;
        // Comando SQL
        String sql = "INSERT INTO DDD_CLIENTE(nome_cliente, placa) VALUES (?, ?)";
        // try-with-resouces
        try(PreparedStatement ps = getCon().prepareStatement(sql)) {
            // Substituindo ? no Insert
            ps.setString(1, cliente.getNomeCliente());
            ps.setString(2, cliente.getPlaca());
            // Verificação da operação
            if (ps.executeUpdate() > 0) {
                return "Inserido com Sucesso!";
            } else {
                return "Erro ao inserir";
            }
        } catch (SQLException e) {
            return "Erro de SQL: " + e.getMessage();
        }
    }

    // Update
    public String alterar(Object object){
        // Concersão
        cliente = (Cliente) object;
        // Comando SQL
        String sql = "UPDATE DDD_CLIENTE SET nome_cliente = ?, placa = ? WHERE id_cliente = ?";
        // try-with-resouces
        try(PreparedStatement ps = getCon().prepareStatement(sql)) {
            // Substituindo ? no Insert
            ps.setString(1, cliente.getNomeCliente());
            ps.setString(2, cliente.getPlaca());
            ps.setInt(3, cliente.getIdCliente());
            // Verificação da operação
            if (ps.executeUpdate() > 0) {
                return "Alterado com Sucesso!";
            } else {
                return "Erro ao alterar";
            }
        } catch (SQLException e) {
            return "Erro de SQL: " + e.getMessage();
        }
    }

    // Delete
    public String excluir(Object object){
        // Concersão
        cliente = (Cliente) object;
        // Comando SQL
        String sql = "DELETE FROM DDD_CLIENTE WHERE id_cliente = ?";
        // try-with-resouces
        try(PreparedStatement ps = getCon().prepareStatement(sql)) {
            // Substituindo ? no Insert
            ps.setInt(1, cliente.getIdCliente());
            // Verificação da operação
            if (ps.executeUpdate() > 0) {
                return "Excluido com Sucesso!";
            } else {
                return "Erro ao excluir";
            }
        } catch (SQLException e) {
            return "Erro de SQL: " + e.getMessage();
        }
    }

    // Read
    public String listarUm(Object object){
        // Concersão
        cliente = (Cliente) object;
        // Comando SQL
        String sql = "SELECT * FROM DDD_CLIENTE WHERE id_cliente = ?";
        // try-with-resources
        try(PreparedStatement ps = getCon().prepareStatement(sql)) {
            ps.setInt(1, cliente.getIdCliente());
            ResultSet rs = ps.executeQuery();
            // Verificação
            if (rs.next()) {
                return "ID: " + cliente.getIdCliente() + "\nNome: " + rs.getString("nome_cliente") + "\nPlaca: " + rs.getString("placa");
            } else {
                return "Registro não encontrado!";
            }
        } catch (SQLException e){
            return "Erro de SQL: " + e.getMessage();
        }
    }
}
