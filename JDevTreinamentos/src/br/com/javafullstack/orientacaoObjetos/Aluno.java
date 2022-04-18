package br.com.javafullstack.orientacaoObjetos;

import java.util.Objects;

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
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

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
	
	/* ###### Gerando ToString ####### */
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
				+ ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
				+ serieMatriculado + "]";
	}
	
	/* ###### Gerando métodos Equal e HashCode para comparar o valor ####### 
	 * aqui escolhemos apenas o atributo nome e cpf pois pode acontecer de duas pessoas
	 * ter nome iguais */

	@Override
	public int hashCode() {
		return Objects.hash(nome, numeroCpf);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(numeroCpf, other.numeroCpf);
	}

}
