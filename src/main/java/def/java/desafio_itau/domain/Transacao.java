package def.java.desafio_itau.domain;


import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.ScriptAssert;


import java.time.OffsetDateTime;

@Data
public class Transacao {

    @PositiveOrZero
    private double valor;
    final OffsetDateTime date = OffsetDateTime.now();

}