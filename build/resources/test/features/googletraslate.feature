# language: en


  @SmokeTest
  Feature:Google translate

    Scenario: Traducir una palabra
      Given ingreso al traductor de google
      When traduzco la palabra Queso a ingles
      Then  verifico la palabra Cheese



