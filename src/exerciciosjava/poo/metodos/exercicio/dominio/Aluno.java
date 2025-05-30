package exerciciosjava.poo.metodos.exercicio.dominio;

public class Aluno {
    private double [] notas;

    public void imprime(){
        System.out.println(this.notas.length);
    }

    public void adicionarNota(){
        if(this.notas == null){
            return;
        }
        for(double nota: notas){
            System.out.println(nota + " ");
        }
    }

    public double calcularMedia(){
        if (this.notas.length == 0) {
            System.out.println("Não há notas para calcular a média.");
            return 0.0;
        }
        double soma = 0;
       for (double nota : this.notas) {
           soma += nota;
       }

       //for(int i = 0; i < this.notas.length; i++){
       //    soma = soma + this.notas[i];
       //}
        return soma / this.notas.length;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double[] getNotas() {
        return notas;
    }
}
