package br.com.setebit.delivery.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import br.com.setebit.delivery.mode.entity.Sangria;
import br.com.setebit.delivery.repository.SangriaRepository;
import br.com.setebit.delivery.service.SangriaService;

@Service
public class SangriaServiceImpl extends AbstractService<Sangria, Integer> implements SangriaService {

	private SangriaRepository repository;

	@Autowired
	public SangriaServiceImpl(SangriaRepository repository) {
		this.repository = repository;
	}

	@Override
	protected CrudRepository<Sangria, Integer> getRepository() {
		return repository;
	}

}