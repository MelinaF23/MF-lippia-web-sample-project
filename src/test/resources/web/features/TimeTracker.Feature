@timeTracker @regresion
Feature: Time Tracker

  Background: 
    Given el usuario ingresó a Clockify con un mail y contraseña válidos
    And se encuentra en la sección Tracker
  
  @smoke @registroExitoso @do
  Scenario Outline: Registro exitoso de horas trabajadas
    When hace click en el icono Manual (m)
	And ingresa el texto <texto> y el momento actual en el Campo de Texto
	And hace click en Project
	And hace click en el Proyecto <proyecto>
	And ingresa la hora de Inicio <inicio>
	And ingresa la hora de Finalizacion <finalizacion>
	And hace click en el icono Calendario
	And selecciona el dia actual
	And hace click en el boton ADD
	Then se genera el registro de horas trabajadas exitosamente
	
	Examples:
	| texto  | proyecto    | inicio | finalizacion |
	| Prueba | Hamburguesa | 2230   | 2330         |
	
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
	#Then el usuario visualiza un toast con el mensaje: "Timer Cancelled"
	
	Examples:
	| texto  | proyecto    |
	| Prueba | Hamburguesa |
  
  @smoke
  Scenario Outline: Modificacion exitosa de un registro
    Given existe un registro con datos seteados
    When ingresa el texto <texto> y el momento actual en el Campo Add description
	And hace click en el Proyecto Seteado <proyectoSeteado>
	And hace click en el Proyecto <proyecto>
	And hace click en el icono Tag
	And ingresa el Tag <tag>
	And hace click en el Tag <tag>
	And hace click en el icono Billable
	And ingresa la hora de Inicio <inicio>
	And ingresa la hora de Finalizacion <finalizacion>
	And hace click en el icono Calendario
	And selecciona el dia previo al actual
	Then el usuario visualiza las modificaciones seteadas exitosamente
	
	Examples:
	| texto   | proyectoSeteado | proyecto | tag  | inicio | finalizacion |
	| Academy | Hamburguesa     | Intellij | 2024 | 2230   | 2330         |