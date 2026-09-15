package projeto.Avancado.projeto.service;

import org.springframework.stereotype.Service;
import projeto.Avancado.projeto.controller.dto.CadastroRequest;
import projeto.Avancado.projeto.controller.dto.LoginRequest;
import projeto.Avancado.projeto.model.Usuario;
import projeto.Avancado.projeto.repository.UsuarioRepository;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario cadastrar(CadastroRequest request){

        if(usuarioRepository.findByEmail(request.getEmail()).isPresent()) {
            throw new RuntimeException("Este email ja esta cadastrado.");
        }
            Usuario usuario = new Usuario();

            usuario.setNome(request.getNome());
            usuario.setEmail(request.getEmail());
            usuario.setSenha(request.getSenha());

            return usuarioRepository.save(usuario);
        }


    public Usuario login(LoginRequest request){

        Usuario usuario = usuarioRepository.findByEmail(request.getEmail())
                .orElseThrow(() -> new RuntimeException("Usuario nao encontrado!"));

        if(!usuario.getSenha().equals(request.getSenha())){
            throw new RuntimeException("Senha incorreta!");
        }

        return usuario;

    }

}
