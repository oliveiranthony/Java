# 💰 Tax Calculator

Sistema simples desenvolvido em **Java** para cálculo de impostos de pessoas físicas e jurídicas, utilizando conceitos fundamentais de **Programação Orientada a Objetos (POO)**.

---

## 📌 Sobre o Projeto

Este projeto simula o cálculo de impostos para diferentes tipos de contribuintes:

- 👤 **Pessoa Física (Individual)**
- 🏢 **Pessoa Jurídica (Company)**

O sistema solicita os dados do usuário, calcula os impostos individualmente e exibe o total arrecadado.

---

## 🚀 Conceitos Aplicados

Este exercício foi desenvolvido com foco nos principais pilares da POO:

- Herança  
- Polimorfismo  
- Classes Abstratas  
- Sobrescrita de Métodos (@Override)  
- Encapsulamento  
- Upcasting  

---

## 🧱 Estrutura do Projeto

```

src/
├── application/
│    └── Main.java
└── entities/
├── Payers.java
├── Individual.java
└── Company.java

```

---

## 🧠 Regras de Negócio

### 👤 Pessoa Física (Individual)

- Renda anual **abaixo de 20.000** → 15% de imposto  
- Renda anual **acima ou igual a 20.000** → 25% de imposto  
- Desconto de **50% dos gastos com saúde**

---

### 🏢 Pessoa Jurídica (Company)

- Até **10 funcionários** → 16% de imposto  
- Mais de **10 funcionários** → 14% de imposto  

---

## 💻 Exemplo de Execução

```

Enter the number of tax payer: 2

Tax payer #1 data:
Individual or company (i/c)? i
Name: Alex
Anual Income: 50000
Health expenditures: 2000

Tax payer #2 data:
Individual or company (i/c)? c
Name: SoftTech
Anual Income: 400000
Number of employees: 25

TAXES PAID:
Alex: $ 11500.00
SoftTech: $ 56000.00

TOTAL TAXES:
$ 67500.00

````

---

## ⚙️ Como Executar

1. Clone o repositório:
```bash
git clone https://github.com/seu-usuario/seu-repo.git
````

2. Abra o projeto em uma IDE (ex: IntelliJ)

3. Execute a classe:

```
Main.java
```

---

## 📚 Aprendizados

Este projeto é ideal para reforçar:

* Estrutura de classes em Java
* Uso de classes abstratas para generalização
* Aplicação prática de polimorfismo
* Organização de código em pacotes

---

## 🧑‍💻 Autor

**Anthony Oliveira Carvalho**
