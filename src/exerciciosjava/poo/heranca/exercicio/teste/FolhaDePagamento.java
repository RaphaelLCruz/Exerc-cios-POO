package exerciciosjava.poo.heranca.exercicio.teste;

import exerciciosjava.poo.heranca.exercicio.dominio.*;

public class FolhaDePagamento {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Tayane", 1);
        Funcionario funcionario = new Funcionario("Raphael", 2);
        Gerente gerente = new Gerente("Marcos", 3);
        Telefonista telefonista = new Telefonista("Joao", 4);
        Vendedor vendedor = new Vendedor("Paulo", 5);



        pessoa.imprimeNome();
        System.out.println("\n----------");
        System.out.println("\n----------");
        gerente.imprimeGerente();
        System.out.println("\n----------");
        telefonista.imprimeTelefonista();
        System.out.println("\n----------");
        vendedor.imprimeVendedor();


        System.out.println("\n----------");
        System.out.println("\n----------");
        System.out.println("\n----------");

        funcionario.imprimirFolhaPagamento();
        System.out.println("\n----------");
        gerente.imprimirFolhaPagamentoGerente();
        System.out.println("\n----------");
        telefonista.imprimeFolhaPagamentoTelefonista();
        System.out.println("\n----------");
        vendedor.imprimeFolhaPagamentoVendedor();



    }
}
