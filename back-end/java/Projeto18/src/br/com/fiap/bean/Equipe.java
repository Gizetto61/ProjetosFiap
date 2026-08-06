package br.com.fiap.bean;

import javax.swing.*;

public class Equipe {
    // Atributos
    private String nome;
    private String[] integrantes;

    // Contrutor
    public Equipe() {
    }

    public Equipe(String nome, String[] integrantes) {
        this.nome = nome;
        this.integrantes = integrantes;
    }

    // Getter e Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String[] getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(String[] integrantes) {
        this.integrantes = integrantes;
    }

    // Metodos Exclusivos
    public void listarEquipe(){
        // Primeira formatação na string exibe
        String exibe = String.format("Neme da Equipe: %s\n", nome);
        // Contador de vetor
        int contador = 1;
        // For each para percorrer integrantes
        for (String i : integrantes) {
            // Segunda formatação na string exibe
            exibe += String.format("Integrante: %d: %s \n", contador, i);
            contador++;
        }
        // Exibição com JOptionPane
        JOptionPane.showMessageDialog(null, exibe, "Listagem de equipe", JOptionPane.INFORMATION_MESSAGE);
    }
}
