package projeto.Avancado.projeto.controller;

import lombok.Data;
import org.springframework.web.bind.annotation.*;
import projeto.Avancado.projeto.service.UsuarioService;

@Data
@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    private final UsuarioService usuarioService;

}
