package br.com.setebit.delivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.setebit.delivery.mode.entity.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

}