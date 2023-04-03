package br.com.fiap.startup.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="T_HORARIO")
public class Horario {

	@Id
	@SequenceGenerator(name="horario", sequenceName="sq_horario", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="horario")
	@Column(name="cd_horario")
	private int id;
	
	@Temporal(TemporalType.DATE)
	@Column(name="dt_horario")
	private LocalDate data;
	
	@Enumerated(EnumType.STRING)
	@Temporal(TemporalType.TIME)
	@Column(name="hr_horario")
	private Hora hora;
	
	@Column
	private boolean disponivel;
	
	public Horario() {
		super();
	}
	
	public Horario(LocalDate data, Hora hora) {
		super();
		this.data = data;
		this.hora = hora;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Hora getHora() {
		return hora;
	}

	public void setHora(Hora hora) {
		this.hora = hora;
	}
	
}
