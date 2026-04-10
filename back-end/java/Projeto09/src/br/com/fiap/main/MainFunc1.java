package br.com.fiap.main;

import br.com.fiap.bean.Funcionario;

import java.time.LocalDate;

public class MainFunc1
{
    public static void main(String[] args)
    {
        // Criação e instanciação
        Funcionario funcionario1 = new Funcionario();
        LocalDate dataAtual = LocalDate.now();

        // Atribição de valor
        funcionario1.setNome("Giovanni");
        funcionario1.setValorHoraTrabalho(100f);

        // Exibição de Status
        System.out.printf("Nome: %s\nSalário: %.2f", funcionario1.getNome(), funcionario1.calcularSalario(60f));
        System.out.printf("\n%s/%s/%s", dataAtual.getDayOfMonth(), dataAtual.getMonth(), dataAtual.getYear());
    }
}
