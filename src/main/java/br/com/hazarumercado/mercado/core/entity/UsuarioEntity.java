package br.com.hazarumercado.mercado.core.entity;

import br.com.hazarumercado.mercado.entrypoint.usuarioendereco.Endereco;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.Query;

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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario", nullable = false)
    private Long id;
    @JsonProperty(value="cpf")
    private int cpf;
    @JsonProperty(value="nome")
    private String nome;
    @ManyToOne

    @JoinColumn(name = "endereco_id")
    @JsonProperty(value="endereco")
    private Endereco endereco;



}
