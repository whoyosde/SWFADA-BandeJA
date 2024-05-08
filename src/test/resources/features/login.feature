#language: es
@LoginBandeja
Característica: Registrar una remisión de expediente
  Como usuario comun
  Quiero ingresar a la plataforma Bandeja
  Para gestinar las comunicaciones.

  Esquema del escenario: Ingresar a Bandeja
    Dado que el usuario ingresa a la plataforma Bandeja
    Cuando se inicia sesión mediante usuario "<DNI>" y contraseña "<contraseña>"
    Y presiono el boton entrar
    Entonces se carga las comunicaciones

    Ejemplos:
    |DNI|contraseña|
    |30268264B|30268264B|