package exerciciosjava.poo.classesabstratas.exercicio.dominio;

public class Assassino extends Personagem{

    public Assassino(String nome, int vida) {
        super(nome, vida);
    }

    @Override
    public void atacar() {
        System.out.println(this.nome + " ataque furtivo");
    }
}
