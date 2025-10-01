# language: pt

Funcionalidade: Consultar usuários da API

Cenário: Buscar usuário por ID
Dado que a API está disponível
Quando eu faço uma requisição GET para "/users/1"
Então o status da resposta deve ser 200
E o nome do usuário deve ser "Leanne Graham"

Cenário: Buscar todos os comentários de um post
Dado que a API está disponível
Quando eu faço uma requisição GET para "/posts/1/comments"
Então o status da resposta deve ser 200
E a resposta deve conter pelo menos 5 comentários

Cenário: Buscar um álbum específico
Dado que a API está disponível
Quando eu faço uma requisição GET para "/albums/1"
Então o status da resposta deve ser 200
E o título do álbum deve ser "quidem molestiae enim"

Cenário: Buscar todos os álbuns de um usuário
Dado que a API está disponível
Quando eu faço uma requisição GET para "/users/1/albums"
Então o status da resposta deve ser 200
E a resposta deve conter pelo menos 1 álbum
