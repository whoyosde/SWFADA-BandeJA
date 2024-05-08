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


    @Dado("que presiono la acción nueva comunicación")
    public void QuePresionoLaAcciónNuevaComunicación() {

        myStep.QuePresionoLaAcciónNuevaComunicación();
    }

    @Cuando("se muestra el modal Alta de comunicación")
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

    @Y("selecciono destino de comunicación {string}")
    public void SeleccionoDestinoDeComunicación(String destino) {

        myStep.SeleccionoDestinoDeComunicación(destino);
    }

    @Y("resgitro la fecha limite {string}")
    public void ResgitroLaFechaLimite(String fecha) {
        myStep.ResgitroLaFechaLimite(fecha);
    }

    @Y("presiono el boton Enviar sin firma")
    public void presionoElBotonEnviarSinFirma() {

        myStep.presionoElBotonEnviarSinFirma();
    }

    @Y("se muestra mensaje éxito")
    public void SeMuestraMensajeÉxito() {

        myStep.SeMuestraMensajeÉxito();
    }


    @Entonces("valida que se envió la comunicación")
    public void ValidaQueSeEnvióLaComunicación() {
        myStep.ValidaQueSeEnvióLaComunicación();

    }
}
