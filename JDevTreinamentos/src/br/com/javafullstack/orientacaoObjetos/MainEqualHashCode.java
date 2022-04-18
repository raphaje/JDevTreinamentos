package br.com.javafullstack.orientacaoObjetos;

public class MainEqualHashCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Raphael");
		aluno1.setNumeroCpf("123");
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Raphael");
		aluno2.setNumeroCpf("124");
		
		/* Equal e HashCode são para comparar e diferenciar objetos */
		
		/* Equal compara objetos e retorna valor boolean, quando for iguais retorna true. */
		/* OBS: é preciso implementar a o método equal e hashcode para comparar o valor dos objetos,
		 * sem ele o "equais" irá comparar a sobreescrita na memória e sempre mostrará valor "false" mesmo
		 * o valor sendo iguais. 
		 * 
		 * VEJA: nesse exemplo temos duas pessoas com mesmo nome mas com cpf diferente então trata-se de duas pessoas diferentes */
		if(aluno1.equals(aluno2)) {
			System.out.println("Alunos são iguais.");
		}
		else {
			System.out.println("Alunos não são iguais.");
		}

	}

}
