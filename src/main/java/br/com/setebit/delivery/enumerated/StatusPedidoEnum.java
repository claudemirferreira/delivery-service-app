package br.com.setebit.delivery.enumerated;

import java.util.HashMap;
import java.util.Map;

public enum StatusPedidoEnum {

	PENDENTE("1", "PENDENTE"), FINALIZADO("2", "FINALIZADO"), CANCELADO("3", "CANCELADO");

	private String nome;

	private String id;

	StatusPedidoEnum(String id, String nome) {
		this.nome = nome;
		this.id = id;
	}

	private static final Map<String, StatusPedidoEnum> byId = new HashMap<String, StatusPedidoEnum>();
	static {
		for (StatusPedidoEnum e : StatusPedidoEnum.values()) {
			if (byId.put(e.getId(), e) != null) {
				throw new IllegalArgumentException("duplicate id: " + e.getId());
			}
		}
	}

	public static StatusPedidoEnum getById(String id) {
		for (StatusPedidoEnum e : StatusPedidoEnum.values()) {
			if (id == e.getId())
				return e;
		}
		throw new IllegalArgumentException("oh no");
	}

	public String getNome() {
		return nome;
	}

	public String getId() {
		return id;
	}
}
