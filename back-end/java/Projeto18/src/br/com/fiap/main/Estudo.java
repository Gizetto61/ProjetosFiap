package br.com.fiap.main;

public class Estudo {
    static void main() {
        // Vetor com tamanho definido atraves do preenchimento
        String[] carros = {"Volvo", "Ford", "BMW", "Mazda"};
        // Vetor sem preenchimento mas com o tamanho já estabelecido
        double[] numeros = new double[3];
        // Preenchimento do vetor numeros
        numeros[0] = 3.75; // indice 0 -> posição 1
        numeros[1] = 23.88; // indice 1 -> posição 2
        numeros[2] = 1.07; // indice 2 -> posição 3
        // numeros[3.73, 23.88, 1.07]

        // Metodo para verificar a quantidade de itens em um vetor
        System.out.println("Tamanho do vetor carros: " + carros.length);
        // Exibição do vetor carros completo sem repetição
        System.out.println(carros[0]);
        System.out.println(carros[1]);
        System.out.println(carros[2]);
        System.out.println(carros[3]);
        // Exibição do vetor carros com repetição
        // i = variável de controle
        for (int i = 0; i < carros.length; i++) {
            System.out.print(carros[i] + " ");
        }
        // for each
        // Pegar os todos os valores, um por vez, do vetor numeros e armazenar na variável i
        System.out.println();
        for (double i : numeros) {
            System.out.print(i + " ");
        }
    }
}
