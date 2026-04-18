# 📚 Sistema de Gerenciamento de Cursos

Aplicação simples em **Java (console)** que simula um sistema de matrícula em cursos, utilizando conceitos de **Programação Orientada a Objetos (POO)**.

Este projeto foi desenvolvido com foco em prática de modelagem de domínio, relacionamentos entre classes e uso de `enum`, seguindo padrões comuns em **testes técnicos para estágio**.

---

## 🚀 Funcionalidades

* Cadastro de alunos
* Criação de cursos com níveis diferentes
* Associação de instrutores aos cursos
* Matrícula de alunos em cursos
* Registro da data da matrícula
* Exibição organizada dos dados

---

## 🧩 Estrutura de Classes

O sistema é composto pelas seguintes entidades:

* `Student` → dados do aluno
* `Course` → representa um curso
* `Instructor` → instrutor responsável pelo curso
* `Enrollment` → ligação entre aluno e curso (relacionamento muitos-para-muitos)
* `CourseLevel` → enum para nível do curso

---

## 🔗 Relacionamentos

* Um **Student** pode se matricular em vários cursos
* Um **Course** pode ter vários alunos
* Cada **Course** possui um **Instructor**
* A classe **Enrollment** faz a ligação entre Student e Course

---

## 🛠️ Tecnologias Utilizadas

* Java (JDK 25)
* Programação Orientada a Objetos (POO)
* Collections (`List`)
* Enum
* Manipulação de datas (`Date` / `LocalDateTime`)

---

## 📌 Exemplo de Enum

```java id="m1xk3a"
public enum CourseLevel {
    BEGINNER,
    INTERMEDIATE,
    ADVANCED
}
```

---

## ▶️ Como Executar

1. Clone o repositório:

```bash id="q9z8vn"
git clone https://github.com/seu-usuario/course-system.git
```

2. Abra o projeto no IntelliJ ou VS Code

3. Execute a classe `Main`

---

## 📷 Exemplo de Saída

```id="m4k2ds"
ALUNO: João Silva
CURSOS MATRICULADOS:
- Java (INTERMEDIATE)
- Banco de Dados (BEGINNER)
```

---

## 💡 Melhorias Futuras

* Adicionar notas e status da matrícula
* Criar menu interativo no console
* Salvar dados em arquivo (JSON ou TXT)
* Validações de entrada de dados
* Uso de Stream API e expressões lambda

---

## 🎯 Objetivos de Aprendizado

Este projeto demonstra:

* Modelagem de entidades do mundo real
* Uso correto de classe intermediária (`Enrollment`)
* Organização e separação de responsabilidades
* Base para evolução para sistemas mais complexos

---

## 📄 Licença

Projeto livre para fins de estudo.

---

## 👨‍💻 Autor

Desenvolvido por **Anthony Oliveira Carvalho** 🚀
Futuro desenvolvedor Java
