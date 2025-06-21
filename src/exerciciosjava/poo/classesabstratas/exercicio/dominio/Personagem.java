package exerciciosjava.poo.classesabstratas.exercicio.dominio;

// 1. Classe Abstrata Personagem
// Esta classe é 'abstract' porque um "Personagem" genérico não ataca de uma forma específica.
// Ela define o que um personagem 'é' (tem nome, vida) e o que ele 'faz' (ataca).
// O "como" o ataque acontece é deixado para as subclasses.
public abstract class Personagem {
    protected String nome;
    protected int vida;
    protected int experencia;
    protected int nivel;

    public Personagem(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
        this.experencia = 0;
        this.nivel = 1;
    }



    // Método concreto (com implementação) que todos os personagens herdam.
    // Este método é 'public' e pode ser chamado diretamente.
    public void exibirStatus() {
        System.out.println("--- " + nome + " ---");
        System.out.println("Vida: " + vida);
        System.out.println("XP : " + experencia);
        System.out.println("Nível : " + nivel);
    }

    // Método abstrato: 'public abstract void atacar();'
    // Ele força as classes filhas (subclasses) a criarem sua própria versão de "atacar".
    // Não tem um corpo {} aqui, apenas termina com ';'.
    public abstract void atacar();

    public void ganharExperiencia(int quantidadeXP){
        this.experencia += quantidadeXP;
        System.out.println(this.nome + " ganhou " + quantidadeXP + " de XP! Total:" + this.experencia);
        verificarnivel();
    }

    private void verificarnivel(){
        if(this.experencia >= nivel * 100){
            subirDeNivel();
            System.out.println("--------");
        }
    }

    public void subirDeNivel(){
        this.nivel++;
        System.out.println(this.nome + " subiu para o Nível " + this.nivel);
    }

    // Getters básicos (métodos para obter os valores dos atributos)
    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getNivel() {
        return nivel;
    }

    public int getExperencia() {
        return experencia;
    }
}