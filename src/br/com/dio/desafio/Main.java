package br.com.dio.desafio;

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
    curso1.setDescricao("Descri��o curso Java");
    curso1.setCargaHoraria(8);
    
    curso2.setTitulo("Curso Js");
    curso2.setDescricao("Descri��o curso Js");
    curso2.setCargaHoraria(4);
    
    Mentoria mentoria = new Mentoria();
    mentoria.setTitulo("Mentoria de Java");
    mentoria.setDescricao("Descri��o mentoria Java");
    mentoria.setData(LocalDate.now());
    
    /*System.out.println(curso1);
    System.out.println(curso2);
    System.out.println(mentoria);*/
    
    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Bootcamp Java Developer");
    bootcamp.setDescricao("Descri��o Bootcamp Java Developer");
    bootcamp.getConteudos().add(curso1);
    bootcamp.getConteudos().add(curso2);
    bootcamp.getConteudos().add(mentoria);
    
    Dev devDouglas = new Dev();
    devDouglas.setNome("Douglas");
    devDouglas.inscreverBootcamp(bootcamp);
    System.out.println("Conteudos inscritos Douglas: " + devDouglas.getConteudosInscritos());
    System.out.println("--------------------------------");
    devDouglas.progredir();
    devDouglas.progredir();
    System.out.println("Conteudos inscritos Douglas: " + devDouglas.getConteudosInscritos());
    System.out.println("Conteudos conclu�dos Douglas: " + devDouglas.getConteudosConcluidos());
    System.out.println("XP: " + devDouglas.calcularTotalXp());
    System.out.println("================================");
    Dev devJoao = new Dev();
    devJoao.setNome("Jo�o");
    devJoao.inscreverBootcamp(bootcamp);
    System.out.println("Conteudos inscritos Jo�o: " + devJoao.getConteudosInscritos());
    System.out.println("--------------------------------");
    devJoao.progredir();
    devJoao.progredir();
    devJoao.progredir();
    System.out.println("Conteudos inscritos Jo�o: " + devJoao.getConteudosInscritos());
    System.out.println("Conteudos conclu�dos Jo�o: " + devJoao.getConteudosConcluidos());
    System.out.println("XP: " + devJoao.calcularTotalXp());
  }

}
