package br.com.letscode.caixaeletronico.services;

import br.com.letscode.caixaeletronico.model.Conta;

/**
 * Transferir um valor era a conta de origem, para a conta de destido.
 */
public interface Transferencia {

    /**
     * Método usado para transferir dinheiro
     *
     * @param valor              Valor que eu quero transferir
     * @param numeroContaDestino Número da conta que vai receber o dinheiro
     * @param origem             Conta de onde vai partir a transação.
     */
    void transferir(double valor, Conta numeroContaDestino, Conta origem);

    void execute(double valor, Conta numeroContaDestino, Conta origem);

    double execute(double valor, int numeroContaDestino, Conta origem);

    void execute(double valor, int numeroDaConta);
}
