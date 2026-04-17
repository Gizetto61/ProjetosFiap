package br.com.fiap.bean;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;

public class Pessoa
{
    // Atributos
    private String nome;
    private LocalDate dataNascimento;

    // Construtores
    public Pessoa() {
    }

    public Pessoa(String nome, LocalDate dataNascimento)
    {
        this.nome = nome;
        // this.dataNascimento = dataNascimento;
        // Aplicando regra de negócios no construtor usando o metodo setDataNascimento()
        setDataNascimento(dataNascimento);
    }

    //Getter e Setter
    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public LocalDate getDataNascimento()
    {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento)
    {
        try {
            // Criação e instanciação do objeto inicio com o valor "1900-01-01" menos um dia
            LocalDate inicio = LocalDate.parse("1900-01-01").minusDays(1);
            // Criação e instanciação do objeto dataAtual com o valor da data atual mais um dia
            LocalDate dataAtual = LocalDate.now().plusDays(1);
            // Condição para atribuição (não pode ser menor que 1900 e não pode ser maior[pode ser igual] que a data atual)
            if (dataNascimento.isAfter(inicio) && dataNascimento.isBefore(dataAtual)) {
                this.dataNascimento = dataNascimento;
            } else {
                // Mensagem de erro
                throw new Exception("Data de nascimento fora da faixa permitida");
            }
        } catch (Exception e) {
            // Exibição da mensagem de erro com JOptioPane
            JOptionPane.showMessageDialog(null, e.getMessage());
            // Encerrando o programa após mensagem de erro
            System.exit(0);
        }
    }

    // Métodos da classe
    public int calcularIdade()
    {
        // Criação e instanciação do objeto dataAtual (configurado para trazer a data atual do computador [metodo now()])
        LocalDate dataAtual = LocalDate.now();
        /*
            Criação e instanciação do objeto idade com a
            classe Period, para calcular o intervalo entre a data de nascimento e a data atual
        */
        Period idade = Period.between(dataNascimento, dataAtual);
        // Retorno do metodo getYears() para retornar o intervalo de anos no objeto idade
        return idade.getYears();
    }
}
