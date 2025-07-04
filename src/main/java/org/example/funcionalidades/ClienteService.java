package org.example.funcionalidades;

import org.example.contas.Conta;

import java.util.List;

public class ClienteService {

    public static void listarClientesComContas(List<Conta> contas){
        for (Conta conta: contas){
            System.out.println("Titular: " + conta.getTitular() + " Contas: " + conta.getNumeroConta() + " Saldo: R$" + conta.getSaldo());
        }
    }
}
