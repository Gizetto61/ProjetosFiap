package br.com.fiap.bean;

public class FolhaDePagamento
{
    //Atributos
    public double salarioBruto;
    public int numeroDeDependentes;
    public double descontoINSS;
    public double valorPlanoDeSaude;

    //Métodos
    public double calcularSalarioLiquido()
    {
        double salarioLiquido = salarioBruto - (salarioBruto * descontoINSS / 100 + (valorPlanoDeSaude * (numeroDeDependentes + 1)));
        return salarioLiquido;
    }
}
