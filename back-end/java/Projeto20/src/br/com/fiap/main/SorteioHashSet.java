package br.com.fiap.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class SorteioHashSet {
    static void main() {
        // Declaração e Instanciação de objetos
        HashSet<Integer> numerosSorteados = new HashSet<>();
        Random random = new Random();

        System.out.println("Sorteio da Mega Sena");
        // Laço que roda com base no tamanho do set
        while (numerosSorteados.size() < 6) {
            // Sorteia um número de 1 a 59
            int numero = random.nextInt(59) + 1;
            // Adiciona o numero sorteado na lista
            numerosSorteados.add(numero);
        }
        // Jogando o set dentro de uma lista
        ArrayList<Integer> resultadoDoSorteio = new ArrayList<>(numerosSorteados);
        // Ordenar lista com sort()
        Collections.sort(resultadoDoSorteio);
        // Exibição da lista ordenada
        System.out.println(resultadoDoSorteio);
    }
}
