package org.example.contas;

public class ContaCorrente extends Conta {

    public ContaCorrente(String titular) {
        super(1, titular);
    }

    @Override
    public void exibirDadosDaConta() {
        System.out.println("Conta Corrente");
        super.exibirDadosDaConta();
    }

    @Override
    public void exibirSaldo() {
        System.out.println("Saldo da Conta Corrente: R$" + getSaldo());
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            super.depositar(valor);
            System.out.println("Depósito na Conta Corrente de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido para Conta Corrente.");
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
            System.out.println("Valor de depósito inválido por transferência na Conta Corrente.");
        }
    }

    @Override
    public void sacar(double valor) {
        if (valor <= getSaldo()) {
            super.sacar(valor);
            System.out.println("Saque da Conta Corrente de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para saque na Conta Corrente.");
        }
    }
}
