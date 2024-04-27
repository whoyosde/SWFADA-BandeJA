@AltaNuevaComunicacionConFirma
Feature: Alta de una nueva comunicación con firma
  Background:
    Given el usuario navega al sitio web
    When ingresa credenciales validas
    Then el sistema muestra la pantalla obligaciones para el uso del sistema

Scenario: CP01 - Alta de una nueva comunicación con firma exitosa
  And presione el botón Aceptar
  And seleccione el puesto

  And da click en nueva comunicación
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





