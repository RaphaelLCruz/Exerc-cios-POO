package exerciciosjava.poo.associação.exercicio.teste;

import exerciciosjava.poo.associação.exercicio.dominio.Equipe;
import exerciciosjava.poo.associação.exercicio.dominio.Jogador;

import java.sql.SQLOutput;

public class ExercicioEquipeJogador {
    public static void main(String[] args) {

        Equipe equipe = new Equipe("Barcelona");
        Equipe equipe2 = new Equipe("Real Madrid");

        Jogador jogador = new Jogador("Neymar", 11);
        Jogador jogador2 = new Jogador("Messi", 10);
        Jogador jogador3 = new Jogador("Vini Jr", 7);

        equipe.adicionarJogador(jogador);
        equipe.adicionarJogador(jogador2);
        equipe2.adicionarJogador(jogador3);

        equipe.listarJogadores();
        equipe2.listarJogadores();


    }
}
