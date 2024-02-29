package br.com.arquite.infraestrutura.usecase.dto;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class CpfDto {

  private String numero;
  private LocalDate dataResgisto;
  private boolean status;
  private boolean restricao;
}
