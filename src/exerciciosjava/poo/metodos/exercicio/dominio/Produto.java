package exerciciosjava.poo.metodos.exercicio.dominio;

public class Produto {
    private String nome;
    private double preco;


    public void aplicarDesconto(double desconto){
        double valorDoDesconto = this.preco * desconto; // Calcula o valor do desconto
        this.preco = this.preco - valorDoDesconto; // Aplica o desconto

        System.out.println("Percentual de desconto aplicado: " + (desconto * 100) + "%");
        System.out.println("Valor do desconto: R$" + String.format("%.2f", valorDoDesconto)); // Imprime o valor em dinheiro

    }

    public double getPreco(){
        return this.preco;

    }
    public void setPreco(double preco){
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
