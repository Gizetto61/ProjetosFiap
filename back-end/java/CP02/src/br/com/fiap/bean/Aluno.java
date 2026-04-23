package br.com.fiap.bean;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;

public class Aluno
{
    // Atributos
    private int registroMatricula;
    private String nomeCompleto;
    private LocalDate dataDeNascimento;

    // Construtores
    public Aluno() {
    }

    public Aluno(int registroMatricula, String nomeCompleto, LocalDate dataDeNascimento)
    {
        // this.registroMatricula = registroMatricula;
        // Regra de negócio no Construtor
        setRegistroMatricula(registroMatricula);
        this.nomeCompleto = nomeCompleto;
        // this.dataDeNascimento = dataDeNascimento;
        // Regra de negócio no Construtor
        setDataDeNascimento(dataDeNascimento);
    }

    // Getter e Setter
    public int getRegistroMatricula()
    {
        return registroMatricula;
    }

    public void setRegistroMatricula(int registroMatricula)
    {
        // Tratamento de Erros
        try{
            // Condição para atribuição de valor ao atributo registroMatricula
            if (registroMatricula >= 80000 && registroMatricula <= 599999) {
                this.registroMatricula = registroMatricula;
            } else {
                throw new Exception("Faixa de matrícula não permitida");
            }
        } catch (Exception e) {
            // Mensagem de erro
            JOptionPane.showMessageDialog(null, e.getMessage());
            // Encerrando o programa após mensagem de erro
            System.exit(0);
        }
    }

    public String getNomeCompleto()
    {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto)
    {
        this.nomeCompleto = nomeCompleto;
    }

    public LocalDate getDataDeNascimento()
    {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento)
    {
        try {
            // Criação e instanciação do objeto inicio com o valor "1960-01-01" menos um dia
            LocalDate inicio = LocalDate.parse("1960-01-01").minusDays(1);
            // Criação e instanciação do objeto dataAtual com o valor da data atual mais um dia
            LocalDate dataAtual = LocalDate.now().plusDays(1);
            // Condição para atribuição (não pode ser menor que 1900 e não pode ser maior[pode ser igual] que a data atual)
            if (dataDeNascimento.isAfter(inicio) && dataDeNascimento.isBefore(dataAtual)) {
                this.dataDeNascimento = dataDeNascimento;
            } else {
                // Mensagem de erro
                throw new Exception("Data de nascimento fora da faixa permitida");
            }
        } catch (Exception e) {
            // Exibição da mensagem de erro com JOptionPane
            JOptionPane.showMessageDialog(null, e.getMessage());
            // Encerrando o programa após mensagem de erro
            System.exit(0);
        }
    }

    // Métodos Específicos
    public String calcularIdadeCompleta(LocalDate dataAtual)
    {
        // Classe Period para calcular o intervalo de tempo entre a data de nascimento e a data atual
        Period idade = Period.between(dataDeNascimento, dataAtual);
        // Atribuição em uma String para retorno de valor usando String.format()
        String idadeCompleta = String.format(idade.getYears() + " anos, " + idade.getMonths() + " meses, " + idade.getDays() + " dias.");
        // Retorno de valor
        return idadeCompleta;
    }
}
