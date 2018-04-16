package br.com.manzatech.rel.services;

import java.util.List;

import br.com.manzatech.rel.models.City;

public interface CityService {

	public List<City> findAll();
	public City create(Long stateId, City city);
	public List<City> findByState(Long stateId);
}
