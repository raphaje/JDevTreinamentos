package br.com.javafullstack.orientacaoObjetos;

public class MainCalculoMedia {
	
	public static void main(String[] args) {
		
		CalculoMedia calculo = new CalculoMedia();
		
		calculo.setNota1(90);
		calculo.setNota2(70);
		calculo.setNota3(60.3);
		calculo.setNota4(70.2);
		
		System.out.println("A média é: " + calculo.getNotaMedia());
	}

}
