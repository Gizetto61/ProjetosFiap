package br.com.fiap.bean;

public class Retangulo extends Quadrado
{
    // Atributos
    private float altura;

    // Construtores
    public Retangulo(){

    }

    public Retangulo(float lado, float altura) {
        super.setLado(lado);
        this.altura = altura;
    }

    // Getter e Setter
    public float getAltura()
    {
        return altura;
    }

    public void setAltura(float altura)
    {
        this.altura = altura;
    }

    // Métodos Específicos
    public float calcularArea() {
        return super.getLado() * altura;
    }
}
