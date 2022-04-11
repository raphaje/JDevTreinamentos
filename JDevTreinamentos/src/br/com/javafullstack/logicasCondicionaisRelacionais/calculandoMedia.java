package br.com.javafullstack.logicasCondicionaisRelacionais;

import javax.swing.JOptionPane;

public class calculandoMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ap1 = JOptionPane.showInputDialog("Informa a nota da avaliação parcial 1: ");
		String af1 = JOptionPane.showInputDialog("Informe a nota da avaliação final 1: ");
		String ap2 = JOptionPane.showInputDialog("Informe a nota a avaliação parcial 2: ");
		String af2 = JOptionPane.showInputDialog("Informa a nota da avaliação final 2: ");
		
		double dAp1 = Double.parseDouble(ap1);
		double dAf1 = Double.parseDouble(af1);
		double dAp2 = Double.parseDouble(ap2);
		double dAf2 = Double.parseDouble(af2);
		
		double media = (dAp1 + dAf1 + dAp2 + dAf2) / 4;
		
		// Média para aprovação é 70
		
		if(media >= 50) {
			if(media >= 70) {
				JOptionPane.showMessageDialog(null, "Aluno aprovado com média: " + media);
			}
			else {
			JOptionPane.showMessageDialog(null, "Aluno em recuperação com média: " + media);
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "Aluno reprovado com média: " + media);
		}
	}

}
