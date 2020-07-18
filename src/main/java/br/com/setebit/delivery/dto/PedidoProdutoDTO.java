package br.com.setebit.delivery.dto;

import java.io.Serializable;

public class PedidoProdutoDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;

	private ProdutoDTO produto;

	private PedidoDTO pedido;

	private double valor;

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