package br.com.fiap.bean;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;

public class Equipe {
    // Atributos
    private String nome;
    private ArrayList<String> integrantes;

    // Contrutores
    public Equipe(){
    }

    public Equipe(String nome, ArrayList<String> integrantes) {
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

    public ArrayList<String> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(ArrayList<String> integrantes) {
        this.integrantes = integrantes;
    }

    // Metodos exclusivos
    public void listarEquipe(){
        // 1ª Atribuição da String exibe
        String exibe = String.format("Nome da equipe: %s\n", nome);
        // Organizar a lista em nome alfabética
        Collections.sort(integrantes);
        int contador = 1;
        // Laço para percorrer cada elemento da lista
        for (String i : integrantes){
            // 2{ Atribuição da String exibe
            exibe += String.format("Integrante %d: %s\n", contador, i);
            contador++;
        }
        // Impressão com JOptionPane
        JOptionPane.showMessageDialog(null, exibe, "Listagem de equipe", JOptionPane.INFORMATION_MESSAGE);
    }
}
