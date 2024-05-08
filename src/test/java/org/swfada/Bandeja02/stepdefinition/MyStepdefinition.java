package org.swfada.Bandeja02.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.swfada.Bandeja02.step.MyStep;


public class MyStepdefinition {
    @Steps
    MyStep myStep;

    @Cuando("presiono en nueva comunicación")
    public void presionoEnNuevaComunicación() {
        myStep.presionoEnNuevaComunicación();
    }

    @Entonces("se muestra la ventana Alta de Comunicación")
    public void seMuestraLaVentanaAltaDeComunicación() {
        myStep.seMuestraLaVentanaAltaDeComunicación();
    }

    @Y("registro el asunto {string}")
    public void registroElAsunto(String asunto) {
        myStep.registroElAsunto(asunto);
    }

    @Y("selecciono el registro de procedimientos y servicios {string}")
    public void seleccionoElRegistroDeProcedimientosYServicios(String nombreProcedimiento) {
        myStep.seleccionoElRegistroDeProcedimientosYServicios(nombreProcedimiento);
    }

    @Y("registro el código expediente relacionado {string}")
    public void registroElCódigoExpedienteRelacionado(String codigoExpediente) {
        myStep.registroElCódigoExpedienteRelacionado (codigoExpediente);
    }

    @Y("anexo documento")
    public void anexoDocumento() {
        myStep.anexoDocumento();
    }


    @Y ("selecciono el destino de comunicación {string}")
    public void SeleccionoElDestinoDeComunicación(String destino) {
        myStep.SeleccionoElDestinoDeComunicación(destino);
    }
    @Y("registro la fecha limite {string}")
    public void registroLaFechaLimite(String fecha) {
        myStep.registroLaFechaLimite(fecha);
    }

    @Cuando("presiono el botón Enviar a Portafirmas")
    public void presionoElBotónEnviarAPortafirmas() {
        myStep.presionoElBotónEnviarAPortafirmas();
    }

    @Entonces("el sistema presenta la ventana Enviar petición a Port@firmas")
    public void elSistemaPresentaLaVentanaEnviarPeticiónAPortFirmas() {
        myStep.elSistemaPresentaLaVentanaEnviarPeticiónAPortFirmas();
    }

    @Y("selecciono el documento a firmar")
    public void seleccionoElDocumentoAFirmar() {
        myStep.seleccionoElDocumentoAFirmar();
    }

    @Y("ingresar el nombre del firmante {string}")
    public void ingresarElNombreDelFirmante(String nombreFirmante) {
        myStep.ingresarElNombreDelFirmante(nombreFirmante);

    }

    @Cuando("presione el botón Buscar")
    public void presioneElBotónBuscar() {
        myStep.presioneElBotónBuscar();
    }

    @Y("selecciono el firmante buscado")
    public void SeleccionoElFirmanteBuscado() {
        myStep.SeleccionoElFirmanteBuscado();
    }

    @Entonces("se muestra el firmante en la sección Firmantes del documento")
    public void SeMuestraElFirmanteEnLaSecciónFirmantesDelDocumento() {
        myStep.SeMuestraElFirmanteEnLaSecciónFirmantesDelDocumento();
    }

    @Y("selecciono el resto de firmantes")
    public void SeleccionoElRestoDeFirmantes() {
        myStep.SeleccionoElRestoDeFirmantes();
    }

    @Cuando("cambio de posición a los firmantes")
    public void CambioDePosiciónALosFirmantes() {
        myStep.CambioDePosiciónALosFirmantes();
    }

    @Y("presiono el botón Enviar a Portafirma Final")
    public void PresionoElBotónEnviarAPortafirmaFinal() {
        myStep.PresionoElBotónEnviarAPortafirmaFinal();
    }

    @Entonces("se muestra el mensaje de éxito")
    public void SeMuestraElMensajeDeÉxito() {
        myStep.SeMuestraElMensajeDeÉxito();
    }
}
