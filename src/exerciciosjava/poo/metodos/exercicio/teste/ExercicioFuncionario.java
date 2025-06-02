package exerciciosjava.poo.metodos.exercicio.teste;

import exerciciosjava.poo.metodos.exercicio.dominio.Funcionario;

public class ExercicioFuncionario {

    public static void main(String[] args) {

        Funcionario funcionario =  new Funcionario();


        funcionario.setSalario(5000);
        System.out.println("Antigo salario: " + funcionario.getSalario());
        funcionario.darAumento(0.1);

        System.out.println("Salario novo: " + funcionario.getSalario());
    }
}
