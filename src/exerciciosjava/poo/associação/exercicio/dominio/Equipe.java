package exerciciosjava.poo.associação.exercicio.dominio;

public class Equipe {
    private String nomeEquipe;
    private Jogador[] jogadores;
    private int totalJogadores = 0;
    private final int LIMITE = 5;

    public Equipe(String nomeEquipe) {
        this.nomeEquipe = nomeEquipe;
        this.jogadores = new Jogador[LIMITE];
    }

    public void listarJogadores() {

        for (Jogador jogador : jogadores) {
            if (jogador != null) {
                System.out.println(jogador.getNome() + " Camisa:" + jogador.getNumeroCamisa() + " Time: " + this.nomeEquipe);
            }
        }

    }


    public void adicionarJogador(Jogador jogador) {
        if (totalJogadores >= LIMITE) {
            System.out.println("Time cheio");
            return;
        }

        jogadores[totalJogadores] = jogador;
        totalJogadores++;

        jogador.setEquipe(this);
    }
}
