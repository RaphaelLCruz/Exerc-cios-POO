package exerciciosjava.poo.metodos.exercicio.dominio;

public class ContaBancaria {
    private double saldo;



    public void depositar(double valorDeposito) {
        if (saldo > 0) {
            this.saldo += valorDeposito;
            System.out.println("Depósito de R$" + valorDeposito + " realizado. Novo saldo: R$" + this.saldo);
        } else {
            System.out.println("Valor de depósito inválido. Deve ser maior que zero.");
        }
    }

    public void sacar(double valorSaque) {

        if (valorSaque <= 0) {
            System.out.println("Valor de saque inválido. Deve ser maior que zero.");
            return;
        }


        if (this.saldo >= valorSaque) {
            this.saldo = this.saldo - valorSaque;
            System.out.println("Saque de R$" + valorSaque + " realizado. Novo saldo: R$" + this.saldo);
        } else {

            System.out.println("Saldo insuficiente para realizar o saque de R$" + valorSaque + ".");
            System.out.println("Saldo atual: R$" + this.saldo);
        }
    }


    public double getSaldo() {
        return this.saldo;
    }

    public  void setSaldo(double saldo){
        this.saldo = saldo;

    }
}





