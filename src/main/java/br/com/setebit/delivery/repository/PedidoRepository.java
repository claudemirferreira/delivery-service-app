package br.com.setebit.delivery.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.setebit.delivery.mode.entity.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

	@Query("SELECT u FROM Pedido u ")
	Page<Pedido> pesquisa(Pageable pageable);

}