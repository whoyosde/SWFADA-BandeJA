#language: es
@DeshacerFinalizado
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

  Escenario: Deshacer el estado finalizado de una comunicación
    Dado que selecciono el filtro Finalizado
    Cuando presiono el boton Filtrar
    Y se muestran las comunicaciones finalizadas
    Y presiono el icono Deshacer finalizar de una comunicacion
    Y presiono el boton Deshacer
    Y se muestra mensaje satisfactorio
    Entonces la comunicacion se elimina del grupo de finalizadas