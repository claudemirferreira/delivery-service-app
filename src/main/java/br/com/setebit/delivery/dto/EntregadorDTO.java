package br.com.setebit.delivery.dto;

import java.io.Serializable;

public class EntregadorDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;

	private String nome;

	private String numeroHailitacao;

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

	public String getNumeroHailitacao() {
		return numeroHailitacao;
	}

	public void setNumeroHailitacao(String numeroHailitacao) {
		this.numeroHailitacao = numeroHailitacao;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

}