package exerciciosjava.poo.classes.exercicio.teste;

import exerciciosjava.poo.classes.exercicio.dominio.Livro;

public class ExercicioLivro01 {
    public static void main(String[] args) {
        Livro livro = new Livro();
        Livro livro2 = new Livro();

        livro.titulo = "Suicidas";
        livro.autor = "Raphael Montes";
        livro.anoPublicacao = 2020;


        livro2.titulo = "A Longa Marcha";
        livro2.autor = "Stephen King";
        livro2.anoPublicacao = 1972;

        System.out.println(livro.titulo);
        System.out.println(livro.autor);
        System.out.println(livro.anoPublicacao);

        System.out.println("--------------------");


        System.out.println(livro2.titulo);
        System.out.println(livro2.autor);
        System.out.println(livro2.anoPublicacao);
    }

}
