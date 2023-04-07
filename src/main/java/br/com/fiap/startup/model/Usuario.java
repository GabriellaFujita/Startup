package br.com.fiap.startup.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_USUARIO")
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class Usuario implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="usuario", sequenceName="sq_usuario", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="usuario")
	@Column(name="cd_usuario")
	private int id;
	
	@Column(name="ds_tipo")
	private String tipo;
	
	@Column(name="ds_usuario")
	private String usuario;
	
	@Column(name="ds_senha")
	private String senha;
	
	@Embedded
	@OneToOne(mappedBy="usuario", cascade=CascadeType.ALL)
	private Dados dados;

	public Usuario() {
		super();
	}

	public Usuario(int id, String tipo, String usuario, String senha, Dados dados) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.usuario = usuario;
		this.senha = senha;
		this.dados = dados;
	}

	public Usuario(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Dados getDados() {
		return dados;
	}

	public void setDados(Dados dados) {
		this.dados = dados;
	}
	
}
