@AltaNuevaComunicacionConFirma
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

  Scenario Outline: CP01 - Alta de una nueva comunicación con firma exitosa
    Given que me encuentro ubicado en Bandeja
    When presiono en nueva comunicación
    Then se muestra la ventana Alta de Comunicación
    And registro el asunto "<asunto>"
    And selecciono el registro de procedimientos y servicios "<procedimiento>"
    And registro el código expediente relacionado "<codigo>"
    And anexo documento
    And registra un mensaje
    And selecciono el destino de comunicación <destino>
    And registro la fecha limite "<fecha limite>"
    And presiono el botón Enviar a Portafirmas
    Examples:
    Ejemplos:
      | asunto                     | procedimiento                        | codigo  | destino         | fecha limite |
      | Prueba de Automatización02 | Indemnización por Razón del Servicio | EXP123 | D.G. PATRIMONIO | 27/04/2024   |





