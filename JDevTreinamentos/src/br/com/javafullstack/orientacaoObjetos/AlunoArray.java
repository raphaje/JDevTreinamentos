package br.com.javafullstack.orientacaoObjetos;

import java.util.ArrayList;
import java.util.Objects;

public class AlunoArray {
	
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
	
	/* DisciplinaArray é a classe de qual vamos usar os atributos. */
	private ArrayList<DisciplinaArray> disciplinas = new ArrayList<DisciplinaArray>();
	
	public void setDisciplinas(ArrayList<DisciplinaArray> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	public ArrayList<DisciplinaArray> getDisciplinas() {
		return disciplinas;
	}

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

	@Override
	public int hashCode() {
		return Objects.hash(dataMatricula, dataNascimento, disciplinas, idade, nome, nomeEscola, nomeMae, nomePai,
				numeroCpf, registroGeral, serieMatriculado);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AlunoArray other = (AlunoArray) obj;
		return Objects.equals(dataMatricula, other.dataMatricula)
				&& Objects.equals(dataNascimento, other.dataNascimento)
				&& Objects.equals(disciplinas, other.disciplinas) && idade == other.idade
				&& Objects.equals(nome, other.nome) && Objects.equals(nomeEscola, other.nomeEscola)
				&& Objects.equals(nomeMae, other.nomeMae) && Objects.equals(nomePai, other.nomePai)
				&& Objects.equals(numeroCpf, other.numeroCpf) && Objects.equals(registroGeral, other.registroGeral)
				&& Objects.equals(serieMatriculado, other.serieMatriculado);
	}

	@Override
	public String toString() {
		return "AlunoArray [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento
				+ ", registroGeral=" + registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae
				+ ", nomePai=" + nomePai + ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola
				+ ", serieMatriculado=" + serieMatriculado + "]";
	}
	

}
