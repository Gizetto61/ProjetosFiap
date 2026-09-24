/*
 * Giovanni Zorzetto Oliveira - RM569464
 * Felipe Lima de Oliveira - RM569947
 * Raphael Gomes Brito - RM572637
 */

package br.com.fiap.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    // Abrir Conexão
    public static Connection abrirConexao(){
        // Objeto con
        Connection con = null;
        // Tratamento de erros
        try {
            // import do DRIVER
            Class.forName("oracle.jdbc.driver.OracleDriver");
            // 1ª parte: Ferramenta java para conexão com banco de dados - 2ª parte: SGBD usado - 3ª parte: Modelo do SGBD - 4ª parte: domínio de conexão - 5ª parte: PORT(Porta) - 6ª parte: SID.
            String url = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
            // Definição de constantes próprias
            final String USER = "rm569464";
            final String PASSWORD = "110507";
            // Instanciação do objeto con
            con = DriverManager.getConnection(url, USER, PASSWORD);
            System.out.println("Conexão Aberta");
        // Erro de importação de classe
        } catch (ClassNotFoundException e) {
            System.out.println("Erro: A classe de conexão não foi encontrada" + e.getMessage());
        // Erro de conexão com o banco
        } catch (SQLException e) {
            System.out.println("Erro de SQL: " + e.getMessage());
        }
        return con;
    }

    // Fechar Conexão
    public static void fecharConexao(Connection con) {
        try {
            // Fechamento do objeto de conexão
            con.close();
            System.out.println("Conexão Fechada");
        } catch (Exception e) {
            System.out.println("Erro de SQL: " + e.getMessage());
        }
    }
}
