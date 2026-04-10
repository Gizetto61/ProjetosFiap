package br.com.fiap.main;

import br.com.fiap.bean.Pessoa;

public class Main
{
    public static void main(String[] args)
    {
        // Criação e instanciação
        // Construtor vazio
        Pessoa pessoa1 = new Pessoa();
        // Atribuição de valor
        pessoa1.setNome("Astrogildo");
        pessoa1.setAnoNascimento(1998);
        // Exibição de status do objeto
        System.out.printf("Nome: %s\nIdade: %d anos\n\n", pessoa1.getNome(), pessoa1.calcularIdade(2026));

        // Criação e instanciação
        // Construtor com passagem de parâmetro
        // Atribuição de valor
        Pessoa pessoa2 = new Pessoa("Berisvaldo", 1500);
        // Exibição de status do objeto
        System.out.printf("Nome: %s\nIdade: %d anos", pessoa2.getNome(), pessoa2.calcularIdade(2026));
    }
}