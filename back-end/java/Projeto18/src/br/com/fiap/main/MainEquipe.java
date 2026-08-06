package br.com.fiap.main;

import br.com.fiap.bean.Equipe;

import javax.swing.*;

public class MainEquipe {
    static void main() {
        // Criação do objeto grupo da classe Equipe
        Equipe grupo;
        // Variáveis de apoio
        String nome;
        String[] integrantes;
        int quantidade;
        // Estrutura de repetição
        do {
            // Tratamento de erros
            try{
                // Entrada de dados
                nome = JOptionPane.showInputDialog("Digite o nome da equipe: ");
                quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de integrantes"));
                // Definindo tamanho do vetor com base na quantidade informada
                integrantes = new String[quantidade];
                // Percorrendo vetor com for, usando metodo length
                for (int i = 0; i < integrantes.length; i++) {
                    // Entrada formatada
                    integrantes[i] = JOptionPane.showInputDialog(String.format("Integrante %d:", (i + 1)));
                }
                // Instanciação do objeto grupo com construtor com passagem de parâmetro
                grupo = new Equipe(nome, integrantes);
                // Metodo listarEquipe()
                grupo.listarEquipe();
            } catch (Exception e) {
                // Mensagem de erro
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        // Condição do While com showConfirmDialog
        } while (JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
        // Mensagem de despedida
        JOptionPane.showMessageDialog(null, "Fim de programa", "Adeus", JOptionPane.WARNING_MESSAGE);
    }
}
