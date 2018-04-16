package br.com.manzatech.rel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.manzatech.rel.models.State;

@Repository
public interface StateRepository extends JpaRepository<State, Long>{

}
