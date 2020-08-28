package br.com.setebit.delivery.enumerated;

public enum TipoPedidoEnum {

	DELIVERY(0, "DELIVERY"), IFOOD(1, "IFOOD");

	private int codigo;

	private String descricao;

	private TipoPedidoEnum(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
