package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
	
	@PostMapping ("/process_login")
	public String process_login(HttpServletRequest request, Model model) {
		String usuario = request.getParameter("usuario");
		String senha = request.getParameter("senha");
		
		System.out.println("Usuario: " + usuario);
		System.out.println("Senha: " + senha);
		
		HttpSession session = request.getSession();
		
		if (senha.equals("123")) {
			model.addAttribute("nome", usuario);
			model.addAttribute("descricao", "Football");
			session.setAttribute("nome", usuario);
			return "dashboard";
		}
		else {
			model.addAttribute("mensagem", "Senha Invalida");
			return "notfound";
		}	
	}
		
	@GetMapping("/dashboard")
	public String dashboard(HttpServletRequest request, Model model) {
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
	
	@GetMapping("/cadastro_livro")
	public String cadastro_livro (HttpServletRequest request) {
		HttpSession session = request.getSession();
		String usuario = (String) session.getAttribute("nome");
		System.out.println(usuario);
		return "cadastro_livro";
	}
	
	@GetMapping("/tarefas")
	public String tarefas() {
		return "tarefas";
	}
}