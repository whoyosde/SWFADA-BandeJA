@DescargarDocumentoZip
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

    Scenario: Descarga de documento zip exitoso
      When ingreso a la información detallada de una comunicación
      And el sistema muestra la ventana Información Detallada
      And presiono el icono Descargar Dccumentos
      Then valido el documento descargado

