package br.com.setebit.delivery.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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
	
	public Page<Entregador> findByNomeLike(String nome, int page, int size) {
		Pageable pageable = PageRequest.of(page, size, Sort.by("nome"));
		return repository.findByNomeLike("%"+nome+"%", pageable);
		
	}

}