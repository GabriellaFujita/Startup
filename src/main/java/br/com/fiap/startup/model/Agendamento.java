package br.com.fiap.startup.model;

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
import java.time.LocalTime;

@Entity
@Table(name="T_AGENDAMENTO")
public class Agendamento {

	@Id
	@SequenceGenerator(name="agendamento", sequenceName="sq_agendamento", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="agendamento")
	@Column(name="cd_agendamento")
	private int id;
	
	//@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dt_agendamento")
	private LocalTime horarioMarcado;
	
	@ManyToOne
	@JoinColumn(name="cd_servico")
	private Servico servico;
	
	@ManyToOne
	@JoinColumn(name="cd_usuario")
	private Cliente cliente;
	
	@Column(name="ds_recomendacao")
	private String recomendacao;

	public Agendamento() {
		super();
	}

	public Agendamento(int id, LocalTime horarioMarcado, Servico servico, Cliente cliente) {
		super();
		this.id = id;
		this.horarioMarcado = horarioMarcado;
		this.servico = servico;
		this.cliente = cliente;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalTime getHorarioMarcado() {
		return horarioMarcado;
	}

	public void setHorarioMarcado(LocalTime horarioMarcado) {
		this.horarioMarcado = horarioMarcado;
	}

	public Servico getServico() {
		return servico;
	}

	public void setServico(Servico servico) {
		this.servico = servico;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getRecomendacao() {
		return recomendacao;
	}

	public void setRecomendacao(String recomendacao) {
		this.recomendacao = recomendacao;
	}
	
}
