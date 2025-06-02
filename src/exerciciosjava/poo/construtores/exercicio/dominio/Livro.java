package exerciciosjava.poo.construtores.exercicio.dominio;

public class Livro {
    private final String titulo;
    private final String autor;
    private final int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;

    }

    public void obterDetalhes(){
        System.out.println("Nome livro: " + this.titulo + " \nNome autor: " + this.autor + " \nAno Publicação: " + this.anoPublicacao);
    }
}
