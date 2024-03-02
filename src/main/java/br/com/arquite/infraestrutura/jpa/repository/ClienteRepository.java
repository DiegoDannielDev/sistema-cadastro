package br.com.arquite.infraestrutura.jpa.repository;

import br.com.arquite.infraestrutura.jpa.entities.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {}
