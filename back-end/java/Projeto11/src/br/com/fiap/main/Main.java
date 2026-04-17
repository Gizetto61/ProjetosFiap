package br.com.fiap.main;

import br.com.fiap.bean.Pessoa;

import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main
{
    public static void main(String[] args)
    {
        // Objeto pessoa1
        Pessoa pessoa1;
        // Variáveis
        String auxiliar, nome;
        // Objeto dataNascimento
        LocalDate dataNascimento;
        // Objeto dtf para formatar o estilo de datas para o padrão BR
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // Tratamento de erros
        try{
            // Entrada de dados
            // Nome em Maiúsculo
            nome = JOptionPane.showInputDialog("Digite seu nome: ").toUpperCase();
            auxiliar = JOptionPane.showInputDialog("Digite a data de nascimento (dia/mês/ano): ");
            // Arruamndo a string (ano-mês-dia) -> "21/12/2012"
            String ano = auxiliar.substring(6, 10);
            String mes = auxiliar.substring(3, 5);
            String dia = auxiliar.substring(0, 2);
            String dataEUA = ano + "-" + mes + "-" + dia; // "2012-12-21"
            // armazenando valor na dataNascimento
            dataNascimento = LocalDate.parse(dataEUA);
            // Instanciação do objeto pessoa1
            pessoa1 = new Pessoa(nome, dataNascimento);
            // Exibição de resultado
            JOptionPane.showMessageDialog(null, pessoa1.getDataNascimento());
            // Data formatada com o objeto dtf para voltar para o padrão BR
            JOptionPane.showMessageDialog(null, String.format("Nome: %s\nData de Nascimento: %s\nIdade: %d anos", pessoa1.getNome(), pessoa1.getDataNascimento().format(dtf), pessoa1.calcularIdade()));
        } catch (Exception e) {
            // Mensagem de erro com JOptionPane
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
