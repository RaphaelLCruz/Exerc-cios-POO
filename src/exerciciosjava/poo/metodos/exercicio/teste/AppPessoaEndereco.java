package exerciciosjava.poo.metodos.exercicio.teste;


import exerciciosjava.poo.metodos.exercicio.dominio.Endereco;
import exerciciosjava.poo.metodos.exercicio.dominio.Pessoa;

import java.util.Scanner;

public class AppPessoaEndereco {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entradaString = new Scanner(System.in);
        char resp;
        // Objeto Pessoa e Endereco

        Pessoa p = new Pessoa();
        Endereco end = new Endereco();

        //dados pessoa
        System.out.println("Digite o nome: ");
        p.setNome(entradaString.nextLine());
        System.out.println("Digite a idade: ");
        p.setIdade(entrada.nextInt());
        System.out.println("Digite o sexo (f/m): ");
        p.setSexo(entrada.next().charAt(0));


        //dados endereco
        System.out.println("Digite seu endereço: ");
        end.setLograrouro(entradaString.nextLine());
        System.out.println("Digite o numero: ");
        end.setNumero(entrada.nextInt());

        System.out.println("Tem complento? ");
        resp = entrada.next().charAt(0);

        if(resp == 's' ){
            System.out.println("Digite o complemento: ");
            end.setComplemento(entradaString.nextLine());
        }else{
            end.setComplemento("");
        }

        System.out.println("Digite o CEP:");
        end.setCep(entrada.next());

        //associação entre pessoa e endereço
        p.setEnd(end);

        System.out.println("Dados da Pessoa: " + p.imprimir());
    }
}
