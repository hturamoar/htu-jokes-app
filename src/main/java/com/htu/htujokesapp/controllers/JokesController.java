package com.htu.htujokesapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.htu.htujokesapp.services.JokesService;

@Controller
public class JokesController {
	
	private final JokesService jokesService;
	
	public JokesController(JokesService jokesService) {
		super();
		this.jokesService = jokesService;
	}


	@GetMapping(path = "/")
	public String getJokes(Model model) {
		model.addAttribute("jokes", this.jokesService.getJokes());
		return "index";
	}

}
