package exerciciosjava.poo.classesabstratas.exercicio.dominio;

// 1. Classe Abstrata Personagem
// Esta classe é 'abstract' porque um "Personagem" genérico não ataca de uma forma específica.
// Ela define o que um personagem 'é' (tem nome, vida) e o que ele 'faz' (ataca).
// O "como" o ataque acontece é deixado para as subclasses.
public abstract class Personagem {
    protected String nome;
    protected int vida;

    public Personagem(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }

    // Método concreto (com implementação) que todos os personagens herdam.
    // Este método é 'public' e pode ser chamado diretamente.
    public void exibirStatus() {
        System.out.println("--- " + nome + " ---");
        System.out.println("Vida: " + vida);
    }

    // Método abstrato: 'public abstract void atacar();'
    // Ele força as classes filhas (subclasses) a criarem sua própria versão de "atacar".
    // Não tem um corpo {} aqui, apenas termina com ';'.
    public abstract void atacar();

    // Getters básicos (métodos para obter os valores dos atributos)
    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }
}