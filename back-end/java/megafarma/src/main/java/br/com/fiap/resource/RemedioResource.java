package br.com.fiap.resource;

import br.com.fiap.bo.RemedioBO;
import br.com.fiap.to.RemedioTO;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Annotations
@RestController
@RequestMapping("/megafarma")  //localhost:8080/megafarma
public class RemedioResource {
    // Atributo
    private RemedioBO remedioBO = new RemedioBO();

    @GetMapping
    public ResponseEntity<List<RemedioTO>> findAll() {
        List<RemedioTO> remedios = remedioBO.findAll();
        if (remedios != null) {
            // mensagem de retorno OK
            return ResponseEntity.status(HttpStatus.OK).body(remedios);
        } else {
            // mensagem de retorno Error 404
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @GetMapping("/{codigo}")
    public ResponseEntity<?> findByCodigo(@PathVariable Long codigo) {
        RemedioTO remedio = remedioBO.findByCodigo(codigo);

        if (remedio != null) {
            // mensagem de retorno OK
            return ResponseEntity.status(HttpStatus.OK).body(remedio);
        } else {
            // mensagem de retorno Error 404
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Remédio não encontrado!");
        }
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody @Valid RemedioTO remedio) {
        try {
            RemedioTO resultado = remedioBO.save(remedio);
            return ResponseEntity.status(HttpStatus.CREATED).body(remedio);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Erro ao salvar o remédio");
        }
    }

    @PutMapping("/{codigo}")
    public ResponseEntity<?> update(@PathVariable Long codigo, @RequestBody @Valid RemedioTO remedio) {
        try {
            remedio.setCodigo(codigo);
            RemedioTO resultado = remedioBO.update(remedio);
            return ResponseEntity.status(HttpStatus.CREATED).body(remedio);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Erro ao atualizar remédio");
        }
    }

    @DeleteMapping("/{codigo}")
    public ResponseEntity<String> delete(@PathVariable Long codigo) {
        if (remedioBO.delete(codigo)) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Remédio deletado com sucesso!");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Remédio não encontrado!");
        }
    }
}
