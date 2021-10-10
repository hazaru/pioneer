package br.com.hazarumercado.mercado.entrypoint.usuarioendereco;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EnderecoDTO {

    private String logradouro;

    private String rua;

    private int numero;

    private int cep;

    private String bairro;

}
