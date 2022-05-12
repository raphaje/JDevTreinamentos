package br.com.javafullstack.orientacaoObjetos;

import javax.swing.JOptionPane;

public class MainAlunoDisciplinaArrayDinamico {
	
	
	/* Deixamos nosso código de forma mais dinâmica de forma que o usuário digite os dados tornando a utilização mais flexível e com menos código
	 * veja que na classe "MainAlunoDisciplinaArray" as disciplinas estão inseridas de forma fixa deixando o código menos eficaz*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AlunoArray aluno = new AlunoArray();
		
		aluno.setNome(JOptionPane.showInputDialog("Nome do aluno ?"));
		
		//String nomeAluno = JOptionPane.showInputDialog("Qual o nome do aluno ? ");
		
		for(int pos = 1; pos <= 4; pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina "+pos+" ?");
			double notaDisciplina = (+ Double.parseDouble(JOptionPane.showInputDialog("Nota da disciplina "+pos+" ?")));
			
			DisciplinaArray disciplina = new DisciplinaArray();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(notaDisciplina);
			
			aluno.getDisciplinas().add(disciplina);
			
		}
		
		System.out.println("Disciplinas Originais");
		System.out.println(aluno.getDisciplinas() + "\n");
		
		/* Agora vamos remover uma disciplina dessa lista, para isso vamos usar o .remove(index) 
		 * veja, o .add(disciplina) adiciona a disciplina na lista de disciplinas do aluno o .remove(index) 
		 * remove a disciplina da lista, "index" é a posição na lista */
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?");
		
		if (escolha == 0) {
			int disciplinaRemover = (+ Integer.parseInt(JOptionPane.showInputDialog("Qual disciplina deseja remover, 1, 2, 3 ou 4 ?")));
					aluno.getDisciplinas().remove(disciplinaRemover -1); //Lembre-se que a primeira posição do Array é 0, então preciamos subtrair 1 para remover o correto.
		}
		
		System.out.println(aluno);
		System.out.println("Aluno = " + aluno.getNome());
		System.out.println("Média do aluno = " + aluno.getMediaNota());
		System.out.println("Resultado = " + (aluno.getAlunoAprovado() ? "Aluno Aprovado" : "Aluno Reprovado\n"));
		System.out.println("Disciplinas Removidas");
		System.out.println(aluno.getDisciplinas());

	}

}
