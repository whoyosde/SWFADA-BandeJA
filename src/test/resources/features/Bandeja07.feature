@ReenviarComunicacion
Feature: Plataforma Bandeja
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

  Scenario Outline:
    And selecciono una comunicación
    When presiono el botón Reenviar
    Then el sistema muestra la ventana de reenvío de la comunicación
    And selecciono el destino de la comunicación "<destino>"
    And presiono el botón Reenviar
    Then sistema muestra mensaje de confirmación de reenvío

    Examples:
      | destino                    |
      | AGENCIA DIGITAL DE ANDALUCIA (ADA) |