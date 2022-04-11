package br.com.javafullstack.logicasCondicionaisRelacionais;

import javax.swing.JOptionPane;

public class caixaDeConfirmacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros. ");
		String pessoas = JOptionPane.showInputDialog("Informe quantidade de pessoas. ");
		
		/*
		 * 
		 * O tipo de dados das variáveis acima é String então se digitarmos números para fazer um calculo o código irá quebrar
		 * então vamos converter para um tipo numerico.
		 * 
		 */
		
		double carroNumero = Double.parseDouble(carros);
		double pessoasNumero = Double.parseDouble(pessoas);
		
		int divisao = (int) (carroNumero / pessoasNumero);
		
		int resto = (int) (carroNumero % pessoasNumero);
		
		
		/* Aqui está imprimindo no console */
		System.out.println("Cada pessoa ficou com " + divisao + " carros");
		System.out.println("Restou " + resto + " carro.");
		
		/* JOptionPane showConfirmDialog retorna um valor inteiro
		 * Sim retorna 0
		 * Não retorna 1
		 * Cancelar retorna 2
		 * OK Option retorna 0 */
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja fazer a divisão ? ");
		
		if(resposta == 0) {
			JOptionPane.showMessageDialog(null, "A divisão deu " + divisao);
			
		}
		
		resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o RESTO da divisão ? ");
		
		if(resposta == 0) {
			JOptionPane.showMessageDialog(null, "O resto é " + resto);
		}
		
				/*
				 * Mostrando mensagem na tela ao invés do console, usando o JOptionPane
				 * 
				 */
				
		         // JOptionPane.showMessageDialog(null, "Cada pessoa ficou com " + divisao + " carros e restou " + resto + " carro.");

	}

}
