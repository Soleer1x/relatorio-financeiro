package projeto.Avancado.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projeto.Avancado.projeto.model.Usuario;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {

    Optional<Usuario> findByEmail(String email);
}
