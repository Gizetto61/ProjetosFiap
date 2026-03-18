package br.com.fiap;

import javax.swing.*;

public class ExercicioMediaJX
{
    public static void main(String[] args)
    {
        //Declaração de variáveis
        double n1, n2, n3, n4;
        String auxiliar;

        try {
            //Extração de dados
            auxiliar = JOptionPane.showInputDialog("Digite a primeira nota:");
            //Converção de tipo primitivo
            n1 = Double.parseDouble(auxiliar);
            //Extração de dados
            auxiliar = JOptionPane.showInputDialog("Digite a segunda nota:");
            //Converção de tipo primitivo
            n2 = Double.parseDouble(auxiliar);
            //Extração de dados
            auxiliar = JOptionPane.showInputDialog("Digite a terceira nota:");
            //Converção de tipo primitivo
            n3 = Double.parseDouble(auxiliar);
            //Extração de dados
            auxiliar = JOptionPane.showInputDialog("Digite a quarta nota:");
            //Converção de tipo primitivo
            n4 = Double.parseDouble(auxiliar);
            //Declaração da média
            double media = (n1 + n2 + n3 + n4) / 4;
            //Exibição de resultado
            JOptionPane.showMessageDialog(null, "Nota 1: " + n1 + "\nNota 2: " + n2 + "\nNota 3: " + n3 + "\nNota 4: " + n4 + "\nMédia: " + media);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
