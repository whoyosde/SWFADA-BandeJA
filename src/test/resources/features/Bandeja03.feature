#language: es
@FinalizarComuncación
Característica: 003.Finalizar una comunicación en estado PENDIENTE.
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

  Escenario: Finalizar comunicación en estado Pendiente
    Dado que presiono el ícono finalizar de una comunicación en estado Pendiente
    Y presiono el boton Finalizar
    Entonces se muestra mensaje de exito
    Y valido que no se muestre en comunicaciones recibidas
