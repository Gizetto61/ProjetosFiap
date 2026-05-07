package br.com.fiap.bean;

public class VigiaNoturno extends Funcionario
{
    // Atributos
    private float adicionalNoturno;

    // Construtores
    public VigiaNoturno() {
    }

    public VigiaNoturno(String nome, float valorHoraTrabalho, float adicionalNoturno)
    {
        super(nome, valorHoraTrabalho);
        this.adicionalNoturno = adicionalNoturno;
    }

    // Getter e Setter
    public float getAdicionalNoturno()
    {
        return adicionalNoturno;
    }

    public void setAdicionalNoturno(float adicionalNoturno)
    {
        this.adicionalNoturno = adicionalNoturno;
    }

    // Métodos exclusivos
    public float calcularSalario() {
        return super.calcularSalario() + adicionalNoturno;
    }
}
