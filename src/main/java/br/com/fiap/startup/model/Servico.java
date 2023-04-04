package br.com.fiap.startup.model;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="T_SERVICO")
public class Servico {
	
	@Id
	@SequenceGenerator(name="servico", sequenceName="sq_servico", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="servico")
	@Column(name="cd_servico")
	private int id;
	
	@Column(name="nm_servico")
	private String nome;
	
	@Column(name="vl_servico")
	private double valor;
	
//	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dt_horarios")
	private ArrayList <Horario> horariosDisponiveis = new ArrayList<>();
	
	@ManyToOne
	@JoinColumn(name="cd_prestador")
	private PrestadorDeServico prestador;
	
	@ManyToOne
	@JoinColumn(name="cd_categoria")
	private Categoria categoria;

	public Servico() {
		super();
	}

	public Servico(int id, String nome, double valor, PrestadorDeServico prestador, Categoria categoria) {
		super();
		this.id = id;
		this.nome = nome;
		this.valor = valor;
		this.prestador = prestador;
		this.categoria = categoria;
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

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public ArrayList<Horario> getHorariosDisponiveis() {
		return horariosDisponiveis;
	}

	public void setHorariosDisponiveis(ArrayList<Horario> horariosDisponiveis) {
		this.horariosDisponiveis = horariosDisponiveis;
	}

	public PrestadorDeServico getPrestadorDeServico() {
		return prestador;
	}

	public void setAutonomo(PrestadorDeServico prestador) {
		this.prestador = prestador;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	

}
