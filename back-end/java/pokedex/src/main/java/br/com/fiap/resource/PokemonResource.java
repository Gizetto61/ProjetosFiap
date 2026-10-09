package br.com.fiap.resource;

import br.com.fiap.bo.PokemonBO;
import br.com.fiap.to.PokemonTO;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{codigo}")
    public ResponseEntity<?> findByCodigo(@PathVariable Long codigo) {
        PokemonTO pokemon = pokemonBO.findByCodigo(codigo);

        if (pokemon != null) {
            // mensagem de retorno OK
            return ResponseEntity.status(HttpStatus.OK).body(pokemon);
        } else {
            // mensagem de retorno Error 404
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Pokemon não encontrado!");
        }
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody PokemonTO pokemon) {
        try {
            PokemonTO resultado = pokemonBO.save(pokemon);
            return ResponseEntity.status(HttpStatus.CREATED).body(pokemon);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Erro ao salvar o pokemon");
        }
    }

    @PutMapping("/{codigo}")
    public ResponseEntity<?> update(@PathVariable Long codigo, @RequestBody @Valid PokemonTO pokemon) {
        try {
            pokemon.setCodigo(codigo);
            PokemonTO resultado = pokemonBO.update(pokemon);
            return ResponseEntity.status(HttpStatus.CREATED).body(pokemon);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Erro ao atualizar pokemon");
        }
    }

    @DeleteMapping("/{codigo}")
    public ResponseEntity<String> delete(@PathVariable Long codigo) {
        if (pokemonBO.delete(codigo)) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Pokemon deletado com sucesso!");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Pokemon não encontrado!");
        }
    }
}
