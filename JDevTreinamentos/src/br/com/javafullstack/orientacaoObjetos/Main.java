package br.com.javafullstack.orientacaoObjetos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Objeto ainda não existe na memória  */
		Aluno aluno1;
		
		/* Agora temos um objeto real 
		 * new Aluno() é uma instância (Criação de objeto) 
		 * aluno2 é uma referência para o objeto aluno.  */
		Aluno aluno2 = new Aluno();
		aluno2.nome = "Raphael";
		aluno2.idade = 34;
		
		System.out.println("Nome do aluno é: " + aluno2.nome);
		System.out.println("Idade do aluno é: " + aluno2.idade);
		
		/* Aqui to criando o objeto aluno3 passando os parâmetros nome e idade  */
		Aluno aluno3 = new Aluno("Raphael", 34);

	}

}
