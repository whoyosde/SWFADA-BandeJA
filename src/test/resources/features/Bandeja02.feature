#language: es
@AltaNuevaComunicacionConFirma
Característica: : Plataforma Bandeja
  Como usuario comun
  Quiero ingresar a la plataforma Bandeja
  Para gestionar las comunicaciones.

  Antecedentes: :
    Dado que el usuario ingresa a la plataforma Bandeja
    Cuando se inicia sesión mediante usuario "30268264B" y contraseña "30268264B"
    Y presiono el boton Entrar
    Y presiono el boton Aceptar obligaciones
    Cuando selecciono el puesto de trabajo "ANALISTA FUNCIONAL (D.G. PATRIMONIO)"
    Y presiono el boton Acceder
    Entonces valido que me encuentro en la plataforma Bandeja

  Esquema del escenario: Alta de una nueva comunicación con firma exitosa
    Cuando presiono en nueva comunicación
    Entonces se muestra la ventana Alta de Comunicación
    Y registro el asunto "<asunto>"
    Y selecciono el registro de procedimientos y servicios "<procedimiento>"
    Y registro el código expediente relacionado "<codigo>"
    Y anexo documento
    Y selecciono el destino de comunicación "<destino>"
    Y registro la fecha limite "<fecha limite>"
    Cuando presiono el botón Enviar a Portafirmas
    Entonces el sistema presenta la ventana Enviar petición a Port@firmas
    Y selecciono el documento a firmar
   Y ingresar el nombre del firmante "<nombre firmante>"
    Cuando presione el botón Buscar
    Y selecciono el firmante buscado
    Entonces se muestra el firmante en la sección Firmantes del documento
    Y selecciono el resto de firmantes
    Cuando cambio de posición a los firmantes
    Y presiono el botón Enviar a Portafirma Final
    Entonces se muestra el mensaje de éxito



    Ejemplos:
      | asunto                     | procedimiento                        | codigo | destino         | fecha limite | nombre firmante               |
      | Prueba de Automatización03 | Indemnización por Razón del Servicio | EXP123 | D.G. PATRIMONIO | 27/08/2024   | Usuario 1 Pruebas Rendimiento |