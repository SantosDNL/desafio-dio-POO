import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
	
	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		Curso curso2 = new Curso();
		
		
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição - Curso Java");
		curso1.setCargaHoraria(8);
		
		curso2.setTitulo("Curso javascript");
		curso2.setDescricao("Descrição - Curso javascript");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		
		mentoria.setTitulo("Mentoria Java");
		mentoria.setDescricao("Descrição - Mentoria Java");	
		mentoria.setData(LocalDate.now());
		
		
		
		/*System.out.println(curso1);
		System.out.println(curso2);
	
		System.out.println(mentoria);*/
		
		Bootcamp bootcamp = new Bootcamp();
		
		bootcamp.setNome("Bootcamp Java Developer");																	// Criando bootcamp e inserindo seus conteúdos
		bootcamp.setDescricao("Descrição - Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		
		Dev devCamila = new Dev();
		devCamila.setNome("Camila");
		devCamila.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos de " + devCamila.getNome() + ": " + devCamila.getConteudosInscritos());
		devCamila.progredir();																							// Nesse caso Camila irá progredir duas vezes, 
		devCamila.progredir();																							// tendo que fazer somente a Mentoria com total de 120XP
		System.out.println("Conteudos Inscritos de " + devCamila.getNome() + ": " + devCamila.getConteudosInscritos());
		System.out.println("Conteudos Concluídos de " + devCamila.getNome() + ": " + devCamila.getConteudosConcluidos());
		System.out.println("XP: " + devCamila.calcularTotalXP());
		
		System.out.println("");
		
		Dev devDaniel = new Dev();
		devDaniel.setNome("Daniel");
		devDaniel.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos de " + devDaniel.getNome() + ": " + devDaniel.getConteudosInscritos());
		devDaniel.progredir();																							// Nesse caso Daniel concluiu todos os cursos e mentorias, logo,
		devDaniel.progredir();																							// não devem aparecer conteudos inscritos e um total de 150XP
		devDaniel.progredir();
		System.out.println("Conteudos Inscritos de " + devDaniel.getNome() + ": " + devDaniel.getConteudosInscritos());
		System.out.println("Conteudos Concluídos de " + devDaniel.getNome() + ": " + devDaniel.getConteudosConcluidos());
		System.out.println("XP: " + devDaniel.calcularTotalXP());

	}
}