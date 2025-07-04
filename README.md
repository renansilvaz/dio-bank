# 💻 Projeto: Banco Digital com Programação Orientada a Objetos em Java

Este projeto foi desenvolvido como parte de um desafio prático da plataforma **DIO (Digital Innovation One)**, com o objetivo de reforçar conhecimentos em **Programação Orientada a Objetos (POO)** utilizando a linguagem **Java**, explorando seus principais pilares em um contexto de **simulação de um banco digital**.

## 🎯 Objetivo

O principal objetivo é implementar um sistema bancário que represente, de forma prática, os fundamentos da POO, como **abstração**, **encapsulamento**, **herança** e **polimorfismo**, permitindo uma compreensão sólida dos conceitos através de uma aplicação concreta.

## 🧠 Conceitos Trabalhados

- Abstração de entidades do mundo real (cliente, conta bancária, banco)
- Encapsulamento de dados e lógica de negócios
- Herança entre tipos de contas
- Polimorfismo no tratamento de diferentes tipos de operações
- Reforço prático dos pilares da Programação Orientada a Objetos em Java

## 🚀 Tecnologias e Ferramentas

- **Java 24** (versão utilizada no desenvolvimento)
- Paradigma de **Programação Orientada a Objetos**
- IDE IntelliJ
- Git e GitHub para versionamento e hospedagem do projeto

## 🛠️ Funcionalidades Implementadas

- Cadastro de clientes
- Criação de contas bancárias (Conta Corrente e Conta Poupança)
- Operações básicas de conta: saque, depósito e transferência
- Exibição de extrato bancário
- **Listagem de clientes com contas ativas**
  - Apenas clientes com ao menos uma conta cadastrada são exibidos nessa listagem
  - Clientes registrados, mas sem conta, são ignorados neste método específico

## 📂 Estrutura do Projeto

O projeto está organizado com base em classes e objetos, simulando a estrutura de um sistema bancário real. A seguir, um exemplo das classes envolvidas:

- `Cliente`: representa os dados do cliente
- `Conta`: classe abstrata que define as funcionalidades básicas de uma conta
- `ContaCorrente` e `ContaPoupanca`: classes que herdam de `Conta`
- `Banco`: gerencia a lista de clientes e contas

## 🔄 Possibilidades de Evolução

Este projeto pode ser expandido com diversas melhorias, como:

- Interface gráfica (GUI) com JavaFX ou Swing
- Persistência de dados com arquivos ou banco de dados
- API REST usando Spring Boot
- Validações mais robustas para as operações
- Testes automatizados com JUnit

🤝 Contribuição
Sinta-se à vontade para fazer um fork do projeto e contribuir com melhorias! Pull requests são bem-vindos.
