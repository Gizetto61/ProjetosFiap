package br.com.fiap.main;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {
    static void main() {
        HashMap<String, String> mapa = new HashMap<>();
        do {
            try {
                // Cadastro de UF e Estados
                String sigla, estado;
                do {
                    sigla = JOptionPane.showInputDialog("Digite a UF (Unidade Federal) de um estado\nou digite \"FIM\" para encerrar:").toUpperCase();
                    if (!sigla.equalsIgnoreCase("fim")) {
                        if (mapa.containsKey(sigla)) {
                            JOptionPane.showMessageDialog(null, "Estado já cadastrado");
                        } else {
                            estado = JOptionPane.showInputDialog("Digite o nome completo do Estado informado:");
                            mapa.put(sigla, estado);
                        }
                    }
                } while (!sigla.equalsIgnoreCase("fim"));
                // pesquisando um estado pela sua sigla
                String escolha = JOptionPane.showInputDialog("Digite uma UF de um estado qualquer:").toUpperCase();
                if (mapa.containsKey(escolha)) {
                    JOptionPane.showMessageDialog(null, "Nome do Estado: " + mapa.get(escolha));
                } else {
                    JOptionPane.showMessageDialog(null, "Estado não cadastrado:");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } while (JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
    }
}
