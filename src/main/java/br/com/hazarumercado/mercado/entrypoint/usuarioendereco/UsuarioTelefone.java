package br.com.hazarumercado.mercado.entrypoint.usuarioendereco;

import br.com.hazarumercado.mercado.core.entity.UsuarioEntity;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="tb_usuario_telefone")
public class UsuarioTelefone implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_telefone")
    private int id;

    @Column(name = "desc_ddd")
    private int ddd;

    @Column(name = "desc_numero_telefone")
    private int telefone;

    @Column(name = "telefone_id_usuario")
    private int usuarioId;

}
