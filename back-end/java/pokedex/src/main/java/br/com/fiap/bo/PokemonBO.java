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

    public PokemonTO findByCodigo(Long codigo) {
        pokemonDAO = new PokemonDAO();
        // regras de negócio...
        return pokemonDAO.findByCodigo(codigo);
    }

    public PokemonTO save(PokemonTO pokemon) {
        pokemonDAO = new PokemonDAO();
        // Regras de negócio
        return pokemonDAO.save(pokemon);
    }

    public PokemonTO update(PokemonTO pokemon) {
        pokemonDAO = new PokemonDAO();
        // Regras de negócio...
        return pokemonDAO.update(pokemon);
    }

    public boolean delete(Long codigo) {
        pokemonDAO = new PokemonDAO();
        // Regras de negócio...
        return pokemonDAO.delete(codigo);
    }
}
