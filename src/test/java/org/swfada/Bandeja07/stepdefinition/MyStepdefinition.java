package org.swfada.Bandeja07.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.swfada.Bandeja07.step.MyStep;

public class MyStepdefinition {

    @Steps
    MyStep myStep;

    @And("selecciono una comunicación")
    public void seleccionoUnaComunicación() {
        myStep.seleccionoUnaComunicación();
    }

    @When("presiono el icono Reenviar")
    public void presionoElIconoReenviar() {
        myStep.presionoElIconoReenviar();
    }

    @Then("el sistema muestra la ventana Reenvio de la Comunicación")
    public void elSistemaMuestraLaVentanaReenvioDeLaComunicación() {
        myStep.elSistemaMuestraLaVentanaReenvioDeLaComunicación();
    }


    @And("selecciono el destino de la comunicación {string}")
    public void seleccionoElDestinoDeLaComunicación(String destinoCo) {
        myStep.seleccionoElDestinoDeLaComunicación(destinoCo);

    }

    @When("presiono el botón Reenviar")
    public void presionoElBotónReenviar() {
        myStep.presionoElBotónReenviar();
    }

    @And("verifico que el mensaje sea el correcto")
    public void verificoQueElMensajeSeaElCorrecto() {
        myStep.verificoQueElMensajeSeaElCorrecto();
    }
}
