package br.com.setebit.delivery.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

import br.com.setebit.delivery.mode.entity.PedidoProduto;

public class ItensDTO implements Serializable {

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

	public ItensDTO(Integer id, Integer idProduto, String nome, Integer idPedido, BigDecimal valor,
			BigDecimal quantidade) {
		super();
		this.id = id;
		this.idProduto = idProduto;
		this.nome = nome;
		this.idPedido = idPedido;
		this.valor = valor;
		this.quantidade = quantidade;
	}

	public ItensDTO(PedidoProduto entity) {
		super();
		this.id = entity.getId();
		this.idProduto = entity.getProduto().getId();
		this.nome = entity.getProduto().getNome();
		this.idPedido = entity.getPedido().getId();
		this.valor = entity.getValor();
		this.quantidade = entity.getQuantidade();
	}

	public static List<ItensDTO> toDto(List<PedidoProduto> entityList) {
		List<ItensDTO> dtoList = entityList.stream().map(e -> new ItensDTO(e)).collect(Collectors.toList());
		return dtoList;
	}

	public static ItensDTO toDto(PedidoProduto entity) {
		return new ItensDTO(entity.getId(), entity.getProduto().getId(), entity.getProduto().getNome(),
				entity.getPedido().getId(), entity.getValor(), entity.getQuantidade());
	}

}