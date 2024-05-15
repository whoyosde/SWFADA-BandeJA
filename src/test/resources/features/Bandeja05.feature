@AsignarComunicacionEstadoPendiente
Feature: 005.Asignar una comunicación en estado PENDIENTE.
  Como usuario comun
  Quiero ingresar a la plataforma Bandeja
  Para gestinar las comunicaciones.
  Background:
    Given que el usuario ingresa a la plataforma Bandeja
    When se inicia sesión mediante usuario "30268264B" y contraseña "30268264B"
    And presiono el boton Entrar
    And presiono el boton Aceptar obligaciones
    When selecciono el puesto de trabajo "ANALISTA FUNCIONAL (D.G. PATRIMONIO)"
    And presiono el boton Acceder
    Then valido que me encuentro en la plataforma Bandeja

    Scenario: Asignación de comunicación en estado pendiente
      And selecciono comunicación
      When presiono el icono Asignar
      And presiono el botón Aceptar
      And verifico el cambio de estado


