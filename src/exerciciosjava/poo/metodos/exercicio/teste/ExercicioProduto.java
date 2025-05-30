package exerciciosjava.poo.metodos.exercicio.teste;

import exerciciosjava.poo.metodos.exercicio.dominio.Produto;

public class ExercicioProduto {
    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.setPreco(50.0);
        produto.setNome("Café");

        System.out.println("Nome do produto: " + produto.getNome() + "\nPreço original: " + produto.getPreco());


        produto.aplicarDesconto(0.1);

        System.out.println("Nome do produto: " + produto.getNome() + "\nPreço com desconto:" + produto.getPreco());
    }
}
