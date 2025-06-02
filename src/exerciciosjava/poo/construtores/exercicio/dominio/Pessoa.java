package exerciciosjava.poo.construtores.exercicio.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void apresentar(){
        System.out.println("Meu nome é: " + this.nome);
        System.out.println("Eu tenho " + this.idade + " anos");
    }
}
