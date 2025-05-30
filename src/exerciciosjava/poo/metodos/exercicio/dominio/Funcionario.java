package exerciciosjava.poo.metodos.exercicio.dominio;

public class Funcionario {
    private String nome;
    private double salario;

    public void darAumento(double percentual) {
        if (percentual == 0) {
            this.salario = this.salario + percentual;
        } else {
            percentual = this.salario * percentual;
            this.salario = this.salario + percentual;
        }


    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return this.salario;
    }
}
