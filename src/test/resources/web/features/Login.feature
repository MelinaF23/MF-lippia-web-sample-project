@login @regresion
Feature: Login

  @smoke @loginExitoso
  Scenario: Log in exitoso manualmente
    Given el usuario se encuentra en la Home
    When hace click en Log in
    And hace click en Log in manually
    And coloca un email válido "pruebadepruebamelina@yopmail.com"
    And ingresa la contraseña válida "123123"
    And hace click en Log in en la pantalla de Login
    Then el log in es exitoso

  @loginFallido
  Scenario: Log in fallido con email al ingresar un verification code inválido
    Given el usuario se encuentra en la Home
    When hace click en Log in
    And coloca un email válido "pruebadepruebamelina@yopmail.com"
    And hace click en CONTINUE WITH EMAIL
    And ingresa el verification code inválido "123123"
    Then el usuario visualiza el mensaje: "That code isn't valid. Please try again."

  @loginFallido
  Scenario: Log in fallido con cuenta de Google al ingresar un email inválido
    Given el usuario se encuentra en la Home
    When hace click en Log in
    And hace click en Continue with Google
    And coloca un email inválido "alejandra.fittipaldi@"
    #And hace click en Siguiente
    #Then el usuario visualiza el mensaje: "Ingresa un número de telefono o correo electrónico válidos"