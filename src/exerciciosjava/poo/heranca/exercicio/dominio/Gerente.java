package exerciciosjava.poo.heranca.exercicio.dominio;

public class Gerente extends Funcionario{

    public Gerente(String nome, int codigo) {
        super(nome, codigo);

    }

    @Override
    public double getSalario() {
        return super.getSalario() + (super.getSalario() * 0.45);
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
