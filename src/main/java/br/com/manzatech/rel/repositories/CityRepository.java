package br.com.manzatech.rel.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.manzatech.rel.models.City;
import br.com.manzatech.rel.models.State;

@Repository
public interface CityRepository extends JpaRepository<City, Long>{

	List<City> findByState(State state);

}
