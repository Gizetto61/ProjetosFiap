package br.com.fiap.main;

import br.com.fiap.bean.ArCondicionado;
import br.com.fiap.bean.Televisor;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        // Mock Test
        //Criação e instanciação do objeto ar1
        ArCondicionado ar1 = new ArCondicionado();
        // Criação do objeto scanner
        Scanner scanner;
        // Variável de controle
        int opcao;

        // Tratamento de erros
        try{
            // Instanciação do objeto scanner
            scanner = new Scanner(System.in);
            // Entrada de dados iniciáis
            System.out.println("Digite um temperatura e um modo inicial: ");
            ar1.setTemperatura(scanner.nextInt());
            ar1.setModo(scanner.nextLine());

            // MENU
            System.out.println("=================================");
            System.out.println("O que deseja fazer?");
            System.out.println("1 - Mudar temperatura\n2 - Mudar modo\n3 - Aumentar temperatura\n4 - Diminuir temperatura");
            System.out.println("=================================");
            System.out.print("-> ");
            opcao = scanner.nextInt();

            // Análise da opção
            switch (opcao){
                case 1:
                    System.out.print("Digite a NOVA temperatura: ");
                    ar1.setTemperatura(scanner.nextInt());
                    break;
                case 2:
                    System.out.print("Digite o NOVO modo: ");
                    ar1.setModo(scanner.nextLine());
                    break;
                case 3:
                    ar1.aumentarTemperatura();
                    System.out.println("Aumentando...");
                    break;
                case 4:
                    ar1.diminuirTemperatura();
                    System.out.println("Diminuindo...");
                    break;
                default:
                    System.out.println("Opção inálida!");
                    break;
            }

            // Exibindo Status do objeto ar1
            System.out.println("-------------------------------------");
            System.out.printf("Modo: %s\nTemperatura: %d", ar1.getModo(), ar1.getTemperatura());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Mock Test
        // Criação e instanciação do objeto tv1
        Televisor tv1 = new Televisor();
        // Criação do objeto scan
        Scanner scan;
        int escolha;

        //Tratamento de erros
        try{
            // Instanciação do objeto scan
            scan = new Scanner(System.in);
            // Entrada de Dados
            System.out.print("Escolha um canal e defina o volume: ");
            tv1.setCanal(scan.nextInt());
            tv1.setVolume(scan.nextInt());

            // Menu
            System.out.println("=============================");
            System.out.println("Faça a sua escolha:");
            System.out.println("1 - Definir canal\n2 - Definir volume\n3 - Aumentar volume\n4 - Diminuir volume");
            System.out.println("=============================");
            System.out.print("-> ");
            escolha = scan.nextInt();

            // Análise da escolha
            if (escolha == 1) {
                System.out.print("Escolha um NOVO canal: ");
                tv1.setCanal(scan.nextInt());
            } else if (escolha == 2) {
                System.out.println("Escolha um NOVO volume: ");
                tv1.setVolume(scan.nextInt());
            } else if (escolha == 3) {
                tv1.aumentarVolume();
                System.out.println("Aumentando volume...");
            } else if (escolha == 4) {
                tv1.diminuirVolume();
                System.out.println("Diminuindo volume...");
            } else {
                System.out.println("Opção inválida!");
            }

            // Exibição de status do objeto tv1
            System.out.printf("Canal: %d\nVolume: %d", tv1.getCanal(), tv1.getVolume());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
