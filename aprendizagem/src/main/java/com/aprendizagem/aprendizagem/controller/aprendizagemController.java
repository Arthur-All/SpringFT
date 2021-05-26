package com.aprendizagem.aprendizagem.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class aprendizagemController {
	
	
	@RequestMapping("/Aprendi")
	public String Aprendo() {
		return "Um pouco sobre seguranca da info";
	}
	

}
