package br.com.fiap.bean;

public class Vendedor extends Funcionario
{
    // Atributos
    private float comissao;

    // Construtores
    public Vendedor(){
    }

    public Vendedor(String nome, float valorHoraTrabalho, float comissao)
    {
        super(nome, valorHoraTrabalho);
        this.comissao = comissao;
    }

    // Getter e Setter
    public float getComissao()
    {
        return comissao;
    }

    public void setComissao(float comissao)
    {
        this.comissao = comissao;
    }

    // Métodos exclusivos
    public float calcularSalario() {
        return super.calcularSalario() * (1 + comissao / 100);
    }
}
