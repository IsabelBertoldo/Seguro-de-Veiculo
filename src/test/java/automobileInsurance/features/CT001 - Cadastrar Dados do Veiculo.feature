#language: en
#author: Isabel Bertoldo
#Encoding: UTF-8
Feature: Seguro de Automovel

  Scenario: CT001 - Cadastro Dados do Veiculo
    Given preencho os dados do veiculo
    When clico no botao next enter insurant data
    Then valido a tela de dados do seguro