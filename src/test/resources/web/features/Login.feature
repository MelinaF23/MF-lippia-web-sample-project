@Login
Feature: Login

  @Smoke @regresion @loginExitoso
  Scenario: Log in exitoso manualmente
    Given el usuario se encuentra en la Home
    #When hace click en "Log in"
    #And hace click en "Log in manually"
    #And coloca un email válido "alejandra.fittipaldi@gmail.com"
    #And ingresa la contraseña válida
    #And hace click en "Log in"
    #Then el log in es exitoso
    #And clockify redirige al usuario a su Workspace







  @Smoke @Automated
  Scenario Outline: The client search by <word>
    Given The client is on google page
    When The client search for word <word>
    Then The client verify that results are shown properly

    Examples:
    | word            |
    | Crowdar Academy |
    | Calidad         |
    | Software        |
    | Testing         |

  @Academy
  Scenario Outline: The client search by <word>
    Given The client is on google page
    When The client search for word <word>
    Then The client verify that results are shown properly

    Examples:
      | word            |
      | Crowdar         |
      | IntelliJ        |