package br.com.setebit.delivery.dto;

import java.io.Serializable;

import javax.validation.constraints.Min;

public class PedidoProdutoDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;

	private ProdutoDTO produto;

	private PedidoDTO pedido;

	private double valor;
	
	@Min(value = 1, message = "quantidade deve ser maior que 0")
	private double quantidade;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ProdutoDTO getProduto() {
		return produto;
	}

	public void setProduto(ProdutoDTO produto) {
		this.produto = produto;
	}

	public PedidoDTO getPedido() {
		return pedido;
	}

	public void setPedido(PedidoDTO pedido) {
		this.pedido = pedido;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}