package br.com.javafullstack.orientacaoObjetos;

public class Aluno {
	
	
	/* Esse são os atributos do aluno. 
	 * Quando não definimos o estado desse atributo
	 * o java usa por padrão o private,
	 * podemos usar os valores public, private e protected
	 * */
	public String nome;
	int idade;
	String dataNascimento;
	String registroGeral;
	String numeroCpf;
	String nomeMae;
	String nomePai;
	String dataMatricula;
	String nomeEscola;
	String serieMatriculado;
	
	/* Podemos criar um construtor para definir valores padrões */
	
	/* Cria dados na memoria, sendo padrão do java, mesmo que não crie aqui o java usa um construtor que não vemos */
	public Aluno() {
		// TODO Auto-generated constructor stub		
		
	}
	
	/* Construtor com varialvel nomePadrao, quando essa variavel recebe valor ela passa para a variavel nome */
	public Aluno(String nomePadrao) {
		nome = nomePadrao;
	}
	
	/* Aqui é um construtor que precisa receber nome e idade
	 * que é recebido no nomePadrao e idadePadrao e depois passado para
	 * as variáveis nome e idade */
	public Aluno(String nomePadrao, int idadePadrao ) {
		nome = nomePadrao;
		idade = idadePadrao;
	}

}
