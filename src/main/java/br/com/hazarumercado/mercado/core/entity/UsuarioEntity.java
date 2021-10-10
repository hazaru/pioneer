package br.com.hazarumercado.mercado.core.entity;

import br.com.hazarumercado.mercado.entrypoint.usuarioendereco.Endereco;
import br.com.hazarumercado.mercado.entrypoint.usuarioendereco.UsuarioTelefone;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "tb_usuario")
public class UsuarioEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario", nullable = false)
    private Long id;

    @Column(name="cpf")
    @CPF
    private int cpf;

    @Column(name="nome")
    private String nome;

    @Column(name = "data_nascimento")
    @DateTimeFormat(pattern = "dd/mm/yyyy")
    private String dataNascimento;

    @Column(name = "cidade_nascimento")
    private String cidadeNascimento;

    @Column(name = "estado_nascimento")
    private String estadoNascimento;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name="telefone_id_usuario")
    private List<UsuarioTelefone> telefones;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario_endereco", insertable = false, updatable = false)
    private List<Endereco> enderecos;

}
