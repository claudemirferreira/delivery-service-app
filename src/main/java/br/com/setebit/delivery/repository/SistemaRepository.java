package br.com.setebit.delivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.setebit.delivery.mode.entity.Sistema;

public interface SistemaRepository extends JpaRepository<Sistema, Integer> {

}