package br.com.fiap.main;

import br.com.fiap.bean.SuperHeroi;

import javax.swing.*;

public class MainHeroi {
    static void main() {
        // Variáveis e objeto de apoio
        SuperHeroi heroi;
        String nome, idSecreta;
        String[] poderes;
        String[] fraquezas;
        // Laço de controle
        do {
            // Tratamento de erros
            try {
                // Entrada de Dados
                nome = JOptionPane.showInputDialog("Digite o nome do Herói:");
                idSecreta = JOptionPane.showInputDialog("Digite a identidade secreta do Herói:");
                int qtdPoder = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de poderes do herói:"));
                int qtdFraqueza = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de fraquezas do herói:"));
                // Novos vetores com quantidades estabelecidas pelo usuário
                poderes = new String[qtdPoder];
                fraquezas = new String[qtdFraqueza];
                // Laços para preencher os vetores
                for (int i = 0; i < poderes.length; i++) {
                    poderes[i] = JOptionPane.showInputDialog(String.format("Poder %d:", (i + 1)));
                }
                for (int i = 0; i < fraquezas.length; i++) {
                    poderes[i] = JOptionPane.showInputDialog(String.format("Fraqueza %d:", (i + 1)));
                }
                // Intanciação de objeto
                heroi = new SuperHeroi(nome, idSecreta, poderes, fraquezas);
                // Chamada de metodo
                heroi.listarHeroi();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } while (JOptionPane.showConfirmDialog(null, "Deseja continuar", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
        JOptionPane.showMessageDialog(null, "Fim de programa", "Despedida", JOptionPane.WARNING_MESSAGE);
    }
}
