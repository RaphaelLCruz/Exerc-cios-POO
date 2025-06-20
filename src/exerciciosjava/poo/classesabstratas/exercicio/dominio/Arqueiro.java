package exerciciosjava.poo.classesabstratas.exercicio.dominio;

// 4. Subclasse Concreta: Arqueiro
// O Arqueiro 'extends' de Personagem e DEVE implementar 'atacar()'.
public class Arqueiro extends Personagem {
    private int flechas; // Atributo exclusivo do Arqueiro

    public Arqueiro(String nome, int vida, int flechas) {
        super(nome, vida);
        this.flechas = flechas;
    }

    // Sobrescrita do método 'atacar()'.
    @Override
    public void atacar() {
        if (flechas > 0) { // Verifica se há flechas antes de disparar
            System.out.println(nome + " dispara uma flecha certeira!");
            flechas--;
            System.out.println("Flechas restantes: " + flechas);
        } else {
            System.out.println(nome + " não tem flechas! Precisa recarregar.");
        }
    }

    public int getFlechas() {
        return flechas;
    }
}