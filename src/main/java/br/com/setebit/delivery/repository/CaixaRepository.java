package br.com.setebit.delivery.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.setebit.delivery.mode.entity.Caixa;

public interface CaixaRepository extends PagingAndSortingRepository<Caixa, Integer> {

}