package br.com.fiap.bean;

public class ArCondicionado
{
    //Atributos
    public int temperatura;
    public String modo;

    //Métodos
    public void aumentarTemperatura(){
        temperatura ++;
    }

    public void diminuirTemperatura()
    {
        temperatura --;
    }

    public void trocarModo(String novoModo)
    {
        modo = novoModo;
    }
}
