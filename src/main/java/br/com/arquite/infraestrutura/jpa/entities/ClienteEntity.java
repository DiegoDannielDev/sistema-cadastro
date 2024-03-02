package br.com.arquite.infraestrutura.jpa.entities;

import static jakarta.persistence.GenerationType.IDENTITY;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "cliente")
@Table(
        name = "cliente",
        uniqueConstraints = {
                @UniqueConstraint(
                        columnNames = {"codigo_cliente"},
                        name = "fk_codigo_cliente")
        })
public class ClienteEntity implements Serializable {

  @Id
  @GeneratedValue(strategy = IDENTITY)
  private Long codigoCliente;

  @Column(name = "nome_cliente")
  private String nome;

  @Column(name = "data_nascimento")
  private LocalDate dataNascimento;

  @Column(name = "flag_ativo")
  private boolean ativo;
}
