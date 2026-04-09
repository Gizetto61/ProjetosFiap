package br.com.fiap.bean;

public class Televisor
{
    //Atributos
    private int volume;
    private int canal;

    //Getter e Setter
    public int getVolume()
    {
        return volume;
    }

    public void setVolume(int volume)
    {
        //Tratamento de erros
        try {
            //Definir margem de volumes permitidos
            if (volume >= 0 && volume <= 20) {
                this.volume = volume;
            } else {
                throw new Exception("Volume fora da faixa permitida [min=0 e máx=20]");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public int getCanal()
    {
        return canal;
    }

    public void setCanal(int canal)
    {
        //Tratamento de erros
        try {
            //Definir margem de canais permitidos
            if (canal == 2 || canal == 4 || canal == 5 || canal == 7 || canal == 13) {
                this.canal = canal;
            } else {
                this.canal = 2;
                throw new Exception("Canal incorreto, sintonizando o canal 2...\nCanais permitidos: 2, 4, 5, 7, 13");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    //Métodos da Classe
    public void aumentarVolume()
    {
        //Estrutura condicional para controle de regra de negócio
        if (volume < 20) {
            volume++;
        }
    }

    public void diminuirVolume()
    {
        //Estrutura condicional para controle de regra de negócio
        if (volume > 0) {
            volume--;
        }
    }
}
