package br.com.hazarumercado.mercado.entrypoint;

import br.com.hazarumercado.mercado.core.entity.UsuarioEntity;
import br.com.hazarumercado.mercado.dataprovider.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class UsuarioController  {

    private final UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @GetMapping(value = "/usuario")

    public List<UsuarioEntity> findAll() {

        List<UsuarioEntity> usuario = (List<UsuarioEntity>) usuarioRepository.findAll();

        return usuario;
    }

    @GetMapping(value = "/usuario/{id}")
    public Optional<UsuarioEntity> getOne(@PathVariable Long id) {

        Optional<UsuarioEntity> usuario = usuarioRepository.findById(id);
        return usuario;
    }

    @DeleteMapping(value = "/usuario/{id}")
    public void deleteById(@PathVariable Long id) {

        usuarioRepository.deleteById(id);

    }

    /*@PostMapping(value = "/usuario")
    public UsuarioEntity updateUsuarioById(Long id){
        UsuarioEntity u = new UsuarioEntity();

        usuarioRepository.updateUsuarioById(id);

        return new UsuarioEntity();
    }*/
}
