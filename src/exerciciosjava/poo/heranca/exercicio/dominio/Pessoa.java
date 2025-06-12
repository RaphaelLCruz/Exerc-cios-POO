package exerciciosjava.poo.heranca.exercicio.dominio;

public class Pessoa {
    private String nome;
    private int codigo;

    public Pessoa(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public void imprimeNome(){
        System.out.printf("Nome funcionario: " + this.nome +
                " \nCodigo Funcionario: " + this.codigo);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
