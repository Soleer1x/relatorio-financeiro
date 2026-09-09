package projeto.Avancado.projeto.controller;

import lombok.Data;
import org.springframework.web.bind.annotation.*;
import projeto.Avancado.projeto.model.Usuario;
import projeto.Avancado.projeto.repository.UsuarioRepository;

import java.util.List;

@Data
@RestController
@RequestMapping("usuario")
public class UsuarioController {

    private final UsuarioRepository usuarioRepository;

    @GetMapping
    public List<Usuario> buscarTodos(){
        return usuarioRepository.findAll();
    }

    @GetMapping("{id}")
    public Usuario buscarPorId(@PathVariable String id){
        return usuarioRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Usuario criar(@RequestBody Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    @PutMapping("{id}")
    public Usuario atualizar(@PathVariable String id, @RequestBody Usuario usuario){
        return usuarioRepository.findById(id).orElse(null);
    }

    @DeleteMapping("{id}")
    public void deletarPorId(@PathVariable String id){
        usuarioRepository.deleteById(id);
    }

}
