package br.com.javafullstack.orientacaoObjetos;

public class CalculoMedia {
	
	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;
	
	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getNota4() {
		return nota4;
	}

	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}

	public double getNotaMedia() {
		return (nota1 + nota2 + nota3 + nota4) / 4;
	}
	
	/* Método para retornar True para aprovado e False para reprovado.
	 * O this é usado quando queremos usar algo do próprio objeto, nesse caso
	 * estamos recuperando o valor do método getNotaMedia e armazenando
	 * na varável media que é do tipo double, mesmo tipo do método getNotaMedia. */
	public boolean getAlunoAprovado() {
		double media = this.getNotaMedia();
			if(media >= 70) {
				return true;
			}
			else {
				return false;
			}
	}
	
	/* Outra forma de calcular a media e retornar APROVADO ou REPROVADO 
	 * nesse exempo vamos criar um método que retorna String */
	public String getAlunoAprovado2() {
		double media = this.getNotaMedia();
		if(media >= 70) {
			return "Aluno está aprovado...";
		}
		else {
			return "Aluno está reprovado...";
		}
	}

}
