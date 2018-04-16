package br.com.manzatech.rel.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.manzatech.rel.services.CityService;
import br.com.manzatech.rel.services.StateService;

@Controller
@RequestMapping("/reports")
public class ReportController {

	@Autowired
	private StateService stateService;
	
	@Autowired
	private CityService cityService;
	
	@GetMapping("/html")
	public String html(@RequestParam(name="state", required=false) Long id, Model model) {
		model.addAttribute("states", stateService.findAll());
		if (id == null) {
			return "report/index";
		} 
		model.addAttribute("list", cityService.findByState(id));
		
		return "report/index";
	}
}
