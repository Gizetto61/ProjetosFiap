package br.com.fiap.main;

import java.util.HashMap;
import java.util.Map;

public class NavegaHashMap {
    static void main() {
        // Criação e instanciação de objeto HashMap -> 2 Tipos, Chave e Valor
        HashMap<String, Integer> pessoas = new HashMap<>();
        // Metodo que insere Chave e Valor
        pessoas.put("Giovanni", 19);
        pessoas.put("Natália", 45);
        pessoas.put("Humberto", 45);
        // System.out.println(pessoas);
        // For que percorre o Map bidimencional sem uso de 2 for
        for (Map.Entry<String, Integer> valor : pessoas.entrySet()) {
            // Exibição usando metodos getKey() e getValue do objeto valor da interface Map
            System.out.println("Chave: " + valor.getKey() + "\tValor: " + valor.getValue());
        }
    }
}
