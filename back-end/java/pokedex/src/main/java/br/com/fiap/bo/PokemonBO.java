package br.com.fiap.bo;

import br.com.fiap.dao.PokemonDAO;
import br.com.fiap.to.PokemonTO;

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
}
