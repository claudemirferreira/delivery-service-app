package br.com.setebit.delivery.service;

import org.springframework.data.domain.Page;

import br.com.setebit.delivery.mode.entity.Entregador;

public interface EntregadorService extends BaseService<Entregador, Integer> {
	
	Page<Entregador> findByNomeLike(String nome, int page, int size);

}
