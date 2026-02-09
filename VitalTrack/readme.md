# 💪 VitalTrack

**VitalTrack** é um projeto em **Java (console)** desenvolvido com foco em aprendizado de lógica de programação, estruturas condicionais e interação com o usuário.

O programa auxilia no cálculo de **hidratação diária**, **Taxa Metabólica Basal (TMB)** e **Gasto Energético Total (GET)**, além de fornecer orientações conforme o objetivo do usuário.

> ⚠️ **Aviso**: As fórmulas utilizadas são apenas estimativas. Para resultados precisos e personalizados, consulte um nutricionista ou profissional da saúde.

---

## 📌 Funcionalidades

### 🔹 1. Cálculo de ingestão diária de água

* Baseado no peso corporal
* Fórmula utilizada:

  ```
  35 ml por kg de peso
  ```
* Resultado exibido em **litros por dia**

---

### 🔹 2. Cálculo de Saúde Metabólica

#### ✅ Taxa Metabólica Basal (TMB)

Calculada com base em:

* Peso
* Altura
* Idade
* Sexo

Fórmula utilizada (Mifflin-St Jeor):

* **Homens**:

  ```
  TMB = (10 × peso) + (6.25 × altura) − (5 × idade) + 5
  ```
* **Mulheres**:

  ```
  TMB = (10 × peso) + (6.25 × altura) − (5 × idade) − 161
  ```

---

#### ✅ Gasto Energético Total (GET)

O GET é calculado a partir da TMB multiplicada pelo **Fator de Atividade Física (FAF)**:

| Nível de Atividade  | FAF   |
| ------------------- | ----- |
| Sedentário          | 1.2   |
| Levemente ativo     | 1.375 |
| Moderadamente ativo | 1.55  |
| Muito ativo         | 1.725 |
| Extremamente ativo  | 1.9   |

---

#### 🎯 Objetivo do Usuário

Após o cálculo do GET, o programa fornece orientações conforme o objetivo escolhido:

* Manter peso
* Perder peso
* Ganhar massa muscular

---

## 🛠️ Tecnologias Utilizadas

* Java
* Scanner (entrada de dados)
* Estruturas de controle:

  * `if / else`
  * `switch`
  * `while`

---

## ▶️ Como Executar

1. Clone o repositório:

   ```bash
   git clone https://github.com/seu-usuario/vitaltrack-java.git
   ```
2. Compile o programa:

   ```bash
   javac VitalTrack.java
   ```
3. Execute:

   ```bash
   java VitalTrack
   ```

---

## 🎯 Objetivo do Projeto

Este projeto foi desenvolvido com fins **educacionais**, visando:

* Praticar lógica de programação
* Trabalhar validação de dados
* Consolidar conceitos básicos da linguagem Java
* Criar um projeto apresentável para portfólio iniciante

---

## 🚀 Próximas Melhorias (ideias)

* Refatoração para métodos
* Interface gráfica (JavaFX ou Swing)
* Salvamento de dados do usuário
* Conversão para aplicação mobile ou web

---

## 👨‍💻 Autor

Desenvolvido por **Anthony Oliveira**
Estudante de Engenharia de Computação | Iniciante em TI
Apaixonado por tecnologia e aprendizado contínuo 🚀

---

⭐ Se gostou do projeto, deixe uma estrela no repositório!
