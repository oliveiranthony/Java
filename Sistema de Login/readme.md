# 🔐 Sistema de Login em Java (POO)

Este projeto consiste em um **Sistema de Login simples**, desenvolvido em **Java**, com foco total na prática de **Programação Orientada a Objetos (POO)**. O objetivo principal é consolidar conceitos como **encapsulamento, construtores, métodos não estáticos e responsabilidade das classes**.

---

## 📌 Objetivo do Projeto

Simular um processo básico de autenticação de usuário, garantindo:

* Proteção dos dados sensíveis (senha)
* Validações centralizadas na própria classe
* Separação clara entre regra de negócio e execução do programa

Este projeto foi criado com fins **educacionais**, voltado ao aprendizado de boas práticas em Java.

---

## 🧠 Conceitos Aplicados

* Programação Orientada a Objetos (POO)
* Encapsulamento
* Construtores
* Métodos de instância (não estáticos)
* Separação de responsabilidades

---

## 🧩 Estrutura do Projeto

```
📂 src
 ┣ 📂 application
 ┃ ┗ 📄 Program.java
 ┣ 📂 Service
 ┃ ┗ 📄 SistemaLogin.java
```

### 📄 `SistemaLogin.java`

Classe responsável por:

* Armazenar a senha de forma encapsulada
* Realizar a autenticação do usuário
* Proteger o acesso direto aos dados

### 📄 `Program.java`

Classe principal (`main`) responsável apenas por:

* Interação com o usuário
* Leitura da senha digitada
* Chamada do método de autenticação

---

## 🔐 Funcionamento do Sistema

1. O usuário digita a senha via terminal
2. O sistema cria um objeto `SistemaLogin`
3. A autenticação é realizada através de um método específico
4. O sistema retorna se o acesso foi liberado ou não

---

## 🛠️ Tecnologias Utilizadas

* Java (JDK 25)
* Scanner (`java.util.Scanner`)
* IDE: Eclipse (ou similar)

---

## ▶️ Como Executar

1. Clone o repositório:

```bash
git clone https://github.com/seu-usuario/seu-repositorio.git
```

2. Compile o projeto:

```bash
javac application/Program.java
```

3. Execute:

```bash
java application.Program
```

---

## 🚀 Aprendizados

Este projeto foi fundamental para compreender que:

* OOP não é apenas dividir código em classes
* Cada classe deve ser responsável por suas próprias regras
* Encapsulamento aumenta segurança e organização
* Métodos `static` nem sempre são a melhor solução

---

## 📈 Próximos Passos (Evoluções Futuras)

* Limitar tentativas de login
* Trabalhar com múltiplos usuários
* Criptografia de senha
* Persistência de dados

---

## 👤 Autor

Desenvolvido por **Anthony Oliveira**
Estudante de Engenharia de Computação e entusiasta em desenvolvimento de software.

---

📬 Feedbacks, sugestões e contribuições são sempre bem-vindos!
