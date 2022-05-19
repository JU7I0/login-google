package com.example.logingoogle.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Login {

	@GetMapping("/")
	public String inicial() {
		return "faça login para entrar na plataforma!";
	}
	
	
	@GetMapping("/entrar")
	public String entrar() {
		return "Você está logado";
	}
	
}
