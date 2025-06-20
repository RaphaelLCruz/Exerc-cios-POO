package exerciciosjava.poo.classesabstratas.exercicio.teste;

import exerciciosjava.poo.classesabstratas.exercicio.dominio.Arqueiro;
import exerciciosjava.poo.classesabstratas.exercicio.dominio.Guerreiro;
import exerciciosjava.poo.classesabstratas.exercicio.dominio.Mago;
import exerciciosjava.poo.classesabstratas.exercicio.dominio.Personagem;

// 5. Classe Principal para Testar o Exemplo
public class TestePersonagensBasico {
    public static void main(String[] args) {
        // Criando instâncias de cada tipo de personagem
        Guerreiro guerreiro = new Guerreiro("Conan", 150);
        Mago mago = new Mago("Gandalf", 80, 50);
        Arqueiro arqueiro = new Arqueiro("Legolas", 100, 20);



        System.out.println("--- Status dos Personagens ---");
        // Chamando o método 'exibirStatus()' para cada personagem.
        // Este método foi herdado da classe 'Personagem'.
        guerreiro.exibirStatus();
        mago.exibirStatus();
        arqueiro.exibirStatus();

        System.out.println("\n--- Os Personagens Atacam! ---");

        // Chamando o método 'atacar()' para cada personagem.
        // Cada um executará a versão de 'atacar()' que foi SOBRESCRITA em sua própria classe.
        guerreiro.atacar();
        System.out.println("--------------------");

        mago.atacar();
        System.out.println("--------------------");

        arqueiro.atacar();
        System.out.println("--------------------");

        System.out.println("\n--- Segundo Ataque (Mago e Arqueiro podem mudar o estado) ---");
        mago.atacar(); // Mago usa mais mana
        System.out.println("--------------------");
        arqueiro.atacar(); // Arqueiro usa mais flechas
        System.out.println("--------------------");
    }
}
