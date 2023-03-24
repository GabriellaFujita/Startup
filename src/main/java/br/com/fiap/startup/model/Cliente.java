package br.com.fiap.startup.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="T_CLIENTE")
public class Cliente extends Usuario {

	private static final long serialVersionUID = 1L;

	@Column(name="nm_cliente")
	private String nome;
	
	@Temporal(TemporalType.DATE)
	@Column(name="dt_nascimento")
	private Date dataNascimento;

	public Cliente() {
		super();
	}

	public Cliente(int id, String tipo, String usuario, String senha, Dados dados,
			String nome, Date dataNascimento) {
		super(id, tipo, usuario, senha, dados);
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
}