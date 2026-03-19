package br.com.fiap;

public class ArCondicionado
{
    //Atributos
    public int temperatura;
    public String modo;

    //Métodos
    //Aumenta a temperatura em 1
    public void aumentarTemperatura()
    {
        temperatura ++;
    }
    //Diminui a temperatura em 1
    public void diminuirTemperatura()
    {
        temperatura --;
    }
    //Troca o modo do ar
    public void trocarModo(String novoModo)
    {
        modo = novoModo;
    }
}
