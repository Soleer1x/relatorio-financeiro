package projeto.Avancado.projeto.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import projeto.Avancado.projeto.controller.dto.CadastroRequest;
import projeto.Avancado.projeto.controller.dto.LoginRequest;
import projeto.Avancado.projeto.model.Usuario;
import projeto.Avancado.projeto.service.UsuarioService;

@RestController
@RequestMapping("/auth")
public class LoginController {

    private final UsuarioService usuarioService;

    public LoginController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping("/cadastro")
    public Usuario cadastrar(@RequestBody CadastroRequest request){
        return usuarioService.cadastrar(request);
    }

    @PostMapping("/login")
    public Usuario login(@RequestBody LoginRequest request){
        return usuarioService.login(request);

    }
}
