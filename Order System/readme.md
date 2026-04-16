# Sistema de Pedidos (Order System)

Este é um projeto prático desenvolvido em Java para consolidar conceitos fundamentais de **Orientação a Objetos (POO)**, manipulação de datas, enumerações e composição de objetos.

## 🚀 Sobre o Projeto

O sistema simula o processo de registro de um pedido de compra, desde o cadastro do cliente até a listagem detalhada dos itens e o cálculo do valor total. A estrutura demonstra como diferentes classes se relacionam para formar um domínio de negócio completo.

## 🛠️ Tecnologias e Conceitos Utilizados

* **Linguagem:** Java
* **Composição de Objetos:** Relacionamento entre as classes `Order`, `Client`, `Product` e `OrderItem`.
* **Enumerações:** Uso de `OrderStatus` para gerenciar os estados do pedido.
* **Sobrescrita de Métodos:** Implementação do método `@Override toString()` para formatação personalizada de dados.
* **Manipulação de Datas:** Uso de `SimpleDateFormat` e a API moderna `java.time` (`LocalDateTime` e `DateTimeFormatter`).
* **Encapsulamento:** Uso de modificadores de acesso `private` e métodos `getters/setters`.

## 📋 Funcionalidades

1.  **Cadastro de Cliente:** Captura nome, e-mail e data de nascimento.
2.  **Gestão de Itens:** Permite adicionar múltiplos produtos a um único pedido.
3.  **Cálculo Automático:** O sistema calcula o subtotal de cada item (preço × quantidade) e o valor total final da ordem.
4.  **Sumário Detalhado:** Gera um relatório formatado no console com todos os dados da transação.

## 📂 Estrutura das Classes

* **`Main.java`**: Ponto de entrada da aplicação e lógica de interação com o usuário.
* **`entities/`**:
    * `Client`: Representa o comprador.
    * `Product`: Representa o produto disponível.
    * `OrderItem`: Representa a quantidade e o preço de um produto específico dentro de um pedido.
    * `Order`: Classe principal que agrega o cliente e a lista de itens.
* **`entities.enums/`**:
    * `OrderStatus`: Define os status possíveis do pedido (PENDING_PAYMENT, PROCESSING, SHIPPED, DELIVERED).

## 💻 Exemplo de Saída no Terminal

```text
ORDER SUMMARY: 
Order moment: 16/04/2026 17:50:37
Order status: PROCESSING
Client: Alex Green (20/10/1985) - alex@gmail.com
Order items: 
TV, $1000.00, Quantity: 1, Subtotal: $1000.00
Mouse, $40.00, Quantity: 2, Subtotal: $80.00
Total Price: $1080.00
