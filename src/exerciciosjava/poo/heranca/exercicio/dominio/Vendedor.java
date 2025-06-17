package exerciciosjava.poo.heranca.exercicio.dominio;

public class Vendedor extends Funcionario{

    public Vendedor(String nome, int codigo) {
        super(nome, codigo);
    }

    @Override
    public double getSalario() {
        return super.getSalario() + (super.getSalario() * 0.25);
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
