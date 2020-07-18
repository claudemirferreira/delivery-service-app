package br.com.setebit.delivery.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import br.com.setebit.delivery.mode.entity.Entregador;
import br.com.setebit.delivery.repository.EntregadorRepository;
import br.com.setebit.delivery.service.EntregadorService;

@Service
public class EntregadorServiceImpl extends AbstractService<Entregador, Integer> implements EntregadorService {

	private EntregadorRepository repository;

	@Autowired
	public EntregadorServiceImpl(EntregadorRepository repository) {
		this.repository = repository;
	}

	@Override
	protected CrudRepository<Entregador, Integer> getRepository() {
		return repository;
	}

}