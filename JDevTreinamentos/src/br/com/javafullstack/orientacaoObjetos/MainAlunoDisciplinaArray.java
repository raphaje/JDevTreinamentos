package br.com.javafullstack.orientacaoObjetos;

public class MainAlunoDisciplinaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AlunoArray aluno = new AlunoArray();
		
		aluno.setNome("Raphael");
		
		
		// PRIMEIRA DISCIPLINA
		// ## Criando objeto disciplina para ser adicionado a lista de disciplinas desse aluno
		DisciplinaArray disciplina = new DisciplinaArray();
		
		disciplina.setDisciplina("Banco de dados");
		disciplina.setNota(70.0);
		
		// Adicionando a disciplina "Banco de dados" na lista de disciplinas do aluno
		aluno.getDisciplinas().add(disciplina);
		
		
		// SEGUNDA DISCIPLINA
		// ## Criando a segunda disciplina para ser adicionado a lista de disciplinas do aluno
		DisciplinaArray disciplina1 = new DisciplinaArray();
		
		disciplina1.setDisciplina("Matemática");
		disciplina1.setNota(70.0);
		
		// Adicionando a segunda disciplina na lista de disciplinas do aluno
		aluno.getDisciplinas().add(disciplina1);
		
		
		// TERCEIRA DISCIPLINA
		// ## Criando a terceira disciplina
		DisciplinaArray disciplina2 = new DisciplinaArray();
		
		disciplina2.setDisciplina("JAVA Orientação a Objetos");
		disciplina2.setNota(69.0);
		
		// Adicionando a terceira disciplina na lista de disciplinas do aluno
		aluno.getDisciplinas().add(disciplina2);
		
		System.out.println(aluno);
		System.out.println(aluno.getNome());
		System.out.println("Média do aluno = " + aluno.getMediaNota());
		System.out.println("Resultado = " + (aluno.getAlunoAprovado() ? "Aprovado" : "Reprovado"));

	}

}
