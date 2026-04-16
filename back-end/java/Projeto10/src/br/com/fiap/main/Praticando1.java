package br.com.fiap.main;

import java.util.Scanner;

public class Praticando1
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String frase;
        System.out.printf("Digite uma frase: ");
        frase = scan.nextLine();
        System.out.println("===================================");
        System.out.printf("A frase digitada foi:\n%s\n", frase);
        System.out.printf("Ela possui %d caracteres\n", frase.length());
        System.out.printf("E ela toda em maiúscula fica assim:\n- %s\n", frase.toUpperCase());
        System.out.println("===================================");
        System.out.println("\nAgora digite a palavra que deseja mudar e a palavra substituta: ");
        String palavra = scan.next();
        String substituta = scan.next();
        String novaFrase = frase.replace(palavra, substituta);
        System.out.println("-----------------------------------");
        System.out.printf("A nova frase ficou assim:\n- %s\n", novaFrase);
        System.out.printf("E tem %d caracteres\n", novaFrase.length());
        System.out.println("-----------------------------------");
    }
}
