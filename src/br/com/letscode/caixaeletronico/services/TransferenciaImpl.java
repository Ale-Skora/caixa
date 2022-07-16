package br.com.letscode.caixaeletronico.services;

import br.com.letscode.caixaeletronico.model.Conta;
import br.com.letscode.caixaeletronico.repository.MemoriaContaRepository;

public class TransferenciaImpl implements Transferencia{
    private final MemoriaContaRepository repository;
    public TransferenciaImpl(MemoriaContaRepository repository) {
        this.repository = repository;
    }

    @Override
    public void transferir(double valor, Conta numeroContaDestino, Conta origem) {

    }

    @Override
    public void execute(double valor, Conta numeroContaDestino, Conta origem) {

    }

    @Override
    public double execute(double valor, int numeroContaDestino, Conta origem) {
        Conta conta;
        conta = repository.findById(numeroContaDestino);
        conta.retirarSaldo(valor);

        System.out.println("Valor transferido: " + valor);
        System.out.println("Número da conta destino: " + numeroContaDestino);
        System.out.printf("Transferência realizada com sucesso! O saldo atualizado é de R$ %.2f%n", conta.getSaldo());
        return valor;


    }

    @Override
    public void execute(double valor, int numeroDaConta) {

    }


}
