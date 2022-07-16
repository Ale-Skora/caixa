package br.com.letscode.caixaeletronico.model;

public class Conta {

   private int numeroDaConta;

   private double saldo;

    public Conta() {
        saldo = 0;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void adicionaSaldo(double valor){
        saldo = saldo + valor;
    }

    public void retirarSaldo(double valor){
        if(saldo >= valor){
            saldo = saldo - valor;
        }else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void retirarSaldo() {
    }
}
