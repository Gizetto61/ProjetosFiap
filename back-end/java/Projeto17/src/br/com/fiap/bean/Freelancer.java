package br.com.fiap.bean;

/**
 * Classe Freelancer
 * Representação de uma alocação real que possui um salário baseado em horas de trabalho como CNPJ
 * @author Giovanni Zorzetto
 * @version 1.0
 * @since JDK21
 */
public class Freelancer implements Funcionario
{
    // Atributos
    private String nome;
    private float valorHoraTrabalho;
    private long CNPJ;

    // Construtores
    public Freelancer(){
    }

    public Freelancer(String nome, float valorHoraTrabalho, long CNPJ) {
        this.nome = nome;
        this.valorHoraTrabalho = valorHoraTrabalho;
        this.CNPJ = CNPJ;
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

    public long getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(long CNPJ) {
        this.CNPJ = CNPJ;
    }

    /**
     * Metodo calcularSalário, proveniente da interface Funcionário, sem passagem de parâmetro
     * que multiplica o valor da hora de trabalho com a quantidade de horas em uma semana, multiplica o resultado com
     * quatro semanas, e multiplica o resultado por 1.5
     * @return valor Real
     */
    // Metodos da Classe
    public float calcularSalario() {
        float salarioFreelancer = ((valorHoraTrabalho * 40) * 4) * 1.5f;
        return salarioFreelancer;
    }
}
