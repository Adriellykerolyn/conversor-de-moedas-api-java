---
📌 Conversor de Moedas --> Java
---
Aplicação desenvolvida em Java 17 que consome uma API de câmbio em tempo real para realizar conversões entre moedas. O projeto utiliza requisições HTTP nativas da plataforma Java e processamento de JSON com a biblioteca Gson.

O objetivo é consolidar fundamentos de integração com APIs REST, manipulação de dados externos e organização de fluxo lógico em aplicações backend.

---
🚀 Tecnologias Utilizadas
---
* ☕ Java 17
* 🌐 java.net.http.HttpClient
* 📦 Gson
* 🔄 API de câmbio (ExchangeRate API)
---

📂 Estrutura do Projeto
---
```
conversor-de-moedas-api-java/
│
├── src/
│   └── ConversorMoedas.java
│
├── out/
│
└── gson-2.10.1.jar
```
---
🔄 Funcionalidades
---
✔ Consumo de API REST externa  
✔ Extração e leitura de dados JSON  
✔ Conversão entre múltiplas moedas  
✔ Menu interativo via terminal  
✔ Formatação numérica com duas casas decimais  
✔ Tratamento básico de exceções  

 ---
💱 Moedas Disponíveis
---
* USD — Dólar Americano
* BRL — Real Brasileiro
* ARS — Peso Argentino
* BOB — Boliviano
* CLP — Peso Chileno
* COP — Peso Colombiano
* EUR — Euro
---
🧩 Funcionamento da Aplicação
---
Envio de requisição HTTP GET para a API de câmbio.  
Recebimento da resposta em formato JSON.  
Conversão da resposta utilizando a biblioteca Gson.  
Extração do objeto conversion_rates.  
Aplicação do cálculo com base na moeda selecionada.  
Exibição do valor convertido no terminal.  

---

▶ Como Executar
---
1️⃣ Clonar o repositório
```
git clone https://github.com/seu-usuario/conversor-de-moedas-api-java.git
```

2️⃣ Adicionar a biblioteca Gson
```
Baixe o arquivo .jar e inclua no classpath do projeto.
```
Compilação via terminal:
```
javac -cp gson-2.10.1.jar ConversorMoedas.java
java -cp .;gson-2.10.1.jar ConversorMoedas
```
No Windows utilize ; para separar o classpath.  
No Linux/Mac utilize :.

---
🛠 Conceitos Aplicados
---
* Programação Orientada a Objetos (POO)  
* Consumo de APIs REST  
* Parsing e manipulação de JSON  
* Uso de HttpClient (Java 11+)  
* Estruturas de decisão (switch)  
* Entrada de dados com Scanner  
* Tratamento de exceções (try/catch)

---
📌 Contexto Acadêmico
---
Projeto desenvolvido como prática durante a formação Backend em Java e Spring Boot do programa ONE - Oracle Next Education, realizado em parceria com a Alura e a Oracle.
O foco foi consolidar fundamentos de integração com serviços externos, comunicação HTTP e manipulação de dados estruturados, competências essenciais no desenvolvimento backend.
