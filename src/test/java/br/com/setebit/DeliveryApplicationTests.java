package br.com.setebit;

import java.util.Arrays;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.setebit.delivery.enumerated.StatusPedidoEnum;
import br.com.setebit.delivery.mode.entity.Entregador;
import br.com.setebit.delivery.mode.entity.Pedido;
import br.com.setebit.delivery.mode.entity.PedidoProduto;
import br.com.setebit.delivery.mode.entity.Produto;
import br.com.setebit.delivery.repository.ProdutoRepository;
import br.com.setebit.delivery.service.PedidoService;

@SpringBootTest
class DeliveryApplicationTests {
	
	@Autowired
	PedidoService service;
	
	@Autowired
	ProdutoRepository produtoRepository;

	@Test
	void contextLoads() {
	}
	
	@Test
	void testarCalculo() {
		
		Entregador en = new Entregador();
		en.setId(1);
		
		Produto a = produtoRepository.findById(1).get();
		Produto b = produtoRepository.findById(2).get();
		Produto c = produtoRepository.findById(3).get();
		
		PedidoProduto d = new PedidoProduto();
		d.setProduto(a);
		//d.setValor(3.0);
		//d.setQuantidade(3);
		
		PedidoProduto e = new PedidoProduto();
		e.setProduto(b);
		//e.setValor(3.0);
		//e.setQuantidade(3);
		
		PedidoProduto f = new PedidoProduto();
		f.setProduto(c);
		//f.setValor(3.0);
		//f.setQuantidade(5);
		
		Pedido p = new Pedido();
		p.setEndereco("rua 4");
		p.setDataEntrega(new Date());
		p.setEntregador(en);
		p.setNome("joão");
		p.setStatus(StatusPedidoEnum.PENDENTE);
		p.setTelefone("999999999");
		p.setPedidoProdutos(Arrays.asList(d, e, f));	
		
		service.criar(p);
		
	}

}
