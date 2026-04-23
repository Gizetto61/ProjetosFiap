/*
 * Felipe Lima de Oliveira - rm569947
 * Giovanni Zorzetto Oliveira - rm569464
 * Raphael Gomes Brito - rm572637*/

package br.com.fiap.main;

import br.com.fiap.bean.Aluno;

import javax.swing.*;
import java.time.LocalDate;

public class MainAluno
{
    public static void main(String[] args)
    {
        // Objeto Aluno1
        Aluno aluno1 = new Aluno();
        // Inicialização de atributos
        aluno1.setNomeCompleto("Raphael Gomes Brito");
        aluno1.setRegistroMatricula(572637);
        String ano = "2007";
        String mes = "05";
        String dia = "11";
        // Transformação de data BR em data EUA
        String dataEUA = ano + "-" + mes + "-" + dia;
        aluno1.setDataDeNascimento(LocalDate.parse(dataEUA));

        // Objeto Aluno2
        Aluno aluno2 = new Aluno();
        // Inicialização de atributos
        aluno2.setNomeCompleto("Felipe Lima de Oliveira");
        aluno2.setRegistroMatricula(569947);
        ano = "2008";
        mes = "05";
        dia = "30";
        // Transformação de data BR em data EUA
        dataEUA = ano + "-" + mes + "-" + dia;
        aluno2.setDataDeNascimento(LocalDate.parse(dataEUA));

        // Objeto dataAtual para chamada de metodo calcularIdadeCompleta(dataAtual)
        LocalDate dataAtual = LocalDate.now();
        // Criação de objetos Aluno3 e Aluno4
        Aluno aluno3;
        Aluno aluno4;
        // Variáveis de apoio no main
        LocalDate dataNascimento;
        String auxiliar, nome;
        int matricula;
        // Tratamento de erros
        try{
            // Armazenamento de valor nas variáveis de apoio
            nome = JOptionPane.showInputDialog("Nome Aluno3: ");
            matricula = Integer.parseInt(JOptionPane.showInputDialog("Matrícula Aluno3: "));
            auxiliar = JOptionPane.showInputDialog("Data de nascimento Aluno3 (dia/mês/ano): ");
            // Uso do substring para manipular a String auxiliar com a data BR
            ano = auxiliar.substring(6, 10);
            mes = auxiliar.substring(3, 5);
            dia = auxiliar.substring(0, 2);
            // Transformação de data BR em data EUA
            dataEUA = ano + "-" + mes + "-" + dia;
            dataNascimento = LocalDate.parse(dataEUA);
            // Inicialização de atributos do aluno3 pelo construtor com passagem de parâmetro
            aluno3 = new Aluno(matricula, nome, dataNascimento);
            // Armazenamento de valor nas variáveis de apoio
            nome = JOptionPane.showInputDialog("Nome Aluno4: ");
            matricula = Integer.parseInt(JOptionPane.showInputDialog("Matrícula Aluno4: "));
            auxiliar = JOptionPane.showInputDialog("Data de nascimento Aluno4 (dia/mês/ano): ");
            // Uso do substring para manipular a String auxiliar com a data BR
            ano = auxiliar.substring(6, 10);
            mes = auxiliar.substring(3, 5);
            dia = auxiliar.substring(0, 2);
            // Transformação de data BR em data EUA
            dataEUA = ano + "-" + mes + "-" + dia;
            dataNascimento = LocalDate.parse(dataEUA);
            // Inicialização de atributos do aluno3 pelo construtor com passagem de parâmetro
            aluno4 = new Aluno(matricula, nome, dataNascimento);

            // Exibição do objeto Aluno1 com JOptionPane e String.format()
            JOptionPane.showMessageDialog(null, String.format("Aluno 1\nRM: %d\nNome: %s\nIdade completa: %s", aluno1.getRegistroMatricula(), aluno1.getNomeCompleto(), aluno1.calcularIdadeCompleta(dataAtual)));
            // Exibição do objeto Aluno2 com JOptionPane e String.format()
            JOptionPane.showMessageDialog(null, String.format("Aluno 2\nRM: %d\nNome: %s\nIdade completa: %s", aluno2.getRegistroMatricula(), aluno2.getNomeCompleto(), aluno2.calcularIdadeCompleta(dataAtual)));
            // Exibição do objeto Aluno3 com JOptionPane e String.format()
            JOptionPane.showMessageDialog(null, String.format("Aluno 3\nRM: %d\nNome: %s\nIdade completa: %s", aluno3.getRegistroMatricula(), aluno3.getNomeCompleto(), aluno3.calcularIdadeCompleta(dataAtual)));
            // Exibição do objeto Aluno3 com JOptionPane e String.format()
            JOptionPane.showMessageDialog(null, String.format("Aluno 4\nRM: %d\nNome: %s\nIdade completa: %s", aluno4.getRegistroMatricula(), aluno4.getNomeCompleto(), aluno4.calcularIdadeCompleta(dataAtual)));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
