package org.example;

import org.example.clientes.Cliente;
import org.example.contas.Conta;
import org.example.contas.ContaCorrente;
import org.example.contas.ContaPoupanca;
import org.example.funcionalidades.ClienteService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Conta> contas = new ArrayList<>();

        Cliente cliente = new Cliente("João Silva", "123.456.789-00");
        Cliente cliente2 = new Cliente("Maria Oliveira", "987.654.321-00");
        Cliente cliente3 = new Cliente("Ana Souza", "111.222.333-44");
        Cliente cliente4 = new Cliente("Carlos Pereira", "555.666.777-88"); // Cliente sem conta, logo, não será exibido

        ContaCorrente contaCorrente = new ContaCorrente(cliente.getNome());
        contaCorrente.depositar(500);
        contaCorrente.sacar(200);
        contaCorrente.exibirDadosDaConta();
        System.out.println("==========================");

        ContaPoupanca contaPoupanca = new ContaPoupanca(cliente.getNome());
        contaPoupanca.depositar(300);
        contaPoupanca.sacar(100);
        contaPoupanca.exibirDadosDaConta();
        System.out.println("==========================");

        ContaCorrente contaMaria = new ContaCorrente(cliente2.getNome());
        contaMaria.depositar(1000);
        contaMaria.exibirDadosDaConta();
        System.out.println("==========================");

        ContaPoupanca contaAna = new ContaPoupanca(cliente3.getNome());
        contaAna.depositar(200);
        contaAna.exibirDadosDaConta();
        System.out.println("==========================");

        contas.add(contaCorrente);
        contas.add(contaPoupanca);
        contas.add(contaMaria);
        contas.add(contaAna);
        
        ClienteService.listarClientesComContas(contas);
    }
}