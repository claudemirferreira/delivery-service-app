package br.com.setebit.delivery.service;

import br.com.setebit.delivery.mode.entity.Pedido;

public interface PedidoService extends BaseService<Pedido, Integer> {
	
	public Pedido criar(Pedido entity);

}
