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
		System.out.println("Idade do aluno é: " + aluno2.idade + "\n");
		
		/* Aqui to criando o objeto aluno3 passando os parâmetros nome e idade  */
		Aluno aluno3 = new Aluno("Raphael", 34);
		
		
		/* GETTERS AND SETTERS */
		
		/* Criando Objeto, passando parametros e recebendo valor usando o getters e setters */
		GettersSetters aluno4 = new GettersSetters();
		aluno4.setNome("Raphael Honorato");
		aluno4.setIdade(34);
		aluno4.setDataNascimento("05/07/1987");
		aluno4.setRegistroGeral("2222222222222");
		aluno4.setNumeroCpf("33333333333");
		aluno4.setNomeMae("Raimunda");
		aluno4.setNomePai("Jamal");
		aluno4.setDataMatricula("01/01/2022");
		aluno4.setNomeEscola("Escola 1");
		aluno4.setSerieMatriculado("Primera série");
		
		
		System.out.println("Usando método getters and setters:");
		System.out.println("Nome do aluno é: " + aluno4.getNome());
		System.out.println("Idade do aluno é: " + aluno4.getIdade());
		System.out.println("Data do Nascimento do aluno é: " + aluno4.getDataNascimento());
		System.out.println("RG do aluno é: " + aluno4.getRegistroGeral());
		System.out.println("CPF do aluno é: " + aluno4.getNumeroCpf());
		System.out.println("Nome da mãe do aluno é: " + aluno4.getNomeMae());
		System.out.println("Nome do pai do aluno é: " + aluno4.getNomePai());
		System.out.println("Data da matrícula do aluno é: " + aluno4.getDataMatricula());
		System.out.println("Nome da escola do aluno é: " + aluno4.getNomeEscola());
		System.out.println("Serie do aluno é: " + aluno4.getSerieMatriculado());

	}

}
