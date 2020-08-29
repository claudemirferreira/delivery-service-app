package br.com.setebit.delivery.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

import br.com.setebit.delivery.mode.entity.Pedido;
import br.com.setebit.delivery.mode.entity.PedidoProduto;
import br.com.setebit.delivery.mode.entity.Produto;

public class ItemDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;

	private Integer idProduto;

	private String nome;

	private Integer idPedido;

	private BigDecimal valor;

	private BigDecimal quantidade;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Integer idPedido) {
		this.idPedido = idPedido;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public BigDecimal getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(BigDecimal quantidade) {
		this.quantidade = quantidade;
	}

	public ItemDTO(Integer id, Integer idProduto, String nome, Integer idPedido, BigDecimal valor,
			BigDecimal quantidade) {
		super();
		this.id = id;
		this.idProduto = idProduto;
		this.nome = nome;
		this.idPedido = idPedido;
		this.valor = valor;
		this.quantidade = quantidade;
	}

	public ItemDTO(PedidoProduto entity) {
		super();
		this.id = entity.getId();
		this.idProduto = entity.getProduto().getId();
		this.nome = entity.getProduto().getNome();
		this.idPedido = entity.getPedido().getId();
		this.valor = entity.getValor();
		this.quantidade = entity.getQuantidade();
	}

	public static List<ItemDTO> toDto(List<PedidoProduto> entityList) {
		List<ItemDTO> dtoList = entityList.stream().map(e -> new ItemDTO(e)).collect(Collectors.toList());
		return dtoList;
	}

	public static ItemDTO toDto(PedidoProduto entity) {
		return new ItemDTO(entity.getId(), entity.getProduto().getId(), entity.getProduto().getNome(),
				entity.getPedido().getId(), entity.getValor(), entity.getQuantidade());
	}

	public static PedidoProduto toDto(ItemDTO dto) {
		PedidoProduto pedidoProduto = new PedidoProduto();
		Produto produto = new Produto(dto.getIdProduto());
		Pedido pedido = new Pedido(dto.getIdPedido());
		
		pedidoProduto.setPedido(pedido);
		pedidoProduto.setProduto(produto);
		pedidoProduto.setValor(dto.getValor());
		pedidoProduto.setQuantidade(dto.getQuantidade());
		
		return pedidoProduto;
	}

}