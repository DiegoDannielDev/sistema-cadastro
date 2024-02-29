package br.com.arquite.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class ClienteDocumento{

    private CpfDomain cpfDomain;
    private RegistroUnicoDomain rg;
}
