package br.com.fiap.bean;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;

public class Gestante
{
    // Atributos
    private String nome;
    private LocalDate dataDaGestacao;

    // Construtores
    public Gestante() {
    }

    public Gestante(String nome, LocalDate dataDaGestacao)
    {
        this.nome = nome;
        // this.dataDaGestacao = dataDaGestacao;
        // Regra de negócio no construtor
        setDataDaGestacao(dataDaGestacao);
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

    public LocalDate getDataDaGestacao()
    {
        return dataDaGestacao;
    }

    public void setDataDaGestacao(LocalDate dataDaGestacao)
    {
        // Classe LocalDate para pegar a data atual e dicionar um dia
        LocalDate dataAtual = LocalDate.now().plusDays(1);
        // Tratamento de erros
        try{
            // Condição: Data de gestão não pode ser maior que a data atual,
            // e o tempo de gestação não pode ser maior que 9 meses.
            if (dataDaGestacao.isBefore(dataAtual) && tempoDeGestacao() < 9) {
                this.dataDaGestacao = dataDaGestacao;
            } else {
                throw new Exception("Data de gestação fora da faixa permitida");
            }
        } catch (Exception e) {
            // Mensagem de erro com JOptionPane
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    // Métodos da classe
    public int tempoDeGestacao()
    {
        // Classe Local date para pegar a data atual
        LocalDate dataAtual = LocalDate.now();
        // Classe Period para calcular intervalo de tempo
        Period tempoGestacao = Period.between(dataAtual, dataDaGestacao);
        // Retorno dos meses apenas
        return tempoGestacao.getMonths();
    }
}
