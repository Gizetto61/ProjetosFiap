package br.com.fiap.main;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Praticando2
{
    public static void main(String[] args)
    {
        String auxiliar;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        auxiliar = JOptionPane.showInputDialog("Digite uma data inicial: ");
        LocalDate dataInicial = LocalDate.parse(auxiliar);
        auxiliar = JOptionPane.showInputDialog("Digite uma data final: ");
        LocalDate dataFinal = LocalDate.parse(auxiliar);
        Period periodo = Period.between(dataInicial, dataFinal);
        JOptionPane.showMessageDialog(null, "Data inicial:" + dataInicial.format(dtf) + "\nData Final: " + dataFinal.format(dtf) + "\nEntre as datas fornecidas existem " + periodo.getYears() + " anos, " + periodo.getMonths() + " meses e " + periodo.getDays() + " dias.");

    }
}
