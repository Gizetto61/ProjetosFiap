package br.com.fiap.bean;

public class Funcionario
{
    // Atributos
    private String nome;
    private float valorHoraTrabalho;

    // Construtores
    public Funcionario()
    {

    }

    public Funcionario(String nome, float valorHoraTrabalho)
    {
        this.nome = nome;
        this.valorHoraTrabalho = valorHoraTrabalho;
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

    public float getValorHoraTrabalho()
    {
        return valorHoraTrabalho;
    }

    public void setValorHoraTrabalho(float valorHoraTrabalho)
    {
        this.valorHoraTrabalho = valorHoraTrabalho;
    }

    // Métodos Exclusivos
    public float calcularSalario()
    {
        return valorHoraTrabalho * 40 * 4;
    }
}
