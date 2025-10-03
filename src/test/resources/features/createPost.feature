# language: pt


Funcionalidade: Criar Post via API

Cenário: Criar um novo post
Dado que a API está disponível
Quando eu faço uma requisição POST para "/posts" com o corpo:
"""
    {
      "title": "Meu post de teste mike",
      "body": "Conteúdo do post criado via Rest Assured",
      "userId": 1
    }
    """
Então o status da resposta deve ser 201
E o título do post na resposta deve ser "Meu post de teste mike"
E o userId deve ser 1
