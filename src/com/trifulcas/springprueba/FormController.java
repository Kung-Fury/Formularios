package com.trifulcas.springprueba;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {
	
	@RequestMapping("/")
	public String verPagina() {
		return "inicio";
	}
}

