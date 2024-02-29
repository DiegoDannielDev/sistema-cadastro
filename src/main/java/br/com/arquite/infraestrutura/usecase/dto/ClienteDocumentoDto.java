package br.com.arquite.infraestrutura.usecase.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class ClienteDocumentoDto {

    private CpfDto cpf;
    private RegistroUnicoDto rg;
}
