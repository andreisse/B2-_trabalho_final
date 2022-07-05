package dominio;

import java.time.LocalDate;

public class Avaliacao {
	
	private Integer peso;
	private LocalDate data;
	private Double nota;
	private Aluno aluno;
	
	public Avaliacao() {
	}

	public Avaliacao(Integer peso, LocalDate data, Double nota) {
		this.peso = peso;
		this.data = data;
		this.nota = nota;
	}

	public Integer getPeso() {
		return peso;
	}

	public void setPeso(Integer peso) {
		this.peso = peso;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	public Double calculaNota() {
		return peso * nota;
	}

	
}
