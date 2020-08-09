package br.com.setebit.delivery.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.validation.constraints.Min;

import br.com.setebit.delivery.mode.entity.PedidoProduto;
import br.com.setebit.delivery.util.ObjectMapperUtils;

public class PedidoProdutoDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;

	private ProdutoDTO produto;

	private PedidoDTO pedido;

	private BigDecimal valor;

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

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public static List<PedidoProdutoDTO> toDto(List<PedidoProduto> entityList) {
		return ObjectMapperUtils.mapAll(entityList, PedidoProdutoDTO.class);
	}

	public static PedidoProdutoDTO toDto(PedidoProduto entityList) {
		return ObjectMapperUtils.map(entityList, PedidoProdutoDTO.class);
	}

}