# Heran-a-de-Pre-os-em-Java
Exemplo de Herança de Preços em Java realizados na faculdade de ADS Senac


# 🛍️ Projeto Java - Produtos com Herança e Polimorfismo

Este projeto simples em Java demonstra o uso de **Programação Orientada a Objetos (POO)**, com foco nos conceitos de **herança** e **polimorfismo** aplicados a uma estrutura de produtos.

---

## 📚 Conceitos Envolvidos

### 👨‍👩‍👧‍👦 Herança
- A classe `Produto` é a **classe mãe** que contém os atributos comuns: `nome` e `preco`, além do método `exibirInfo()`.
- As classes `Roupa` e `Eletronico` **herdam** de `Produto`, reutilizando a lógica e podendo ser expandidas com comportamentos próprios.

### 🧠 Polimorfismo (em prática)
- A chamada ao método `exibirInfo()` é feita em objetos de tipos diferentes (`Roupa`, `Eletronico`), mas a lógica compartilhada da superclasse `Produto` é reutilizada.
- Isso mostra o **polimorfismo** em ação: **mesmo método, comportamentos coerentes com a classe**.

---

## ✅ Funcionalidades

- Criação de produtos genéricos (`Produto`)
- Especialização de produtos (`Roupa`, `Eletronico`)
- Exibição de informações com base no tipo do produto

---

## 💻 Execução

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/produtos-poo-java.git


Saída esperada:

=== Produto Eletrônico ===
Nome Smartphone
Preço R$1999.9

=== Produto Roupa ===
Nome Camiseta Polo
Preço R$89.9
