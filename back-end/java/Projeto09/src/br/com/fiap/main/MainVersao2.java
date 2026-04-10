package br.com.fiap.main;

import br.com.fiap.bean.Pessoa;

import java.util.Scanner;

public class MainVersao2
{
    public static void main(String[] args)
    {
        // Criação de objeto
        Pessoa pessoa1;
        Scanner scan;

        // Tratamento de erros
        try{
            // Instanciação do objeto scan
            scan = new Scanner(System.in);

            // Entrada de dados
            System.out.println("Digite seu nome e ano de nascimento: ");
            // Instanciação do objeto pessoa1
            pessoa1 = new Pessoa(scan.nextLine(), scan.nextInt());

            // Exibição de status do objeto
            System.out.printf("Nome: %s\nIdade: %d anos", pessoa1.getNome(), pessoa1.calcularIdade(2026));
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
}
