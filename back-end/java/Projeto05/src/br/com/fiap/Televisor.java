package br.com.fiap;

public class Televisor
{
    //Atributos
    public int volume, canal;

    //Métodos
    public void aumentarvolume()
    {
        volume ++;
    }

    public void diminuirVolume()
    {
        volume --;
    }

    public void trocarCanal(int novoCanal)
    {
        canal = novoCanal;
    }
}

