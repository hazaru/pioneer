package br.com.hazarumercado.mercado.dataprovider.gateway;

import br.com.hazarumercado.mercado.core.entity.UsuarioEntity;
import br.com.hazarumercado.mercado.dataprovider.UsuarioRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UsuarioGateway {

    public Optional<UsuarioEntity> findById(int id) {
        Optional<UsuarioEntity> user = findById(id);
        return user;
    }
}
