package br.com.hazarumercado.mercado.entrypoint.usuarioendereco;

import br.com.hazarumercado.mercado.core.entity.UsuarioEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
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
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    private String logradouro;

    private String rua;

    private int numero;

    private int cep;

    private String bairro;

    @ManyToOne
    @JoinColumn(name = "usuario_id_id_usuario")
    private UsuarioEntity endereco_id;
}
