package br.com.transportador.contrato.repository;

import br.com.transportador.contrato.model.UsuarioModel;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<UsuarioModel, Integer> {
}
