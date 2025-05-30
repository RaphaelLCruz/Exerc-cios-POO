package exerciciosjava.poo.metodos.exercicio.teste;

import exerciciosjava.poo.metodos.exercicio.dominio.RetanguloPerimetro;

public class ExercicioRetangulo {
    public static void main(String[] args) {
        RetanguloPerimetro retangulo =  new RetanguloPerimetro();

        retangulo.setLargura(1.5);
        retangulo.setAltura(1.5);

        double area = retangulo.calcularPerimetro();

        System.out.println( "a altura é: " + retangulo.getAltura());
        System.out.println( "a largura é: " + retangulo.getLargura());


        System.out.println("o perimetro é: " +  area);

    }
}
