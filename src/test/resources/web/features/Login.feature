@Login
Feature: Login

  @Smoke @regresion @loginExitoso
  Scenario: Log in exitoso manualmente
    Given el usuario se encuentra en la Home
    When hace click en Log in
    And hace click en Log in manually
    #And coloca un email válido "alejandra.fittipaldi@gmail.com"
    #And ingresa la contraseña válida
    #And hace click en "Log in"
    #Then el log in es exitoso
    #And clockify redirige al usuario a su Workspace