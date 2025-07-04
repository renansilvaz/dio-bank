package org.example.contas;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(String titular) {
        super(1, titular);
    }

    @Override
    public void exibirDadosDaConta() {
        System.out.println("Conta Poupança");
        super.exibirDadosDaConta();
    }

    @Override
    public void exibirSaldo() {
        System.out.println("Saldo da Conta Poupança: R$" + getSaldo());
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            super.depositar(valor);
            System.out.println("Depósito na Conta Poupança de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido para Conta Poupança.");
        }
    }

    @Override
    public void depositoPorTransferencia(double valor) {

    }

    @Override
    public void depositarPorTransferencia(double valor) {
        if (valor > 0) {
            super.depositarPorTransferencia(valor);
        } else {
            System.out.println("Valor de depósito inválido por transferência na Conta Poupança.");
        }
    }

    @Override
    public void sacar(double valor) {
        if (valor <= getSaldo()) {
            super.sacar(valor);
            System.out.println("Saque da Conta Poupança de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para saque na Conta Poupança.");
        }
    }
}
