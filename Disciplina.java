import java.util.ArrayList;
import java.util.List;

public class Disciplina {
	
	private String codigo;
	private String nome;
	private Integer cargaHoraria;
	private List<Aluno> alunos = new ArrayList<>();
	
	
	public Disciplina() {
	}

	public Disciplina(String codigo, String nome, Integer cargaHoraria) {
		this.codigo = codigo;
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}
	
	public void mediaDisciplina() {
		double sum = 0;
		int cont = 0;
		for (Aluno aluno : getAlunos()) {
			sum += aluno.mediaAluno();
			cont++;
		}
		System.out.println("M�dia dos Alunos na disciplina: " + sum/cont);
	}
}
