package exerciciosjava.poo.metodos.exercicio.teste;

import exerciciosjava.poo.metodos.exercicio.dominio.Aluno;

public class ExercicioAluno {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.setNotas(new double[] {5.0, 6.5, 8.0, 9.5});
        aluno.adicionarNota();

        double media = aluno.calcularMedia();
        System.out.println("Média das notas: " + String.format("%.2f", media));

        aluno.imprime();
    }


}
