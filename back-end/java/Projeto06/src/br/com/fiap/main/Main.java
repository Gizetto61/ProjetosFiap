package br.com.fiap.main;

import br.com.fiap.bean.ArCondicionado;
import br.com.fiap.bean.FolhaDePagamento;
import br.com.fiap.bean.Televisor;

import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        // mock test
        // Instanciando objeto
        Televisor televisor1 = new Televisor();
        ArCondicionado arCondicionado1 = new ArCondicionado();
        FolhaDePagamento folha1 = new FolhaDePagamento();

        // Valor aos atributos
        //Atributos Televisor
        televisor1.volume = 10;
        televisor1.canal = 5;
        //Atributos Ar Condicionado
        arCondicionado1.temperatura = 20;
        arCondicionado1.modo = "Resfriar";
        //Atributos Folha de Pagamento
        folha1.salarioBruto = 5000;
        folha1.numeroDeDependentes = 3;
        folha1.descontoINSS = 2;
        folha1.valorPlanoDeSaude = 50;

        //Métodos
        //Aumentando o volume em 2
        televisor1.aumentarVolume();
        televisor1.aumentarVolume();
        //Trocar canal
        televisor1.trocarCanal(13);
        //Aumentar temperatura em 1
        arCondicionado1.aumentarTemperatura();
        //Diminuir temperatura em 2
        arCondicionado1.diminuirTemperatura();
        arCondicionado1.diminuirTemperatura();
        //Trocar Modo
        arCondicionado1.trocarModo("Ventilar");

        //Exibindo na tela status atual
        //Concatenação com printf
        System.out.printf("Canal: %d\nVolume: %d", televisor1.canal, televisor1.volume);
        //Nova maneira de formatação
        //Classe String, metodo format
        String mensagem = String.format("\nModo: %s\nTemperatura: %d°C\n", arCondicionado1.modo, arCondicionado1.temperatura);
        System.out.println(mensagem);
        JOptionPane.showMessageDialog(null, mensagem);

        //Printando salário Líquido
        System.out.println("------------------------------");
        System.out.println("------------Salário-----------");
        System.out.printf("Salário Bruto: %.2f \nDesconto do INSS: %.2f%% \nValor do Plano de Saúde: %.2f \nNúmero de dependentes: %d \n\nSalário Líquido: %.2f", folha1.salarioBruto, folha1.descontoINSS, folha1.valorPlanoDeSaude, folha1.numeroDeDependentes, folha1.calcularSalarioLiquido());


    }
}
