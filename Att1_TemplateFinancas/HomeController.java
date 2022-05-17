package com.example.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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
	
	@PostMapping("/dashboard")
	public String dashboard(HttpServletRequest request, Model model) {
		String usuario = request.getParameter("usuario");
		String senha = request.getParameter("senha");
		
		System.out.println("Usuario: " + usuario);
		System.out.println("Senha: " + senha);
		
		if (senha.equals("123")) {
			model.addAttribute("nome", usuario);
			model.addAttribute("descricao", "Football");
			return "dashboard";
		}
		else {
			model.addAttribute("mensagem", "Senha Invalida");
			return "notfound";
		}	
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
	
	@GetMapping("/cadastro_livro")
	public String cadastro_livro () {
		return "cadastro_livro";
	}
}