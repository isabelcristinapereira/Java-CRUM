package com.example.colaborador.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table (name= "tbl_cliente")
public class ColaboradorModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	private String colaborador;
	
	@NotBlank
	private String cpf;

	
	
	private String alimento;

	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getColaborador() {
		return colaborador;
	}



	public void setColaborador(String colaborador) {
		this.colaborador = colaborador;
	}



	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public String getAlimento() {
		return alimento;
	}



	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}



	
}
