package exerciciosjava.poo.classesabstratas.exercicio.dominio;

// 3. Subclasse Concreta: Mago
// O Mago 'extends' de Personagem e também DEVE implementar 'atacar()'.
public class Mago extends Personagem {
    private int mana; // Atributo exclusivo do Mago

    public Mago(String nome, int vida, int mana) {
        super(nome, vida);
        this.mana = mana;
    }

    // Sobrescrita do método 'atacar()'.
    @Override
    public void atacar() {
        System.out.println(nome + " lança uma bola de fogo mágica!");
        if (mana >= 10) { // Verifica se há mana suficiente antes de usar
            mana -= 10;
            System.out.println("Mana restante: " + mana);
        } else {
            System.out.println("Mana insuficiente para um ataque poderoso!");
        }
    }

    public int getMana() {
        return mana;
    }
}