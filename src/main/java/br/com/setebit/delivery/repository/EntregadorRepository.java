package br.com.setebit.delivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.setebit.delivery.mode.entity.Entregador;

public interface EntregadorRepository extends JpaRepository<Entregador, Integer> {

}