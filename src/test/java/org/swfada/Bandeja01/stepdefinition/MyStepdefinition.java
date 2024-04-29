package org.swfada.Bandeja01.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.swfada.Bandeja01.step.MyStep;


public class MyStepdefinition {
    @Steps
    private MyStep myStep;

    @Dado("que me encuentro en Bandeja")
    public void QueMeEncuentroEnBandeja() {

        myStep.QueMeEncuentroEnBandeja();
    }

    @Cuando("presiono la acción nueva comunicación")
    public void PresionoLaAcciónNuevaComunicación() {

        myStep.PresionoLaAcciónNuevaComunicación();
    }

    @Entonces("se muestra el modal Alta de comunicación")
    public void SeMuestraElModalAltaDeComunicación() {

        myStep.SeMuestraElModalAltaDeComunicación();
    }

    @Y("registro el Asunto {string}")
    public void RegistroElAsunto(String asunto) {

        myStep.RegistroElAsunto(asunto);
    }

    @Y("selecciono Registro de procedimientos y servicios {string}")
    public void SeleccionoRegistroDeProcedimientosYServicios(String procedimiento) {
        myStep.SeleccionoRegistroDeProcedimientosYServicios(procedimiento);
    }

    @Y("registro el Código expediente {string}")
    public void RegistroElCódigoExpediente(String codigo) {

        myStep.RegistroElCódigoExpediente(codigo);
    }

    @Y("adjunto documento")
    public void AdjuntoDocumento() {

        myStep.AdjuntoDocumento();
    }

    @Y("selecciono el destino de comunicación {string}")
    public void SeleccionoElDestinoDeComunicación(String destino) {

        myStep.SeleccionoElDestinoDeComunicación(destino);
    }

    @Y("resgitro la fecha limite {string}")
    public void ResgitroLaFechaLimite(String fecha) {
        myStep.ResgitroLaFechaLimite(fecha);
    }

    @Cuando("presiono el boton Enviar sin firma")
    public void presionoElBotonEnviarSinFirma() {

        myStep.presionoElBotonEnviarSinFirma();
    }

    @Entonces("valido mensaje de exito")
    public void validoMensajeDeExito() {
        myStep.validoMensajeDeExito();
    }
}
