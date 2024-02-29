package br.com.arquite.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class ClienteEnderecoDomain {
    private String codigoPostal;
    private String descricao;
    private String numero;
    private String cidade;
    private String uf;
    private String codigoIBGE;
    private String pais;

}
