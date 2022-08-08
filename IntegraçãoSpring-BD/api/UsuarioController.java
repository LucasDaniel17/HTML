package br.ifba.teste.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ifba.teste.model.UsuarioModel;
import br.ifba.teste.repository.UsuarioRepository;

@RestController
@RequestMapping ("/usuario")
public class UsuarioController {
	
	private UsuarioRepository usuRepository;
	
	public UsuarioController(UsuarioRepository usuRepository) {
		super();
		this.usuRepository = usuRepository;
	}

	@GetMapping ("/")
	public String teste() {
		return "testando rota usuario";
	}
	
	@GetMapping ("/listall")
	public List<UsuarioModel> listall() {
		var usuarios = usuRepository.findAll();
		return usuarios;
	}
}
