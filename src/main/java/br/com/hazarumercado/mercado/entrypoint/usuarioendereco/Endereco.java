package br.com.hazarumercado.mercado.entrypoint.usuarioendereco;

import br.com.hazarumercado.mercado.core.entity.UsuarioEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "tb_endereco_usuario")
public class Endereco {
    @Id
    @Column(name = "id", nullable = false)

    private Long id;

    private String logradouro;

    private String rua;

    private int numero;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private UsuarioEntity usuario;

    public UsuarioEntity getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioEntity usuario) {
        this.usuario = usuario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Endereco(String logradouro, String rua, int numero) {
        this.logradouro = logradouro;
        this.rua = rua;
        this.numero = numero;
    }

}
