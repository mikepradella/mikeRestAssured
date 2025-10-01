Feature: Consultar usuários da API

  Scenario: Buscar usuário por ID
    Given que a API está disponível
    When eu faço uma requisição GET para "/users/1"
    Then o status da resposta deve ser 200
    And o nome do usuário deve ser "Leanne Graham"