package dominio;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	
	private String matricula;
	private String nome;
	private String cpf;
	private List<Avaliacao> avaliacoes = new ArrayList<>();
	
	public Aluno() {
	}

	public Aluno(String matricula, String nome, String cpf) {
		this.matricula = matricula;
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public void addAvaliacao(Avaliacao avaliacao) {
		this.avaliacoes.add(avaliacao);
		avaliacao.setAluno(this);
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public List<Avaliacao> getAvaliacoes() {
		return avaliacoes;
	}
	
	public Double mediaAluno() {
		double sum = 0;
		int peso = 0;
		for (Avaliacao avaliacao : getAvaliacoes()) {
			sum += avaliacao.calculaNota();
			peso += avaliacao.getPeso();
		}
		return sum/peso;
	}
}
