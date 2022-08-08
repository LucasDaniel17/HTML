package br.ifba.teste.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data // gera informações aleatorias, se eu precisar
@Entity // entidade: classe q espelha uma tabela do bd
@Table(name = "usuario") // nome da tabela q a classe vai representar 
public class UsuarioModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idUsuario")
	private long idUsuario;
	
	@Column(name = "loginUsuario", nullable = false, unique = true)
	private String loginUsuario;
	
	@Column(name = "senhaUsuario", nullable = false)
	private String senhaUsuario;

	public long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getLoginUsuario() {
		return loginUsuario;
	}

	public void setLoginUsuario(String loginUsuario) {
		this.loginUsuario = loginUsuario;
	}

	public String getSenhaUsuario() {
		return senhaUsuario;
	}

	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}

	public UsuarioModel() {
		super();
	}

	public UsuarioModel(long idUsuario, String loginUsuario, String senhaUsuario) {
		super();
		this.idUsuario = idUsuario;
		this.loginUsuario = loginUsuario;
		this.senhaUsuario = senhaUsuario;
	}

	
}	