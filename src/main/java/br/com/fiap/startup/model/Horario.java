package br.com.fiap.startup.model;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_HORARIO")
public class Horario {

	@Id
	@SequenceGenerator(name="horario", sequenceName="sq_horario", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="horario")
	@Column(name="cd_horario")
	private int id;
	
	//@Temporal(TemporalType.DATE)
	@Column(name="dt_horario")
	private LocalDate data;
	
	//@Enumerated(EnumType.STRING)
	//@Temporal(TemporalType.TIME)
	@Column(name="hr_horario")
	private LocalTime hora;
	
	@Column
	private boolean estaDisponivel;
	
	public Horario() {
		super();
	}
	
	public Horario(LocalDate data, LocalTime hora) {
		super();
		this.data = data;
		this.hora = hora;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isEstaDisponivel() {
		return estaDisponivel;
	}

	public void setEstaDisponivel(boolean estaDisponivel) {
		this.estaDisponivel = estaDisponivel;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}
	
}
