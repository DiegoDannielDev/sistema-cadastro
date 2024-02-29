package br.com.arquite.infraestrutura.controller.request;

import br.com.arquite.domain.ClienteDocumento;
import br.com.arquite.domain.ClienteEnderecoDomain;
import br.com.arquite.domain.ClienteTelefonesDomain;
import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@JsonNaming(PropertyNamingStrategies.LowerCaseStrategy.class)
public class ClienteRequest {

  private String nome;
  private LocalDate dataNascimento;
  private List<ClienteEnderecoRequest> clienteEnderecoDomain;
  private ClienteDocumentoRequest clienteDocumento;
  private List<ClienteTelefonesRequest> cLienteTelefones;
  private boolean ativo;
}
