/*
* Felipe Lima de Oliveira - rm569947
* Giovanni Zorzetto Oliveira - rm569464
* Raphael Gomes Brito - rm572637*/

package br.com.fiap.bean;

public class DespesaFamiliar
{
    //Atributos
    public double rendaFamiliar;
    public int numeroDeMoradores;
    public double gastoComLuz;
    public double gastoComAgua;
    public double gastoComInternet;
    public double valorMensalidadeDaAcademia;

    //Metodos
    public double calcularTotalDeDespesas()
    {
        //Calculo totDespesas
        //OBS: Todos fazem academia
        double totDespesas = gastoComLuz + gastoComAgua + gastoComInternet + (valorMensalidadeDaAcademia * numeroDeMoradores);
        //Retorno de valor
        return totDespesas;
    }

    public double calcularRendaFamiliarLiquida()
    {
        //Calculo rendaLiquida
        //Chamando o metodo calcularTotalDespesas para retornar o valor totDespesas e realizar o calculo
        double rendaLiquida = rendaFamiliar - calcularTotalDeDespesas();
        //Retorno de valor
        return rendaLiquida;
    }
}
