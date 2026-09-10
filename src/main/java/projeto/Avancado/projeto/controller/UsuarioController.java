package projeto.Avancado.projeto.controller;

import lombok.Data;
import org.springframework.web.bind.annotation.*;
import projeto.Avancado.projeto.model.Usuario;
import projeto.Avancado.projeto.repository.UsuarioRepository;
import projeto.Avancado.projeto.service.UsuarioService;

import java.util.List;

@Data
@RestController
@RequestMapping("usuario")
public class UsuarioController {

    private final UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> buscarTodos(){
        return usuarioService.buscarTodos();
    }

    @GetMapping("{id}")
    public Usuario buscarPorId(@PathVariable String id){
        return usuarioService.buscarPorId(id);
    }

    @PostMapping
    public Usuario criar(@RequestBody Usuario usuario){
        return usuarioService.criar(usuario);
    }

    @PutMapping("{id}")
    public Usuario atualizarPorId(@PathVariable String id, @RequestBody Usuario usuario){
        return usuarioService.atualizarPorId(id, usuario);
    }

    @DeleteMapping("{id}")
    public void deletarPorId(@PathVariable String id){
        usuarioService.deletarPorId(id);
    }
}
