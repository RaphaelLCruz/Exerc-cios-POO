package exerciciosjava.poo.heranca.exercicio.dominio;

public class Gerente extends Funcionario{
    private double salario = 2000;

    public Gerente(String nome, int codigo) {
        super(nome, codigo);

    }



    public void imprimeGerente(){
        super.imprimeNome();
        System.out.println("\nSalario: " + this.salario);
    }

    public void imprimirFolhaPagamentoGerente(){
        super.imprimeNome();
        this.salario = (salario * 0.45) + this.salario;
        System.out.println("\nSalario: " + this.salario);
    }

    public void imprimirFolhaPagamentoGerente2(){
        super.imprimeNome();
        this.salario = (salario * 0.45) + this.salario;
        System.out.println("\nSalario: " + this.salario);
    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
