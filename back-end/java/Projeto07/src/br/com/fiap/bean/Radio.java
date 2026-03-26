package br.com.fiap.bean;

public class Radio
{
    //Atributos
    private int volume;
    private float estacao;

    //Métodos Getters e Setters
    public float getEstacao()
    {
        return estacao;
    }

    public void setEstacao(float estacao)
    {
        //Tratamento de erros, se a estação não estiver entre 80.0 e 105.0
        try {
            if (estacao >= 80.0 && estacao <= 105.0) {
                this.estacao = estacao;
            } else {
                throw new Exception("Estação fora de sintonia [min-80.0 a max-105.0]");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public int getVolume()
    {
        return volume;
    }

    public void setVolume(int volume)
    {
        //Tratamento de erros, se o volume não estiver entre 0 e 100
        try {
            if (volume >= 0 && volume <= 100) {
                this.volume = volume;
            } else {
                throw new Exception("Volume fora da faixa permitida [min-0 e max-100]");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    //Métodos
    public void aumentarVolume()
    {
        //Só funciona se volume for < 100
        if (volume < 100){
            volume++;
        }
    }

    public void diminuirVolume()
    {
        //Só funciona se volume for > 0
        if (volume > 0) {
            volume--;
        }
    }
}
