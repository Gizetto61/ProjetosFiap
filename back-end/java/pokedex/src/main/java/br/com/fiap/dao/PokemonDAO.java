package br.com.fiap.dao;

import br.com.fiap.to.PokemonTO;

import java.time.LocalDate;
import java.util.ArrayList;

public class PokemonDAO {
    // Mock SELECT
    public ArrayList<PokemonTO> findAll() {
        // Lista
        ArrayList<PokemonTO> pokemons = new ArrayList<>();
        // Objeto
        PokemonTO pokemon = new PokemonTO();

        // preenchimento
        pokemon = new PokemonTO(1L, "Pikachu", 1.50, 100.0, "Raio", LocalDate.now());
        // Novo pokemon na lista
        pokemons.add(pokemon);

        // preenchimento
        pokemon = new PokemonTO(2L, "Mewtwo", 1.90, 150.0, "Psíquico", LocalDate.now());
        // Novo pokemon na lista
        pokemons.add(pokemon);

        // preenchimento
        pokemon = new PokemonTO(3L, "Charizard", 3.0, 500.0, "Fogo", LocalDate.now());
        // Novo pokemon na lista
        pokemons.add(pokemon);

        return pokemons;
    }
}
