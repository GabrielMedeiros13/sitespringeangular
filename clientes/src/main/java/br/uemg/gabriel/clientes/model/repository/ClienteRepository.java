package br.uemg.gabriel.clientes.model.repository;

import br.uemg.gabriel.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
