package br.com.fiap.resource;

import br.com.fiap.bo.PokemonBO;
import br.com.fiap.to.PokemonTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// Annotations
@RestController
@RequestMapping("/pokedex")
public class PokemonResource {
    // Atributo
    private PokemonBO pokemonBO = new PokemonBO();

    @GetMapping
    public ResponseEntity<List<PokemonTO>> findAll() {
        List<PokemonTO> pokemons = pokemonBO.findAll();
        if (pokemons != null) {
            // mensagem de retorno OK
            return ResponseEntity.status(HttpStatus.OK).body(pokemons);
        } else {
            // mensagem de retorno OK
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(pokemons);
        }
    }
}
