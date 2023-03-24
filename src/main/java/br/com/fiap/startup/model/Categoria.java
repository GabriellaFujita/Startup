package br.com.fiap.startup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_CATEGORIA")
public class Categoria {
	//estetica, automovel, limpeza, manutencao, aula, musica, costura, construcao
	
	@Id
	@SequenceGenerator(name="categoria", sequenceName="sq_categoria", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="categoria")
	@Column(name="cd_categoria")
	private int id;
	
	@Column(name="nm_categoria")
	private String nome;
	
	public Categoria() {
		super();
	}
	
	public Categoria(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
