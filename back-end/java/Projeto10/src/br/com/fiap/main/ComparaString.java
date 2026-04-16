package br.com.fiap.main;

import java.util.Scanner;

public class ComparaString
{
    public static void main(String[] args)
    {
        String senha;
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite sua senha: ");
        senha = scan.next();
        // Verificando se as Strings são idênticas
        if (senha.equals("P4ssw0rD")) {
            System.out.println("Teste 1: Acesso concedido!");
        } else {
            System.out.println("Teste 1: Acesso negado!");
        }

        // Verificando se as Strings são iguáis
        if (senha.equalsIgnoreCase("P4ssw0rD")) {
            System.out.println("Teste 2: Acesso autorizado!");
        } else {
            System.out.println("Teste 2: Acesso proibido!");
        }
    }
}
