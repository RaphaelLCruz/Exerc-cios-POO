package exerciciosjava.poo.heranca.exercicio.dominio;

public class Telefonista extends Funcionario{
    private double salario = 2000;


    public Telefonista(String nome, int codigo) {
        super(nome, codigo);

    }

    public void imprimeTelefonista(){
        super.imprimeNome();
        System.out.println("\nSalario: " + this.salario);

    }
    public void imprimeFolhaPagamentoTelefonista(){
        super.imprimeNome();
        this.salario = (this.salario * 0.1) + this.salario;
        System.out.println("\nSalario: " + this.salario);

    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
