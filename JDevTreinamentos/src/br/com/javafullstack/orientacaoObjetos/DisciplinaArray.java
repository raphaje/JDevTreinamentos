package br.com.javafullstack.orientacaoObjetos;

import java.util.Objects;

/* Estudo de Array e Lists, essa classe servirá para todos os objetos e instancias
 * de notas e materias */

public class DisciplinaArray {
	
	private Double nota;
	private String disciplina;
	
	public Double getNota() {
		return nota;
	}
	public void setNota(Double nota) {
		this.nota = nota;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	@Override
	public int hashCode() {
		return Objects.hash(disciplina, nota);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DisciplinaArray other = (DisciplinaArray) obj;
		return Objects.equals(disciplina, other.disciplina) && Objects.equals(nota, other.nota);
	}
	
	@Override
	public String toString() {
		return "DisciplinaArray [nota=" + nota + ", disciplina=" + disciplina + "]";
	}

}
