package br.com.fiap.bean;

public class Televisor
{
    //Atributos
    public int volume;
    public int canal;

    //Métodos
    //Aumenta volume em 1
    public void aumentarVolume()
    {
        volume ++;
    }
    //Diminui volume em 1
    public void diminuirVolume()
    {
        volume --;
    }
    //Troca de canal
    public void trocarCanal (int novoCanal)
    {
        canal = novoCanal;
    }
}
