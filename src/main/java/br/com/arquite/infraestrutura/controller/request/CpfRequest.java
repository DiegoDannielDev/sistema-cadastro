package br.com.arquite.infraestrutura.controller.request;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class CpfRequest {

  private String numero;
  private LocalDate dataResgisto;
  private boolean status;
  private boolean restricao;
}
