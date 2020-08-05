package br.com.setebit.delivery.service;

import org.springframework.data.domain.Page;

import br.com.setebit.delivery.dto.FiltroPaginacaoDTO;
import br.com.setebit.delivery.mode.entity.Pedido;

public interface PedidoService extends BaseService<Pedido, Integer> {

	public Pedido criar(Pedido entity);

	Page<Pedido> pesquisa(FiltroPaginacaoDTO dto);

}
