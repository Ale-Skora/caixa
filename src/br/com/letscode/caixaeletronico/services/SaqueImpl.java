package br.com.letscode.caixaeletronico.services;

import br.com.letscode.caixaeletronico.model.Conta;
import br.com.letscode.caixaeletronico.repository.MemoriaContaRepository;

public class SaqueImpl implements Saque {

    private final MemoriaContaRepository repository;

    public SaqueImpl(MemoriaContaRepository repository) {

        this.repository = repository;
    }

    @Override
    public double execute() {
        return 0;
    }

    @Override
    public void execute(double valor, int numeroDaConta) {
        Conta conta;

        conta = repository.findById(numeroDaConta);

        conta.retirarSaldo(valor);

        System.out.println("Valor sacado: " + valor);
        System.out.println("Número da conta: " + numeroDaConta);
        System.out.printf("Saque efetuado com sucesso! O saldo atualizado é de R$ %.2f %n", conta.getSaldo());

    }
}