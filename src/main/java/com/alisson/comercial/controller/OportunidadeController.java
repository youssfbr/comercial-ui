package com.alisson.comercial.controller;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alisson.comercial.model.Oportunidade;

@RestController
@RequestMapping("/oportunidades")
public class OportunidadeController {

	@GetMapping
	public List<Oportunidade> listar() {
		Oportunidade oportunidade = new Oportunidade();
		oportunidade.setId(1L);
		oportunidade.setNomeProspecto("Link Informática");
		oportunidade.setDescrição("Desenvolvimento de ERP's com Spring MVC");
		oportunidade.setValor(new BigDecimal(500000));
		
		return Arrays.asList(oportunidade);
	}
}
