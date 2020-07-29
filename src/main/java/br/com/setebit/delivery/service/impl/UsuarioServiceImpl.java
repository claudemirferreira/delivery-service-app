package br.com.setebit.delivery.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import br.com.setebit.delivery.mode.entity.Usuario;
import br.com.setebit.delivery.repository.UsuarioRepository;
import br.com.setebit.delivery.service.UsuarioService;

@Service
public class UsuarioServiceImpl extends AbstractService<Usuario, Integer> implements UsuarioService {

	private UsuarioRepository repository;

	@Autowired
	public UsuarioServiceImpl(UsuarioRepository repository) {
		this.repository = repository;
	}

	@Override
	protected CrudRepository<Usuario, Integer> getRepository() {
		return repository;
	}

}