package br.com.fiap.bean;

/**
 * Classe VigiaNoturno
 * Representação de uma alocação real que possui um salário baseado em horas de trabalho e adicional noturno
 * @author Giovanni Zorzetto
 * @version 1.0
 * @since JDK21
 */
public class VigiaNoturno implements Funcionario
{
    // Atributos
    private String nome;
    private float valorHoraTrabalho;
    private float adicionalNoturno;

    // Construtores
    public VigiaNoturno(){
    }

    public VigiaNoturno(String nome, float valorHoraTrabalho, float adicionalNoturno) {
        this.nome = nome;
        this.valorHoraTrabalho = valorHoraTrabalho;
        this.adicionalNoturno = adicionalNoturno;
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

    public float getAdicionalNoturno() {
        return adicionalNoturno;
    }

    public void setAdicionalNoturno(float adicionalNoturno) {
        this.adicionalNoturno = adicionalNoturno;
    }

    /**
     * Metodo calcularSalário, proveniente da interface Funcionário, sem passagem de parâmetro
     * que multiplica o valor da hora de trabalho com a quantidade de horas em uma semana e multiplica o resultado com
     * quatro semana mais o adicional noturno
     * @return valor Real
     */
    // Metodos da classe
    public float calcularSalario() {
        float salarioVigia = ((valorHoraTrabalho * 40) * 4 + adicionalNoturno);
        return salarioVigia;
    }
}
