package br.com.fiap.bean;

import java.time.LocalDate;

public class Pessoa
{
    // Atributos
    private String nome;
    private int anoNascimento;

    // Construtores
    public Pessoa() {
    }

    public Pessoa(String nome, int anoNascimento)
    {
        this.nome = nome;
        // this.anoNascimento = anoNascimento;
        // Contrutor com regra de negócio implementada do metodo setAnoNascimento
        setAnoNascimento(anoNascimento);
    }

    // Getter e Setter
    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public int getAnoNascimento()
    {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento)
    {
        // Aplicando regra de negócio
        // Tratamento erros
        try {
            // Classe LocalDate - Trabalhar com datas
            // Classe LocalTime - Trabalhar com hora
            // Classe LocalDateTime - Trabalhar com datas e hora
            // Criação e inicialização com a data atual no objeto dataAtual
            LocalDate dataAtual = LocalDate.now();
            // Só é permitido idade entre 1900 e o ano atual
            if (anoNascimento >= 1900 && anoNascimento <= dataAtual.getYear()) {
                this.anoNascimento = anoNascimento;
            } else {
                throw new Exception("Valor inválido! [min-1900 | máx-Ano Atual]");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Métodos
    public int calcularIdade(int anoAtual)
    {
        return anoAtual - anoNascimento;
    }
}