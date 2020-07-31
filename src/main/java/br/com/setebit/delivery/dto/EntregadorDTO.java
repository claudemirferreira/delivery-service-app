package br.com.setebit.delivery.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class EntregadorDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;

	@Size(min = 6, max = 60, message = "nome deve conter entre 6 e 60 caracteres")
	@NotNull(message = "nome deve ser informado")
	private String nome;

	@NotNull(message = "nome deve ser informado")
	@Size(min = 6, max = 10, message = "cnh deve conter entre 6 e 20 caracteres")
	private String cnh;

	@NotNull(message = "placa deve ser informado")
	@Size(min = 6, max = 10, message = "placa deve conter entre 6 e 20 caracteres")
	private String placa;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

}