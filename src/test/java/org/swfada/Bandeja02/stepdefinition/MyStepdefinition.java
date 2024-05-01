package org.swfada.Bandeja02.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.swfada.Bandeja02.step.MyStep;


public class MyStepdefinition {
    @Steps
    MyStep myStep;

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

    @When("presiono el botón Enviar a Portafirmas")
    public void presionoElBotónEnviarAPortafirmas() {
        myStep.presionoElBotónEnviarAPortafirmas();
    }

    @Then("el sistema presenta la ventana Enviar petición a Port@firmas")
    public void elSistemaPresentaLaVentanaEnviarPeticiónAPortFirmas() {
        myStep.elSistemaPresentaLaVentanaEnviarPeticiónAPortFirmas();
    }

    @And("selecciono el documento a firmar {string}")
    public void seleccionoElDocumentoAFirmar(String nombreDocumento) {
        myStep.seleccionoElDocumentoAFirmar();
    }

    @And("ingresar el nombre del firmante {string}")
    public void ingresarElNombreDelFirmante(String nombreFirmante) {
        myStep.ingresarElNombreDelFirmante(nombreFirmante);

    }

    @When("presione el botón Buscar")
    public void presioneElBotónBuscar() {
        myStep.presioneElBotónBuscar();
    }

}
