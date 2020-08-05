package br.com.setebit.delivery.mode.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.ibm.icu.math.BigDecimal;

import br.com.setebit.delivery.enumerated.StatusCaixaEnum;


/**
 * 
 * @author altitdb
 */
@Entity
@Table(name = "deli_caixa")
public class Caixa extends AbstractEntity implements Serializable {

	private static final long serialVersionUID = 4203174084588806620L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "caixa_id")
	private Integer id;

	@Column(nullable = false)
	private LocalDate dataAbertura;

	@Column
	private LocalDate dataFechamento;

	@Column(columnDefinition = "DECIMAL(10,2)")
	private BigDecimal totalFechamento;

	@Column(columnDefinition = "DECIMAL(10,2)")
	private BigDecimal totalApurado;

	@Column(columnDefinition = "DECIMAL(10,2)", nullable = false)
	private BigDecimal totalInicial;

	@Enumerated(EnumType.ORDINAL)
	@Column(nullable = false)
	private StatusCaixaEnum statusCaixa;

	@OneToMany
	@JoinColumn(name = "caixa_id")
	private List<Sangria> sangrias;

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

	public List<Sangria> getSangrias() {
		return sangrias;
	}

	public void setSangrias(List<Sangria> sangrias) {
		this.sangrias = sangrias;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Caixa other = (Caixa) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public Caixa(Integer id, LocalDate dataAbertura, LocalDate dataFechamento, BigDecimal totalFechamento,
			BigDecimal totalApurado, BigDecimal totalInicial, StatusCaixaEnum statusCaixa, List<Sangria> sangrias) {
		super();
		this.id = id;
		this.dataAbertura = dataAbertura;
		this.dataFechamento = dataFechamento;
		this.totalFechamento = totalFechamento;
		this.totalApurado = totalApurado;
		this.totalInicial = totalInicial;
		this.statusCaixa = statusCaixa;
		this.sangrias = sangrias;
	}
	
	public Caixa() {}
	
}