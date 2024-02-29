package br.com.arquite.infraestrutura.controller;

import br.com.arquite.infraestrutura.controller.request.ClienteRequest;
import br.com.arquite.infraestrutura.usecase.ClienteUserCase;
import br.com.arquite.infraestrutura.usecase.mapper.ClienteMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
@RequiredArgsConstructor
public class ClienteController {

  private final ClienteUserCase clienteUserCase;
  private final ClienteMapper clienteMapper;

  @PostMapping(path = "/save")
  public ResponseEntity<ClienteRequest> salvarCliente(@RequestBody ClienteRequest clienteRequest) {
    var clienteDto = clienteMapper.toDtoFromRequest(clienteRequest);
    var cliente = clienteMapper.toDtoFromResponse(clienteUserCase.salvarUsuario(clienteDto));
    return new ResponseEntity<>(cliente, HttpStatus.OK);
  }
}
