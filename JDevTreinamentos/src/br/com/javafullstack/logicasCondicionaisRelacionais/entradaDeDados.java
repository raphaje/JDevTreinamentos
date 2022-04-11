package br.com.javafullstack.logicasCondicionaisRelacionais;

import javax.swing.JOptionPane;

public class entradaDeDados {

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
		
		System.out.println("Cada pessoa ficou com " + divisao + " carros");
		System.out.println("Restou " + resto + " carro.");
		
		/*
		 * Mostrando mensagem na tela ao invés do console, usando o JOptionPane
		 */
		
		JOptionPane.showMessageDialog(null, "Cada pessoa ficou com " + divisao + " carros e restou " + resto + " carro.");

	}

}
