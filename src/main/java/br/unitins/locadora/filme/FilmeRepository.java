package br.unitins.locadora.filme;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface FilmeRepository extends CrudRepository<Filme, Long> {
}
