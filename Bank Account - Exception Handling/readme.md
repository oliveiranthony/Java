# 💰 Bank Account - Exception Handling (Java)

Este projeto é um exercício em Java que simula uma conta bancária simples, com foco em **tratamento de exceções personalizadas**, regras de negócio e boas práticas de orientação a objetos.

---

## 📚 Conceitos aplicados

- Programação Orientada a Objetos (POO)
- Encapsulamento
- Tratamento de exceções (`try/catch`)
- Criação de exceções personalizadas
- Regras de negócio aplicadas na entidade
- Entrada de dados com `Scanner`

---

## 🧠 Regras de Negócio

O sistema permite realizar um saque, respeitando duas condições:

1. O valor do saque **não pode exceder o saldo atual**
2. O valor do saque **não pode exceder o limite de saque definido**

Caso alguma dessas regras seja violada, uma exceção personalizada é lançada.

---

## 🏗️ Estrutura do Projeto


src/
├── application/

│ └── Main.java

├── model/

│ ├── entities/

│ │ └── Account.java

│ └── exception/

│ └── DomainException.java


---

## 🚀 Como executar

1. Clone o repositório:
```bash
git clone https://github.com/seu-usuario/seu-repo.git
```
Abra o projeto em sua IDE (IntelliJ, Eclipse, etc.)
Execute a classe Main.java
---
##💻 Exemplo de execução
Enter account data
Account number: 1234
Holder name: John Doe
Initial balance: 500.00
Withdraw limit: 300.00

Enter amount for withdraw: 400.00
Withdraw error: The withdrawal amount exceeds the current account withdraw limits.
---
##⚠️ Tratamento de erros

O sistema trata dois tipos de erro:

DomainException: erros de regra de negócio (saque inválido)
IllegalArgumentException: entradas inválidas do usuário
📌 Classe principal
Account

Responsável por representar a conta bancária e aplicar as regras de negócio.

Métodos principais:

deposit(amount)
withdraw(amount) → pode lançar exceção
DomainException

Exceção personalizada utilizada para representar erros de domínio da aplicação.

---

## 🎯 Objetivo do exercício

Praticar:

Criação de exceções customizadas

Separação de responsabilidades

Validação de regras diretamente na entidade

Uso correto de try/catch

📈 Possíveis melhorias

Adicionar validação de valores negativos

Implementar histórico de transações

Criar interface gráfica

Persistência de dados (arquivo ou banco)

Testes unitários
---
## 🧑‍💻 Autor

Anthony Oliveira Carvalho
