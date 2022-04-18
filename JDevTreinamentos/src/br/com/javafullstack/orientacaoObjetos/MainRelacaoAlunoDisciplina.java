package br.com.javafullstack.orientacaoObjetos;

import javax.swing.JOptionPane;

public class MainRelacaoAlunoDisciplina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Cria o objeto aluno1 */
		Aluno aluno1 = new Aluno();
		
		/* Recebe entrada de dados do teclado e armazena na variável nome, cpf e disciplina1 */
		String nome = JOptionPane.showInputDialog("Nome do Aluno");
		String cpf = JOptionPane.showInputDialog("CPF do aluno");
		String disciplina1 = JOptionPane.showInputDialog("Disciplina 1");
		
		/* Recebe entrada de dados do teclado ja convertendo o tipo para double
		 * pois o tipo do JOptionPane é String. */
		double nota1 = (+ Double.parseDouble(JOptionPane.showInputDialog("Nota 1")));
		double nota2 = (+ Double.parseDouble(JOptionPane.showInputDialog("Nota 2")));
		double nota3 = (+ Double.parseDouble(JOptionPane.showInputDialog("Nota 3")));
		double nota4 = (+ Double.parseDouble(JOptionPane.showInputDialog("Nota 4")));
		
		/* Passando os valores armazenado nas variáveis para o objeto aluno1  */
		aluno1.setNome(nome);
		aluno1.setNumeroCpf(cpf);
		
		/* Aqui existe o relação do objeto aluno com objeto disciplina
		 * então devemos usar o "getDisciplina" para depois inserir os dados usando o 
		 * método setDisciplina passando o variavel com o valor que digitamos anteriormente 
		 * as notas também segue o mesmo padrão */
		aluno1.getDisciplina().setDisciplina1(disciplina1);
		aluno1.getDisciplina().setNota1(nota1);
		aluno1.getDisciplina().setNota2(nota2);
		aluno1.getDisciplina().setNota3(nota3);
		aluno1.getDisciplina().setNota4(nota4);
		
		/* Imprime ToString */
		System.out.println(aluno1.toString());
		
		/* Imprime no console alguns dados do aluno */
		System.out.println("Nome do Aluno é = " + nome);
		System.out.println("Cpf do aluino é = " + cpf);
		System.out.println("Disciplina 1 = " + disciplina1);
		
		/* Imprime o valor da média e se foi aprovado ou reprovado */
		System.out.println("A média do aluno é = " + aluno1.getNotaMedia());
		System.out.println(aluno1.getAlunoAprovado() ? "Aluno Aprovado" : "Aluno Reprovado");

	}

}
