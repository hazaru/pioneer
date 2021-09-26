package br.com.hazarumercado.mercado.core.entity;

import br.com.hazarumercado.mercado.entrypoint.usuarioendereco.Endereco;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "tb_usuario")
public class UsuarioEntity {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @JsonProperty(value="nome")
    private String nome;
    @JsonProperty(value="cpf")
    private int cpf;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario", cascade = CascadeType.REMOVE)
    @JsonProperty(value="endereco")
    private List<Endereco> endereco;
}
