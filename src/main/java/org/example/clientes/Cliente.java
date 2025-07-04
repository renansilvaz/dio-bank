package org.example.clientes;

import org.example.contas.Conta;
import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nome;
    private String cpf;
    private List<Conta> contas = new ArrayList<>();

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public List<Conta> getContas() { return contas; }
    public void adicionarConta(Conta conta) { contas.add(conta); }
}
