package br.com.fiap;

//Importação da classe Scanner
import java.util.Scanner;

public class EntradaDeDado
{
    public static void main(String[] args)
    {
        int num1, num2, resultado; //Declaração de Variáveis
        Scanner scan; //Declaração do objeto scanner
        scan = new Scanner(System.in); //Instanciando o Objeto
        //Tratamento de erros
        try {
            //Entada de dados do usuário
            System.out.println("Digite um número inteiro:");
            //Recepção\Leitura de dados
            num1 = scan.nextInt();
            //Entada de dados do usuário
            System.out.println("Digite outro número inteiro:");
            //Recepção\Leitura de dados
            num2 = scan.nextInt();
            //Atribuição de valor ao 'resultado'
            resultado = num1 + num2;
            //Exibir valores digitados e soma
            System.out.println("Valor 1: " + num1 + "\nValor 2: " + num2 + "\nSomatório: " + resultado);
        } catch (Exception e) {
            System.out.println("Formato de número incorreto");
        }
    }
}
