package br.com.manzatech.rel.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.manzatech.rel.models.City;
import br.com.manzatech.rel.models.State;
import br.com.manzatech.rel.repositories.CityRepository;
import br.com.manzatech.rel.repositories.StateRepository;

@Service
public class CityServiceImpl implements CityService {

	@Autowired
	private CityRepository cityRepository;
	@Autowired
	private StateRepository stateRepository;
	
	@Override
	public City create(Long stateId, City city) {
		State state = stateRepository.getOne(stateId);
		city.setState(state);
		return cityRepository.save(city);
	}

	@Override
	public List<City> findAll() {
		return cityRepository.findAll();
	}

	@Override
	public List<City> findByState(Long stateId) {
		State state = stateRepository.getOne(stateId);
		return cityRepository.findByState(state);
	}

}
