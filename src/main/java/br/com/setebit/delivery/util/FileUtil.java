package br.com.setebit.delivery.util;

public class FileUtil {
	
	public String pegarJrxml(String nome) {
		System.out.println(System.getProperties().get("file.separator"));
		System.out.println(this.getClass().getResourceAsStream("/jasper/" + nome));
		
		return "";
		
	}

}
