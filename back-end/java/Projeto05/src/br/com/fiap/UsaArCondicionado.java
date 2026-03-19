package br.com.fiap;

public class UsaArCondicionado
{
    public static void main(String[] args)
    {
        //Instanciando o objeto
        ArCondicionado arCondicionado1 = new ArCondicionado();

        //Atribuindo valores aos atributos
        arCondicionado1.temperatura = 20;
        arCondicionado1.modo = "Ventilar";

        //Uso de Métodos
        arCondicionado1.trocarModo("Resfriar");
        arCondicionado1.diminuirTemperatura();
        arCondicionado1.diminuirTemperatura();
        arCondicionado1.aumentarTemperatura();

        //Exibir status atual
        System.out.println("Modo Atual : " + arCondicionado1.modo + "\nTemperatura: " + arCondicionado1.temperatura);
    }
}
