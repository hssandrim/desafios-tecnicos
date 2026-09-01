


# 🚀 Desafios Técnicos & Simulações de Processos Seletivos (Java)

Este repositório reúne as minhas resoluções de desafios técnicos, simulações de regras de negócio e exercícios práticos focados no desenvolvimento Back-end com **Java**.

---

## 🎯 Objetivo
Desenvolver autonomia lógica, modularização de código, tratamento de casos de borda (*corner cases*) e manipulação limpa de coleções de dados dinâmicas, simulando os requisitos reais exigidos em testes técnicos de empresas de tecnologia e instituições financeiras.

---

## 📁 Estrutura do Repositório

```text
desafios-tecnicos/
├── transaction-system/        # Desafio: Processador de Transações Bancárias
├── limit-manager/             # Desafio: Gerenciador de Limites de Crédito
├── score-tracker/             # Desafio: Rastreador de Pontuações de Risco
├── order-discount-tracker/    # Desafio: Rastreador de Descontos de Pedidos
├── cashback-account-system/   # Desafio: Sistema de Gestão de Contas e Cashback
├── digital-wallet-system/     # Desafio: Sistema de Carteira Digital e Recompensas
├── README.md                  # Documentação do repositório
└── (desafios futuros)

```

---

## 🛠️ Desafios Implementados

### 🟢 1. Transaction System (`/transaction-system`)

Simulação de um processador de transações financeiras focado no gerenciamento de estados em memória e cálculos de indicadores.

* **Nível 1:** Implementação da estrutura do contêiner para adicionar transações (`addTransaction`) e cancelar registros (`cancelTransaction`) garantindo controle de integridade de dados.
* **Nível 2:** Processamento da média aritmética das transações (`getAverageTransaction`), tratando listas vazias com a caixinha de segurança `Optional<Double>` para evitar exceções de ponteiro nulo (`NullPointerException`).
  
* **Tecnologias & Conceitos:** Java, `ArrayList`, Manipulação de Wrappers (`Double`, `Integer`), JUnit/Gradle e Validação com `Optional`.

### 🟢 2. Limit Manager (`/limit-manager`)

Simulação de um módulo de análise de limites de cartão de crédito.

* **Nível 1:** Implementação da estrutura de armazenamento em memória para adição (`addLimit`) e revogação (`revokeLimit`) de limites.
* **Nível 2:** Processamento e filtragem de limites superiores a determinado valor (`getLimitsAbove`), garantindo a preservação e imutabilidade da coleção original.
  
* **Tecnologias & Conceitos:** Java, `ArrayList`, Laço *for-each*, Controle de Escopo Local e Filtragem de Coleções.

### 🟢 3. Score Tracker (`/score-tracker`)
Simulação de um rastreador de pontuações de risco para identificação e histórico de limites operacionais.

* **Nível 1:** Registro de pontuações (`recordScore`) e remoção segura de registros (`removeScore`) via manipulação explícita de wrappers.
* **Nível 2:** Busca do valor máximo armazenado (`getHighestScore`) integrado ao utilitário `Collections.max` e empacotamento com `Optional<Integer>`.

* **Tecnologias & Conceitos:** Java, `ArrayList`, Wrappers (`Integer`), `Collections.max` e Tratativa de Borda.

### 🟢 4. Order Discount Tracker (`/order-discount-tracker`)
Simulação de um rastreador de descontos aplicados a pedidos de e-commerce para análise de receita operacional e métricas de vendas.

* **Nível 1:** Registro de pedidos (`addOrder`) permitindo apenas valores estritamente positivos e cancelamento seguro de pedidos (`cancelOrder`) de forma individual via remoção direta na lista.
* **Nível 2:** Cálculo da receita total acumulada aplicando taxa de desconto flexível para pedidos acima do limite estabelecido (`getTotalDiscountRevenue`) e contagem filtrada de pedidos acima de um valor de corte (`countOrdersAbove`).

* **Tecnologias & Conceitos:** Java, `ArrayList`, Wrappers (`Double`), Autoboxing, laço `for-each`, acumuladores (`+=`) e tratamento de validação de dados.

### 🟢 5. Cashback Account System (`/cashback-account-system`)
Simulação de um módulo de gerenciamento de compras e acumulo de bonificações de cashback para cartões de crédito.

* **Nível 1:** Implementação da estrutura de armazenamento em memória para adicionar compras (`addPurchase`) e cancelar registros (`cancelPurchase`) via remoção por valor (`Integer.valueOf`).
* **Nível 2:** Processamento e cálculo de bonificação de **5% de cashback** exclusivo para compras acima de 100 (`getTotalCashback`), com tratamento seguro de lista vazia via `Optional<Double>`.
* **Nível 3:** Cópia de segurança e ordenação crescente da coleção para cálculo da mediana de transações (`getMedianPurchase`), preservando o histórico de inserção original.
* **Nível 4:** Filtragem dinâmica de compras de alto valor com base em um limiar mínimo flexível (`getHighValuePurchases`), retornando uma nova coleção sem alterar o estado do contêiner.
  
* **Tecnologias & Conceitos:** Java, `ArrayList`, `Collections.sort`, Tratativa de Lista Vazia com `Optional`, laço *for-each*, Acumuladores (`+=`) e Filtros de Limiar.

### 🟢 6. Digital Wallet System (`/digital-wallet-system`)
Simulação de um módulo central de carteira digital para processar transações diárias e gerenciar recompensas de usuários.

* **Nível 1:** Implementação de estado em memória para adicionar transações (`addTransaction`) e cancelar registros (`cancelTransaction`) com remoção segura por valor (`Integer.valueOf`).
* **Nível 2:** Processamento de regras de negócio com cálculo de 10% de recompensa exclusivo para transações estritamente maiores que 150 (`calculateRewards`), com retorno seguro via `Optional<Double>`.
* **Nível 3:** Cópia defensiva e ordenação crescente da coleção para cálculo da mediana de transações (`getMedianTransaction`), preservando o histórico de inserção original.
* **Nível 4:** Filtragem inclusiva por intervalos flexíveis (`filterTransactionsByRange`), construindo uma nova coleção de retorno do zero para evitar modificações concorrentes (`ConcurrentModificationException`).

* **Tecnologias & Conceitos:** Java, `ArrayList`, `Collections.sort`, Tratativa de Lista Vazia com `Optional`, `laço for-each`, Acumuladores e Imutabilidade de Iteradores.

---
 
---

## 💻 Como Executar

1. Clone o repositório:
```bash
git clone https://github.com/hssandrim/desafios-tecnicos.git

```


2. Abra a subpasta do desafio desejado (ex: `transaction-system`, `score-tracker`, `limit-manager`) no IntelliJ IDEA ou na sua IDE de preferência.
3. Execute o método `main` da classe para visualizar os testes e validações no console.

---

**Desenvolvido por: [Henrique Soares Sandrim](https://www.google.com/search?q=https://github.com/hssandrim) 🚀**

