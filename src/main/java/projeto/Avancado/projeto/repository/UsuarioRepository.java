package projeto.Avancado.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projeto.Avancado.projeto.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {
}
