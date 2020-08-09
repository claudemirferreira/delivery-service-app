package br.com.setebit.delivery.util;

import java.math.BigDecimal;

import br.com.setebit.delivery.mode.entity.Pedido;

public class PedidoUtil {
	/*
	public static Pedido calcularValorPedido(Pedido pedido) {
		pedido = atualizarValorItens(pedido);
		double valor = 0;
		valor = pedido.getPedidoProdutos().stream().mapToDouble(x -> x.calcularValorTotal()).sum(); 
		pedido.setValor( BigDecimal.valueOf( valor ));
		System.out.println(valor);
		return pedido;
	}
	
	public static Pedido atualizarValorItens(Pedido pedido) {
		pedido.getPedidoProdutos().stream().forEach(x -> { 
			x.setValor(BigDecimal.valueOf() x.getProduto().getValor());
			x.setPedido(pedido);		
		});
		pedido.getPedidoProdutos().stream().forEach(x -> System.out.println(x.getValor()));
		return pedido;
	}
	*/

}
