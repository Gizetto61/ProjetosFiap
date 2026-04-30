package br.com.fiap.bean;

public class Triangulo extends Quadrado
{
    // Atributos
    private float altura;

    // Construtores
    public Triangulo() {

    }

    public Triangulo(float lado, float altura)
    {
        super(lado);
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

    // Metodos Específicos
    public float calcularArea()
    {
        return (super.getLado() * altura) / 3;
    }
}
