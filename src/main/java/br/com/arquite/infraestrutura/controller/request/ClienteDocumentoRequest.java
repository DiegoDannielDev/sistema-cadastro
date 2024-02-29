package br.com.arquite.infraestrutura.controller.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class ClienteDocumentoRequest {

  private CpfRequest cpfDomain;
  private RegistroUnicoRequest rg;
}
