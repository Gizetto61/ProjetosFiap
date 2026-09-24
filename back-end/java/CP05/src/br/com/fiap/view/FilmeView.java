package br.com.fiap.view;

import br.com.fiap.controller.FilmeController;

import javax.swing.*;

public class FilmeView {
    static void main() {
        // Variáveis, listas e objetos de apoio
        int codigo;
        String titulo, genero, produtora;
        String[] escolha = {"Inserir", "Alterar", "Excluir", "Listar"};
        int opcao;
        FilmeController filmeCtrl = new FilmeController();
        // Laço controlador
        do {
            // Tratamento de erros
            try {
                opcao = JOptionPane.showOptionDialog(
                        null,
                        "Escolha uma das opções abaixo para manipular um filme",
                        "Faça sua escolha",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        escolha,
                        escolha[0]
                );
                switch (opcao){
                    // INSERIR
                    case 0:
                        titulo = JOptionPane.showInputDialog("Digite o título do filme:");
                        genero = JOptionPane.showInputDialog("Digite o gênero do filme:");
                        produtora = JOptionPane.showInputDialog("Digite a produtora do filme:");
                        System.out.println(filmeCtrl.inserirFilme(titulo, genero, produtora));
                        break;
                    // ALTERAR
                    case 1:
                        codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do filme que deseja alterar:"));
                        titulo = JOptionPane.showInputDialog("Digite o novo título do filme:");
                        genero = JOptionPane.showInputDialog("Digite o novo gênero do filme:");
                        produtora = JOptionPane.showInputDialog("Digite a nova produtora do filme:");
                        System.out.println(filmeCtrl.alterarFilme(codigo, titulo, genero, produtora));
                        break;
                    // EXCLUIR
                    case 2:
                        codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do filme que deseja excluir:"));
                        System.out.println(filmeCtrl.excluirFilme(codigo));
                        break;
                    // LISTAR
                    case 3:
                        JOptionPane.showMessageDialog(null, filmeCtrl.listarFilmes(), "lista", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        System.out.println("Opção Inválida!");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        } while (JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Controle", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 0);
        JOptionPane.showMessageDialog(null, "Fim de programa");
    }
}
