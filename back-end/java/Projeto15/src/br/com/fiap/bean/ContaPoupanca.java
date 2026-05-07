package br.com.fiap.bean;

public class ContaPoupanca extends ContaBancaria
{
    // Atributos
    private int diaDeRendimento;

    // Construtor
    public ContaPoupanca(){
    }

    // Getter e Setter
    public int getDiaDeRendimento()
    {
        return diaDeRendimento;
    }

    public void setDiaDeRendimento(int diaDeRendimento)
    {
        this.diaDeRendimento = diaDeRendimento;
    }

    // Métodos exclusivos
    public float novoSaldo(float rendimento)
    {
        setSaldo((getSaldo() * rendimento) + getSaldo());
        return getSaldo();
    }
}
