package org.example.contas;


import org.example.funcionalidades.Funcionalidades;

public abstract class Conta implements Funcionalidades {

    private static int agenciaPadrao = 1;
    private static int numeroContaPadrao = 1001;

    private int agencia;
    private int numeroConta;
    private String titular;
    private double saldo;

    public Conta(int agenciaPadrao, String titular) {
        this.agencia = agenciaPadrao;
        this.numeroConta = numeroContaPadrao++;
        this.titular = titular;
        this.saldo = 0.0;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    @Override
    public void depositarPorTransferencia(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor de depósito inválido por transferência.");
        }
    }

    @Override
    public void transferir(double valor, Funcionalidades contaDestino) {
        if (valor <= saldo) {
            saldo -= valor;
            contaDestino.depositarPorTransferencia(valor);
            System.out.println("Transferência de R$" + valor + " realizada com sucesso para a conta " + contaDestino.getNumeroConta() + ".");
        } else {
            System.out.println("Saldo insuficiente para transferência.");
        }
    }

    @Override
    public void exibirSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }

    @Override
    public void exibirDadosDaConta() {
        System.out.println("Agência: " + agencia);
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$" + saldo);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
}

