package br.com.javafullstack.logicasCondicionaisRelacionais;

public class estruturaWhile {

	public static void main(String[] args) {

		int numero = 0;

		/* While verifica primeiro e depois executa */
		while (numero <= 10) {

			System.out.println(numero);
			numero++;
		}
		
		/*----------------------------------------------------------*/
		
		
		/* do while primeiro executa e depois verifica */
		int numero2 = 0;
		
		do {
			System.out.println(numero2);
			numero2++;
			} 
		while (numero2 <= 10);
		
		
	}
}