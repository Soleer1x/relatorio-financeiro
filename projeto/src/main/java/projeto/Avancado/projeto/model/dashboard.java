package projeto.Avancado.projeto.model;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@JsonPropertyOrder({"id", "transacao" , "valor" , "tipo" , "data"})
public class dashboard {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String transacao;

    private double valor;

    private String tipo;

    private LocalDateTime data;
}
