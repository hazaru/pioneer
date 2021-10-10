package br.com.hazarumercado.mercado.entrypoint.usuarioendereco;

import br.com.hazarumercado.mercado.core.entity.UsuarioEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name= "tb_endereco_usuario")
public class Endereco {
    @Id
    @Column(name = "id_endereco", nullable = false)
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    @Column(name = "desc_logradouro")
    private String logradouro;

    @Column(name = "desc_rua")
    private String rua;

    @Column(name = "desc_numero_residencia")
    private int numero;

    @Column(name = "desc_cep_residencia")
    private int cep;

    @Column(name = "desc_bairro")
    private String bairro;

    @Column(name = "id_usuario_endereco")
    private int endereco_id;
}
