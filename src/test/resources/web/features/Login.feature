@Login
Feature: Login

  @Smoke @regresion @loginExitoso
  Scenario: Log in exitoso manualmente
    Given el usuario se encuentra en la Home
    When hace click en Log in
    And hace click en Log in manually
    And coloca un email válido "pruebadepruebamelina@yopmail.com"
    And ingresa la contraseña válida "123123"
    And hace click en Log in en la pantalla de Login
    Then el log in es exitoso
    #And clockify redirige al usuario a su Workspace