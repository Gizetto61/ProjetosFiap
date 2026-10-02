package br.com.fiap.bo;

import br.com.fiap.dao.PokemonDAO;
import br.com.fiap.to.PokemonTO;

import java.time.LocalDate;
import java.util.ArrayList;

public class PokemonBO {
    // Atributo
    private PokemonDAO pokemonDAO;

    // Metodo para regras de negócio
    public ArrayList<PokemonTO> findAll() {
        pokemonDAO = new PokemonDAO();
        // Regras de Negócio...
        return pokemonDAO.findAll();
    }

    public PokemonTO save(PokemonTO pokemon) {
        pokemonDAO = new PokemonDAO();
        // Regras de negócio
        // Verificando se o pokemon foi capturado no futuro
        if (pokemon.getDataDaCaptura().isAfter(LocalDate.now())) {
            return null;
        }
        return pokemonDAO.save(pokemon);
    }
}
