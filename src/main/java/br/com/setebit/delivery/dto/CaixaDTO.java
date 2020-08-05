package br.com.setebit.delivery.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.ibm.icu.math.BigDecimal;

import br.com.setebit.delivery.enumerated.StatusCaixaEnum;

public class CaixaDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;

	@NotNull(message = "nome deve ser informado")
	private LocalDate dataAbertura;

	private LocalDate dataFechamento;

	private BigDecimal totalFechamento;

	private BigDecimal totalApurado;

	private BigDecimal totalInicial;

	@NotNull(message = "status deve ser informado")
	private StatusCaixaEnum statusCaixa;

	private List<SangriaDTO> sangrias;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(LocalDate dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public LocalDate getDataFechamento() {
		return dataFechamento;
	}

	public void setDataFechamento(LocalDate dataFechamento) {
		this.dataFechamento = dataFechamento;
	}

	public BigDecimal getTotalFechamento() {
		return totalFechamento;
	}

	public void setTotalFechamento(BigDecimal totalFechamento) {
		this.totalFechamento = totalFechamento;
	}

	public BigDecimal getTotalApurado() {
		return totalApurado;
	}

	public void setTotalApurado(BigDecimal totalApurado) {
		this.totalApurado = totalApurado;
	}

	public BigDecimal getTotalInicial() {
		return totalInicial;
	}

	public void setTotalInicial(BigDecimal totalInicial) {
		this.totalInicial = totalInicial;
	}

	public StatusCaixaEnum getStatusCaixa() {
		return statusCaixa;
	}

	public void setStatusCaixa(StatusCaixaEnum statusCaixa) {
		this.statusCaixa = statusCaixa;
	}

	public List<SangriaDTO> getSangrias() {
		return sangrias;
	}

	public void setSangrias(List<SangriaDTO> sangrias) {
		this.sangrias = sangrias;
	}

}