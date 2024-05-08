#language: es
@EliminarAsignacion
Característica: Plataforma Bandeja
  Como usuario comun
  Quiero ingresar a la plataforma Bandeja
  Para gestionar las comunicaciones.

  Antecedentes:
    Dado que el usuario ingresa a la plataforma Bandeja
    Cuando se inicia sesión mediante usuario "30268264B" y contraseña "30268264B"
    Y presiono el boton Entrar
    Y presiono el boton Aceptar obligaciones
    Cuando selecciono el puesto de trabajo "ANALISTA FUNCIONAL (D.G. PATRIMONIO)"
    Y presiono el boton Acceder
    Entonces valido que me encuentro en la plataforma Bandeja

  Escenario: Eliminar la asignación de una comunicación en estado ASIGNADO
    Dado que presiono el ícono reasignar de una comunicacion en estado Asignado
    Cuando presiono Eliminar asignacion
    Y muestra mensaje de exito
    Y presiono el boton Aceptar
    Entonces la comunicación cambia a estado Pendiente