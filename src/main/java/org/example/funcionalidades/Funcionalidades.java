package org.example.funcionalidades;

public interface Funcionalidades {

    void sacar(double valor);

    void depositar(double valor);

    void depositoPorTransferencia(double valor);

    void depositarPorTransferencia(double valor);

    void transferir(double valor, Funcionalidades contaDestino);

    void exibirSaldo();

    void exibirDadosDaConta();

    int getNumeroConta();
}
