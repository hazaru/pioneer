package br.com.hazarumercado.mercado.entrypoint;

import br.com.hazarumercado.mercado.core.entity.UsuarioEntity;
import br.com.hazarumercado.mercado.dataprovider.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class UsuarioController  {

    private final UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @GetMapping(value = "/usuario")

    public ResponseEntity<UsuarioEntity> findAll() {

        List<UsuarioEntity> usuario = usuarioRepository.findAll();
        System.out.println(usuario);

        return new ResponseEntity(usuario, HttpStatus.OK);
    }

    @GetMapping(value = "/usuario/{id}")
    public UsuarioEntity getOne(@PathVariable Long id) {

        UsuarioEntity u = new UsuarioEntity();

        UsuarioEntity usuario = usuarioRepository.getOne(id);
        return usuario;
    }

    @DeleteMapping(value = "/usuario/{id}")
    public void deleteById(@PathVariable Long id) {

        usuarioRepository.deleteById(id);

    }

    @PostMapping(value = "/usuario")
    public UsuarioEntity updateUsuarioById(Long id){
        UsuarioEntity u = new UsuarioEntity();

        usuarioRepository.updateUsuarioById(id);

        return new UsuarioEntity();
    }



}
