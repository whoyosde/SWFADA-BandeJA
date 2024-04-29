@AltaNuevaComunicacionConFirma
Feature: Plataforma Bandeja
  Como usuario comun
  Quiero ingresar a la plataforma Bandeja
  Para gestinar las comunicaciones.
  Background:
    Given que el usuario ingresa a la plataforma Bandeja
    When se inicia sesión mediante usuario "30268264B" y contraseña "30268264B"
    Then presiono el boton Aceptar obligaciones
    And presiono el boton Entrar
    And presiono el boton Aceptar obligaciones
    When selecciono el puesto de trabajo "ANALISTA FUNCIONAL (D.G. PATRIMONIO)"
    And presiono el boton Acceder

Scenario: CP01 - Alta de una nueva comunicación con firma exitosa
  And da click en nueva comunicación
  Then puede visualizar la ventana
  And ingresa el asunto
  And selecciona el registro de procedimientos y servicios
  And ingresa el código expediente relacionado
  And anexa el archivo correspondiente
  And registra un mensaje
  And selecciona el(los) destinos de comunicación
  And marca Sí o No solicita respuesta a destinatarios
  And presiona el botón Enviar a Portafirmas
  Then se presenta la ventana titulada Enviar Petición a Portafirmas
  And selecciona los documentos a firmar
  And se presiona el botón Buscar
  And selecciona un firmante
  And presiona el botón Portafirmas
  Then se muestra el mensaje "Las comunicaciones se han creado correctamente y se han enviado los documentos seleccionados a Portafirmas"





