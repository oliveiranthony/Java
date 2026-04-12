# Sistema de Gerenciamento de Produtos em Java

Este projeto é um exercício prático focado no uso de **Programação Orientada a Objetos (POO)** e manipulação de coleções utilizando a **Stream API** do Java. O programa permite gerenciar um inventário simples, realizar buscas e filtrar produtos por critérios de preço e disponibilidade.

## 🚀 Funcionalidades

* **Cadastro de Produtos**: Registro de nome, preço e quantidade em estoque.
* **Validação de Dados**: Sistema de controle que impede a entrada de quantidades negativas.
* **Filtro por Preço**: Listagem dinâmica de itens que superam um valor determinado pelo usuário.
* **Busca Nominal**: Localização rápida de produtos específicos para consulta de preço.
* **Relatório de Estoque**: Exibição automática apenas dos produtos que possuem unidades disponíveis para venda.

## 🛠️ Tecnologias e Conceitos Aplicados

* **Linguagem**: Java.
* **Estruturas de Dados**: `ArrayList` para armazenamento dos objetos.
* **Stream API**: Utilização de `.filter()`, `.collect()` e `.findFirst()` para manipulação eficiente da lista.
* **Encapsulamento**: Uso de modificadores de acesso `private` e métodos `get`/`set` na classe de entidade.
* **Formatação**: Uso de `DecimalFormat` e `Locale` para garantir a exibição correta de valores monetários.

## 📂 Estrutura do Código

O projeto está dividido em dois arquivos principais:
1.  **`Main.java`**: Responsável pela interface de console e lógica de execução.
2.  **`entities/Products.java`**: Classe que define o objeto Produto e seus atributos fundamentais.

## 📝 Como Executar

1. Certifique-se de ter o **JDK 8** ou superior instalado.
2. Clone ou baixe os arquivos do repositório.
3. Compile os arquivos:
   ```bash
   javac entities/Products.java Main.java
   
---

## 🧑🏻‍💻 Autor

*Anthony Oliveira Carvalho*
