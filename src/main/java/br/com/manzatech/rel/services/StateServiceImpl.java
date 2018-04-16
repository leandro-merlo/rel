package br.com.manzatech.rel.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.manzatech.rel.models.State;
import br.com.manzatech.rel.repositories.StateRepository;

@Transactional
@Service
public class StateServiceImpl implements StateService {
	
	@Autowired
	private StateRepository stateRepository;
	
	@Override
	public State create(State state) {
		return stateRepository.save(state);
	}

	@Override
	public List<State> findAll() {
		return stateRepository.findAll();
	}
	

}
