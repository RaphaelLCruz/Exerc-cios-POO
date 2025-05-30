package exerciciosjava.poo.classes.exercicio.teste;

import exerciciosjava.poo.classes.exercicio.dominio.Carro;

public class ExercicioCarro01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.marca = "Hyundai";
        carro.modelo = "HB20";
        carro.anoFabriacao = 2010;

        carro2.marca = "Toyota";
        carro2.modelo = "Corolla";
        carro2.anoFabriacao = 2005;

        System.out.println(carro.marca);
        System.out.println(carro.modelo);
        System.out.println(carro.anoFabriacao);


        System.out.println("----------------");


        System.out.println(carro2.marca);
        System.out.println(carro2.modelo);
        System.out.println(carro2.anoFabriacao);

    }
}
