/*
 * Felipe Lima de Oliveira - rm569947
 * Giovanni Zorzetto Oliveira - rm569464
 * Raphael Gomes Brito - rm572637*/

package br.com.fiap.main;

//importação de classes
import java.util.Scanner;
import br.com.fiap.bean.DespesaFamiliar;

public class Main
{
    public static void main (String[] args)
    {
        //Criação de objetos
        Scanner scan;
        DespesaFamiliar despesa1;
        //Tratamento de erros
        try {
            //Instanciação de objetos
            scan = new Scanner(System.in);
            despesa1 = new DespesaFamiliar();

            //Entrada de dados
            System.out.print("Digite o valor da renda familiar: R$");
            despesa1.rendaFamiliar = scan.nextDouble();
            System.out.print("Digite o número de moradores: ");
            despesa1.numeroDeMoradores = scan.nextInt();
            System.out.print("Digite o valor do gasto com LUZ: R$");
            despesa1.gastoComLuz = scan.nextDouble();
            System.out.print("Digite o valor do gasto com ÁGUA: R$");
            despesa1.gastoComAgua = scan.nextDouble();
            System.out.print("Digite o valor do gasto com INTERNET: R$");
            despesa1.gastoComInternet = scan.nextDouble();
            System.out.print("Digite o valor da mensalidade da academia: R$");
            despesa1.valorMensalidadeDaAcademia = scan.nextDouble();

            //Exibição de valores
            System.out.println("=================================");
            System.out.printf("Renda Bruta: R$%.3f\nTotal de Despesas: R$%.3f\nRenda Líquida: R$%.3f", despesa1.rendaFamiliar, despesa1.calcularTotalDeDespesas(), despesa1.calcularRendaFamiliarLiquida());

        } catch (Exception e) {
            //Mensagem de Erro
            System.out.println("Número digitado de valor incorreto!");
        }
    }
}
