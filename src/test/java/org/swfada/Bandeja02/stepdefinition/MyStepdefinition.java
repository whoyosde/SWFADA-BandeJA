package org.swfada.Bandeja02.stepdefinition;

import io.cucumber.java.en.And;

import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import org.swfada.Bandeja02.step.MyStep;


public class MyStepdefinition {
    @Steps
    MyStep myStep;

    @And("da click en nueva comunicación")
    public void daClickEnNuevaComunicación() {
        myStep.daClickEnNuevaComunicación();
    }

    @Then("puede visualizar la ventana")
    public void puedeVisualizarLaVentana() {
        myStep.puedeVisualizarLaVentana();
    }
}
