package br.com.arquite.infraestrutura.usecase.dto;

import java.time.LocalDate;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class ClienteDto {

  private String nome;
  private LocalDate dataNascimento;
  private List<ClienteEnderecoDto> clienteEnderecoDomain;
  private ClienteDocumentoDto clienteDocumento;
  private List<ClienteTelefonesDto> cLienteTelefones;
  private boolean ativo;
}
