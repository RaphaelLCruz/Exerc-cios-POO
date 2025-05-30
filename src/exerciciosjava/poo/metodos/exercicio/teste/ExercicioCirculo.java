package exerciciosjava.poo.metodos.exercicio.teste;

import exerciciosjava.poo.metodos.exercicio.dominio.CirculoArea;

public class ExercicioCirculo {
    public static void main(String[] args) {
        CirculoArea circulo = new CirculoArea();


        circulo.raio = 5.0;

        System.out.println("O raio do círculo é: " + circulo.raio);
        System.out.println("A área do círculo é: " + circulo.calcularArea());
    }
}
