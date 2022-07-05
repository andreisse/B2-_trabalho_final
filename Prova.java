package dominio;

import java.time.LocalDate;

public class Prova extends Avaliacao {
	
	private Integer qtdQuestoes;

	public Prova() {
	}

	public Prova(Integer peso, LocalDate data, Double nota, Integer qtdQuestoes) {
		super(peso, data, nota);
		this.qtdQuestoes = qtdQuestoes;
	}

	public Integer getQtdQuestoes() {
		return qtdQuestoes;
	}

	public void setQtdQuestoes(Integer qtdQuestoes) {
		this.qtdQuestoes = qtdQuestoes;
	}	
	
}
