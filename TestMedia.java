import java.time.LocalDate;
import java.util.List;

public class TestMedia {

	public static void main(String[] args) {
		
		Avaliacao prova1 = new Prova(1, LocalDate.of(2022, 7, 4), 8.5, 10);
		Avaliacao prova2 = new Prova(1, LocalDate.of(2022, 7, 4), 9.0, 10);
		Avaliacao prova3 = new Prova(1, LocalDate.of(2022, 7, 4), 2.5, 10);
		Avaliacao prova4 = new Prova(1, LocalDate.of(2022, 7, 4), 7.2, 10);
		Avaliacao prova5 = new Prova(1, LocalDate.of(2022, 7, 4), 10.0, 10);

		Avaliacao trabalho1 = new Trabalho(1, LocalDate.of(2022, 6, 20), 10.0, false);
		Avaliacao trabalho2 = new Trabalho(1, LocalDate.of(2022, 6, 20), 10.0, false);
		Avaliacao trabalho3 = new Trabalho(2, LocalDate.of(2022, 6, 20), 10.0, false);
		Avaliacao trabalho4 = new Trabalho(1, LocalDate.of(2022, 6, 20), 10.0, false);
		Avaliacao trabalho5 = new Trabalho(2, LocalDate.of(2022, 6, 20), 10.0, false);
		
		Aluno aluno1 = new Aluno("123abc", "Estevao Araujo", "555.542.170-28");
		Aluno aluno2 = new Aluno("2245br", "Andre Luiz", "270.296.430-38");
		Aluno aluno3 = new Aluno("23045w", "Jaqueline Mattos", "959.221.010-13");
		Aluno aluno4 = new Aluno("23mc34", "Andreisse Leandro", "881.428.010-00");
		Aluno aluno5 = new Aluno("1034er", "Vitor Lucas", "400.886.510-10");
		
		aluno1.addAvaliacao(prova1);
		aluno1.addAvaliacao(trabalho1);
		System.out.println("Media do Aluno 1: "+aluno1.mediaAluno());
		
		aluno2.addAvaliacao(prova2);
		aluno2.addAvaliacao(trabalho2);
		System.out.println("Media do Aluno 2: "+aluno2.mediaAluno());

		aluno3.addAvaliacao(prova3);
		aluno3.addAvaliacao(trabalho3);
		System.out.println("Media do Aluno 3: "+aluno3.mediaAluno());
		

		aluno4.addAvaliacao(prova4);
		aluno4.addAvaliacao(trabalho4);
		System.out.println("Media do Aluno 4: "+aluno4.mediaAluno());

		aluno5.addAvaliacao(prova5);
		aluno5.addAvaliacao(trabalho5);
		System.out.println("Media do Aluno 5: "+aluno5.mediaAluno());

		
		Disciplina poo = new Disciplina("25xp10", "Engenharia de Requisitos", 80);
		erps.getAlunos().addAll(List.of(aluno1, aluno2, aluno3, aluno4, aluno5));
		
		erps.mediaDisciplina();
	}

}
