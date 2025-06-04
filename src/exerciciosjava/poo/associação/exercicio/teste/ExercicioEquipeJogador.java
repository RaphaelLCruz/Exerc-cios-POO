package exerciciosjava.poo.associação.exercicio.teste;

import exerciciosjava.poo.associação.exercicio.dominio.Equipe;
import exerciciosjava.poo.associação.exercicio.dominio.Jogador;

public class ExercicioEquipeJogador {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Ronaldo", 9);
        Jogador jogador2 = new Jogador("Messi",  10);
        Jogador [] listaJogadores = {jogador1, jogador2};

        Equipe equipe = new Equipe("Barcelona", listaJogadores);

        equipe.listarJogadores();

    }
}
