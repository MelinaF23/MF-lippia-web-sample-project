@timeTracker @regresion
Feature: Time Tracker

  Background: 
    Given el usuario ingreso a Clockify con un mail y contrasenia validos
    And se encuentra en la seccion Tracker
  
  @smoke @registroExitoso
  Scenario Outline: Registro exitoso de horas trabajadas
    When hace click en el icono Manual (m)
    And ingresa el texto <texto> y el momento actual en el Campo de Texto
    And hace click en Project
    And hace click en el Proyecto <proyecto>
    And ingresa la hora de Inicio <inicio>
    And ingresa la hora de Finalizacion <finalizacion>
    And hace click en el icono Calendario
    #And selecciona el dia actual
    And hace click en el boton ADD
    Then el usuario visualiza el mensaje de verificacion "Time entry has been created"

    Examples:
      | texto   | proyecto    | inicio | finalizacion |
      | Lechuga | Hamburguesa | 2230   | 2330         |

  @registroDescartado
  Scenario Outline: Descarte exitoso de registro de horas trabajadas
    When hace click en el icono Timer (n)
    And ingresa el texto <texto> y el momento actual en el Campo de Texto
    And hace click en Project
    And hace click en el Proyecto <proyecto>
    And hace click en el boton START
    And hace click en el menu hamburguesa
    And hace click en Discard
    And hace click en el boton DISCARD
    Then Se visualiza el boton START nuevamente
    And el usuario visualiza el mensaje "Timer cancelled"

    Examples:
      | texto  | proyecto    |
      | Prueba | Hamburguesa |

  @smoke
  Scenario Outline: Modificacion exitosa de un registro
    Given existe un registro recientemente creado con datos seteados
    When edita el texto <texto> y el momento actual en el Campo Add description
    And click en el Project Seteado
	And click en el Proyecto <proyecto>
    And click en el icono Tag
    And ingresa el Tag <tag>
    And click en el Tag <tag>
    And click en el icono Billable
	And ingresar hora de Inicio <inicio>
	And ingresar hora de Finalizacion <finalizacion>
	And click en el icono Calendario
    #And seleccionar el dia previo al actual
    Then el usuario visualiza las modificaciones <texto>, <proyecto>, <tag>, <inicio> y <finalizacion> exitosamente

    Examples:
      | texto         | proyecto | tag  | inicio | finalizacion |
      | Entrega Final | IntelliJ | 2024 | 1022   | 1145         |