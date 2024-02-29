package br.com.arquite.infraestrutura.usecase;

import br.com.arquite.domain.ClienteDomain;
import br.com.arquite.infraestrutura.usecase.dto.ClienteDto;

public interface ClienteUserCase {

  ClienteDto salvarUsuario(ClienteDto clienteDto);
}
