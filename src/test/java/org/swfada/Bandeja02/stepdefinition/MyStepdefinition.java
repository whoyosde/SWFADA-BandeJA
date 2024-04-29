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

    @Given("que me encuentro ubicado en Bandeja")
    public void queMeEncuentroUbicadoEnBandeja() {
        myStep.queMeEncuentroUbicadoEnBandeja();
    }

    @When("presiono en nueva comunicación")
    public void presionoEnNuevaComunicación() {
        myStep.presionoEnNuevaComunicación();
    }

    @Then("se muestra la ventana Alta de Comunicación")
    public void seMuestraLaVentanaAltaDeComunicación() {
        myStep.seMuestraLaVentanaAltaDeComunicación();
    }
}
