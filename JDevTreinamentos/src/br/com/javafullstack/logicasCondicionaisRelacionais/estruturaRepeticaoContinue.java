package br.com.javafullstack.logicasCondicionaisRelacionais;

public class estruturaRepeticaoContinue {
	
	public static void main(String[] args) {
	
		
		/* Estrutura de repetição FOR com o "continue"
		  Funciona assim, processa algo e continua
		  nesse caso aqui quando encontra o numero 3 ele imprimi e continua
		  quando encontra o 6 imprimi e continua e assim por diante. */
		
	for(int numero = 0; numero <= 10; numero ++) {
		if(numero ==3 || numero == 6 || numero == 9) {
		System.out.println("Oba Achei o numero " + numero);
		continue;
		}
		
		}
	}

}
