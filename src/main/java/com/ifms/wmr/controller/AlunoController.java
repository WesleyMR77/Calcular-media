package com.ifms.wmr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.ifms.wmr.model.Aluno;

@Controller
public class AlunoController {

@GetMapping("/")
public String showForm(Model model) {
	model.addAttribute("aluno", new Aluno());
	return "formularioaluno";
}

@GetMapping("/dados")
public String exibirDados(@ModelAttribute Aluno aluno) {
	if((aluno.getN1()+aluno.getN2())/2 >= 6) {
		aluno.setStatus("Parabéns, você passou!! :)");
	} else {
		aluno.setStatus("Infelizmente, você reprovou!! :(");		
	}
	
	return "exibedadosaluno";
}
	
}
