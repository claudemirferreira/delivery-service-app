package br.com.setebit.delivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.setebit.delivery.mode.entity.Rotina;

public interface RotinaRepository extends JpaRepository<Rotina, Integer> {

}