package exerciciosjava.poo.heranca.exercicio.dominio;

public class Vendedor extends Funcionario{
    private double salario = 2000;

    public Vendedor(String nome, int codigo) {
        super(nome, codigo);
    }

    public void imprimeVendedor(){
        super.imprimeNome();
        System.out.println("\nSalario: " + this.salario);
    }

    public void imprimeFolhaPagamentoVendedor(){
        super.imprimeNome();
        this.salario = (this.salario * 0.25) + this.salario;
        System.out.println("\nSalario: " + this.salario);
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
