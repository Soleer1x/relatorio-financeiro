package projeto.Avancado.projeto.model;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "usuarios")
@JsonPropertyOrder({"id", "nome" , "email" , "senha"})
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String nome;

    @Column(unique = true)
    private String email;

    private String senha;
}
