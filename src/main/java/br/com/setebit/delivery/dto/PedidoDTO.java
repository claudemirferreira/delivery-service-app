package br.com.setebit.delivery.dto;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;

import br.com.setebit.delivery.enumerated.StatusPedidoEnum;

public class PedidoDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;

	@NotNull(message = "nome deve ser informado")
	private String nome;

	@NotNull(message = "endereço deve ser informado")
	private String endereco;

	@NotNull(message = "telefone deve ser informado")
	private String telefone;

	private Date data;

	private Date dataEntrega;

	private double valor;

	private double troco;

	private StatusPedidoEnum status;

	private EntregadorDTO entregador;

//	private List<PedidoProdutoDTO> pedidoProdutos = new ArrayList<PedidoProdutoDTO>();

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

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
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

	public EntregadorDTO getEntregador() {
		return entregador;
	}

	public void setEntregador(EntregadorDTO entregador) {
		this.entregador = entregador;
	}

//	public List<PedidoProdutoDTO> getPedidoProdutos() {
//		return pedidoProdutos;
//	}
//
//	public void setPedidoProdutos(List<PedidoProdutoDTO> pedidoProdutos) {
//		this.pedidoProdutos = pedidoProdutos;
//	}

}