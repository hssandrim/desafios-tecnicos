


# 🚀 Desafios Técnicos & Simulações de Processos Seletivos (Java)

Este repositório reúne as minhas resoluções de desafios técnicos, simulações de regras de negócio e exercícios práticos focados no desenvolvimento Back-end com **Java**.

---

## 🎯 Objetivo
Desenvolver autonomia lógica, modularização de código, tratamento de casos de borda (*corner cases*) e manipulação limpa de coleções de dados dinâmicas, simulando os requisitos reais exigidos em testes técnicos de empresas de tecnologia e instituições financeiras.

---

## 📁 Estrutura do Repositório

```text
desafios-tecnicos/
├── transaction-system/    # Desafio 1: Processador de Transações Bancárias (Níveis 1 e 2)
├── README.md             # Documentação do repositório
└── (desafios futuros)

```

---

## 🛠️ Desafios Implementados

### 🟢 1. Transaction System (`/transaction-system`)

Simulação de um processador de transações financeiras focado no gerenciamento de estados em memória e cálculos de indicadores.

* **Nível 1:** Implementação da estrutura do contêiner para adicionar transações (`addTransaction`) e cancelar registros (`cancelTransaction`) garantindo controle de integridade de dados.
* **Nível 2:** Processamento da média aritmética das transações (`getAverageTransaction`), tratando listas vazias com a caixinha de segurança `Optional<Double>` para evitar exceções de ponteiro nulo (`NullPointerException`).
* **Tecnologias & Conceitos:** Java, `ArrayList`, Manipulação de Wrappers (`Double`, `Integer`), JUnit/Gradle e Validação com `Optional`.

---

## 💻 Como Executar

1. Clone o repositório:
```bash
git clone https://github.com/hssandrim/desafios-tecnicos.git

```


2. Abra a subpasta do desafio desejado (ex: `transaction-system`) no IntelliJ IDEA ou na sua IDE de preferência.
3. Execute os testes unitários da pasta `src/test/java` para validar a execução.

---

**Desenvolvido por: [Henrique Soares Sandrim](https://www.google.com/search?q=https://github.com/hssandrim) 🚀**

