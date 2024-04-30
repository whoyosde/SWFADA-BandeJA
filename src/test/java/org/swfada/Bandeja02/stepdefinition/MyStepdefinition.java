package org.swfada.Bandeja02.stepdefinition;

import io.cucumber.java.en.And;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.swfada.Bandeja02.step.MyStep;


public class MyStepdefinition {
    @Steps
    MyStep myStep;

    //@Given("que me encuentro ubicado en Bandeja")
    //public void queMeEncuentroUbicadoEnBandeja() {
      //  myStep.queMeEncuentroUbicadoEnBandeja();
    //}

    @When("presiono en nueva comunicación")
    public void presionoEnNuevaComunicación() {
        myStep.presionoEnNuevaComunicación();
    }

    @Then("se muestra la ventana Alta de Comunicación")
    public void seMuestraLaVentanaAltaDeComunicación() {
        myStep.seMuestraLaVentanaAltaDeComunicación();
    }

    @And("registro el asunto {string}")
    public void registroElAsunto(String asunto) {
        myStep.registroElAsunto(asunto);
    }

    @And("selecciono el registro de procedimientos y servicios {string}")
    public void seleccionoElRegistroDeProcedimientosYServicios(String nombreProcedimiento) {
        myStep.seleccionoElRegistroDeProcedimientosYServicios(nombreProcedimiento);
    }

    @And("registro el código expediente relacionado {string}")
    public void registroElCódigoExpedienteRelacionado(String codigoExpediente) {
        myStep.registroElCódigoExpedienteRelacionado (codigoExpediente);
    }

    @And("anexo documento")
    public void anexoDocumento() {
        myStep.anexoDocumento();
    }


    @And ("selecciono el destino de comunicación {string}")
    public void SeleccionoElDestinoDeComunicación(String destino) {
        myStep.SeleccionoElDestinoDeComunicación(destino);
    }
    @And("registro la fecha limite {string}")
    public void registroLaFechaLimite(String fecha) {
        myStep.registroLaFechaLimite(fecha);
    }

    @And("presiono el botón Enviar a Portafirmas")
    public void presionoElBotónEnviarAPortafirmas() {
        myStep.presionoElBotónEnviarAPortafirmas();
    }

    @And("el sistema presenta la ventana Enviar petición a Port@firmas")
    public void elSistemaPresentaLaVentanaEnviarPeticiónAPortFirmas() {
        myStep.elSistemaPresentaLaVentanaEnviarPeticiónAPortFirmas();
    }
}
