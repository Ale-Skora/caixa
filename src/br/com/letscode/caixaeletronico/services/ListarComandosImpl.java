package br.com.letscode.caixaeletronico.services;

public class ListarComandosImpl implements ListarComandos{

    @Override
    public void execute() {
        System.out.println("Digite o comando desejado de acordo com as opções abaixo: ");
        System.out.println("Para encerrar, digite opção: 0");
        System.out.println("Para saque, digite opção: 1");
        System.out.println("Para depósito, digite opção: 2 ");
        System.out.println("Para abrir uma conta, digite opção: 3 ");

    }
}
