package br.com.fiap.main;

import br.com.fiap.bean.Geometria;

import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        // Criação e instanciação do objeto geo1
        Geometria geo1 = new Geometria();
        // variável auxiliar para JOptioPane
        String auxiliar;
        // Condição para laço
        String escolha = "sim";
        // opção menu
        int opcao;
        // Variáveis de uso no main
        float lado, altura;
        double raio;
        while (escolha.equalsIgnoreCase("sim")){
            try {
                // Exibição de menu
                auxiliar = JOptionPane.showInputDialog("Qual área deseja calcular?\n1 - Quadrado\n2 - Retângulo\n3 - Círculo");
                opcao = Integer.parseInt(auxiliar);
                // Condicional analisando a opção
                switch (opcao){
                    // Calcular área do quadrado
                    case 1:
                        auxiliar = JOptionPane.showInputDialog("Digite o valor do lado do quadrado: ");
                        // Transformar string em float
                        lado = Float.parseFloat(auxiliar);
                        geo1.calcularArea(lado);
                        break;
                    // Calcular área do retângulo
                    case 2:
                        auxiliar = JOptionPane.showInputDialog("Digite o valor do lado do retângulo: ");
                        // Transformar string em float
                        lado = Float.parseFloat(auxiliar);
                        auxiliar = JOptionPane.showInputDialog("Digite a altura do retângulo: ");
                        // Transformar string em float
                        altura = Float.parseFloat(auxiliar);
                        geo1.calcularArea(lado, altura);
                        break;
                    // Calcular área do círculo
                    case 3:
                        auxiliar = JOptionPane.showInputDialog("Digite o valor do raio do círculo: ");
                        // Transformar string em double
                        raio = Double.parseDouble(auxiliar);
                        geo1.calcularArea(raio);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida");
                }
                escolha = JOptionPane.showInputDialog("Deseja continuar?");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        JOptionPane.showMessageDialog(null, "Fim de programa!");
    }
}
