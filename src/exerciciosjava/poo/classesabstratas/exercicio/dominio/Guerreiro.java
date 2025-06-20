package exerciciosjava.poo.classesabstratas.exercicio.dominio;

// 2. Subclasse Concreta: Guerreiro
// O Guerreiro 'extends' (estende/herda) de Personagem.
// Como Personagem tem um método abstrato 'atacar()', o Guerreiro DEVE implementá-lo.
public class Guerreiro extends Personagem {

    public Guerreiro(String nome, int vida) {
        super(nome, vida); // 'super' chama o construtor da classe pai (Personagem)
    }

    // Sobrescrita do método 'atacar()' da classe Personagem.
    // Usamos '@Override' para indicar claramente que estamos reescrevendo o método.
    @Override
    public void atacar() {
        System.out.println(nome + " ataca com sua espada, causando dano físico!");
    }
}