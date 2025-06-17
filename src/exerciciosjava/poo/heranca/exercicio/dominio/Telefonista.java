package exerciciosjava.poo.heranca.exercicio.dominio;

public class Telefonista extends Funcionario{


    public Telefonista(String nome, int codigo) {
        super(nome, codigo);

    }


    @Override
    public double getSalario() {
        return super.getSalario() + (super.getSalario() * 0.10);
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
