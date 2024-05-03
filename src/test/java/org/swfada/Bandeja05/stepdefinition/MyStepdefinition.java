package org.swfada.Bandeja05.stepdefinition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.swfada.Bandeja05.step.MyStep;
import net.thucydides.core.annotations.Steps;

public class MyStepdefinition {


    @Steps
    MyStep myStep;

    @And ("selecciono comunicación")
    public void seleccionoComunicación(){
        myStep.seleccionoComunicación();
    }


    @When("presiono el icono Asignar")
    public void presionoElIconoAsignar() {
        myStep.presionoElIconoAsignar();
    }

    @Then("el sistema muestra la ventana Asignacion de la Comunicación")
    public void elSistemaMuestraLaVentanaAsignacionDeLaComunicación() {
        myStep.elSistemaMuestraLaVentanaAsignacionDeLaComunicación();
    }

    @And("selecciono el nombre de la persona a asignar")
    public void seleccionoElNombreDeLaPersonaAAsignar() {
        myStep.seleccionoElNombreDeLaPersonaAAsignar();
    }

    @And("presiono el icono de asignación")
    public void presionoElIconoDeAsignación() {
        myStep.presionoElIconoDeAsignación();
    }

    @And("presiono el botón Aceptar")
    public void presionoElBotónAceptar() {
        myStep.presionoElBotónAceptar();
    }
}
