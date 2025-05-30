package exerciciosjava.poo.metodos.exercicio.dominio;

public class RetanguloPerimetro {
    private double largura;
    private double altura;

    public double calcularPerimetro(){
        return 2 * (this.largura + this.altura);
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
