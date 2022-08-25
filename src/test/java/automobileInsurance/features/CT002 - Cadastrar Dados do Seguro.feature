#language: en
#author: Isabel Bertoldo
#Encoding: UTF-8
Feature: Seguro de Automovel

  Scenario: CT002 - Cadastro dos dados do seguro
    Given que estou na tela de dados do seguro
    When preencho os dados do seguro
    And clico no botao next enter product data
    Then valido a tela de dados do produto
