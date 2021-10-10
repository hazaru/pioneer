package br.com.hazarumercado.mercado.dataprovider;

import br.com.hazarumercado.mercado.core.entity.UsuarioEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioEntity, Long> {

}
