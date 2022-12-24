package br.uemg.gabriel.clientes.model.repository;

import br.uemg.gabriel.clientes.model.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
