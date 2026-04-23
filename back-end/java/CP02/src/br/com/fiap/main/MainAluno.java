package br.com.fiap.main;

import br.com.fiap.bean.Aluno;

import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MainAluno
{
    public static void main(String[] args)
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Aluno aluno1 = new Aluno();
        aluno1.setNomeCompleto("Raphael Gomes Brito");
        aluno1.setRegistroMatricula(100000);
        String ano = "2007";
        String mes = "05";
        String dia = "11";
        String dataEUA = ano + "-" + mes + "-" + dia;
        aluno1.setDataDeNascimento(LocalDate.parse(dataEUA));

        Aluno aluno2 = new Aluno();
        aluno1.setNomeCompleto("Felipe Lima de Oliveira");
        aluno1.setRegistroMatricula(660548);
        ano = "2006";
        mes = "05";
        dia = "30";
        dataEUA = ano + "-" + mes + "-" + dia;
        aluno1.setDataDeNascimento(LocalDate.parse(dataEUA));

        Aluno aluno3;
        Aluno aluno4;
        LocalDate dataNascimento;
        String auxiliar, nome;
        int matricula;
        try{
            nome = JOptionPane.showInputDialog("Nome Aluno3: ");
            matricula = Integer.parseInt(JOptionPane.showInputDialog("Matrícula Aluno3: "));
            auxiliar = JOptionPane.showInputDialog("Data de nascimento Aluno3 (dia/mês/ano): ");
            ano = auxiliar.substring(6, 10);
            mes = auxiliar.substring(3, 5);
            dia = auxiliar.substring(0, 2);
            dataEUA = ano + "-" + mes + "-" + dia;
            dataNascimento = LocalDate.parse(dataEUA);
            aluno3 = new Aluno(matricula, nome, dataNascimento);

            nome = JOptionPane.showInputDialog("Nome Aluno4: ");
            matricula = Integer.parseInt(JOptionPane.showInputDialog("Matrícula Aluno4: "));
            auxiliar = JOptionPane.showInputDialog("Data de nascimento Aluno4 (dia/mês/ano): ");
            ano = auxiliar.substring(6, 10);
            mes = auxiliar.substring(3, 5);
            dia = auxiliar.substring(0, 2);
            dataEUA = ano + "-" + mes + "-" + dia;
            dataNascimento = LocalDate.parse(dataEUA);
            aluno4 = new Aluno(matricula, nome, dataNascimento);

            

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
