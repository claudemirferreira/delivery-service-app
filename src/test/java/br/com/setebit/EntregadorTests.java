package br.com.setebit;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.setebit.delivery.mode.entity.Entregador;
import br.com.setebit.delivery.repository.EntregadorRepository;

@SpringBootTest
class EntregadorTests {

	@Autowired
	EntregadorRepository rep;

	@Test
	void contextLoads() {
	}

	@Test
	void testarCalculo() {

		Entregador en = new Entregador();
		en.setCnh("aaa");
		en.setNome("aaaa");
		en.setPlaca("aaa");
		rep.save(en);
		System.out.println(en.getId());

	}

}
