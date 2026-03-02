# Sistema Bancário 🏛️💰

## 🔎 Sobre 
Este projeto consiste em um Sistema Bancário desenvolvido em Java, com foco na
aplicação prática dos princípios da Programação Orientada a Objetos.

O sistema simula operações bancárias essenciais, como cadastro de contas,
depósitos, saques e exibição de dados, aplicando regras de negócio e boas
práticas de modelagem orientada a objetos.

O projeto tem como objetivo servir como base de estudo e evolução contínua,
permitindo a incorporação gradual de novos conceitos relacionados à lógica de
programação, estrutura de dados, organização de código, arquitetura e qualidade
de software, à medida que novos conhecimentos são adquiridos. 📚

---
## ⚙️ Funcionalidades 
- Cadastro de contas recebendo o nome do titular e um depósito inicial (opcional);
- Depósitos, saques, remoção de conta, exibição dos dados da conta;
- Cada saque possui uma taxa fixa de $5;
---
## 🛠 Tecnologias e Ferramentas 
- Java;
- Programação Orientada a Objetos (POO)
- Git & GitHub.
---
## 📘 Primeira Versão do Projeto 
A primeira versão do Sistema Bancário foi desenvolvida como parte do estudo
dos fundamentos de Programação Orientada a Objetos em Java. [21/12/25]

Nessa etapa, o sistema permitia o cadastro de uma única conta bancária,
realização de depósitos e saques, atualização do nome do titular
e exibição dos dados da conta. 🚧

---
## 📌 Histórico de Atualizações

### [01/03/2026] - [v0.1.1]
- Refatoração da estrutura do código para reduzir duplicação
- Criação do método `validateAccount()` para centralizar a busca e validação de contas
- Substituição do método `findAccount()` por uma abordagem mais completa de validação
- Remoção de código repetido nos casos de depósito, saque, exclusão e consulta de contas
- Melhoria na organização do fluxo da classe Main
- Validações de regras de negócio adicionadas diretamente na classe BankAccount
- Tratamento de valores inválidos para operações de depósito e saque
- Melhoria no encapsulamento da lógica de operações bancárias

### Conceitos aplicados (novos)
- Refatoração de código
- Centralização de validações em métodos reutilizáveis
- Melhoria do encapsulamento da lógica de negócio

### [08/01/2026] - [v0.1.0]
- Implementado menu interativo no console
- Cadastro de múltiplas contas bancárias
- Geração automática do número da conta
- Armazenamento das contas utilizando `ArrayList`
- Busca de contas por número da conta
- Validações para evitar operações em contas inexistentes
- Opção de excluir contas

#### Conceitos aplicados (novos)
- Uso de `ArrayList` para gerenciar múltiplas contas (principal)
- Busca de objetos em coleções
- Validações de regras de negócio

