# 🧾 Product Management System (POO em Java)

Este é um projeto simples desenvolvido em **Java** com foco em conceitos fundamentais de **Programação Orientada a Objetos (POO)**, como:

* Herança
* Polimorfismo
* Upcasting
* Sobrescrita de métodos (`@Override`)
* Uso da palavra-chave `super`

---

## 📌 Sobre o Projeto

O sistema permite cadastrar diferentes tipos de produtos e exibir suas etiquetas de preço (**price tags**), considerando suas particularidades:

* 📦 Produto comum
* 🌍 Produto importado (com taxa de importação)
* ♻️ Produto usado (com data de fabricação)

Cada tipo de produto possui um comportamento específico ao exibir o preço.

---

## 🏗️ Estrutura do Projeto

```
src/
 ├── application/
 │    └── Main.java
 └── entities/
      ├── Product.java
      ├── ImportedProduct.java
      └── UsedProduct.java
```

---

## 🔹 Classes

### 🧱 Product

Classe base que representa um produto genérico.

**Atributos:**

* `name`
* `price`

**Métodos:**

* `priceTag()` → Retorna a etiqueta de preço padrão

---

### 🌍 ImportedProduct (Herança)

Classe que herda de `Product` e adiciona:

**Atributo:**

* `customsFee`

**Diferencial:**

* Calcula o preço total com taxa de importação
* Sobrescreve o método `priceTag()`

---

### ♻️ UsedProduct (Herança)

Classe que herda de `Product` e adiciona:

**Atributo:**

* `manufactureDate`

**Diferencial:**

* Exibe a data de fabricação junto ao preço
* Também sobrescreve `priceTag()`

---

## 🧠 Conceitos Aplicados

### ✔️ Herança

```java
public class ImportedProduct extends Product
```

### ✔️ Polimorfismo

```java
List<Product> list = new ArrayList<>();
```

Permite tratar diferentes tipos de produtos de forma genérica.

### ✔️ Sobrescrita de método (@Override)

```java
@Override
public String priceTag()
```

### ✔️ Uso de `super`

```java
super.getPrice()
```

---

## ▶️ Como Executar

1. Compile o projeto:

```bash
javac application/Main.java
```

2. Execute:

```bash
java application.Main
```

---

## 💻 Exemplo de Execução

```
Enter the number of products: 3

Product #1 data:
Common, used or imported (c/u/i): c
Name: TV
Price: 900.00

Product #2 data:
Common, used or imported (c/u/i): i
Name: Notebook
Price: 1100.00
Custom fee: 200.00

Product #3 data:
Common, used or imported (c/u/i): u
Name: iPhone
Price: 400.00
Manufacture date (dd/MM/YYYY): 15/03/2020

PRICE TAGS:
TV $ 900.00
Notebook $ 1300.00 (Customs fee: 200.00)
iPhone (used) $ 400.00 (Manufacture date: 15/03/2020)
```

---

## 🚀 Objetivo

Este projeto foi desenvolvido com fins educacionais para reforçar conceitos de POO e boas práticas em Java.

---

## 📚 Possíveis Melhorias

* Implementar validações de entrada
* Criar interface gráfica (Swing/JavaFX)
* Persistência de dados (arquivo ou banco)
* Uso de `BigDecimal` para valores monetários

---

## 👨‍💻 Autor

Desenvolvido por **Anthony Oliveira Carvalho** 🚀
