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
        try {
            if (volume >= 0 && volume <= 20) {
                this.volume = volume;
            } else {
                throw new Exception("Volume fora do padrão permitido [min-0 e max-20]");
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
        try {
            if (canal == 2 || canal == 4 || canal == 5 || canal == 7 || canal == 13) {
                this.canal = canal;
            } else {
                throw new Exception("Canal indisponível [Disponíveis: 2-4-5-7-13]");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    //Métodos
    public void aumentarVolume()
    {
        if (volume < 100) {
            volume++;
        }
    }

    public void diminuirVolume()
    {
        if (volume > 0) {
            volume--;
        }
    }
}
