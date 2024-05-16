#language: es
@AltaSinFirma
Característica: 001.Alta de nueva comunicación sin firma
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

  Esquema del escenario: Alta de nueva comunicación sin firma
    Dado que presiono la acción nueva comunicación
    Cuando se muestra el modal Alta de comunicación
    Y registro el Asunto "<asunto>"
    Y selecciono Registro de procedimientos y servicios "<procedimiento>"
    Y registro el Código expediente "<codigo>"
    Y adjunto documento
    Y selecciono destino de comunicación "<destino>"
    Y resgitro la fecha limite "<fecha limite>"
    Y presiono el boton Enviar sin firma
    Y se muestra mensaje éxito
    Entonces valida que se envió la comunicación
    Ejemplos:
      | asunto                     | procedimiento                        | codigo  | destino         | fecha limite |
      | Prueba de Automatización07 | Indemnización por Razón del Servicio | AUTO123 | D.G. PATRIMONIO | 27/08/2024   |


