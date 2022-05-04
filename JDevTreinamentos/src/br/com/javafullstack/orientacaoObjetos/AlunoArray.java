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
	
	// Calcula a media do aluno
	public double getMediaNota() {
		double media = 0.0;
		
		// DisciplinaArray é tipo, "disciplina" é o nome dessa instancia e "disciplinas" é a lista
		// que instanciamos logo acima, use a tecla command + seta do mouse para abrir a declaração
		for(DisciplinaArray disciplina : disciplinas) {
			media += disciplina.getNota();
		}
		// Retorno a soma das notas dividido por 4, é a média.
		// OBS: O melhor é deixar de forma dinamica pois caso seja inserido mais uma disciplina você teria 
		// que vir aqui mudar para dividir por 5.
		// Faça o java contar quantos objetos existe dentro da lista, veja abaixo.
		// return media / 4; <- forma antiga menos eficaz
		return media / disciplinas.size();
	}
	
	// Verifica se aluno foi aprovado ou reprovado
	public boolean getAlunoAprovado() {
		double media = this.getMediaNota();
		if(media >= 70.0) {
			return true;
		}
		else {
			return false;
		}
		
			
		
	}
	

}
