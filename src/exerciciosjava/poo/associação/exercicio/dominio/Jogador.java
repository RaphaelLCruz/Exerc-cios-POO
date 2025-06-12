package exerciciosjava.poo.associação.exercicio.dominio;

public class Jogador {
    private String nome;
    private int numeroCamisa;
    private Equipe equipe;

    public Jogador(String nome, int numeroCamisa) {
        this.nome = nome;
        this.numeroCamisa = numeroCamisa;
    }


    public String getNome() {
        return nome;
    }

    public int getNumeroCamisa() {
        return numeroCamisa;
    }


      public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }
}
