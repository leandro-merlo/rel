package br.com.manzatech.rel.services;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import br.com.manzatech.rel.models.State;

public interface StateService {

	public List<State> findAll();
	public State create(@RequestBody State state);
}
