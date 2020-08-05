package br.com.setebit.delivery.dto;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;

import com.ibm.icu.math.BigDecimal;

public class SangriaDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;

	@Column(nullable = false)
	private LocalDate data;

	@NotNull(message = "valor deve ser informado")
	private BigDecimal valor;

	private String obs;

	@NotNull(message = "caixa deve ser informado")
	private CaixaDTO caixa;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public CaixaDTO getCaixa() {
		return caixa;
	}

	public void setCaixa(CaixaDTO caixa) {
		this.caixa = caixa;
	}

}