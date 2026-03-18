package br.com.fiap;

import java.util.Scanner;

public class ExercicioMedia
{
    public static void main(String[] args)
    {
        //Declaração de variáveis
        double n1, n2, n3, n4;
        //Inicialização do objeto scan
        Scanner scan = new Scanner(System.in);

        try {
            //Entrada de dados
            System.out.println("Digite a primeira nota:");
            //Leitura de dados
            n1 = scan.nextDouble();
            //Entrada de dados
            System.out.println("Digite a segunda nota:");
            //Leitura de dados
            n2 = scan.nextDouble();
            //Entrada de dados
            System.out.println("Digite a terceira nota:");
            //Leitura de dados
            n3 = scan.nextDouble();
            //Entrada de dados
            System.out.println("Digite a quarta nota:");
            //Leitura de dados
            n4 = scan.nextDouble();

            //Declaração de Média
            double media = (n1 + n2 + n3 + n4) / 4;

            //Exibição de resultado
            System.out.println("Nota 1: " + n1 + "\nNota 2: " + n2 + "\nNota 3: " + n3 + "\nNota 4: " + n4 + "\nMédia: " + media);
        } catch (Exception e) {
            System.out.println("Formato numérico incorreto");
        }
    }
}
