package br.com.setebit.delivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.setebit.delivery.mode.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}