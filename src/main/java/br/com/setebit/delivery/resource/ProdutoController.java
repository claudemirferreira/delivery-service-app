package br.com.setebit.delivery.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.setebit.delivery.dto.ProdutoDTO;
import br.com.setebit.delivery.mode.entity.Produto;
import br.com.setebit.delivery.service.BaseService;
import br.com.setebit.delivery.service.ProdutoService;

@RestController
@RequestMapping("/api/produto")
public class ProdutoController extends AbstractController<Produto, Integer, ProdutoDTO> {

	@Autowired
	private ProdutoService service;

	@Override
	protected BaseService<Produto, Integer> getService() {
		return service;
	}

	@Override
	protected Class<ProdutoDTO> getDtoClass() {
		return ProdutoDTO.class;
	}
}
