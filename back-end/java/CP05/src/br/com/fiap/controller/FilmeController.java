/*
 * Giovanni Zorzetto Oliveira - RM569464
 * Felipe Lima de Oliveira - RM569947
 * Raphael Gomes Brito - RM572637
 */

package br.com.fiap.controller;

import br.com.fiap.model.dao.ConnectionFactory;
import br.com.fiap.model.dao.FilmeDAO;
import br.com.fiap.model.dto.Filme;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public class FilmeController {

    // Inserir
    public String inserirFilme(String titulo, String genero, String produtora) throws ClassNotFoundException, SQLException{
        String resultado;

        // Abrindo Conexão
        Connection con = ConnectionFactory.abrirConexao();

        // Objeto filme
        Filme filme = new Filme();
        // Preenchimento de atributos
        filme.setTitulo(titulo);
        filme.setGenero(genero);
        filme.setProdutora(produtora);
        // Objeto DAO
        FilmeDAO filmeDAO = new FilmeDAO(con);
        // Chamada de metodo
        resultado = filmeDAO.inserir(filme);

        // Fechando conexão
        ConnectionFactory.fecharConexao(con);

        return resultado;
    }

    // Alterar
    public String alterarFilme(int codigo, String titulo, String genero, String produtora) throws ClassNotFoundException, SQLException{
        String resultado;

        // Abrindo Conexão
        Connection con = ConnectionFactory.abrirConexao();

        // Objeto filme
        Filme filme = new Filme();
        // Preenchimento de atributos
        filme.setCodigo(codigo);
        filme.setTitulo(titulo);
        filme.setGenero(genero);
        filme.setProdutora(produtora);
        // Objeto DAO
        FilmeDAO filmeDAO = new FilmeDAO(con);
        // Chamada de metodo
        resultado = filmeDAO.alterar(filme);

        // Fechando conexão
        ConnectionFactory.fecharConexao(con);

        return resultado;
    }

    // Excluir
    public String excluirFilme(int codigo) throws ClassNotFoundException, SQLException{
        String resultado;

        // Abrindo Conexão
        Connection con = ConnectionFactory.abrirConexao();

        // Objeto filme
        Filme filme = new Filme();
        // Preenchimento de atributos
        filme.setCodigo(codigo);
        // Objeto DAO
        FilmeDAO filmeDAO = new FilmeDAO(con);
        // Chamada de metodo
        resultado = filmeDAO.excluir(filme);

        // Fechando conexão
        ConnectionFactory.fecharConexao(con);

        return resultado;
    }

    // Listar
    public String listarFilmes() throws ClassNotFoundException, SQLException{
        // Abrindo Conexão
        Connection con = ConnectionFactory.abrirConexao();

        String resultado = "";
        // Objeto DAO
        FilmeDAO filmeDAO = new FilmeDAO(con);
        // Resultado do metodo listar todos dentro da lista listaFilme
        ArrayList<Filme> listaFilme = filmeDAO.listarTodos();
        // Verificação
        if (listaFilme != null){
            // For-each
            for (Filme filme : listaFilme){
                resultado += String.format("Código: %d\nTítulo: %s\nGênero: %s\nProdutora: %s\n\n", filme.getCodigo(), filme.getTitulo(), filme.getGenero(), filme.getProdutora());
            }
        } else {
            resultado = "Tabela não existe, ou está vazia!";
        }

        // Fechando conexão
        ConnectionFactory.fecharConexao(con);

        return resultado;
    }

}
