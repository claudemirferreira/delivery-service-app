package br.com.setebit.delivery.mode.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.ibm.icu.math.BigDecimal;

/**
 * 
 * @author altitdb
 */
@Entity
@Table(name = "deli_sangria")
public class Sangria extends AbstractEntity implements Serializable {

	private static final long serialVersionUID = 4203174084588806620L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sangria_id")
	private Integer id;

	@Column(nullable = false)
	private LocalDate data;

	@Column(columnDefinition = "DECIMAL(10,2)")
	private BigDecimal valor;

	@Column(length = 100)
	private String obs;

	@ManyToOne
	@JoinColumn(name = "caixa_id")
	private Caixa caixa;

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

	public Caixa getCaixa() {
		return caixa;
	}

	public void setCaixa(Caixa caixa) {
		this.caixa = caixa;
	}

	public Sangria(Integer id, LocalDate data, BigDecimal valor, String obs, Caixa caixa) {
		super();
		this.id = id;
		this.data = data;
		this.valor = valor;
		this.obs = obs;
		this.caixa = caixa;
	}

	public Sangria() {
	}

}