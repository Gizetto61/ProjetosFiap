package br.com.fiap.main;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class PokemonHashMap {
    static void main() {
        // Declaração e instanciação de objeto
        HashMap<String, String> pokemon = new HashMap<>();
        // Laço até o usuário quiser
        do {
            // Tratamento de erros
            try {
                // Variáveis de apoio
                String nome, tipo;
                // Laço até o usuário digitar fim
                do {
                    nome = JOptionPane.showInputDialog("Digite o nome do pokemon ou \"Fim\" para encerrar:");
                    // Primeira verificação
                    if (!nome.equalsIgnoreCase("Fim")) {
                        // Segunda Verificação
                        if (pokemon.containsKey(nome)) {
                            JOptionPane.showMessageDialog(null, "Pokemon já cadastrado!");
                        } else {
                            tipo = JOptionPane.showInputDialog("Digite qual o tipo do Pokemon {" + nome + "}:").toUpperCase();
                            pokemon.put(nome, tipo);
                            JOptionPane.showMessageDialog(null, "Pokemon cadastrado!");
                        }
                    }
                } while (!nome.equalsIgnoreCase("fim"));
                // Pesquisa pelo valor dentro do Map
                String escolha = JOptionPane.showInputDialog("Digite o tipo de pokemon que deseja consultar:").toUpperCase();
                // Condicional para verificar se há o tipo
                if (pokemon.containsValue(escolha)) {
                    // Laço para percorrer o Map
                    for (Map.Entry<String, String> valor : pokemon.entrySet()) {
                        // Verificação de valor igual a escolha do usuário
                        if (valor.getValue().equalsIgnoreCase(escolha)) {
                            JOptionPane.showMessageDialog(null, "Nome: " + valor.getKey());
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Valor não cadastrado");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } while (JOptionPane.showConfirmDialog(null, "Deseja Continuar?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
        JOptionPane.showMessageDialog(null, "Fim de programa");
    }
}
