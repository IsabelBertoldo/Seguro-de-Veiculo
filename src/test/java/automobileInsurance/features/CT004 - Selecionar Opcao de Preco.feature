#language: en
#author: Isabel Bertoldo
#Encoding: UTF-8
Feature: Seguro de Automovel

  Scenario: CT004 - Selecionar Opcao de Preco
    Given que estou na tela de selecionar opcao de preco
    When seleciono a opcao de preco
    And clico no botao next send quote
    Then valido a tela de envio de cotacao
