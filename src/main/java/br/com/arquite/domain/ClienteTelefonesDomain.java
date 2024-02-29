package br.com.arquite.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class ClienteTelefonesDomain {

    private int codigoPais;
    private int ddd;
    private int numero;

}
