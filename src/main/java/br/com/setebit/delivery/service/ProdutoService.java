package br.com.setebit.delivery.service;

import org.springframework.data.domain.Page;

import br.com.setebit.delivery.dto.FiltroPaginacaoDTO;
import br.com.setebit.delivery.mode.entity.Produto;

public interface ProdutoService extends BaseService<Produto, Integer> {

	Page<Produto> pesquisa(FiltroPaginacaoDTO dto);

}
