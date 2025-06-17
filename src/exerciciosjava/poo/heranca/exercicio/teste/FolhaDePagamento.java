package exerciciosjava.poo.heranca.exercicio.teste;

import exerciciosjava.poo.heranca.exercicio.dominio.*;

public class FolhaDePagamento {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Tayane", 1);
        Funcionario funcionario = new Funcionario("Raphael", 2);
        Gerente gerente = new Gerente("Marcos", 3);
        Telefonista telefonista = new Telefonista("Joao", 4);
        Vendedor vendedor = new Vendedor("Paulo", 5);




        funcionario.imprimirFolhaPagamento();
        System.out.println("\n----------");
        gerente.imprimirFolhaPagamento();
        System.out.println("\n----------");
        telefonista.imprimirFolhaPagamento();
        System.out.println("\n----------");
        vendedor.imprimirFolhaPagamento();






    }
}
