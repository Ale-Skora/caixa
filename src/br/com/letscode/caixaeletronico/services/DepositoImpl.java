package br.com.letscode.caixaeletronico.services;

import br.com.letscode.caixaeletronico.model.Conta;
import br.com.letscode.caixaeletronico.repository.MemoriaContaRepository;

public class DepositoImpl implements Deposito {

    private final MemoriaContaRepository repository;

    public DepositoImpl(MemoriaContaRepository repository) {
        this.repository = repository;
    }

    @Override
    public void execute(double valor, int numeroDaConta) {
        Conta conta;

        conta = repository.findById(numeroDaConta);

        conta.adicionaSaldo(valor);

        System.out.println("Valor depositado: " + valor);
        System.out.println("Número da conta de depósito: " + numeroDaConta);
        System.out.printf("Depósito efetuado com sucesso! O saldo atualizado é de R$ %.2f %n%n%n", conta.getSaldo());
    }
}


