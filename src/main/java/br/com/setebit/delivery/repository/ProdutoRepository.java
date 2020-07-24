package br.com.setebit.delivery.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.setebit.delivery.mode.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
	
	@Query("SELECT u FROM Produto u WHERE NOME like ?1 OR id like ?2 ")
    Page<Produto> pesquisa(String nome, Integer id, Pageable pageable);

}