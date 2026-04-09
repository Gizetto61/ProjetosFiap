package br.com.fiap.bean;

public class ArCondicionado
{
    // Atributos
    private int temperatura;
    private String modo;

    // Getter e Setter

    public int getTemperatura()
    {
        return temperatura;
    }

    public void setTemperatura(int temperatura)
    {
        try {
            if (temperatura >= 15 && temperatura <= 26) {
                this.temperatura = temperatura;
            } else {
                throw new Exception("Temperatura inválida. [min-15 | máx-26]");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public String getModo()
    {
        return modo;
    }

    public void setModo(String modo)
    {
        try {
            if (modo.equals("ventilar") && modo.equals("aquecer") && modo.equals("resfriar")) {
                this.modo = modo;
            } else {
                throw new Exception("Modo inválido. \nPermitidos:[Ventilar, Aquecer e Resfriar]");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Métodos da classe
    public void aumentarTemperatura()
    {
        if (temperatura < 26) {
            temperatura++;
        }
    }

    public void diminuirTemperatura()
    {
        if (temperatura > 15) {
            temperatura--;
        }
    }
}
