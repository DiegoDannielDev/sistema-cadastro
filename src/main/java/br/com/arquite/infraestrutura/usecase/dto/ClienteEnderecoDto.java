package br.com.arquite.infraestrutura.usecase.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class ClienteEnderecoDto {
    private String codigoPostal;
    private String descricao;
    private String numero;
    private String cidade;
    private String uf;
    private String codigoIBGE;
    private String pais;

}
