package br.com.setebit.delivery.mode.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.setebit.delivery.enumerated.StatusPedidoEnum;

/**
 * 
 * @author altitdb
 */

@Entity
@Table(name = "deli_pedido")
public class Pedido extends AbstractEntity implements Serializable {

	private static final long serialVersionUID = 7371241296081749393L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pedido")
	private Integer id;

	private String nome;

	@Column(length = 200, nullable = false)
	private String endereco;

	@Column(length = 40, nullable = false)
	private String telefone;

	@Temporal(TemporalType.TIMESTAMP)
	private Date data;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dataEntrega;

	@Column(length = 20, nullable = false)
	private double valor;

	@Column(length = 20)
	private double troco;

	@Enumerated(EnumType.STRING)
	private StatusPedidoEnum status;

	@ManyToOne
	@JoinColumn(name = "id_entregador")
	private Entregador entregador;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "pedido")
	@JsonIgnore
	private List<PedidoProduto> pedidoProdutos = new ArrayList<PedidoProduto>();

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

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Date getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(Date dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public double getTroco() {
		return troco;
	}

	public void setTroco(double troco) {
		this.troco = troco;
	}

	public StatusPedidoEnum getStatus() {
		return status;
	}

	public void setStatus(StatusPedidoEnum status) {
		this.status = status;
	}

	public Entregador getEntregador() {
		return entregador;
	}

	public void setEntregador(Entregador entregador) {
		this.entregador = entregador;
	}

	public List<PedidoProduto> getPedidoProdutos() {
		return pedidoProdutos;
	}

	public void setPedidoProdutos(List<PedidoProduto> pedidoProdutos) {
		this.pedidoProdutos = pedidoProdutos;
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
		Pedido other = (Pedido) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public Pedido() {
	}

	public Pedido(Integer id, String nome, String endereco, String telefone, Date data, Date dataEntrega, double valor,
			StatusPedidoEnum status, Entregador entregador) {
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.data = data;
		this.dataEntrega = dataEntrega;
		this.valor = valor;
		this.status = status;
		this.entregador = entregador;
	}

}