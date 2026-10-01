package br.com.fiap.resource;

import br.com.fiap.bo.RemedioBO;
import br.com.fiap.to.RemedioTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
