package br.com.fiap.bean;

import javax.swing.*;

public class SuperHeroi {
    // Atributos
    private String nome;
    private String idSecreta;
    private String[] poderes;
    private String[] fraquezas;

    // Contrutores
    public SuperHeroi() {
    }

    public SuperHeroi(String nome, String idSecreta, String[] poderes, String[] fraquezas) {
        this.nome = nome;
        this.idSecreta = idSecreta;
        this.poderes = poderes;
        this.fraquezas = fraquezas;
    }

    // Getter e Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdSecreta() {
        return idSecreta;
    }

    public void setIdSecreta(String idSecreta) {
        this.idSecreta = idSecreta;
    }

    public String[] getPoderes() {
        return poderes;
    }

    public void setPoderes(String[] poderes) {
        this.poderes = poderes;
    }

    public String[] getFraquezas() {
        return fraquezas;
    }

    // Métodos exclusivos
    public void listarHeroi(){
        // 1° Formatação
        String exibe = String.format("Nome: %s\nIdentidade Secreta: %s\n");
        int contador = 1;
        // For each para exibição de poder
        for (String i : poderes){
            exibe += String.format("%d° Poder: %s", contador, i);
            contador++;
        }
        int contador2 = 1;
        // For each para exibição de poder
        for (String i : fraquezas){
            exibe += String.format("%d° Fraqueza: %s", contador2, i);
            contador2++;
        }
        // Exibição de lista
        JOptionPane.showMessageDialog(null, exibe, "Listar Heroi", JOptionPane.INFORMATION_MESSAGE);
    }

    public void setFraquezas(String[] fraquezas) {
        this.fraquezas = fraquezas;
    }
}
