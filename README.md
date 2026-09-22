# 🏦 BankAccount — Sistema Bancário em Java

<div align="center">

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Concluído-brightgreen?style=for-the-badge)
![License](https://img.shields.io/badge/Licença-MIT-blue?style=for-the-badge)

<p align="center">
  <b>Simulador de operações bancárias interativo via console, com controle dinâmico de saldo, cheque especial e cálculo de encargos automáticos.</b>
</p>

</div>

---

## 📌 Sumário

- [Visão Geral](#-visão-geral)
- [Funcionalidades](#-funcionalidades)
- [Regras de Negócio](#-regras-de-negócio)
- [Estrutura do Projeto](#-estrutura-do-projeto)
- [Como Executar](#-como-executar)
- [Exemplo de Uso](#-exemplo-de-uso)
- [Tecnologias Utilizadas](#-tecnologias-utilizadas)

---

## 💡 Visão Geral

O **BankAccount** é uma aplicação em Java desenvolvida para gerenciar contas bancárias por meio de um menu no terminal. O sistema calcula automaticamente o limite de **cheque especial** com base no valor inicial da conta e aplica a taxa de encargo (20%) sobre o valor utilizado assim que houver saldo disponível.

---

## ✨ Funcionalidades

- [x] 💵 **Consulta de Saldo**: Exibe o saldo total disponível (saldo próprio + limite disponível).
- [x] 🛡️ **Consulta de Cheque Especial**: Consulta o valor atual do limite de crédito especial.
- [x] 📥 **Depósito**: Adiciona fundos à conta e quita débitos pendentes automaticamente.
- [x] 📤 **Saque Inteligente**: Realiza saques utilizando primeiro o saldo primário e, caso necessário, consome o cheque especial.
- [x] 🧾 **Pagamento de Boletos**: Quitação de contas com dedução direta do saldo.
- [x] 🔍 **Verificação de Status do Cheque Especial**: Informa se a conta está ou não usufruindo do cheque especial.
- [x] 🏷️ **Cobrança Automática de Taxas**: Cobra 20% sobre o valor utilizado do cheque especial assim que a conta apresentar saldo suficiente.

---

## 📋 Regras de Negócio

| Operação | Regra Aplicada |
|---|---|
| **Limite Inicial (<= R$ 500,00)** | Cheque especial fixado em **R$ 50,00** |
| **Limite Inicial (> R$ 500,00)** | Cheque especial correspondente a **50%** do valor depositado |
| **Encargo de Utilização** | Taxa de **20%** sobre o total consumido do cheque especial |
| **Quitação de Débitos** | Cobrança automática no início de cada ciclo do menu quando houver saldo em conta |

---

## 📂 Estrutura do Projeto

```text
BankAccount/
├── src/
│   ├── Main.java         # Ponto de entrada (inicia conta e loop do menu)
│   ├── Account.java      # Lógica de negócio, saldos, cheque especial e taxas
│   ├── MenuBank.java     # Interface do menu interativo e processamento de opções
│   └── LimparTela.java   # Utilitário para formatação visual do console
├── out/                  # Binários compilados (.class)
└── README.md             # Documentação do projeto
```

---

## 🚀 Como Executar

### Pré-requisitos
- **Java JDK 17+** (ou JDK 11+) instalado na máquina.
- Terminal / Prompt de Comando / PowerShell ou IDE (IntelliJ IDEA, VS Code, Eclipse).

### Passo a passo via Terminal

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/Hudson390/bank-account-java.git
   cd bank-account-java
   ```

2. **Compile as classes:**
   ```bash
   javac -d bin src/*.java
   ```

3. **Execute a aplicação:**
   ```bash
   java -cp bin Main
   ```

---

## 🖥️ Exemplo de Uso

Ao iniciar a aplicação, você verá o menu interativo:

```text
===================================================
1. Consultar Saldo
2. Consultar Cheque Especial
3. Depositar
4. Sacar
5. Pagar Boleto
6. Verificar se a conta está usando cheque especial
7. Sair
===================================================
Selecione sua opção: _
```

---

## 🛠️ Tecnologias Utilizadas

- **Linguagem:** [Java](https://www.oracle.com/java/)
- **Paradigma:** Orientação a Objetos (POO)
- **Interface:** Console CLI com `java.util.Scanner`

---

<div align="center">
Desenvolvido com ☕ por <b>Hudson</b>.
</div>
