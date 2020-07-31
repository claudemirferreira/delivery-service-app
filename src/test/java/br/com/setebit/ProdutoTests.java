package br.com.setebit;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.setebit.delivery.mode.entity.Entregador;
import br.com.setebit.delivery.mode.entity.Produto;
import br.com.setebit.delivery.repository.EntregadorRepository;
import br.com.setebit.delivery.repository.ProdutoRepository;

@SpringBootTest
class ProdutoTests {

	@Autowired
	ProdutoRepository rep;

	@Test
	void contextLoads() {
	}

	@Test
	void testarCalculo() {

		Produto a = new Produto();
		a.setValor(3.0);
		a.setNome("Kikão");
		a.setDescricao("kikão");
		rep.save(a);
		System.out.println(a.getId());


		Produto b = new Produto();
		b.setValor(3.0);
		b.setNome("xsalada");
		b.setDescricao("xsalada");
		rep.save(b);
		System.out.println(b.getId());


		Produto c = new Produto();
		c.setValor(3.0);
		c.setNome("vitaminada");
		c.setDescricao("vitaminada");
		rep.save(c);
		System.out.println(c.getId());


	}

}
