package br.com.fiap.main;

import br.com.fiap.bean.Gestante;

import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main2
{
    public static void main(String[] args)
    {
        Gestante gestante1;
        String auxiliar, nome;
        LocalDate dataGestacao;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try{
            nome = JOptionPane.showInputDialog("Digite o nome da gestante: ");
            auxiliar = JOptionPane.showInputDialog("Digite a data do início da gestação (dia/mês/ano): ");
            // Arruamndo a string (ano-mês-dia) -> "21/12/2012"
            String ano = auxiliar.substring(6, 10);
            String mes = auxiliar.substring(3, 5);
            String dia = auxiliar.substring(0, 2);
            String dataEUA = ano + "-" + mes + "-" + dia;
            dataGestacao = LocalDate.parse(dataEUA);
            gestante1 = new Gestante(nome, dataGestacao);

            JOptionPane.showMessageDialog(null, String.format("Nome: %s\nData da Gestação: %s\nTempo de Gestação: %d", gestante1.getNome(), gestante1.getDataDaGestacao().format(dtf), gestante1.tempoDeGestacao()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
