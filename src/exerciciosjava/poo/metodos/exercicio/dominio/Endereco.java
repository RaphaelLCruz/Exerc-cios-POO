package exerciciosjava.poo.metodos.exercicio.dominio;

public class Endereco {
    private String lograrouro;
    private String complemento;
    private int numero;
    private String cep;

    public String getLograrouro() {
        return lograrouro;
    }

    public void setLograrouro(String lograrouro) {
        this.lograrouro = lograrouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String imprimir(){
        return lograrouro + ", " + numero + "\nComplemento: " + complemento + "\nCEP: " + cep;
    }
}
