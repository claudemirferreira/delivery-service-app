package br.com.setebit.delivery.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import br.com.setebit.delivery.mode.entity.PedidoProduto;
import br.com.setebit.delivery.repository.PedidoProdutoRepository;
import br.com.setebit.delivery.service.PedidoProdutoService;

@Service
public class PedidoProdutoServiceImpl extends AbstractService<PedidoProduto, Integer> implements PedidoProdutoService {

	private PedidoProdutoRepository repository;

	@Autowired
	public PedidoProdutoServiceImpl(PedidoProdutoRepository repository) {
		this.repository = repository;
	}

	@Override
	protected CrudRepository<PedidoProduto, Integer> getRepository() {
		return repository;
	}

	@Override
	public List<PedidoProduto> findByProduto(Integer idProduto) {
		return repository.findByProduto(idProduto);
	}

}