package br.com.setebit.delivery.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import br.com.setebit.delivery.mode.entity.Caixa;
import br.com.setebit.delivery.repository.CaixaRepository;
import br.com.setebit.delivery.service.CaixaService;

@Service
public class CaixaServiceImpl extends AbstractService<Caixa, Integer> implements CaixaService {

	private CaixaRepository repository;

	@Autowired
	public CaixaServiceImpl(CaixaRepository repository) {
		this.repository = repository;
	}

	@Override
	protected CrudRepository<Caixa, Integer> getRepository() {
		return repository;
	}

}