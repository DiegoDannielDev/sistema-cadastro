package br.com.arquite.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class ClienteDomain {

  private String nome;
  private LocalDate dataNascimento;
  private List<ClienteEnderecoDomain> clienteEnderecoDomain;
  private ClienteDocumento clienteDocumento;
  private List<ClienteTelefonesDomain> cLienteTelefones;
  private boolean ativo;
}
