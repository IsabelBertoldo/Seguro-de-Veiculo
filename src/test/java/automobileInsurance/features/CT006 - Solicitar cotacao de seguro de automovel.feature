#language: en
#author: Isabel Bertoldo
#Encoding: UTF-8
Feature: Seguro de Automovel

  Scenario: CT006 - Solicitar cotacao de Seguro de automovel
    Given preencho o formulario de dados do veiculo
    And preencho o formulario de dados do seguro
    And preencho o formulario de dados do produto
    And seleciono a opcao de preco desejada
    When preencho o formulario para envio de cotacao
    Then valido mensagem de envio de cotacao
