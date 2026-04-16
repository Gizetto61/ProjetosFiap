package br.com.fiap.main;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class FormataData
{
    public static void main(String[] args)
    {
        LocalDate dataAtual = LocalDate.now();
        LocalDate fimDosTempos = LocalDate.parse("2012-12-21");
        Period bonus = Period.between(fimDosTempos, dataAtual);
        System.out.printf("Desde o fim dos tempos, passaram: %d anos, %d meses, %d dias\n",
                bonus.getYears(), bonus.getMonths(), bonus.getDays());

        System.out.println(fimDosTempos);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(fimDosTempos.format(dtf));

    }
}
