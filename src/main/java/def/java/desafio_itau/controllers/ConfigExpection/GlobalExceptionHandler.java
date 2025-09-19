package def.java.desafio_itau.controllers.ConfigExpection;

import def.java.desafio_itau.controllers.TransacaoController;
import def.java.desafio_itau.domain.Transacao;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import static java.lang.System.err;

@ControllerAdvice(basePackageClasses = TransacaoController.class)
public class GlobalExceptionHandler {

    // Quando os dados não passaram na validação
    @ExceptionHandler (MethodArgumentNotValidException.class)
    public ResponseEntity<Object> handleValidationException () {
        // Retorna status personalizado (ex: 422 Unprocessable Entity)
        return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).build();
    }

    // Quando o corpo da requisição está ausente ou inválido (null body)
    @ExceptionHandler (HttpMessageNotReadableException.class)
    public ResponseEntity<Object> handleMissingBody () {
        // Retorna status personalizado (ex: 400 Bad Request ou 415)
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }

}
