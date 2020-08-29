package br.com.setebit.delivery.service;

import java.util.List;

import br.com.setebit.delivery.dto.ItemDTO;
import br.com.setebit.delivery.mode.entity.PedidoProduto;

public interface PedidoProdutoService extends BaseService<PedidoProduto, Integer> {

	List<PedidoProduto> findByProduto(Integer idProduto);
	
	ItemDTO incluirItem(ItemDTO dto);

}