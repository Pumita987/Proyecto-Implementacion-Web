package com.certus.solarsi.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/App")
public class controller {
	
	@Value("${title.generic}") //Llamamos al valor de Properties y lo seteamos en la clase
	private String titlePage;
	
	@GetMapping({"/inicio","/"})
	public String Entrada(Model model) {
	
		
	model.addAttribute("TituloPagina", titlePage); //Inyectar datos a la vista a través del controlador 

		
	return "Inicio";
	
	}
	
	@GetMapping("/Integrantes")
	public String Integrante() {
		
		return "Integrantes";
	}
	
	@GetMapping("/Login")
	public String Log() {
	
		return "Login";
	}
	
	@GetMapping("/Productos")
	public String Productos() {
	
		return "Productos";
	}
	@GetMapping("/Register")
	public String Registrarse() {
	
		return "Register";
	}
	
	@GetMapping("/CarritodeCompras")
	public String CarritodeCompras() {
	
		return "CarritodeCompras";
	}
	
}
