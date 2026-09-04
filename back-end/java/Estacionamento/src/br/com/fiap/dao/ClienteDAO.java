package br.com.fiap.dao;

import br.com.fiap.dto.Carro;
import br.com.fiap.dto.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClienteDAO {
    // Inicialização do connection
    private Connection con;

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
    public String inserir(Cliente cliente){
        // Comando SQL
        String sql = "INSERT INTO DDD_CLIENTE(id_cliente, nome_cliente, placa) VALUES (?, ?, ?)";
        // try-with-resouces
        try(PreparedStatement ps = getCon().prepareStatement(sql)) {
            // Substituindo ? no Insert
            ps.setInt(1, cliente.getIdCliente());
            ps.setString(2, cliente.getNomeCliente());
            ps.setString(3, cliente.getPlaca());
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
    public String alterar(Cliente cliente){
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
    public String excluir(Cliente cliente){
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
    public ArrayList<Cliente> listarTodos(){
        // Comando SQL
        String sql = "SELECT * FROM DDD_CLIENTE ORDER BY id_cliente";
        ArrayList<Cliente> listaCliente = new ArrayList<>();
        // try-with-resources
        try(PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery()) {
            // Verificação
            if (ps != null) {
                // laço que pega todos os clientes no banco
                while (rs.next()){
                    Cliente cliente = new Cliente();
                    cliente.setIdCliente(rs.getInt(1));
                    cliente.setNomeCliente(rs.getString(2));
                    cliente.setPlaca(rs.getString(3));
                    listaCliente.add(cliente);
                }
                return listaCliente;
            } else {
                return null;
            }
        } catch (SQLException e){
            System.out.println("Erro de SQL: " + e.getMessage());
            return null;
        }
    }
}
