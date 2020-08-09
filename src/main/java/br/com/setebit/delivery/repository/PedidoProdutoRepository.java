package br.com.setebit.delivery.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.setebit.delivery.mode.entity.PedidoProduto;

public interface PedidoProdutoRepository extends JpaRepository<PedidoProduto, Integer> {

	@Query("select a from PedidoProduto a where a.pedido.id = :id")
	List<PedidoProduto> findByProduto(@Param("id") Integer idProduto);

}