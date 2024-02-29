package br.com.arquite.infraestrutura.usecase.mapper;

import br.com.arquite.domain.ClienteDomain;
import br.com.arquite.infraestrutura.controller.request.ClienteRequest;
import br.com.arquite.infraestrutura.usecase.dto.ClienteDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClienteMapper {

  ClienteDomain toDomain(ClienteDto clienteDto);

  ClienteDto toDto(ClienteDomain clienteDto);

  ClienteDto toDtoFromRequest(ClienteRequest clienteRequest);

  ClienteRequest toDtoFromResponse(ClienteDto clienteRequest);
}
