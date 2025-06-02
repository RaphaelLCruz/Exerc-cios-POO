package exerciciosjava.poo.construtores.exercicio.teste;

import exerciciosjava.poo.construtores.exercicio.dominio.Livro;

public class ExercicioLivro {
    public static void main(String[] args) {
        Livro livro = new Livro("A longe Marcha", "Stephen King", 1972);

        livro.obterDetalhes();
    }
}
