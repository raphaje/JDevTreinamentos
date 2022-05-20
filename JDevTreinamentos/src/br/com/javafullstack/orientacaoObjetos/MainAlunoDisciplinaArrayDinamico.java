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
		
		if (escolha == 0) { // Esse zero aqui é o valor retornado da opção "sim", e assim entrar na condição.
		
			int continuaRemocao = 0; // Iniciado com zero para entrar na condição do while.
			int posicaoArray = 1;
			
			// While é uma estrutura que roda enquanto estiver atentendo a condição, enquanto estivermos selecionando "sim" o while vai rodar, lembre-se que quando clicamos em sim
			// é retornado valor zero para a variável continuarRemocao
			while (continuaRemocao == 0) {
			int disciplinaRemover = (+ Integer.parseInt(JOptionPane.showInputDialog("Qual disciplina deseja remover, 1, 2, 3 ou 4 ?")));
					aluno.getDisciplinas().remove(disciplinaRemover - posicaoArray); //Lembre-se que a primeira posição do Array é 0, então preciamos subtrair 1 para remover o correto.
					posicaoArray ++; // Incrementa mais um no valor dessa variavel, ou seja, soma mais 1, nesse caso para remover a disciplina correta no array pois após remover a primeira a lista é reordenada.
					continuaRemocao = JOptionPane.showConfirmDialog(null, "Deseja removar mais alguma disciplina ?");
			}
		}
		
		System.out.println(aluno);
		System.out.println("Aluno = " + aluno.getNome());
		System.out.println("Média do aluno = " + aluno.getMediaNota());
		System.out.println("Resultado = " + (aluno.getAlunoAprovado2() + "\n\n"));
		System.out.println("Disciplinas Removidas");
		System.out.println(aluno.getDisciplinas());
	}

}
