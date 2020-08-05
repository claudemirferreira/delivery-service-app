package br.com.setebit.delivery.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.setebit.delivery.mode.entity.Sangria;

public interface SangriaRepository extends PagingAndSortingRepository<Sangria, Integer> {

}