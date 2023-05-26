package com.banco.conta;

public class Main {
    public static void main(String[] args) {

        Conta cc = new ContaCorrente();
        cc.depositar(1000);
        Conta poupanca = new ContaPoupanca();
        poupanca.depositar(500);

        cc.transferir(poupanca,800);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
