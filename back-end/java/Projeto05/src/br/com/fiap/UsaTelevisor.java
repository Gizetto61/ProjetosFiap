package br.com.fiap;

public class UsaTelevisor
{
    public static void main (String[] args)
    {
        //Instanciando o Objeto
        Televisor televisor1 = new Televisor();

        //Atribuindo valores aos atributos do objeto
        televisor1.volume = 10;
        televisor1.canal = 150;

        //Usando métodos
        //Troca o canal para 100
        televisor1.trocarCanal(100);
        //Diminue o volume em 1
        televisor1.diminuirVolume();
        //Troca o canal para 50
        televisor1.trocarCanal(50);
        //Aumenta o volume em 1
        televisor1.aumentarvolume();

        //Exibir status atual
        System.out.println("Canal Atual: " + televisor1.canal + "\nVolume: " + televisor1.volume);
    }
}
