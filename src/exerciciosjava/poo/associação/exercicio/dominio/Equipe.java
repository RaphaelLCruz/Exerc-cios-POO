package exerciciosjava.poo.associação.exercicio.dominio;

public class Equipe {
    private String nomeEquipe;
    private Jogador[] listaJogadores;

    public Equipe(String nomeEquipe, Jogador[] listaJogadores){
        this.nomeEquipe = nomeEquipe;
        this.listaJogadores = listaJogadores;
    }

    public void listarJogadores(){
       //for(Jogador jogadores: listaJogadores){
       //    System.out.println(jogadores.getNome());
       //}
        System.out.println(this.nomeEquipe);
        for(int i = 0; i < listaJogadores.length; i++){
            System.out.println("Nome: " + listaJogadores[i].getNome() + " Camisa: " + listaJogadores[i].getNumeroCamisa());
        }
    }

    public Jogador[] getListaJogadores() {
        return listaJogadores;
    }

    public void setListaJogadores(Jogador[] listaJogadores) {
        this.listaJogadores = listaJogadores;
    }

    public String getNomeEquipe() {
        return nomeEquipe;
    }

    public void setNomeEquipe(String nomeEquipe) {
        this.nomeEquipe = nomeEquipe;
    }
}
