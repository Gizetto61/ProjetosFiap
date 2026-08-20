package br.com.fiap.main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo {
    static void main() {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Digite um número inteiro entre 1 e 10: ");
            int num1 = scan.nextInt();
            if (num1 < 1 || num1 > 10) {
                throw new Exception("Valor informado fora da faixa permitida");
            }
            System.out.println("Digite outro número inteiro: ");
            int num2 = scan.nextInt();
            int numero = num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println("Erro aritmético: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Erro de conversão: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro genérico: " + e.getMessage());
        } finally {
            scan.close();
            System.out.println("Fim de programa");
        }
    }
}
