package br.com.letscode.caixaeletronico.services;

public interface Saque {
    double execute ();

    void execute(double valor, int numero);
}
