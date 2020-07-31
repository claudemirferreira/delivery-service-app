package br.com.setebit.delivery.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import br.com.setebit.delivery.mode.entity.Pedido;
import br.com.setebit.delivery.repository.PedidoRepository;
import br.com.setebit.delivery.service.PedidoService;
import br.com.setebit.delivery.util.PedidoUtil;

@Service
public class PedidoServiceImpl extends AbstractService<Pedido, Integer> implements PedidoService {

	private PedidoRepository repository;

	@Autowired
	public PedidoServiceImpl(PedidoRepository repository) {
		this.repository = repository;
	}

	@Override
	protected CrudRepository<Pedido, Integer> getRepository() {
		return repository;
	}

	@Override
	public Pedido criar(Pedido pedido) {
		pedido = PedidoUtil.calcularValorPedido(pedido);
		pedido = repository.save(pedido);
		return pedido;
	}
	
	

}