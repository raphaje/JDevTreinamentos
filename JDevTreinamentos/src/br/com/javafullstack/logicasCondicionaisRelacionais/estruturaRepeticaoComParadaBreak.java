package br.com.javafullstack.logicasCondicionaisRelacionais;

public class estruturaRepeticaoComParadaBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Break -> parar a repetição quando encontrar o valor espeficico 
		
		for (int numero = 0; numero <= 10; numero++) {
			if(numero == 7) {
				System.out.println("Econtrei o numero 7");
				System.out.println("Parei de executar");
				break;
			}
			
		}
	}

}
