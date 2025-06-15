# ⚡ ApagouAqui - Microserviços

Este repositório contém os **microserviços desenvolvidos para o projeto _ApagouAqui?_**, uma plataforma comunitária que permite a usuários reportarem quedas de energia, receberem alertas e acompanharem relatórios de forma integrada, utilizando arquitetura orientada a serviços.

---

## 👥 Integrantes

> Substitua os nomes e RMs abaixo:

- João Pedro Cruz – RM98650  
- Tiago Paulino – RM551169  
- Victor Eid Carbutti Nicolas – RM98668

## 🔧 Microserviços Implementados

| Serviço          | Porta | Função Principal                                           |
|------------------|-------|------------------------------------------------------------|
| `usuarios`       | 8080  | Cadastro e gerenciamento de usuários                      |
| `registroevento` | 8081  | Registro de quedas de energia por localização             |
| `alertas`        | 8082  | Emissão de alertas climáticos ou emergenciais             |
| `relatorios`     | 8083  | Geração de relatórios a partir dos dados dos demais MS    |

---

## 🧱 Tecnologias Utilizadas

- Java 17
- Spring Boot 3.5.0
- Spring Web / Data JPA
- H2 Database (memória)
- REST APIs
- Maven
- Git + GitHub

---

## 🚀 Como Executar

> É necessário ter o Java 17 e Maven instalados na máquina.

### 1. Clone o repositório

```bash
git clone https://github.com/Jpvalebm607/Challenge_SOA
cd apagouaqui-microservicos
```

### 2. Execute cada microserviço separadamente

Entre em cada pasta e rode:

```bash
cd usuarios
mvn spring-boot:run
```

Depois:

```bash
cd ../registroevento
mvn spring-boot:run
```

E assim por diante para `alertas` e `relatorios`.

---

## 🌐 Endpoints de Teste

### ✅ `usuarios` – http://localhost:8080

```bash
# Criar usuário
curl -X POST http://localhost:8080/usuarios \
-H "Content-Type: application/json" \
-d "{\"nome\":\"Victor\",\"email\":\"victor@email.com\",\"senha\":\"123456\"}"

# Listar usuários
curl -X GET http://localhost:8080/usuarios
```

---

### ✅ `registroevento` – http://localhost:8081

```bash
# Criar evento
curl -X POST http://localhost:8081/eventos \
-H "Content-Type: application/json" \
-d "{\"localizacao\":\"Rua X\",\"descricao\":\"Apagão\",\"dataHora\":\"2025-06-15\",\"status\":\"pendente\"}"

# Listar eventos
curl -X GET http://localhost:8081/eventos
```

---

### ✅ `alertas` – http://localhost:8082

```bash
# Criar alerta
curl -X POST http://localhost:8082/alertas \
-H "Content-Type: application/json" \
-d "{\"tipo\":\"chuva\",\"descricao\":\"Tempestade\",\"origem\":\"INMET\",\"dataHora\":\"2025-06-15T23:00:00\",\"status\":\"ativo\"}"

# Listar alertas
curl -X GET http://localhost:8082/alertas
```

---

### ✅ `relatorios` – http://localhost:8083

```bash
# Relatório de alertas (consome API de alertas)
curl -X GET http://localhost:8083/relatorios/alertas
```

---

## 👨‍💻 Como testar todos de uma vez?

1. Execute os 4 serviços em terminais separados.
2. Use os comandos `curl` acima para simular chamadas reais às APIs.
3. Você pode também testar via Postman ou navegador.

---

