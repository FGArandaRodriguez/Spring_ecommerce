package com.example.Ecommerce.controller;

import com.example.Ecommerce.entity.Usuario;
import com.example.Ecommerce.repository.UsuarioRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    private final UsuarioRepository repository;

    public UsuarioController(UsuarioRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Usuario> getAllUsuarios() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> getUsuarioById(@PathVariable Long id) {
        Optional<Usuario> usuario = repository.findById(id);
        return usuario.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Usuario createUsuario(@RequestBody Usuario usuario) {
        return repository.save(usuario);
    }

    @PatchMapping("/{id}/contrasena")
    public ResponseEntity<Usuario> updateContrasena(@PathVariable Long id, @RequestBody String nuevaContrasena) {
        return repository.findById(id)
                .map(usuario -> {
                    usuario.setContrasena(nuevaContrasena);
                    Usuario updatedUsuario = repository.save(usuario);
                    return ResponseEntity.ok(updatedUsuario);
                })
                .orElseGet(() -> ResponseEntity.notFound().build());
    }


}
