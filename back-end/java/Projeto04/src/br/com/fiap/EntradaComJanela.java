package br.com.fiap;

import javax.swing.*;

public class EntradaComJanela
{
    public static void main(String[] args)
    {
        //Declaração de variáveis
        int num1, num2, resultado;
        String auxiliar;
        //Tratamento de erros
        try {
            //Maneira de extrair dados do usuário usando Javax
            auxiliar = JOptionPane.showInputDialog("Digite um número inteiro:");
            //Conversão de tipo primitivo
            num1 = Integer.parseInt(auxiliar);
            //Maneira de extrair dados do usuário usando Javax
            auxiliar = JOptionPane.showInputDialog("Digite outro número inteiro:");
            //Conversão de tipo primitivo
            num2 = Integer.parseInt(auxiliar);
            //Soma dos números
            resultado = num1 + num2;
            //Maneira de exibir mensagem com resultados usando Javax com concatenação
            JOptionPane.showMessageDialog(null, "Valor 1:" + num1 + "\nValor 2: " + num2 + "\nSomatório: " + resultado);
        } catch (Exception e) {
            //Maneira de exibir mensagem com resultados usando Javax com concatenação
            JOptionPane.showMessageDialog(null, "Formato de número incorreto");
        }
    }
}
