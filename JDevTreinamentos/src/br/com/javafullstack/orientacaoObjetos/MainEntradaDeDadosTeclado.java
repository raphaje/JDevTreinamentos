package br.com.javafullstack.orientacaoObjetos;

import javax.swing.JOptionPane;

public class MainEntradaDeDadosTeclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Usando a biblioteca JOptionPane para inserir dados na aplicação */
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno ? ");
		
		/* OBS: O JOptionPane é do tipo String, caso seja inserido um número que vai ser usado em um método do tipo inteiro
		 * ou para fazer cálculo, sempre sera necessário converter para o tipo inteiro
		 * Nesse exemplo aqui criamos a variável idade do tipo inteiro e já usamos o JOptionPane fazendo
		 * a conversão do tipo usando o Interger.ParseInt */
		int idade = (+ Integer.parseInt(JOptionPane.showInputDialog("Qual a idade ?")));
		
		/* Criando o objeto */
		Aluno aluno1 = new Aluno();
		
		/* Passando o dado armazenado na varável "nome" para o método setNome do objeto aluno1 */
		aluno1.setNome(nome);
		aluno1.setIdade(idade);
		
		/* Recuperando o nome do objeto aluno1 usando o método getNome e imprimindo no console. */
		System.out.println("O nome do aluno é = " + aluno1.getNome());
		System.out.println("A idade do aluno é = " + aluno1.getIdade() + "\n");
		
		/* ###################################################### */
		
		/* Método ToString mostra a descrição do objeto na memória 
		 * mostra na seguinte forma pacote.classe@endereço na memória */
		System.out.println(aluno1.toString());
		System.out.println("Nome do aluno é = " + aluno1.getNome());
		System.out.println("Idade é = " + aluno1.getIdade());
		

	}

}
