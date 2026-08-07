package br.com.fiap.main;

import br.com.fiap.bean.Equipe;

import javax.swing.*;
import java.util.ArrayList;

public class MainEquipe {
    static void main() {
        // Variáveis e objeto de apoio
        Equipe grupo;
        String nome, membro;
        ArrayList<String> integrantes;
        // Laço de controle de execução
        do {
            // Tratamento de erros
            try {
                nome = JOptionPane.showInputDialog("Digite o nome da equipe:");
                // Intanciação da lista
                integrantes = new ArrayList<>();
                // Laço para preenche a lista
                do {
                    membro = JOptionPane.showInputDialog("Informe um integrante desta equipe ou digite \"fim\" para encerrar:");
                    // Condição para adicionar a lista
                    if (!membro.equalsIgnoreCase("fim")) {
                        integrantes.add(membro);
                    }
                // Condição de saída do loop
                } while (!membro.equalsIgnoreCase("fim"));
                // Intanciação do objeto grupo
                grupo = new Equipe(nome, integrantes);
                // Metodo listarEquipe
                grupo.listarEquipe();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } while (JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
        JOptionPane.showMessageDialog(null, "Fim de programa", "Adeus", JOptionPane.WARNING_MESSAGE);
    }
}
