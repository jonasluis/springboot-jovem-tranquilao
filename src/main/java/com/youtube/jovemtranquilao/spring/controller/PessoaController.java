package com.youtube.jovemtranquilao.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PessoaController {

	@GetMapping
	public String helooWord() {
		return "Hello World";
	}
}
