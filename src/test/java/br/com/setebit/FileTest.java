package br.com.setebit;

import br.com.setebit.delivery.util.FileUtil;

public class FileTest {
	
	public static void main(String[] args) {
		FileUtil fu = new FileUtil();
		fu.pegarJrxml("pedido.jrxml");
	}

	
}
