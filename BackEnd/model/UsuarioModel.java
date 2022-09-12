package br.ifba.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data // gera informações aleatorias, se eu precisar
@Entity // entidade: classe q espelha uma tabela do bd
@Table(name = "tarefa") // nome da tabela q a classe vai representar 
public class UsuarioModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Column(name = "descrica0", nullable = false)
	private String descricao;
	
	@Column(name = "data_criacao", nullable = false)
	private String data_criacao;
	
	@Column(name = "data_conclusao", nullable = false)
	private String data_conclusao;
	
	@Column(name = "status", nullable = false)
	private int status;

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getData_criacao() {
		return data_criacao;
	}
	public void setData_criacao(String data_criacao) {
		this.data_criacao = data_criacao;
	}
	public String getData_conclusao() {
		return data_conclusao;
	}
	public void setData_conclusao(String data_conclusao) {
		this.data_conclusao = data_conclusao;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}

	public UsuarioModel(long id, String descricao, String data_criacao, String data_conclusao, int status) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.data_criacao = data_criacao;
		this.data_conclusao = data_conclusao;
		this.status = status;
	}
}	