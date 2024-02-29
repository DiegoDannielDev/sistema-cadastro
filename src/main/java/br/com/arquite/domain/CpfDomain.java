package br.com.arquite.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class CpfDomain {

  private String numero;
  private LocalDate dataResgisto;
  private boolean status;
  private boolean restricao;
}
