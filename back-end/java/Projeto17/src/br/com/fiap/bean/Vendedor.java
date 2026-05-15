package br.com.fiap.bean;

/**
 * Classe Vendedor
 * Representação de uma alocação real que possui um salário baseado em horas de trabalho e comissão por vendas
 * @author Giovanni Zorzetto
 * @version 1.0
 * @since JDK21
 */
public class Vendedor implements Funcionario
{
    // Atributos
    private String nome;
    private float valorHoraTrabalho;
    private float comissao;

    // Construtores
    public Vendedor(){
    }

    public Vendedor(String nome, float valorHoraTrabalho, float comissao) {
        this.nome = nome;
        this.valorHoraTrabalho = valorHoraTrabalho;
        this.comissao = comissao;
    }

    // Getter e Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValorHoraTrabalho() {
        return valorHoraTrabalho;
    }

    public void setValorHoraTrabalho(float valorHoraTrabalho) {
        this.valorHoraTrabalho = valorHoraTrabalho;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    /**
     * Metodo calcularSalário, proveniente da interface Funcionário, sem passagem de parâmetro
     * que multiplica o valor da hora de trabalho com a quantidade de horas em uma semana, multiplica o resultado com
     * quatro semanas, e multiplica o resultado pela porcentagem da comissão
     * @return valor Real
     */
    // Metodos da classe
    public float calcularSalario() {
        float salarioVendedor = (((valorHoraTrabalho * 40) * 4) * (1 + comissao / 100));
        return salarioVendedor;
    }
}
