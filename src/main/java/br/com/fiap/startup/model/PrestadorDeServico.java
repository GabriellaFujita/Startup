package br.com.fiap.startup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="T_PRESTADOR")
public class PrestadorDeServico extends Usuario {

	private static final long serialVersionUID = 1L;

	@Column(name="nm_prestador")
	private String nome;
	
	public PrestadorDeServico() {
		super();
	}

	public PrestadorDeServico(int id, String tipo, String usuario, String senha, Dados dados,
			String nome) {
		super(id, tipo, usuario, senha, dados);
		this.nome = nome;
	}

	public PrestadorDeServico(int id) {
		super(id);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "PrestadorDeServico{" +
				"id= '" + getId() +
				"nome='" + nome + '\'' +
				'}';
	}
}