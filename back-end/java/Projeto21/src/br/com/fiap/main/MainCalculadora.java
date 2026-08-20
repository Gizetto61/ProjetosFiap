package br.com.fiap.main;

import br.com.fiap.bean.Calculadora;

public class MainCalculadora {
    static void main() {
        Calculadora calculadora = new Calculadora();
        try {
            calculadora.setNumero1(10);
            calculadora.setNumero2(0);

            System.out.println(String.format("Números [%.2f] [%.2f]\nSoma: %.2f\nSubtração: %.2f\nMultiplicação: %.2f\nDivisão: %.2f", calculadora.getNumero1(), calculadora.getNumero2(), calculadora.adicao(), calculadora.subtracao(), calculadora.multi(), calculadora.divisao()));
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
