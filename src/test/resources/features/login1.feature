@Suite @Login1
Feature: CP01 - Validacion de autenticacion de usuario y contraseña

  Background:
    Given el usuario navega al sitio web

  @CredencialesValidas
  Scenario: CP01-01: Validacion con credenciales validas
    When ingresa credenciales validas
    Then el sistema muestra la pantalla obligaciones para el uso del sistema