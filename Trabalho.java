package dominio;

import java.time.LocalDate;

public class Trabalho extends Avaliacao{
	
	private boolean emGrupo;

	public Trabalho(){	
	}
	
	public Trabalho(Integer peso, LocalDate data, Double nota, boolean emGrupo) {
		super(peso, data, nota);
		this.emGrupo = emGrupo;
	}

	public boolean isEmGrupo() {
		return emGrupo;
	}

	public void setEmGrupo(boolean emGrupo) {
		this.emGrupo = emGrupo;
	}

}
