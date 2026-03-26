package br.com.fiap.main;

import br.com.fiap.bean.Radio;
import br.com.fiap.bean.Televisor;
import java.util.Scanner;

public class Main
{
    public static void main (String[] args)
    {
        //Mock test
        Radio radio1 = new Radio();

        //Atribuição de valores
        radio1.setVolume(99);
        radio1.setEstacao(89.1f);
        //Chamada de métodos
        radio1.aumentarVolume();
        radio1.aumentarVolume();
        radio1.aumentarVolume();
        //Exibição na tela
        System.out.printf("Estação: %.1f\nVolume: %d", radio1.getEstacao(), radio1.getVolume());

        Televisor televisor1 = new Televisor();
        Scanner scan = new Scanner(System.in);
        try {
            televisor1.setCanal(13);
            System.out.println("\n=======================");
            System.out.println("1-Definir outro canal?");
            System.out.println("2-Definir novo volume?");
            System.out.println("3-Aumentar volume?");
            System.out.println("4-Diminuir volume?");
            System.out.println("=======================");
            int opcao = scan.nextInt();

            if (opcao == 1) {
                System.out.print("Digite o número do canal desejado: ");
                televisor1.setCanal(scan.nextInt());
            } else if (opcao == 2){
                System.out.print("Defina o novo volume: ");
                televisor1.setVolume(scan.nextInt());
            } else if (opcao == 3){
                televisor1.aumentarVolume();
            } else if (opcao == 4){
                televisor1.diminuirVolume();
            }
            System.out.printf("Canal: %d\nVolume: %d", televisor1.getCanal(), televisor1.getVolume());
        } catch (Exception e) {
            System.out.println("Opção inválida");
        }
    }
}
