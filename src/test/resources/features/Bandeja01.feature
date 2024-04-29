#language: es
@AltaSinFirma
Característica: Plataforma Bandeja
  Como usuario comun
  Quiero ingresar a la plataforma Bandeja
  Para gestinar las comunicaciones.

  Antecedentes:
    Dado que el usuario ingresa a la plataforma Bandeja
    Cuando se inicia sesión mediante usuario "30268264B" y contraseña "30268264B"
    Y presiono el boton Entrar
    Y presiono el boton Aceptar obligaciones
    Cuando selecciono el puesto de trabajo "ANALISTA FUNCIONAL (D.G. PATRIMONIO)"
    Y presiono el boton Acceder

  Esquema del escenario: Escenario: Alta de nueva comunicación sin firma
    Dado que me encuentro en Bandeja
    Cuando presiono la acción nueva comunicación
    Entonces se muestra el modal Alta de comunicación
    Y registro el Asunto "<asunto>"
    Y selecciono Registro de procedimientos y servicios "<procedimiento>"
    Y registro el Código expediente "<codigo>"
    Y adjunto documento
    Y selecciono el destino de comunicación "<destino>"
    Y resgitro la fecha limite "<fecha limite>"
    Cuando presiono el boton Enviar sin firma
    Entonces valido mensaje de exito
    Ejemplos:
      | asunto                     | procedimiento                        | codigo  | destino         | fecha limite |
      | Prueba de Automatización02 | Indemnización por Razón del Servicio | AUTO123 | D.G. PATRIMONIO | 27/04/2024   |


