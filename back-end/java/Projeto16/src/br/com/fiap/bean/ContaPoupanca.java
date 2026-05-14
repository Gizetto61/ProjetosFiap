package br.com.fiap.bean;

/**
 * Classe para objetos do tipo Conta Poupanca
 * @author Giovanni Zorzetto Oliveira
 * @version 1.0.0
 * @since Java 21
 *
 */
public class ContaPoupanca implements ContaBancaria
{
    // Atributos
    private int numConta;
    private float saldo;

    // Construtores
    public ContaPoupanca(){
    }

    // Getter e Setter
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    // Metodos da classe

    /**
     * Permite sacar o valor informado.
     * Valor a ser sacado não pode ser superior ao valor do saldo atual.
     * @param valor indica o valor a ser sacado
     * @return (float) valor do saldo atualizado
     */
    public float sacar(float valor) {
        try{
            if (valor <= saldo) {
                saldo -= valor;
            } else {
                throw new Exception("Saldo induficiente");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return saldo;
    }

    /**
     * Permite depositar o valor informado.
     * @param valor indica valor a ser depositado
     * @return (float) valor do saldo atualizado
     * @author Berisvaldo Berílio
     */
    public float depositar(float valor) {
        saldo += valor;
        return saldo;
    }
}
