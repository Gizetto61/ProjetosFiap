package br.com.fiap.bean;

public class Funcionario
{
    // Atributos
    private String nome;
    private float valorHoraTrabalho;

    // Construtores
    public Funcionario() {
    }

    public Funcionario(String nome, float valorHoraTrabalho)
    {
        this.nome = nome;
        // this.valorHoraTrabalho = valorHoraTrabalho;
        // Contrutor com regra de negócio implementada
        setValorHoraTrabalho(valorHoraTrabalho);
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
        // Tratamento de erros
        try{
            // Regra de negócio
            if (valorHoraTrabalho > 0) {
                this.valorHoraTrabalho = valorHoraTrabalho;
            } else {
                throw new Exception("Valor Inválido! [apenas valores acima de 0]");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Métodos
    public float calcularSalario(float qtdHorasTrabalhadaSemana)
    {
        return (qtdHorasTrabalhadaSemana * valorHoraTrabalho) * 4;
    }
}
