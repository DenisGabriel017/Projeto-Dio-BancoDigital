package com.banco.conta;

public class ContaCorrente extends Conta{
    public void imprimirExtrato() {
        System.out.println("==== Extrato Conta Corrente ====");
        imprimirInfosComuns();
    }

}

