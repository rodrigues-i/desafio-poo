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
		
		System.out.println(cursoJava);
	}

}
