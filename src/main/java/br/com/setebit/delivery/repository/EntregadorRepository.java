package br.com.setebit.delivery.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.setebit.delivery.mode.entity.Entregador;

public interface EntregadorRepository extends PagingAndSortingRepository<Entregador, Integer> {

	Page<Entregador> findByNomeLike(String nome, Pageable pageable);

}