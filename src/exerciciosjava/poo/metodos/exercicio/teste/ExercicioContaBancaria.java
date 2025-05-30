package exerciciosjava.poo.metodos.exercicio.teste;

import exerciciosjava.poo.metodos.exercicio.dominio.ContaBancaria;

public class ExercicioContaBancaria {
    public static void main(String[] args) {
        // Criando uma nova conta bancária com saldo inicial de 1000
        ContaBancaria minhaConta = new ContaBancaria();

        minhaConta.setSaldo(5000);

        System.out.println("Saldo inicial: R$" + minhaConta.getSaldo());


        minhaConta.depositar(1);

        minhaConta.sacar(0);


        System.out.println("\nSaldo final da conta: R$" + minhaConta.getSaldo());
    }
}
