package br.com.arquite.infraestrutura.controller.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class ClienteTelefonesRequest {

    private int codigoPais;
    private int ddd;
    private int numero;

}
