package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	

	@GetMapping("/")
	public String index () {
		return "index";
	}
	
	@GetMapping("/signin")
	public String signin() {
		return "signin";
	}
	
	@GetMapping("/dashboard")
	public String dashboard(Model model) {
		model.addAttribute("nome", "Lucas Daniel");
		model.addAttribute("descricao", "Football");
		return "dashboard";
	} 
	
	@GetMapping("/signup")
	public String signup() {
		return "signup";
	}
	
	@GetMapping("/quemsou")
	public String quemsou() {
		return "quemsou";
	}
	
	@GetMapping("/usuariocadastrado")
	public String usuariocadastrado() {
		return "usuariocadastrado";
	}
}