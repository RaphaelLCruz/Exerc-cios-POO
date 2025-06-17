package exerciciosjava.poo.heranca.exercicio.dominio;

public class Funcionario extends Pessoa {
    protected double salario = 2000;

    public Funcionario(String nome, int codigo) {
        super(nome, codigo);

    }

    public void imprimirFolhaPagamento(){
        super.imprimeNome();
        System.out.println("\nSalário: " + String.format("%.2f", getSalario()));
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
