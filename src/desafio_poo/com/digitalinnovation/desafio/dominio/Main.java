package desafio_poo.com.digitalinnovation.desafio.dominio;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {

		Curso cursoJava = new Curso();
		cursoJava.setTitulo("Curso de java");
		cursoJava.setDescricaao("Aprendendo mais sobre orientação a objetos");
		cursoJava.setCargaHoraria(8);

		Curso cursoJs = new Curso();
		cursoJs.setTitulo("Curso de javascript");
		cursoJs.setDescricaao("Introdução a promises");
		cursoJs.setCargaHoraria(3);

		Mentoria mentoriaJava = new Mentoria();
		mentoriaJava.setTitulo("Introdução a java");
		mentoriaJava.setDescricaao("Começando a aprender como java");
		mentoriaJava.setData(LocalDate.now());

		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setName("Java developer bootcamp");
		bootcamp.setDescricao("Aprende java, uma das línguagens mais utilizadas no mercado e que mais empregam");
		bootcamp.getConteudos().add(cursoJava);
		bootcamp.getConteudos().add(cursoJs);
		bootcamp.getConteudos().add(mentoriaJava);

		Dev pedro = new Dev();
		pedro.setName("Pedro");
		pedro.inscreverBootcamp(bootcamp);
		pedro.progredir();
		System.out.println("Conteúdos inscritos Pedro: " + pedro.getConteudosInscritos());
		System.out.println("Conteúdos concluidos Pedro: " + pedro.getConteudosConcluidos());
		System.out.println("XP: " + pedro.calcularTotalXp());

		Dev fernando = new Dev();
		fernando.setName("fernando");
		fernando.inscreverBootcamp(bootcamp);
		fernando.progredir();
		System.out.println("Conteúdos inscritos Fernando: " + fernando.getConteudosInscritos());
		System.out.println("Conteúdos concluidos Fernando: " + fernando.getConteudosConcluidos());
		System.out.println("XP: " + fernando.calcularTotalXp());
	}

}
