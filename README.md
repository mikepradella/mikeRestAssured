# 🚀 mikeRestAssured

Testes automatizados de API REST com Java, RestAssured e Cucumber
Didático, enxuto e pronto para expansão!

---

## ✨ O que este projeto faz?

✅ Valida endpoints REST de forma automatizada

✅ Implementa cenários de testes em BDD (Behavior Driven Development)

✅ Garante legibilidade e manutenibilidade dos testes

✅ Reaproveita contexto entre steps para cenários mais robustos

✅ Suporte a GET, POST, PUT e DELETE

---

## 🛠️ Tecnologias

- Java 11+
- Maven
- RestAssured
- Cucumber
- JUnit

---

## 💡 Diferenciais

- Estrutura de código organizada e escalável

- Uso de TestContext para compartilhar dados entre steps

- Cenários prontos para GET, POST, PUT e DELETE

- Base ideal para entrevistas técnicas ou projetos reais


## 📦 Como rodar

1. Clone o repositório:
   ```bash
   git clone https://github.com/mikepradella/mikeRestAssured.git
   cd mikeRestAssured
<hr></hr>


## 📖 Exemplos de Cenários

🔹 GET – Buscar usuário por ID

Cenário: Buscar usuário por ID
  Dado que a API está disponível
  Quando eu faço uma requisição GET para "/users/1"
  Então o status da resposta deve ser 200
  E o nome do usuário deve ser "Leanne Graham"
<hr></hr>
💡 Diferenciais
Estrutura enxuta e fácil de entender
Pronto para ser expandido com novos cenários
Ideal para demonstrar conhecimento em testes de API
<hr></hr>
👨‍💻 Autor
Mike Pradella
GitHub
<hr></hr>