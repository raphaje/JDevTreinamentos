package br.com.javafullstack.orientacaoObjetos;

public class MainCalculoMedia {
	
	public static void main(String[] args) {
		
		CalculoMedia calculo = new CalculoMedia();
		
		calculo.setNota1(50);
		calculo.setNota2(20);
		calculo.setNota3(40.3);
		calculo.setNota4(10.2);
		
		System.out.println("A média é: " + calculo.getNotaMedia());
		System.out.println("Aluno está = " + calculo.getAlunoAprovado());
		
		/* Veja no print acima está retornando o valor true ou false, dependendo da aprovação do aluno 
		 * podemos formar a saída usando operadores ternários e assim imprimir o nome APROVADO OU REPROVADO
		 * veja o exemplo abaixo. */
		System.out.println("Aluno está = " + (calculo.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
	}

}
