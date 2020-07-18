package br.com.setebit.delivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.setebit.delivery.mode.entity.PedidoProduto;

public interface PedidoProdutoRepository extends JpaRepository<PedidoProduto, Integer> {

}