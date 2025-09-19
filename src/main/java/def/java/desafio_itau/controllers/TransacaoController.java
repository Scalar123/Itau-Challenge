package def.java.desafio_itau.controllers;

import def.java.desafio_itau.domain.Transacao;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/transacao")
public class TransacaoController {
    List<Transacao> list = new ArrayList<>();

    @PostMapping(consumes = "application/json")
    public ResponseEntity<Transacao> processTrasacao(@Valid @RequestBody Transacao transacao){
        list.add(transacao);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }


}
