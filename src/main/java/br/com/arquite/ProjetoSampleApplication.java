package br.com.arquite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@EntityScan(basePackages = "br.com.arquite.infraestrutura.jpa.entities")
public class ProjetoSampleApplication {

  public static void main(String[] args) {
    SpringApplication.run(ProjetoSampleApplication.class, args);
  }
}
