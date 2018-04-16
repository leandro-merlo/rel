package br.com.manzatech.rel.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.manzatech.rel.models.City;
import br.com.manzatech.rel.services.CityService;

@RestController
@RequestMapping("/states/{stateId}/cities")
public class CityController {

	@Autowired
	private CityService cityService;

	
	@GetMapping
	@ResponseBody
	@ResponseStatus(code=HttpStatus.OK)
	public List<City> findAll(@PathVariable Long stateId){
		return cityService.findByState(stateId);
	}
	
	@PostMapping
	@ResponseBody
	@ResponseStatus(code=HttpStatus.CREATED)
	public City create(@PathVariable Long stateId, @RequestBody City city) {
		return cityService.create(stateId, city);
	}
}
