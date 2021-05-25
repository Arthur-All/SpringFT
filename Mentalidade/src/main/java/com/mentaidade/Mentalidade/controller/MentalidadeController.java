package com.mentaidade.Mentalidade.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


	@RestController
	@RequestMapping("/Mentalidade")
	
	public class MentalidadeController{
		@GetMapping
		public String mentalidade() {
			return "Crecimento/pessoa e prof";
			
		}
	}


