package br.com.setebit.delivery.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.setebit.delivery.dto.PedidoProdutoDTO;
import br.com.setebit.delivery.mode.entity.PedidoProduto;
import br.com.setebit.delivery.service.BaseService;
import br.com.setebit.delivery.service.PedidoProdutoService;

@RestController
@RequestMapping("/delivery/pedido-produto")
public class PedidoProdutoController extends AbstractController<PedidoProduto, Integer, PedidoProdutoDTO> {

	@Autowired
	private PedidoProdutoService service;

	@Override
	protected Class<PedidoProduto> getEntityClass() {
		return PedidoProduto.class;
	}

	@Override
	protected BaseService<PedidoProduto, Integer> getService() {
		return service;
	}

	@Override
	protected Class<PedidoProdutoDTO> getDtoClass() {
		return PedidoProdutoDTO.class;
	}
}
