package br.com.fiap.startup.model;

import java.util.regex.Pattern;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Embeddable
@Table(name="T_ENDERECO")
public class Endereco {

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="endereco", sequenceName="sq_endereco", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="endereco")
	@Column(name="cd_endereco")
	private Long Id;

	@Column(name="ds_cep")
	private String cep;

	@Column(name="ds_logradouro")
	private String logradouro;

	public Endereco() {
		super();
	}

	public Endereco(Long Id, String cep, String logradouro) {
		super();
		this.Id = Id;
		this.cep = cep;
		this.logradouro = logradouro;
	}


	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

//	private class CepValidator {
//		private static final Pattern CEP_PATTERN = Pattern.compile("\\d{5}-\\d{3}");
//
//		public static boolean isValid(String cep) {
//			if (cep == null) {
//				return false;
//			}
//			return CEP_PATTERN.matcher(cep).matches();
//		}
//	}

}
