package br.com.fiap.main;

import br.com.fiap.bean.Quadrado;
import br.com.fiap.bean.Retangulo;
import br.com.fiap.bean.Triangulo;

import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        // Variáveis de Apoio
        String auxiliar;
        String escolha = "sim";
        float lado, altura, area;
        int opcao;
        // Laço para avaliar escolha do usuário
        while (escolha.equalsIgnoreCase("sim")){
            // Tratamento de erros
            try{
                // Menu
                auxiliar = JOptionPane.showInputDialog("Qual área deseja calcular?\n1 - Quadrado\n2 - Retângulo\n3 - Triângulo\n-> ");
                // Conerção de string para inteiro e armazenamento de auxiliar em opcao
                opcao = Integer.parseInt(auxiliar);
                switch (opcao){
                    case 1:
                        // Entrada de lado
                        auxiliar = JOptionPane.showInputDialog("Digite o valor do lado: ");
                        // Lado recebe a string auxiliar convertida para float
                        lado = Float.parseFloat(auxiliar);
                        // Criação e instanciação do objeto quadrado
                        Quadrado quadrado = new Quadrado(lado);
                        // Area chamando metodo
                        area = quadrado.calcularArea();
                        // Exibição
                        JOptionPane.showMessageDialog(null, String.format("Área do quadrado: %.1f", area));
                        break;
                    case 2:
                        // Entrada de lado
                        auxiliar = JOptionPane.showInputDialog("Digite o valor do lado: ");
                        // Lado recebe a string auxiliar convertida para float
                        lado = Float.parseFloat(auxiliar);
                        // Entrada de altura
                        auxiliar = JOptionPane.showInputDialog("Digite o valor da altura: ");
                        // Altura recebe a string auxiliar convertida para float
                        altura = Float.parseFloat(auxiliar);
                        // Criação e instanciação do objeto retangulo
                        Retangulo retangulo = new Retangulo(lado, altura);
                        // Area chamando metodo
                        area = retangulo.calcularArea();
                        // Exibição
                        JOptionPane.showMessageDialog(null, String.format("Área do retângulo: %.1f", area));
                        break;
                    case 3:
                        // Entrada de lado
                        auxiliar = JOptionPane.showInputDialog("Digite o valor do lado: ");
                        // Lado recebe a string auxiliar convertida para float
                        lado = Float.parseFloat(auxiliar);
                        // Entrada de altura
                        auxiliar = JOptionPane.showInputDialog("Digite o valor da altura: ");
                        // Altura recebe a string auxiliar convertida para float
                        altura = Float.parseFloat(auxiliar);
                        // Criação e instanciação do objeto triângulo
                        Triangulo triangulo = new Triangulo(lado, altura);
                        // Area chamando metodo
                        area = triangulo.calcularArea();
                        // Exibição
                        JOptionPane.showMessageDialog(null, String.format("Área do triângulo: %.1f", area));
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida");
                        continue;
                }
                escolha = JOptionPane.showInputDialog("Deseja continuar [sim/não]? ");
            } catch (Exception e) {
                // Mensagem de erro
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        // Mensagem de Despedida
        JOptionPane.showMessageDialog(null, "Fim de Programa, Volte sempre!");
    }

}

