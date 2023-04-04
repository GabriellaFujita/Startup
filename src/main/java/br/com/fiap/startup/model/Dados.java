package br.com.fiap.startup.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Embeddable
@Table(name="T_DADOS")
public class Dados implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="dados", sequenceName="sq_dados", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="dados")
	@Column(name="cd_dados")
	private int id;
	
	@Column(name="ds_email")
	private String email;

//	@Column(name="ds_endereco")
//	private Endereco endereco;
	
	@Column(name="nr_telefone")
	private String telefone;
	
	@OneToOne
	@JoinColumn(name="cd_usuario")
	private Usuario usuario;

	public Dados() {
		super();
	}

	public Dados(int id, String email, String telefone, Usuario usuario) {
		super();
		this.id = id;
		this.email = email;
//		this.endereco = endereco;
		this.telefone = telefone;
		this.usuario = usuario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

//	public Endereco getEndereco() {
//		return endereco;
//	}
//
//	public void setEndereco(Endereco endereco) {
//		this.endereco = endereco;
//	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
