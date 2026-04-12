# 💼 Worker Income System

Projeto desenvolvido em Java com foco em **Programação Orientada a Objetos (POO)**, simulando o cálculo de renda de um trabalhador com base em contratos por hora.

---

## 📌 Sobre o projeto

Este sistema permite:

* Cadastrar um trabalhador com:

  * Nome
  * Nível (JUNIOR, MID_LEVEL, SENIOR)
  * Salário base
  * Departamento

* Adicionar múltiplos contratos por hora ao trabalhador

* Calcular a renda total de um trabalhador em um determinado mês/ano, somando:

  * Salário base
  * Valores dos contratos daquele período

---

## 🧠 Conceitos aplicados

* Programação Orientada a Objetos (POO)
* Enum (`WorkerLevel`)
* Composição de classes (`Worker` possui `Department` e `HourContract`)
* Listas (`ArrayList`)
* Manipulação de datas (`Date`, `Calendar`, `SimpleDateFormat`)
* Encapsulamento (getters/setters)
* Métodos de negócio (`income()`)

---

## 🏗️ Estrutura do projeto

```
src/
│
├── application/
│   └── Main.java
│
├── entities/
│   ├── Worker.java
│   ├── Department.java
│   ├── HourContract.java
│   └── enums/
│       └── WorkerLevel.java
```

---

## ⚙️ Como funciona

1. O usuário informa os dados do trabalhador
2. Informa quantos contratos deseja adicionar
3. Para cada contrato:

   * Data
   * Valor por hora
   * Duração (horas)
4. O sistema calcula a renda com base no mês/ano informado

---

## ▶️ Exemplo de execução

```
Enter department's name: Design
Enter worker data:
Name: Alex
Level: MID_LEVEL
Base Salary: $ 1200.00

How many contracts to this worker? 2

Enter contract number #1 data
Date (DD/MM/YYYY): 20/08/2023
Value per hour: $ 50.00
Duration (hours): 20

Enter contract number #2 data
Date (DD/MM/YYYY): 13/08/2023
Value per hour: $ 30.00
Duration (hours): 18

Enter month and year to calculate income (MM/yyyy): 08/2023

Name: Alex
Department: Design
Income for 08/2023: 3000.00
```

---

## 🚀 Possíveis melhorias

* Criar interface gráfica (JavaFX ou Swing)
* Persistência de dados (arquivo ou banco de dados)
* Validação de entrada de dados
* Uso de `LocalDate` (API moderna de datas)
* Separação em camadas (Service, Repository)

---

## 🎯 Objetivo

Este projeto foi desenvolvido com fins de aprendizado, praticando conceitos fundamentais de Java e POO, sendo ideal para compor portfólio de iniciantes.

---

## 👨‍💻 Autor

Desenvolvido por **Anthony Oliveira Carvalho**
🔗 GitHub: https://github.com/oliveiranthony
