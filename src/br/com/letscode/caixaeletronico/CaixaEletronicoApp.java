package br.com.letscode.caixaeletronico;

import br.com.letscode.caixaeletronico.services.SelecionaComando;

public class CaixaEletronicoApp {

    public static void main(String[] args) {
        System.out.println("Caixa eletrônico ligado!");
        SelecionaComando selecionaComando = new SelecionaComando();

        while (selecionaComando.executar())
            System.out.println("Executando um novo comando!");

        System.out.println("Caixa eletrônico desligando!");

    }

}
