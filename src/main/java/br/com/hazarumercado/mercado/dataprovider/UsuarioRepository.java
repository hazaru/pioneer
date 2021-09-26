package br.com.hazarumercado.mercado.dataprovider;

import br.com.hazarumercado.mercado.core.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;


public interface UsuarioRepository extends CrudRepository<UsuarioEntity, Long>
{
    UsuarioEntity getOne(Long id);

    List<UsuarioEntity> findAll();

    void deleteById(Long id);
}
